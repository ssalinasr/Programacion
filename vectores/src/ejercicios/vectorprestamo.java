
package ejercicios;
import java.io.*;
public class vectorprestamo
{

    public static void main(String[] args) 
    throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String sprestamo,sabono;
    int a;
    long acum1,acum2,acum3;
    long prestamo[]=new long[3];
    long abono[]=new long[3];
    long saldo[]=new long[3];

        acum1=0;
        System.out.println("CAPTURA PRESTAMO DE LOS EMPLEADOS");
        for(a=0;a<=2;a++)
        {
            System.out.print("["+a+"]");
            sprestamo=bf.readLine();
            prestamo[a]=Long.parseLong(sprestamo);
            acum1=acum1+prestamo[a];
        }
        System.out.println("IMPRESION PRESTAMO DE LOS EMPLEADOS");
        for(a=0;a<=2;a++)
        {
            System.out.print("["+a+"]"+prestamo[a]);

        }
        System.out.println("\n");
        acum2=0;
        System.out.println("ABONO AL SALDO");
        for(a=0;a<=2;a++)
        {
            System.out.print("["+a+"] ");
            sabono=bf.readLine();
            abono[a]=Long.parseLong(sabono);
            acum2=acum2+abono[a];
        }
        System.out.println("IMPRESION ABONO AL SALDO");
        for(a=0;a<=2;a++)
        {
            System.out.print("["+a+"]"+abono[a]);

        }
        System.out.println("\n");
        acum3=0;
        System.out.println("SALDO DE LOS EMPLEADOS");
        for(a=0;a<=2;a++)
        {
          saldo[a]=prestamo[a]-abono[a];
          System.out.println("["+a+"]"+saldo[a]);
          acum3=acum3+saldo[a];


        }

        System.out.println("El total de prestamos a pagar es: \t"+acum1);
        System.out.println("El total de abonos a pagar es: \t"+acum2);
        System.out.println("El total de saldos a pagar es: \t"+acum3);

    }

}
