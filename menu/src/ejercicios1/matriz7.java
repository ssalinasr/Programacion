
package ejercicios1;

import java.io.*;
public class matriz7 
{

    public static void main(String[] args) 
     throws IOException       
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     double notas[][]=new double[4][4];
     int a,b;
     String snota;
     double acum;
     
     
     for(a=0;a<=3;a++)
     {
      acum=0;   
      for(b=0;b<=2;b++)
      {
          System.out.println("Alumno No "+(a+1)+" ingrese la "+(b+1)+" nota");
          snota=bf.readLine();
          notas[a][b]=Double.parseDouble(snota);
          
          if(b<=1)
          {
          acum=acum+notas[a][b]*0.3;    
              
          }   
          else
          {
           acum=acum+notas[a][b]*0.4;       
              
          }   
      }   
      notas[a][3]=acum;   
     }    
//  ----------------------------------------------------------------------------   
        System.out.println("IMPRESION DEFINITIVA");
     for(a=0;a<=3;a++)
     {
       for(b=0;b<=3;b++)
       {
           System.out.print("["+a+"]["+b+"]"+notas[a][b]);   
       }   
         System.out.println("\n");  
     }   
    }
}
