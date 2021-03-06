/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }
    
    //Retorna a tabela correspondente ao escopo global
    public TabelaDeSimbolos tabelaGlobal() {
        for (TabelaDeSimbolos ts : pilha) {
            if(ts.getName().equals("global"))
                    return ts;
        }
        return null;
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }
    
    //Checa em todas as tabelas da pilha e retorna o tipo da variavel
    public String getTypeData(String nome) {
        for(TabelaDeSimbolos ts : pilha) {
            if(ts.existeSimbolo(nome)) {
                return ts.getTypeData(nome);
            }
        }   
        return "";
    }
    
    
    public String getVarTipo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return ts.getVarTipo(nome);
            }
        }
        return "false";
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        Saida.println(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
