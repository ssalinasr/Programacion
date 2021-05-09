
package ejercicios;

import java.io.*;
public class matriz1 {

  
    public static void main(String[] args) 
     throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int matriz[][]=new int[4][5];
    int a,b;
    String snum;
    //----------------------------------------------------
    System.out.println("CAPTURA DATOS MATRIZ");
    for(a=0;a<=3;a++)
    {
     for(b=0;b<=4;b++)
     {
         System.out.print("["+a+"]["+b+"]");
         snum=bf.readLine();
         matriz[a][b]=Integer.parseInt(snum);


     }

    }
        System.out.println("\n");
  //----------------------------------------------
    System.out.println("IMPRESION ELEMENTOS POSICIONES DIAGONALES");
    for(a=0;a<=3;a++)
    {
     for(b=0;b<=4;b++)
     {
         if(a==b)
         {
         System.out.print("["+a+"]["+b+"]"+matriz[a][b]);
         }

      
     }
        System.out.println("\n");
    }

    }

}
