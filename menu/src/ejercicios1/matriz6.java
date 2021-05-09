
package ejercicios1;

import java.io.*;
public class matriz6 
{
    public static void main(String[] args) 
    throws IOException
    {
      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      double notas[][]=new double[][]{{5.0,3.0,1.0,4.0,2.0},
                                       {1.3,1.6,1.9,4.1,3.6},
                                       {3.2,4.1,3.9,2.8,1.5},
                                       {1.4,3.6,3.9,3.2,3.0}};
      
      int a,b,cont1,cont2,cont3;
      double acum1,acum2,acum3,prom1,prom2,prom3;
      //------------------------------------------------------------------------
      System.out.println("IMPRESION MATRIZ NOTAS");
      for(a=0;a<=3;a++)
      {
       for(b=0;b<=4;b++)
       {
           
           System.out.print("["+a+"]["+b+"]"+notas[a][b]);  
       }   
          System.out.println("\n");   
      }    
       cont1=cont2=cont3=0;
       
     for(a=0;a<=3;a++)
      {
       for(b=0;b<=4;b++)
       {
           
          if(notas[a][b]>=3.0)
          {
            if(notas[a][b]<=4.0)
            {
                
             cont1++;  
             
            }  
            else
            {
             cont2++;   
            }    
          } 
          else
          {
           cont3++;   
              
          }    
       }   
            
      }    
     
        System.out.println("Notas entre 3 y 4:\t"+cont1);
        System.out.println("Notas mayores a 4:\t"+cont2);
        System.out.println("Notas menores a 3:\t"+cont3);
     
      double vectorentre[]=new double[cont1];
      double vectorsobre[]=new double[cont2];
      double vectordebajo[]=new double[cont3];
      int c,d,e;
//------------------------------------------------------------------------------     
      c=d=e=0;
      acum1=acum2=acum3=0;
      
      for(a=0;a<=3;a++)
      {
       for(b=0;b<=4;b++)
       {
           
          if(notas[a][b]>=3.0)
          {
            if(notas[a][b]<=4.0)
            {
             vectorentre[c]=notas[a][b];
             acum1=acum1+vectorentre[c];
             c++;
             
            }  
            else
            {
             vectorsobre[d]=notas[a][b];
             acum2=acum2+vectorsobre[d];
             d++;
            }    
          } 
          else
          {
            vectordebajo[e]=notas[a][b];
            acum3=acum3+vectordebajo[e];
            e++;
              
          }    
       }   

         
      
            
      }
        System.out.println("\n");
      // --------------------------------------------------------------------------------
       System.out.println("VECTOR ENTRE 3 Y 4");
       for(a=0;a<=c-1;a++)
       {
           System.out.print("["+a+"]"+vectorentre[a]);  
           
       }
        System.out.println("\n");
         System.out.println("VECTOR MAYORES A 4");
       for(a=0;a<=d-1;a++)
       {
           System.out.print("["+a+"]"+vectorsobre[a]);  
           
       }
        System.out.println("\n");
         System.out.println("VECTOR MENORES A 3");
       for(a=0;a<=e-1;a++)
       {
           System.out.print("["+a+"]"+vectordebajo[a]);  
           
       }
        System.out.println("\n");
        
        prom1=acum1/cont1;
        prom2=acum2/cont2;
        prom3=acum3/cont3;
        
        System.out.println("El promedio de las notas entre 3 y 4: \t"+prom1);
        System.out.println("El promedio de las notas mayores a 4: \t"+prom2);
        System.out.println("El promedio de las notas menores a 3 : \t"+prom3);
    
    }
    
}
    

