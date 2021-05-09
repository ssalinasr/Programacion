
package ejercicios1;

import java.io.*;
public class vector5 {

 
    public static void main(String[] args) 
     throws IOException       
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int vector[]= new int[]{-5,7,9,3,16,-8,17,4,3}; 
    int a,b,temp;
   
   for(a=0;a<=7;a++)
   {
     for (b=a+1;b<=8;b++)
     {
       if(vector[a]>vector[b])
       {
         temp=vector[a];
         vector[a]=vector[b];
         vector[b]=temp;
       }   
     }   
   }  
        System.out.println("ORDEN ASCENDENTE");
   for(a=0;a<=8;a++)
   {
       System.out.print("["+a+"]"+vector[a]);    
       
       
   } 
        System.out.println("\n");
        
    }
    
}
