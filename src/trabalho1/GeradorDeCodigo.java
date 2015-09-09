/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho1;

import java.util.List;
import trabalho1.LAParser.CorpoContext;

/**
 *
 * @author fernando
 */
public class GeradorDeCodigo extends LABaseVisitor<Void>{
    
    

    @Override
    public Void visitPrograma(LAParser.ProgramaContext ctx) {
        CorpoContext corpo = ctx.corpo();
        List<LAParser.CmdContext> listaC = corpo.comandos().cmd();
        for(LAParser.CmdContext c:listaC) {
            visitCmd(c);
        }
        return null;
        //return super.visitPrograma(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Void visitCmd(LAParser.CmdContext ctx) {
        if(ctx.tipoCmd == 0) {
            String id = ctx.identificador().IDENT.getText();
            System.out.println("scanf(\"..." + id+");");
        }
        return null;
//return super.visitCmd(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
