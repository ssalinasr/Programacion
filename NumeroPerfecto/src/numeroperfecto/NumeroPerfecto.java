
package numeroperfecto;

import java.util.Scanner;
public class NumeroPerfecto {
    static boolean numperf(int n){
        int suma=0;
        int val;
        int mod;
        val=n;
        for (int i=1;i<val;i++){
        mod=n%i;
        if (mod==0){
            suma=suma+i;     
        }    
        }
        if(val==suma){
        return true;    
        }
        else{
        return false;
        }
        }
    
    static int leer(){
        Scanner leer=new Scanner(System.in);
        int num;
        num=leer.nextInt();
        return num;       
    }
    
    static void inicio(){
        int n;
       System.out.println("ingrese valor:");
       n=leer();
       if(numperf(n)){
       System.out.println("es un numero perfecto");
       }
       else{
       System.out.println("no es un numero perfecto");    
       }   
    }
    public static void main(String[] args) {
     inicio();
  
    }
    
}
