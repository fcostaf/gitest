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
public class TesteJUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m=new Metodos();
        System.out.println(m.getIniciais("Felipe Costa Fernandes"));
        for(int r:m.progressaoAritmetica(2, 3, 5)){
            System.out.println(r);
        }
    }
    
}
