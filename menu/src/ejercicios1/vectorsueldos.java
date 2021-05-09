
package ejercicios1;

import java.io.*;
public class vectorsueldos {

    public static void main(String[] args)
    throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String ssueldo;
    long sueldo[]=new long[8];
    long suma[]=new long[8];
    long acum,prom;
    int a,conta,contb;
    acum=0;
    for(a=0;a<=7;a++)
    {
        System.out.print("Sueldo ["+a+"]");
        ssueldo=bf.readLine();
        sueldo[a]=Long.parseLong(ssueldo);
        acum=acum+sueldo[a];

    }
        System.out.println("\n");

 System.out.println("SUELDOS EMPLEADOS");
 for(a=0;a<=7;a++)
    {
        System.out.print("["+a+"]"+sueldo[a]);

    }
    prom=acum/8;
    System.out.println("\n");
    System.out.println("El promedio de sueldos es igual a "+prom);
    System.out.println("\n");
    conta=0;
    System.out.println("SUELDOS SUPERIORES AL PROMEDIO");
    for(a=0;a<=7;a++)
    {
    if(sueldo[a]>=prom)
    {
     conta++;
     System.out.print("["+a+"]");
    }
    }
    System.out.println("Numero de sueldos superiores o iguales al promedio:   "+conta);
        System.out.println("\n");
    contb=0;
    System.out.println("SUELDOS INFERIORES AL PROMEDIO");
    for(a=0;a<=7;a++)
    {
    if(sueldo[a]<prom)
    {
     contb++;
     System.out.print("["+a+"]");
    }
    }
        System.out.println("Numero de sueldos inferiores al promedio:   "+contb);
        System.out.println("\n");
     System.out.println("POSICIONES IMPARES VECTOR SUELDO");
     for(a=0;a<=7;a++)
     {
       if(a%2!=0)
       {
           System.out.print("["+a+"]"+sueldo[a]);
       }
     }
        System.out.println("\n");
        System.out.println("SUELDOS EMPLEADOS INVERTIDOS");
 for(a=7;a>=0;a--)
    {
        System.out.print("["+a+"]"+sueldo[a]);

    }

        System.out.println("\n");
    System.out.println("ADICION A SUELDOS MENORES DE 900000");
    for(a=0;a<=7;a++)
    {
    if(sueldo[a]<900000)
    {
        suma[a]=sueldo[a]+100000;
        System.out.print("["+a+"]"+suma[a]);
    }

        

    }
    System.out.println("\n");

    }

}
