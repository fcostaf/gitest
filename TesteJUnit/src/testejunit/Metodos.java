package testejunit;
public class Metodos {

    public Metodos() {
    }
    public String getIniciais(String nome){
        String[] iniciais=nome.split(" ");
        String[] cIniciais=new String[iniciais.length];
        int m=0;
        for(String n: iniciais){
            cIniciais[m]=String.valueOf(n.charAt(0));
            m+=1;
        }
        String cod="";
        for(String c: cIniciais){
            cod+=c;
        }
        return cod;
    }
    
    public int[] progressaoAritmetica(int a,int b,int c){
        int[] resultado=new int[c];
        int n=0;
        while(n<c){
            resultado[n]=a;
            a+=b;
            n+=1;
        }
        return resultado;
    }
    
    public int[] progressaoGeometrica(int a,int b,int c){
        int[] resultado=new int[c];
        int n=0;
        while(n<c){
            resultado[n]=a;
            a*=b;
            n+=1;
        }
        return resultado;
    }
}
