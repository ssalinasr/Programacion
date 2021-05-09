
package ejercicios1;
import java.io.*;
public class matriz8 {

  
    public static void main(String[] args)
    throws IOException
    {
       BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
       int matriz[][]=new int[4][3];
       String snum;
       int a,b,acum;
//       ----------------------------------------------------------------------
        System.out.println("CAPTURA DE DATOS");
       for(a=0;a<=3;a++)
       {
        acum=0;
        for(b=0;b<=1;b++)
        {
            System.out.print("["+a+"]["+b+"]");
            snum=bf.readLine();
            matriz[a][b]=Integer.parseInt(snum);

         acum=acum+matriz[a][b];
        }
        matriz[a][2]=acum;
       }
// -----------------------------------------------------------------------------
   System.out.println("IMPRESION MATRIZ");
     for(a=0;a<=3;a++)
     {
       for(b=0;b<=2;b++)
       {
           System.out.print("["+a+"]["+b+"]"+matriz[a][b]);
       }
         System.out.println("\n");  
     }
    }

}
