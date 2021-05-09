
package ejercicios1;

import java.io.*;
public class vector2 
{

    public static void main(String[] args) 
    throws IOException
    {        
    BufferedReader bf=new BufferedReader( new InputStreamReader(System.in));
    String spvector1,spvector2;
    int vector1[]=new int[5];
    int vector2[]=new int[5];
    int suma[]=new int[5];
    int resta[]=new int[5];
    int mult[]=new int[5];
    int div[]=new int[5];
    int a,conta,contb,contc;
     
   
    System.out.println("CAPTURA DE DATOS VECTOR 1");
    for(a=0;a<=4;a++)
    {
        System.out.print("Posicion ["+a+"]"); 
        spvector1=bf.readLine();
        vector1[a]=Integer.parseInt(spvector1);
        
    } 
     System.out.println("IMPRESION VECTOR 1");
    for(a=0;a<=4;a++)
    {
        System.out.print(" ["+a+"]"+vector1[a]); 
        
        
    } 
    System.out.println("\n");  
    System.out.println("CAPTURA DE DATOS VECTOR 2");
    for(a=0;a<=4;a++)
    {
        System.out.print("Posicion ["+a+"]"); 
        spvector2=bf.readLine();
        vector2[a]=Integer.parseInt(spvector2);
        
    } 
       System.out.println("IMPRESION VECTOR 2");
    for(a=0;a<=4;a++)
    {
        System.out.print(" ["+a+"]"+vector2[a]); 
        
        
    } 
    System.out.println("\n");
    System.out.println("SUMA");
    for(a=0;a<=4;a++)
    {
     suma[a]=vector1[a]+vector2[a];
        System.out.print("["+a+"]"+suma[a]);
    }  
    System.out.println("\n");
    System.out.println("RESTA");
    for(a=0;a<=4;a++)
    {
     resta[a]=vector1[a]-vector2[a];
        System.out.print("["+a+"]"+resta[a]);
    } 
    System.out.println("\n");
    System.out.println("MULTIPLICACION");
    for(a=0;a<=4;a++)
    {
     mult[a]=vector1[a]*vector2[a];
        System.out.print("["+a+"]"+mult[a]);
    } 
    System.out.println("\n");
    System.out.println("DIVISION");
    for(a=0;a<=4;a++)
    {
     div[a]=vector1[a]/vector2[a];
        System.out.print("["+a+"]"+div[a]);
    } 
    System.out.println("\n");
     System.out.println("POSITIVOS");
    conta=0;
    for(a=0;a<=4;a++)
    {
        if(mult[a]>=0)
        {    
        conta++;
        System.out.print("["+a+"]");
        }
    }
    System.out.println("\n");
    System.out.println("Numeros positivos: \t"+conta);
    System.out.println("\n");
    System.out.println("NEGATIVOS");
    contb=0;
    for(a=0;a<=4;a++)
    {
        if(mult[a]<0)
        {    
        contb++;
        System.out.print("["+a+"]");
        }
    } 
            
    System.out.println("\n"); 
    System.out.println("Numeros negativos: \t"+contb);
    System.out.println("\n");
    System.out.println("\n");
     System.out.println("PARES");
    contc=0;
    for(a=0;a<=4;a++)
    {
        if(suma[a]%2==0)
        {    
        contc++;
        System.out.print("["+a+"]");
        }
    }
    System.out.println("\n");
    System.out.println("Numeros pares: \t"+contc);
    System.out.println("\n");
    }
}
