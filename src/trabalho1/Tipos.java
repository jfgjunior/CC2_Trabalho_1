/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.misc.Pair;

/**
 *
 * @author Fabioclug
 */
public class Tipos {
    private Map<String, List<Pair>> tipos;
    
    public Tipos() {
        tipos = new HashMap<String, List<Pair>>();
        List<Pair> tipo_basico = new ArrayList<Pair>();
        tipos.put("inteiro", tipo_basico);
        tipos.put("real", tipo_basico);
        tipos.put("literal", tipo_basico);
        tipos.put("logico", tipo_basico);
    }
    
    public void addTipo(String tipo, List<Pair> atributos) {
        tipos.put(tipo, atributos);
    }
    
    public boolean existeTipo(String tipo) {
        for (String t : tipos.keySet()) {
            if (t.equals(tipo))
                return true;
        }
        return false;
    }
}
