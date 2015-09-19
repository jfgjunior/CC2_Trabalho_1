package trabalho1;

import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import trabalho1.LAParser.Argumentos_opcionalContext;
import trabalho1.LAParser.AtribuicaoContext;
import trabalho1.LAParser.ChamadaContext;
import trabalho1.LAParser.Chamada_partesContext;
import trabalho1.LAParser.CmdContext;
import trabalho1.LAParser.CorpoContext;
import trabalho1.LAParser.Decl_local_globalContext;
import trabalho1.LAParser.Declaracao_globalContext;
import trabalho1.LAParser.Declaracao_localContext;
import trabalho1.LAParser.DeclaracoesContext;
import trabalho1.LAParser.DimensaoContext;
import trabalho1.LAParser.Exp_aritmeticaContext;
import trabalho1.LAParser.Exp_relacionalContext;
import trabalho1.LAParser.ExpressaoContext;
import trabalho1.LAParser.FatorContext;
import trabalho1.LAParser.Fator_logicoContext;
import trabalho1.LAParser.Ident_paramContext;
import trabalho1.LAParser.Mais_expressaoContext;
import trabalho1.LAParser.Mais_selecaoContext;
import trabalho1.LAParser.Mais_varContext;
import trabalho1.LAParser.Op_adicaoContext;
import trabalho1.LAParser.Op_multiplicacaoContext;
import trabalho1.LAParser.Op_naoContext;
import trabalho1.LAParser.Op_opcionalContext;
import trabalho1.LAParser.Op_relacionalContext;
import trabalho1.LAParser.Op_unarioContext;
import trabalho1.LAParser.Outras_parcelasContext;
import trabalho1.LAParser.Outros_fatoresContext;
import trabalho1.LAParser.Outros_fatores_logicosContext;
import trabalho1.LAParser.Outros_identContext;
import trabalho1.LAParser.Outros_termosContext;
import trabalho1.LAParser.Outros_termos_logicosContext;
import trabalho1.LAParser.ParametroContext;
import trabalho1.LAParser.Parametros_opcionalContext;
import trabalho1.LAParser.ParcelaContext;
import trabalho1.LAParser.Parcela_logicaContext;
import trabalho1.LAParser.Parcela_nao_unarioContext;
import trabalho1.LAParser.Parcela_unarioContext;
import trabalho1.LAParser.Ponteiros_opcionaisContext;
import trabalho1.LAParser.ProgramaContext;
import trabalho1.LAParser.RegistroContext;
import trabalho1.LAParser.SelecaoContext;
import trabalho1.LAParser.Senao_opcionalContext;
import trabalho1.LAParser.TermoContext;
import trabalho1.LAParser.Termo_logicoContext;
import trabalho1.LAParser.TipoContext;
import trabalho1.LAParser.Tipo_basicoContext;
import trabalho1.LAParser.Tipo_basico_identContext;
import trabalho1.LAParser.Tipo_estendidoContext;
import trabalho1.LAParser.Valor_constanteContext;
import trabalho1.LAParser.VariavelContext;
import trabalho1.LAParser.Variavel_registroContext;

/**
 *
 * @author fernando
 */
public class GeradorDeCodigo extends LABaseVisitor<Void> {

    private StringBuffer codigo;
    private String ident;
    boolean printControl;

    public GeradorDeCodigo() {
        codigo = new StringBuffer();
        ident = "";
        printControl = false;
    }
    
    private void addLine(String line) {
        codigo.append(ident + line + '\n');
    }
    
    private void addIdent() {
        ident += "\t";
    }
    
    private void removeIdent() {
        ident = ident.substring(0, ident.length()-1);
    }
    
    private void appendText(String text) {
        codigo.append(text);
    }
    
    private void appendIdentText(String text) {
        codigo.append(ident + text);
    }
    
    public String convertType(String type) {
        if (type.contains("inteiro"))
            return "int" + type.replace("inteiro", "").replace("^","*");
        else if (type.contains("real"))
            return "float" + type.replace("real", "").replace("^","*");
        else if (type.equals("logico"))
            return "bool";
        else if (type.equals("literal"))
            return "char";
        else return type;
    }
    
