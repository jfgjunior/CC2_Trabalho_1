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
    
    public static void erroVariavelJaExiste(String var, int line) {
        text.append("Linha "+line +": identificador "+var+" ja declarado anteriormente").append('\n');
    }
    
    public static void erroVariavelNaoExiste(String var, int line) {
        text.append("Linha "+line +": identificador "+var+" nao declarado").append('\n');
    }
    
    public static void escopoNaoPermitido(int line) {
        text.append("Linha "+ line +": comando retorne nao permitido nesse escopo").append("\n");
    }
    
    public static void erroTipoNaoExiste(String tipo, int line) {
        text.append("Linha "+ line +": tipo "+tipo+ " nao declarado").append("\n");
    }
    
    public static String getText() {
        return text.toString();
    }
    
     public static void erroVariavelNaoCompativel(String var, int line) {
        text.append("Linha "+line +": atribuicao nao compativel para "+var).append('\n');
    }
     
     public static void erroIncompatibilidadeParametros(String funcao, int line) {
         text.append("Linha "+line+": incompatibilidade de parametros na chamada de "+funcao).append('\n');
    }
     
     public static void teste(String b, String a, String c) {
        text.append("IDENT "+b+" tipo IDENT "+a+" tipo atributo "+c).append('\n');
    }
}
