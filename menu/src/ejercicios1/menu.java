
package ejercicios1;
import java.io.*;
public class menu 
{
    public static void main(String[] args) 
     throws IOException       
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
     String snum;
     int a,b,num,cont,acum,prom;
     int numeros[][]=new int[4][5];
     
        System.out.println("CAPTURA DE DATOS MATRIZ");
        //----------------------------------------------
        for(a=0;a<=3;a++)
        {
         for(b=0;b<=4;b++)
         {
             System.out.print("["+a+"]["+b+"]");
             snum=bf.readLine();
             numeros[a][b]=Integer.parseInt(snum);
         }   
        }   
        
        System.out.println("\n");
        //-------------------------------------------- 
       System.out.println("IMPRESION DE DATOS MATRIZ");
        for(a=0;a<=3;a++)
        {
         for(b=0;b<=4;b++)
         {
             System.out.print(" ["+a+"]["+b+"]"+numeros[a][b]);
             
         }   
            System.out.println("\n");
        }   
        
        System.out.println("\n"); 
   //------------------------------------------------------- 
    num=0; 
        System.out.println("BUSQUEDA DEL 3");
   for(a=0;a<=3;a++)
        {
         for(b=0;b<=4;b++)
         {
            if(numeros[a][b]==3)
            {
               num++; 
              System.out.print(" ["+a+"]["+b+"]");  
            }   
             
         }   
            System.out.println("\n");   
        }  
        System.out.println("Se encontro el tres "+num+" veces");
        System.out.println("\n");
        
      //-------------------------------------------------------
         cont=0; 
         acum=0;
        System.out.println("PROMEDIO NUMEROS ENTRE 3 Y 7");
    for(a=0;a<=3;a++)
        {
         for(b=0;b<=4;b++)
         {
            if(numeros[a][b]>=3)
            {
                if(numeros[a][b]<=7)
                {
                 cont++;
                 acum=acum+numeros[a][b];
                }  
            }   
            
         }   
            System.out.println("\n");   
        }
        prom=acum/cont;
        System.out.println("El promedio es \t"+prom);
        System.out.println("\n");
        
    }
}
