/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.List;
import trabalho1.LAParser.CmdContext;
import trabalho1.LAParser.CorpoContext;
import trabalho1.LAParser.Decl_local_globalContext;
import trabalho1.LAParser.Declaracao_globalContext;
import trabalho1.LAParser.Declaracao_localContext;
import trabalho1.LAParser.DeclaracoesContext;
import trabalho1.LAParser.ProgramaContext;

/**
 *
 * @author fernando
 */
public class GeradorDeCodigo extends LABaseVisitor<Void> {

    StringBuffer codigo;
    String ident;

    public GeradorDeCodigo() {
        codigo = new StringBuffer();
        ident = "";
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
    
    public String convertType(String type) {
        if (type.equals("inteiro"))
            return "int";
        else if (type.equals("real"))
            return "float";
        else if (type.equals("logico"))
            return "bool";
        else return "char";
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
        //return super.visitPrograma(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Void visitDecl_local_global(Decl_local_globalContext ctx) {
        if(ctx.dec == 1)
            visitDeclaracao_local(ctx.declaracao_local());
        else
            visitDeclaracao_global(ctx.declaracao_global());
        return null;
        //return super.visitDecl_local_global(ctx); //To change body of generated methods, choose Tools | Templates.
    } 

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        
        return null;
        //return super.visitDeclaracao_global(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Void visitDeclaracao_local(Declaracao_localContext ctx) {
        switch(ctx.tipoDec) {
            case 1:
//                int dimensao;
//                dimensao = ctx.variavel().dimensao().indice;
//                String dim = "";
//                if (dimensao != -1)
//                    dim = "[" + dimensao + "]";
                addLine(convertType(ctx.tipoVar) + " " + ctx.name + ";");
                break;
            case 2:
                addLine("#define " + ctx.IDENT.getText());
                break;
            case 3:
                addLine("typedef ");
                break;
        }
        return null;
        //return super.visitDeclaracao_local(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Void visitCmd(CmdContext ctx) {
        char type;
        if(ctx.tipoVar.equals("inteiro"))
            type = 'd';
        else if(ctx.tipoVar.equals("real"))
            type = 'f';
        else
            type = 's';
        //String var = ctx.nameVar;
        
        switch (ctx.tipoCmd) {
            case 1:
                if(type == 's')
                    addLine("gets(" + ctx.nameVar + ");");
                else
                    codigo.append("\tscanf(\"%"+type+"" + "\",&"+ctx.nameVar+");\n");
                break;
            case 2:
                String var = ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().termo().fator().parcela().parcela_unario().IDENT.getText();
                codigo.append("\tprintf(\"%"+type+"\","+var+");\n");
                break;
            case 3:
                codigo.append("\tif\n");
                break;
            case 4:
                break;
            case 5:
                codigo.append("\tfor\n");
                break;
            case 6:
                codigo.append("\twhile\n");
                break;
            case 7:
                codigo.append("\tdo while\n");
                break;
            case 8:
                break;
            case 9:
                String id = ctx.identificador().IDENT.getText();
                codigo.append("\t" + id + "();");
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return null;
        //return super.visitCmd(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigo() {
        return codigo.toString();
    }

}
