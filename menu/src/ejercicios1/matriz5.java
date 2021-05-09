
package ejercicios1;

import java.io.*;
public class matriz5 

{
    public static void main(String[] args)
     throws IOException
    {
        
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));  
        String smatriz;
     int matriz[][]=new int[3][4];
     int a,b;
     int menor,posmenor1,posmenor2;
        
     //------------------------------------------------------------------
     System.out.println("CAPTURA DE DATOS");
     for(a=0;a<=2;a++)
     {
      for(b=0;b<=3;b++)
      {
          System.out.print("["+a+"]["+b+"]");   
          smatriz=bf.readLine();
          matriz[a][b]=Integer.parseInt(smatriz);
          
      }   
         
     } 
        System.out.println("\n");
     //---------------------------------------------------------------
     System.out.println("IMPRESION MATRIZ");
     for(a=0;a<=2;a++)
     {
      for(b=0;b<=3;b++)
      {
       System.out.print("["+a+"]["+b+"]"+matriz[a][b]);
       
          
      }
         System.out.println("\n");
     }  
        System.out.println("\n");
     
    //--------------------------------------------------------------------------   
        System.out.println("IMPRESION EN DIAGONAL");
     for(a=0;a<=2;a++)
     {
         
         System.out.println("["+a+"]["+a+"]"+matriz[a][a]);    
         
     }   
        System.out.println("\n");
        
     menor=matriz[0][0];
     posmenor1=posmenor2=0;
     
     for(a=0;a<=2;a++)
     {
       for(b=0;b<=3;b++)
       {
        if(menor>matriz[a][b])
        {
         menor=matriz[a][b];   
         posmenor1=a;
         posmenor2=b;
            
        }   
        
           
        }  
       
       
           
       }   
     System.out.println("El menor es "+menor+" en la posicion ["+posmenor1+"]["+posmenor2+"]");
     //-------------------------------------------------------------------------
     int cont1;
       cont1=0;
         System.out.println("NUMERO NEGATIVOS");
       for(a=0;a<=2;a++)
       {
        for(b=0;b<=3;b++)
        {
         if(matriz[a][b]<0)
         {
           cont1++;  
            System.out.print("["+a+"]["+b+"]"); 
         }  
            
        }   
           
       }  
        System.out.println("\n");
        System.out.println("Negativos: "+cont1);
        
       //-----------------------------------------------------------------------
        System.out.println("ELEMENTOS COLUMNA 1");
        
        for(a=0;a<=2;a++)
        {
         for(b=0;b<=3;b++)
         {
           if(b==1)
           {
             System.out.print("["+a+"]["+b+"]"+matriz[a][b]);
               
           }   
             
         
             
         }  
            System.out.println("\n");
            
        }   
        //----------------------------------------------------------------------
        System.out.println("\n");
        System.out.println("ELEMENTOS COLUMNA 3");
        for(a=0;a<=2;a++)
        {
         for(b=0;b<=3;b++)
         {
           if(b==3)
           {
             System.out.print("["+a+"]["+b+"]"+matriz[a][b]);
             
               
           }   
             
         }   
            System.out.println("\n");    
        } 
        System.out.println("\n");
        
     //-------------------------------------------------------------------------
        
        System.out.println("COLUMNA 1 Y COLUMNA 3");
        
        for(a=0;a<=2;a++)
        {
         for(b=1;b<=3;b=b+2)
             
             
         {
             
           System.out.print("["+a+"]["+b+"]"+matriz[a][b]);  
         }   
            
            System.out.println("\n");    
        }    
     }  
    
    }

