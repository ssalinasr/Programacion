
package ejercicios1;

import java.io.*;
public class softbolivar
{


    public static void main(String[] args)
    throws IOException
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

     String santi;
     long anti,paquete,con1,con2,con3,acum1,acum2,acum3,acumgen,a;

     paquete=con1=con2=con3=acum1=acum2=acum3=acumgen=0;
     for(a=1;a<=10;a++)
     {
     System.out.println("Usuario No \t"+a);
     System.out.println("Cual es su antiguedad");
     santi=bf.readLine();
     anti=Long.parseLong(santi);
    
     if(anti>=10)
     {
      if(anti<=20)
      {
      con1++;
      System.out.println("Usted tiene el derecho al paquete 2");
      paquete=800;
      acum1=acum1+paquete;
      }
      else
      {
      con2++;
      System.out.println("Usted tiene derecho al paquete 3");
      paquete=1300;
      acum2=acum2+paquete;

      }
     }
     else
     {
      con3++;
     System.out.println("Usted tiene derecho al paquete 1");
     paquete=500;
     acum3=acum3+paquete;

     }


     }

     acumgen=acum1+acum2+acum3;
        System.out.println("El numero de empleados que tuvo derecho al paquete 1 fue \t"+con3);
        System.out.println("El numero de empleados que tuvo derecho al paquete 2 fue \t"+con1);
        System.out.println("El numero de empleados que tuvo derecho al paquete 3 fue \t"+con2);
        System.out.println("El total de acciones vendidas del paquete 1 fue  \t"+acum3);
        System.out.println("El total de acciones vendidas del paquete 2 fue \t"+acum1);
        System.out.println("El total de acciones vendidas del paquete 3 fue \t"+acum2);
        System.out.println("El total de acciones vendidas fue \t"+acumgen);
    }

}
