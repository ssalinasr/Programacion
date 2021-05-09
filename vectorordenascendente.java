
package ejercicios;
import java.io.*;

public class vectorordenascendente
{
    public static void main(String[] args)
     throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     int a;
     String svector;
    int vector[]=new int[10];

        System.out.println("CAPTURA DE DATOS");
        for(a=0;a<=9;a++)
        {
            System.out.print("["+a+"]");
            svector=bf.readLine();
            vector[a]=Integer.parseInt(svector);
        }
        System.out.println("\n");
        System.out.println("IMPRESION EN FORMA ASCENDENTE");
       for(a=0;a<=9;a++)
       {    
       System.out.print("["+a+"]"+vector[a]);
       
       }
        System.out.println("\n");
        }
    }