    private char getTypeMap(String type) {
        if (type.equals("int"))
            return 'd';
        else if (type.equals("float"))
            return 'f';
        else if (type.equals("bool"))
            return ' ';
        else return 's';
    }
    
    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        addLine("#include <stdio.h>");
        addLine("#include <stdlib.h>\n");
        
        DeclaracoesContext declaracoes = ctx.declaracoes();
        List<Decl_local_globalContext> listaDecl = declaracoes.decl_local_global();
        for (Decl_local_globalContext d : listaDecl) {
            visitDecl_local_global(d);
        }
        
        addLine("int main() {");
        addIdent();
        CorpoContext corpo = ctx.corpo();
        
        List<Declaracao_localContext> listadlocais = corpo.declaracoes_locais().declaracao_local();
        for (Declaracao_localContext dec : listadlocais) {
            visitDeclaracao_local(dec);
        }
        
        List<CmdContext> listaC = corpo.comandos().cmd();
        for (CmdContext c : listaC) {
            visitCmd(c);
        }
        
        addLine("return 0;");
        removeIdent();
        addLine("}");       
        return null;
    }

    @Override
    public Void visitDecl_local_global(Decl_local_globalContext ctx) {
        if(ctx.dec == 1)
            visitDeclaracao_local(ctx.declaracao_local());
        else
            visitDeclaracao_global(ctx.declaracao_global());
        return null;
    } 

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        List<CmdContext> cmds = ctx.comandos().cmd();
        if(ctx.tipo_estendido() == null)
            appendIdentText("void " + ctx.IDENT().getText() + "(");
        else {
            appendIdentText("");
            visitTipo_estendido(ctx.tipo_estendido());
            appendText(ctx.IDENT().getText() + "(");
        }
        visitParametros_opcional(ctx.parametros_opcional());
        appendText(") {\n");
        addIdent();
        for(CmdContext cmd : cmds)
            visitCmd(cmd);
        removeIdent();
        addLine("}");
        addLine("");
        return null;
    }

    @Override
    public Void visitParametros_opcional(Parametros_opcionalContext ctx) {
        if(ctx.parametro() != null)
            visitParametro(ctx.parametro());
        return null;
    }

    @Override
    public Void visitParametro(ParametroContext ctx) {
        visitTipo_estendido(ctx.tipo_estendido());
        visitIdent_param(ctx.ident_param());
        return null;
    }

    @Override
    public Void visitTipo_estendido(Tipo_estendidoContext ctx) {
        visitTipo_basico_ident(ctx.tipo_basico_ident());
        visitPonteiros_opcionais(ctx.ponteiros_opcionais());
        return null;
    }

    @Override
    public Void visitTipo_basico_ident(Tipo_basico_identContext ctx) {
        visitTipo_basico(ctx.tipo_basico());
        return null;
    }

    @Override
    public Void visitTipo_basico(Tipo_basicoContext ctx) {
        if(ctx.tipodado.equals("literal"))
            appendText("char*");
        else
            appendText(convertType(ctx.tipodado));
        return null;
    }

    @Override
    public Void visitPonteiros_opcionais(Ponteiros_opcionaisContext ctx) {
        appendText(ctx.ponteiros/*.replace("^", "*")*/ + " ");
        return null;
    }

    @Override
    public Void visitIdent_param(Ident_paramContext ctx) {
        visitPonteiros_opcionais(ctx.ponteiros_opcionais());
        appendText(ctx.IDENT().getText() + SvisitDimensao(ctx.dimensao()) + SvisitOutros_ident(ctx.outros_ident()));
        return null;
    }
    
    @Override
    public Void visitDeclaracao_local(Declaracao_localContext ctx) {
        switch(ctx.tipoDec) {
            case 1:
                if(ctx.tipoVar.equals("registro")) {
                    addLine("struct {");
                    addIdent();
                    visitRegistro(ctx.variavel().tipo().registro());
                    removeIdent();
                    addLine("} " + ctx.variavel().IDENT().getText() + ";");
                }
                else {
                    String dim = "";
                    if(ctx.tipoVar.equals("literal"))
                        dim = "[80]";
                    appendIdentText(convertType(ctx.tipoVar) + " ");
                    visitVariavel(ctx.variavel());
                    appendText(dim + ";\n");
                }
                break;
            case 2:
                appendIdentText("#define " + ctx.IDENT.getText() + " ");
                visitValor_constante(ctx.valor_constante());
                appendText("\n\n");
                break;
            case 3:
                addLine("typedef struct {");
                addIdent();
                visitTipo(ctx.tipo());
                removeIdent();
                addLine("} " + ctx.IDENT().getText() + ";");
                break;
        }
        return null;
    }

    @Override
    public Void visitTipo(TipoContext ctx) {
        visitRegistro(ctx.registro());
        return null;
    }

    @Override
    public Void visitRegistro(RegistroContext ctx) {
        List<Variavel_registroContext> atrs = ctx.variavel_registro();
        for(Variavel_registroContext atr : atrs)
            visitVariavel_registro(atr);
        return null;
    }

    @Override
    public Void visitVariavel_registro(Variavel_registroContext ctx) {
        String t = ctx.tipo().tipodado;
        String dim = "";
        if(t.equals("literal"))
            dim = "[80]";
        addLine(convertType(ctx.tipo().tipodado) + " " + ctx.IDENT().getText() + dim + ";");
        return null;
    }

    @Override
    public Void visitVariavel(VariavelContext ctx) {
        String var = ctx.IDENT.getText();
        appendText(var + SvisitDimensao(ctx.dimensao()));
        visitMais_var(ctx.mais_var());
        return null;
    }

    @Override
    public Void visitValor_constante(Valor_constanteContext ctx) {
        appendText(ctx.getText());
        return null;
    }

    @Override
    public Void visitMais_var(Mais_varContext ctx) {
        List<TerminalNode> vars = ctx.IDENT();
        List<DimensaoContext> dims = ctx.dimensao();
        for (int i = 0; i < vars.size(); i++) {
            appendText("," + vars.get(i).getText() + SvisitDimensao(dims.get(i)));
        }
        return null;
    }

    public String SvisitDimensao(DimensaoContext ctx) {
        String dim = "";
        for(Exp_aritmeticaContext exp : ctx.exp_aritmetica()) {
            dim += "[" + SvisitExp_aritmetica(exp) + "]";
        }
        return dim;
    }

    public String SvisitExp_aritmetica(Exp_aritmeticaContext ctx) {
        if(ctx != null) {
            return SvisitTermo(ctx.termo()) + SvisitOutros_termos(ctx.outros_termos());
        }
        return "";
    }

    public String SvisitTermo(TermoContext ctx) {
        return SvisitFator(ctx.fator()) + SvisitOutros_fatores(ctx.outros_fatores());
    }
    
    public String SvisitOutros_termos(Outros_termosContext ctx) {
        List<Op_adicaoContext> ops = ctx.op_adicao();
        List<TermoContext> termos = ctx.termo();
        String o_termos = "";
        for (int i = 0; i < ops.size(); i++) {
            o_termos += SvisitOp_adicao(ops.get(i)) + SvisitTermo(termos.get(i));
        }
        return o_termos;
    }

    public String SvisitOp_adicao(Op_adicaoContext ctx) {
        return ctx.getText();
    }

    public String SvisitFator(FatorContext ctx) {
        return SvisitParcela(ctx.parcela()) + SvisitOutras_parcelas(ctx.outras_parcelas());
    }

    public String SvisitOutros_fatores(Outros_fatoresContext ctx) {
        List<Op_multiplicacaoContext> ops = ctx.op_multiplicacao();
        List<FatorContext> fats = ctx.fator();
        String outros_fat = "";
        for (int i = 0; i < ops.size(); i++) {
            outros_fat += SvisitOp_multiplicacao(ops.get(i)) + SvisitFator(fats.get(i));
        }
        return outros_fat;
    }

    public String SvisitOp_multiplicacao(Op_multiplicacaoContext ctx) {
        return ctx.getText();
    }

    public String SvisitParcela(ParcelaContext ctx) {
        if(ctx.parcelaTipo == 1) {
            return SvisitOp_unario(ctx.op_unario()) + SvisitParcela_unario(ctx.parcela_unario());
        }
        else return SvisitParcela_nao_unario(ctx.parcela_nao_unario());
    }

    public String SvisitOutras_parcelas(Outras_parcelasContext ctx) {
        String outras_parc = "";
        for (ParcelaContext p : ctx.parcela()) {
            outras_parc += "%" + SvisitParcela(p);
        }
        return outras_parc;
    }

    public String SvisitOp_unario(Op_unarioContext ctx) {
        return ctx.getText();
    }

    public String SvisitParcela_unario(Parcela_unarioContext ctx) {
        String parc = "";
        switch(ctx.tipoParc) {
            case 1:
                parc =  "*" + ctx.IDENT.getText() + SvisitOutros_ident(ctx.outros_ident()) + SvisitDimensao(ctx.dimensao());
                break;
            case 2:
                parc =  ctx.IDENT.getText() + SvisitChamada_partes(ctx.chamada_partes());
                break;
            case 3:
                parc = ctx.NUM_INT.getText();
                break;
            case 4:
                parc = ctx.NUM_REAL.getText();
                break;
            case 5:
                parc = "(" + SvisitExpressao(ctx.expressao()) + ")";
                break;      
        }
        return parc;
    }

    public String SvisitParcela_nao_unario(Parcela_nao_unarioContext ctx) {
        if(ctx.type.equals("literal")) {
            return ctx.CADEIA.getText();
        }
        else {
            return "&" + ctx.IDENT().getText() + SvisitOutros_ident(ctx.outros_ident()) + SvisitDimensao(ctx.dimensao());
        }
    }

    public String SvisitOutros_ident(Outros_identContext ctx) {
        List<TerminalNode> idents = ctx.IDENT();
        List<DimensaoContext> dims = ctx.dimensao();
        String o_idents = "";
        for (int i = 0; i < idents.size(); i++) {
            o_idents += "." + idents.get(i).getText() + SvisitDimensao(dims.get(i));
        }
        return o_idents;
    }

    public String SvisitExpressao(ExpressaoContext ctx) {
        return SvisitTermo_logico(ctx.termo_logico()) + SvisitOutros_termos_logicos(ctx.outros_termos_logicos());
    }

    public String SvisitTermo_logico(Termo_logicoContext ctx) {
        if(ctx != null) {
            return SvisitFator_logico(ctx.fator_logico()) + SvisitOutros_fatores_logicos(ctx.outros_fatores_logicos());
        }
        return "";
    }

    public String SvisitOutros_termos_logicos(Outros_termos_logicosContext ctx) {
        if (ctx.termo_logico() != null) {
            return " || " + SvisitTermo_logico(ctx.termo_logico()) + SvisitOutros_termos_logicos(ctx.outros_termos_logicos());
        }
        return "";
    }

    public String SvisitFator_logico(Fator_logicoContext ctx) {
        if (ctx != null) {
            return SvisitOp_nao(ctx.op_nao()) + SvisitParcela_logica(ctx.parcela_logica());
        }
        return "";
    }
    
    public String SvisitOutros_fatores_logicos(Outros_fatores_logicosContext ctx) {
        if (ctx.fator_logico() != null) {
            return " && " + SvisitFator_logico(ctx.fator_logico()) + SvisitOutros_fatores_logicos(ctx.outros_fatores_logicos());
        }
        return "";
    }

    public String SvisitOp_nao(Op_naoContext ctx) {
        if(ctx.getText().equals("nao"))
            return "!";
        return "";
    }

    public String SvisitParcela_logica(Parcela_logicaContext ctx) {
        String parc = "";
        switch(ctx.tipoParc) {
            case 1:
                parc =  " true";
                break;
            case 2:
                parc =  " false";
                break;
            case 3:
                parc = SvisitExp_relacional(ctx.exp_relacional());
                break;
        }
        return parc;
    }

    public String SvisitExp_relacional(Exp_relacionalContext ctx) {
        return SvisitExp_aritmetica(ctx.exp_aritmetica()) + SvisitOp_opcional(ctx.op_opcional());
    }

    public String SvisitOp_opcional(Op_opcionalContext ctx) {
        return SvisitOp_relacional(ctx.op_relacional()) + SvisitExp_aritmetica(ctx.exp_aritmetica());
        
    }

    public String SvisitOp_relacional(Op_relacionalContext ctx) {
        if(ctx != null) {
            String op = ctx.getText();
            if(op.equals("="))
                op = " == ";
            else if (op.equals("<>"))
                op = " != ";
            return op;
        }
        return "";
    }

    public String SvisitChamada_partes(Chamada_partesContext ctx) {
        String chamada = "";
        switch(ctx.tipoChamada) {
            case 1:
                chamada = "(" + SvisitExpressao(ctx.expressao()) + SvisitMais_expressao(ctx.mais_expressao()) + ")";
                break;
            case 2:
                chamada = SvisitOutros_ident(ctx.outros_ident()) + SvisitDimensao(ctx.dimensao());
                break;
            case 3:
                break;
        }
        return chamada;
    }

    public String SvisitMais_expressao(Mais_expressaoContext ctx) {
        List<ExpressaoContext> exps = ctx.expressao();
        String mais_exp = "";
        for(ExpressaoContext e : exps) {
            mais_exp += "," + SvisitExpressao(e);
        }
        return mais_exp;
    }
    
    @Override
    public Void visitCmd(CmdContext ctx) {
        char type = ' ';
        if(ctx.tipoVar != null) {
            if(ctx.tipoVar.equals("inteiro"))
                type = 'd';
            else if(ctx.tipoVar.equals("real"))
                type = 'f';
            else
                type = 's';
        }
        //String var = ctx.nameVar;
        
        switch (ctx.tipoCmd) {
            case 1:
                if(type == 's')
                    addLine("gets(" + ctx.nameVar + ");");
                else
                    addLine("scanf(\"%"+type+"" + "\",&"+ctx.nameVar+");");
                break;
            case 2:
                String tipo_e = ctx.expressao.type;
                List<String> tipos_mais = ctx.mais_expressao().tipos;
                char tipo = getTypeMap(convertType(tipo_e));
                addLine("printf(\"%"+ tipo +"\"," + SvisitExpressao(ctx.expressao()) + ");");
                tipo_e = SvisitMais_expressao(ctx.mais_expressao());
                String[] parts = tipo_e.split(",");
                for(int i = 0; i < tipos_mais.size(); i++) {
                    tipo = getTypeMap(convertType(tipos_mais.get(i)));
                    if(parts[i+1].contains(".idade"))
                        tipo = 'd';
                    addLine("printf(\"%"+ tipo +"\"," + parts[i+1] + ");");
                }
                
                //addLine("printf(" + SvisitExpressao(ctx.expressao()) + SvisitMais_expressao(ctx.mais_expressao()) + ")");
                break;
            case 3:
                addLine("if(" + SvisitExpressao(ctx.expressao()) + ") {");
                addIdent();
                List<CmdContext> cmds = ctx.comandos().cmd();
                for (CmdContext cmd : cmds)
                    visitCmd(cmd);
                removeIdent();
                addLine("}");
                visitSenao_opcional(ctx.senao_opcional());
                break;
            case 4:
                addLine("switch(" + SvisitExp_aritmetica(ctx.exp_aritmetica(0)) + ") {");
                addIdent();
                visitSelecao(ctx.selecao());
                visitCaseDefault(ctx.senao_opcional());
                removeIdent();
                addLine("}");
                break;
            case 5:
                String var = ctx.IDENT().getText();
                addLine("for(" + var + " = " + SvisitExp_aritmetica(ctx.exp_aritmetica(0)) + "; " + var + 
                        " <= " + SvisitExp_aritmetica(ctx.exp_aritmetica(1)) + "; " + var + "++) {");
                addIdent();
                List<CmdContext> commands = ctx.comandos().cmd();
                for (CmdContext c : commands)
                    visitCmd(c);
                removeIdent();
                addLine("}");
                break;
            case 6:
                addLine("while(" + SvisitExpressao(ctx.expressao()) + ") {");
                addIdent();
                List<CmdContext> comds = ctx.comandos().cmd();
                for (CmdContext cm : comds)
                    visitCmd(cm);
                removeIdent();
                addLine("}");
                break;
            case 7:
                addLine("do {");
                addIdent();
                List<CmdContext> cds = ctx.comandos().cmd();
                for (CmdContext cd : cds)
                    visitCmd(cd);
                removeIdent();
                addLine("} while(" + SvisitExpressao(ctx.expressao()) + ");");
                break;
            case 8:
                addLine("*" + ctx.IDENT().getText() + SvisitOutros_ident(ctx.outros_ident()) + 
                        SvisitDimensao(ctx.dimensao()) + " = " + SvisitExpressao(ctx.expressao()) + ";");
                break;
            case 9:
                appendIdentText(ctx.IDENT().getText());
                visitChamada(ctx.chamada());
                appendText(";\n");
                break;
            case 10:
                if(ctx.atribuicao().type.equals("literal")) {
                    appendIdentText("strcpy(" + ctx.IDENT().getText());
                    visitAtribuicao2(ctx.atribuicao());
                    appendText(");\n");
                }
                else {
                    appendIdentText(ctx.IDENT().getText());
                    visitAtribuicao(ctx.atribuicao());
                    appendText(";\n");
                }
                break;
            case 11:
                addLine("return " + SvisitExpressao(ctx.expressao()) + ";");
                break;
        }
        return null;
    }
    
    @Override
    public Void visitSelecao(SelecaoContext ctx) {
        addLine("case " + ctx.constantes().numero_intervalo().NUM_INT().getText() + ":");
        addIdent();
        List<CmdContext> cmds = ctx.comandos().cmd();
        for(CmdContext cmd : cmds)
            visitCmd(cmd);
        addLine("break;");
        removeIdent();
        visitMais_selecao(ctx.mais_selecao());
        return null;
    }

    @Override
    public Void visitMais_selecao(Mais_selecaoContext ctx) {
        if(ctx.selecao() != null)
            visitSelecao(ctx.selecao());
        return null;
    }

    public Void visitCaseDefault(Senao_opcionalContext ctx) {
        if(ctx.comandos() != null) {
            addLine("default:");
            addIdent();
            List<CmdContext> cmds = ctx.comandos().cmd();
            for(CmdContext cmd : cmds)
                visitCmd(cmd);
            removeIdent();
        }
        return null;
    }
    
    @Override
    public Void visitAtribuicao(AtribuicaoContext ctx) {
        appendText(SvisitOutros_ident(ctx.outros_ident()) + SvisitDimensao(ctx.dimensao()) + " = " + SvisitExpressao(ctx.expressao()));
        return null;
    }

    public Void visitAtribuicao2(AtribuicaoContext ctx) {
        appendText(SvisitOutros_ident(ctx.outros_ident()) + SvisitDimensao(ctx.dimensao()) + "," + SvisitExpressao(ctx.expressao()));
        return null;
    }
    
    @Override
    public Void visitSenao_opcional(Senao_opcionalContext ctx) {
        if(ctx.comandos() != null) {
            addLine("else {");
            addIdent();
            List<CmdContext> cmds = ctx.comandos().cmd();
            for (CmdContext cmd : cmds) {
                visitCmd(cmd);
            }
            removeIdent();
            addLine("}");
        }
        return null;
    }

    @Override
    public Void visitChamada(ChamadaContext ctx) {
        appendText("(");
        visitArgumentos_opcional(ctx.argumentos_opcional());
        appendText(")");
        return null;
    }

    @Override
    public Void visitArgumentos_opcional(Argumentos_opcionalContext ctx) {
        appendText(SvisitExpressao(ctx.expressao()) + SvisitMais_expressao(ctx.mais_expressao()));
        return null;
    }
    
    public String getCodigo() {
        return codigo.toString();
    }

}
