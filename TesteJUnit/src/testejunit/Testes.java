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
public class Testes {
    Metodos m=new Metodos();
    public void testaGetIniciais(){
        String nome="Felipe Costa Fernandes";
        String esperado="FCF";
        String resultado=m.getIniciais(nome);
        
        if(esperado.equals(resultado)){
            System.out.println("Sucesso");
        }else{
            System.out.println("Falha");
        }
    }
    
    public void testaProgressaoAritmetica(){
        int a=2;
        int b=3;
        int c=5;
        int[] esperado={2,5,8,11,14};
        int[] resultado=m.progressaoAritmetica(a, b, c);
        
        int m=0;
        int soma=0;
        for(int n:esperado){
            if(n==resultado[m]){
                soma+=1;
            }
            m+=1;
        }
        if(soma==c){
            System.out.println("Sucesso");
        }else{
            System.out.println("Falha");
        }
    }
    
    public void testaProgressaoGeometrica(){
        int a=2;
        int b=3;
        int c=5;
        int[] esperado={2,6,18,54,162};
        int[] resultado=m.progressaoGeometrica(a, b, c);
        
        int m=0;
        int soma=0;
        for(int n:esperado){
            if(n==resultado[m]){
                soma+=1;
            }
            m+=1;
        }
        if(soma==c){
            System.out.println("Sucesso");
        }else{
            System.out.println("Falha");
        }
    }
}
