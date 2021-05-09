

package ejercicios;
import java.io.*;
public class vector3 
{

 
    public static void main(String[] args) 
    throws IOException
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
     String scuantos;
     int cuantos;
        System.out.println("Cuantos empleados evaluará");
        scuantos=bf.readLine();
        cuantos=Integer.parseInt(scuantos);
     String sprestamo,sabono;   
     int prestamo[]=new int[cuantos];
     int abono[]=new int[cuantos];
     int saldo[]=new int[cuantos];
     int a,acump,acuma,acums,prom;
     acump=0;
     System.out.println("CUAL FUE SU PRESTAMO");
     for(a=0;a<=cuantos-1;a++)
     {
         System.out.print("Posicion: ["+a+"]"); 
         sprestamo=bf.readLine();
         prestamo[a]=Integer.parseInt(sprestamo);
         acump=acump+prestamo[a];
         
     } 
        acuma=0;
        System.out.println("\n");
     System.out.println("CUAL FUE EL ABONO AL SALDO");
     for(a=0;a<=cuantos-1;a++)
     {
         System.out.print("Posicion: ["+a+"]"); 
         sabono=bf.readLine();
         abono[a]=Integer.parseInt(sabono);
         acuma=acuma+abono[a];
         
     } 
        System.out.println("\n");
        System.out.println("PRESTAMO");
     for(a=0;a<=cuantos-1;a++)
     {
         System.out.print("["+a+"]\t"+prestamo[a]+"\t"); 
     }    
        System.out.println("\n");
        System.out.println("ABONO");
     for(a=0;a<=cuantos-1;a++)
     {
         System.out.print( "["+a+"]\t"+abono[a]+"\t"); 
            
     }
        System.out.println("\n");
        acums=0;
        System.out.println("SALDO");
     for(a=0;a<=cuantos-1;a++)
     {
         saldo[a]=prestamo[a]-abono[a];
         acums=acums+saldo[a];
         System.out.print("["+a+"]\t"+saldo[a]+"\t");
         
     } 
        System.out.println("\n");
        prom=acums/a;
        System.out.println("El total de prestamos: "+acump);
        System.out.println("El total de abonos: "+acuma);
        System.out.println("El promedio de saldos: "+prom);
        System.out.println("\n");
        System.out.println("MAYOR PRESTAMO");
        int mayor,posmayor;
        
        mayor=prestamo[0];
        posmayor=0;
        
        for(a=1;a<=cuantos-1;a++)
        {
          if(mayor<prestamo[a])
          {
           mayor=prestamo[a];
           posmayor=a;
          } 
        } 
            System.out.println("El mayor prestamo fue \t: "+mayor+" y lo encontro en la posicion ["+posmayor+"] ");
            
            System.out.println("MENOR ABONO");
            int menor,posmenor;
            menor=abono[0];
            posmenor=0;
          for(a=1;a<=cuantos-1;a++)
          {
              if(menor>abono[a])
              {
               menor=abono[a];
               posmenor=a;
              }
                   
          }  
          System.out.println("El menor abono fue \t: "+menor+" y lo encontro en la posicion ["+posmenor+"]");
          
            System.out.println("MAYOR SALDO POSICIONES IMPARES"); 
         int mayor1,posmayor1;
            mayor1=saldo[1];
         posmayor1=0;
          for(a=1;a<=cuantos-1;a=a+2)
          {
           if(mayor1<=saldo[a])
           {
            mayor1=saldo[a];
           posmayor1=a;        
           }   
          }   
         System.out.println("El mayor prestamo fue \t: "+mayor1+" y lo encontro en la posicion ["+posmayor1+"] "); 
        }    
    }
    

