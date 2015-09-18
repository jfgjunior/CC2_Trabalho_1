/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author daniel
 */
public class Mensagens {
    private static StringBuffer text = new StringBuffer();
    private static boolean modificado = false;
    
    public static void erroVariavelJaExiste(String var, int line) {
        if(!modificado) modificado = true;
        text.append("Linha "+line +": identificador "+var+" ja declarado anteriormente").append('\n');
    }
    
    public static void erroVariavelNaoExiste(String var, int line) {
        if(!modificado) modificado = true;
        text.append("Linha "+line +": identificador "+var+" nao declarado").append('\n');
    }
    
    public static void escopoNaoPermitido(int line) {
        if(!modificado) modificado = true;
        text.append("Linha "+ line +": comando retorne nao permitido nesse escopo").append("\n");
    }
    
    public static void erroTipoNaoExiste(String tipo, int line) {
        if(!modificado) modificado = true;
        text.append("Linha "+ line +": tipo "+tipo+ " nao declarado").append("\n");
    }
    
    public static void erroVariavelNaoCompativel(String var, int line) {
        if(!modificado) modificado = true;
        text.append("Linha "+line +": atribuicao nao compativel para "+var).append('\n');
    }
     
    public static void erroIncompatibilidadeParametros(String funcao, int line) {
        if(!modificado) modificado = true;
        text.append("Linha "+line+": incompatibilidade de parametros na chamada de "+funcao).append('\n');
    }
    
    public static String getText() {
        return text.toString();
    }
    
    public static boolean isModificado() {
        return modificado;
    }
     
    public static void teste(String a) {
        text.append("---------------\n"+a).append('\n');
    }
}
