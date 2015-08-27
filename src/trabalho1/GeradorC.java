/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fabioclug
 */
public class GeradorC {
    private String codigo;
    
    public GeradorC() {
        codigo = "";
    }
    
    public void addLinha(String linha) {
        codigo += linha + "\n";
    }
    
    public void gerarArquivo(String nomeArquivo) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nomeArquivo)); 
        buffWrite.append(codigo); 
        buffWrite.close();
    }
}
