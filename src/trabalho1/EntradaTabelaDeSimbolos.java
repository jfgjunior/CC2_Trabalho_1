/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author daniel
 */
public class EntradaTabelaDeSimbolos {
    // nome: a cadeia que identifica o token
    // tipodado: pode ser inteiro, real, logico...
    // tipotoken: váriavel ou função
    private String nome, tipodado, tipotoken;
    
    public EntradaTabelaDeSimbolos(String nome, String tipodado, String tipotoken) {
        this.nome = nome;
        this.tipodado = tipodado;
        this.tipotoken = tipotoken;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipodado() {
        return tipodado;
    }
    
    public String getTipotoken() {
        return tipotoken;
    }
    
    @Override
    public String toString() {
        return nome+"("+tipotoken+":"+tipodado+")";
    }
}
