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
import trabalho1.LAParser.DeclaracoesContext;
import trabalho1.LAParser.ProgramaContext;

/**
 *
 * @author fernando
 */
public class GeradorDeCodigo extends LABaseVisitor<Void> {

    StringBuffer codigo;

    public GeradorDeCodigo() {
        codigo = new StringBuffer();
    }

    @Override
    public Void visitDeclaracao_local(LAParser.Declaracao_localContext ctx) {
        codigo.append("\t"+ctx.name+" "+ctx.tipoVar);
        return null;
        //return super.visitDeclaracao_local(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        codigo.append("#include <stdio.h>\n#include <stdlib.h>\n\n");
        
        DeclaracoesContext declaracoes = ctx.declaracoes();
        List<Decl_local_globalContext> listaDecl = declaracoes.decl_local_global();
        for (Decl_local_globalContext d : listaDecl) {
            visitDecl_local_global(d);
        }
        
        codigo.append("int main() {\n");
        CorpoContext corpo = ctx.corpo();
        List<CmdContext> listaC = corpo.comandos().cmd();
        for (CmdContext c : listaC) {
            visitCmd(c);
        }
        
        codigo.append("\treturn 0;\n}");
        return null;
        //return super.visitPrograma(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Void visitDecl_local_global(Decl_local_globalContext ctx) {
        return null;
        //return super.visitDecl_local_global(ctx); //To change body of generated methods, choose Tools | Templates.
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
        
        switch (ctx.tipoCmd) {
            case 1:
                codigo.append("\tscanf(\"%"+type+"" + "\",&"+ctx.nameVar+");\n");
                break;
            case 2:
                codigo.append("\tprintf(\"%"+type+"\","+ctx.nameVar+");\n");
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
