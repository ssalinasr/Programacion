package ejercicios1;

import java.io.*;
public class vector6
{
 
    public static void main(String[] args)
    throws IOException        
    {
        
   BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));     
    double notas[]=new double[]{5.0,1.0,2.6,1.1,4.2,3.2,3.6,4.5,4.2,3.1,3.6,4.2,2.5,2.9,3.6,4.1,4.2,3.1,2.7};   
    
    int a,b,c,d,e,conta,contb,contc,contd;
    double mayor,menor;
    int posmayor,posmenor;
    
    double acuma,prom;
    System.out.println("IMPRESION DATOS");
    for(a=0;a<=18;a++)
    {
        System.out.print("\t["+a+"]"+notas[a]);   
        
        
    }    
    
        System.out.println("\n");    
        
     conta=contb=contc=contd=0; 
     acuma=0;
     
     for(a=0;a<=18;a++)
        {
         if(notas[a]==1.0)
         {
         notas[a]=notas[a]+0.5;    
             
         }  
            
        }
     for(a=0;a<=18;a++)
     {
         
       if(notas[a]>=3)
       {
         if(notas[a]<=3.5)
         {
          conta++;   
             
         }   
         else
         {
           if(notas[a]<=4)
           {
           contb++;
           }  
           else
           {
            contc++; 
            acuma=acuma+notas[a];
           }    
         }  
       }  
        else
       {
        contd++; 
        
       } 
        
     }
     
        System.out.println("El tamaño del vector 1 será  "+conta);
        System.out.println("El tamaño del vector 2 será  "+contb);
        System.out.println("El tamaño del vector 3 será  "+contc);
        System.out.println("El tamaño del vector 4 será  "+contd);
        
         System.out.println("BUSQUEDA NUMERO 3.6");
       int cont36;
       cont36=0;
       
       for(a=0;a<=18;a++)
       {
         if(notas[a]==3.6) 
         {
             cont36++;
             System.out.println("["+a+"]");
             
         }   
             
            
           
       }   
         
       System.out.println("El numero 3.6 se repite "+cont36+" veces"); 
        double vector1[]=new double[conta];
        double vector2[]=new double[contb];
        double vector3[]=new double[contc];
        double vector4[]=new double[contd];
        b=c=d=e=0;
        for(a=0;a<=18;a++)
     {
         
       if(notas[a]>=3)
       {
         if(notas[a]<=3.5)
         {
         vector1[b]=notas[a];
         b++;
             
         }   
         else
         {
           if(notas[a]<=4)
           {
           vector2[c]=notas[a];
           c++;
           }  
           else
           {
            vector3[d]=notas[a];   
            d++;  
            
           }    
         }  
       }  
        else
       {
        vector4[e]=notas[a];
        e++;
       } 
         
     }
     prom=acuma/contc;
        System.out.println("El promedio de los mayores a 4 es : "+prom);        
        
        System.out.println("VECTOR DE 3.0 A 3.5");
        for(a=0;a<=b-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector1[a]);   
            
        }
        System.out.println("\n");
        System.out.println("VECTOR DE 3.6 A 4.0");
        for(a=0;a<=c-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector2[a]);   
            
        } 
        System.out.println("\n");
        System.out.println("VECTOR MAYORES A 4.0");
        for(a=0;a<=d-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector3[a]);   
            
        }
        System.out.println("\n");
        System.out.println("VECTOR MENORES A 3");
        for(a=0;a<=e-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector4[a]);   
            
        }  
       
        System.out.println("\n");
        
        
        
        
        
        System.out.println("IMPRESION MAYOR Y MENOR");
        mayor=menor=notas[0];
        posmayor=posmenor=0;
        
        for(a=0;a<=18;a++)
        {
         if(mayor<notas[a])
         {
          mayor=notas[a];
          posmayor=a;
         }   
            
        }
        for(a=0;a<=18;a++)
        {
         if(menor>notas[a])
         {
          menor=notas[a];
          posmenor=a;
         }   
            
        }
        
        
        System.out.println("El numero mayor es "+mayor+" en la posicion ["+posmayor+"]");
        System.out.println("El numero menor es "+menor+" en la posicion ["+posmenor+"]");
       
    }       
    
    
    
    
    
}
    
