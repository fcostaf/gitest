/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejunit;

/**
 *
 * @author 771000343
 */
public class Metodos {
    public String getIniciais(String nome){
        String[] iniciais=nome.split("");
        String[] cIniciais=new String[iniciais.length];
        int m=0;
        for(String n: iniciais){
            cIniciais[m]=String.valueOf(n.charAt(m));
        }
        return iniciais;
    }
}
