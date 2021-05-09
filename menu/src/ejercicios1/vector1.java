
package ejercicios1;
import java.io.*;

public class vector1 
{
      
    public static void main(String[] args)
    throws IOException        
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader (System.in));
     String sedad;
     int a,conta,contb,contc,acum,contd,conte;
     int prom;
     int edad[]=new int[8];
     prom=0;
     System.out.println("CAPTURA DE DATOS");
     for(a=0;a<=7;a++)
     {
      
     System.out.print("posicion ["+a+"] ");
     sedad=bf.readLine();
     edad[a]=Integer.parseInt(sedad);
     
     } 
        System.out.println("IMPRESION DEL VECTOR");
     for(a=0;a<=7;a++)
     {
         System.out.print(" ["+a+ "]"+edad[a]);    
     } 
     System.out.println ("\n");
     conta=0;
     System.out.println("POSICIONES DE EDAD ENTRE 15 Y 25 AÑOS");
     for(a=0;a<=7;a++)
     {
      if(edad[a]>=15& edad[a]<=25)
      {
      conta++;
          System.out.println("["+a+"]");
      }    
     }
     System.out.println("Esta entre 15 y 25 \t"+conta);
     contb=0;
     System.out.println("POSICIONES DE EDAD MENOR 15 AÑOS");
     for(a=0;a<=7;a++)
     {
      if(edad[a]<15)
      {
      contb++;
          System.out.println("["+a+"]");
      }    
     }
     System.out.println("Son menores de 15 años\t "+contb);
     contc=0;
     System.out.println("POSICIONES DE EDAD MAYOR 25 AÑOS");
     for(a=0;a<=7;a++)
     {
      if(edad[a]>25)
      {
      contc++;
          System.out.println("["+a+"]");
      }    
     }
        System.out.println("Son mayores de 25 años\t"+contc);
     acum=0;
     System.out.println("PROMEDIO DE LOS ELEMENTOS DEL VECTOR");
     for(a=0;a<=7;a++)
        {
         acum=edad[a]+acum;   
        }  
     prom=acum/8;
       System.out.println("El promedio de los elementos del vector fue "+prom);
     contd=0;
        System.out.println("ELEMENTOS MAYORES O IGUALES AL PROMEDIO");
     for(a=0;a<=7;a++)
     {
      if(edad[a]>=prom)
      {
       contd++;   
       System.out.println("["+a+"]");    
      }   
     }
        System.out.println("Los elementos mayores o iguales al promedio: \t "+contd);
     conte=0;
     System.out.println("ELEMENTOS MENORES AL PROMEDIO");
     for(a=0;a<=7;a++)
     {
      
      if(edad[a]<prom)
      {
       conte++; 
       System.out.println("["+a+"]");    
      }    
     }
     System.out.println("Los elementos menores al promedio: \t "+conte);
    }
    
   
          
}
