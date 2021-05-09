
package cuadradomagico;

import java.util.Scanner;

public class CuadradoMagico {
    
    static int numale(int n){
        int x;
        x= (int) (Math.random()*(n*n)+1);
        return x;
    }
    
    static void mtcuad(){
        Scanner leer=new Scanner(System.in);
        int n;
        n=leer.nextInt();

        int consmag;
        consmag=n*((n*n)+1)/2;
        boolean perf=false;
        if (n>=3){
        int m[][]=new int[n][n];
        while (perf==false){
            int acumfil=0;
            int acumcol=0;
            int sumadiag=0;
            int sumadiagsec=0;
            int sumafil=0;
            int sumacol=0;
            for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
                m[i][j]=numale(n);
                if (i==j){
                    sumadiag=sumadiag+m[i][j];
                }
                if (i+j==n-1){
                sumadiagsec=sumadiagsec+m[i][j];
                }     
            }    
        }
       
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
            System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
          for (int i=0;i<m.length;i++){
          sumafil=0;
          for (int j=0;j<m[i].length;j++){
              sumafil=sumafil+m[i][j];
              acumfil=acumfil+m[i][j];
          }
            System.out.println("suma fila "+(i)+":"+" "+sumafil);
        }
          
        for (int i=0;i<m[0].length;i++){
            sumacol=0;
            for (int j=0;j<m.length;j++){
                sumacol=sumacol+m[j][i];
                acumcol=acumcol+m[j][i];
            }
            System.out.println("suma colunma "+(i)+":"+" "+sumacol);
        }  
        System.out.println("Suma diagonal principal:"+" "+sumadiag);
        System.out.println("Suma diagonal secundaria:"+" "+sumadiagsec);
        if (sumadiag==consmag){
            if(sumadiagsec==consmag){
                if(acumfil==consmag){
                    if(acumcol==consmag){
                        perf=true;   
                    }
                }
            }   
        }
        }
        }
        }
      
    public static void main(String[] args) {
        mtcuad();
    }
    
    
    
}
