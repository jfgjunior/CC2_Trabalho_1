/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */

//As funçoes de adicionarSimbolos foram alteradas para se adequar aos atributos que foram adicionados.

public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, String tipodado, String tipotoken) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipodado, tipotoken));
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipodado, String tipotoken) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipodado, tipotoken));
        }
    }
    
    public String getName() {
        return escopo;
    }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public String getTypeData(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getTipodado();
            }
        }
        return "";
    }
    
    //Metodo adicionado para retornar o tipo de uma entrada na tabela de simbolos
    public String getVarTipo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getTipodado();
            }
        }
        return "false";
    }
    
    //Retorna o escopo associado a tabela
    public String getType() {
        if (escopo.contains("funcao"))
            return "funcao";
        else if (escopo.contains("procedimento"))
            return "procedimento";
        return "global";
    }
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
