
package ejercicios1;

import java.io.*;
public class matriz2
{

    public static void main(String[] args)
    throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int matriz[][]=new int[][]{{20,16,18,4},{16,29,72,10},{9,14,17,32} };
        int a,b,continuar,num1,num2;
        String scontinuar,snum1,snum2;

 
   

 //--------------------------------------------------------------------
   System.out.println("IMPRESION DATOS MATRIZ");
     for(a=0;a<=2;a++)
    {
     for(b=0;b<=3;b++)
     {
         System.out.print("["+a+"]["+b+"]"+matriz[a][b]);
         


     }
        System.out.println("\n");
    }
        System.out.println("\n");

        System.out.println("Desea cambiar un numero 1-si o 2-no");
        scontinuar=bf.readLine();
        continuar=Integer.parseInt(scontinuar);

  //------------------------------------------------------------------------
   System.out.println("CAMBIO DE NUMERO");
   do
   {
       System.out.println("Que numero desea cambiar ");
       snum1=bf.readLine();
       num1=Integer.parseInt(snum1);
       System.out.println("Por cual numero desea cambiarlo");
       snum2=bf.readLine();
       num2=Integer.parseInt(snum2);

       for(a=0;a<=2;a++)
    {
     for(b=0;b<=3;b++)
     {
         if(matriz[a][b]==num1)
         {

          matriz[a][b]=num2;
         }


     }

    }
        System.out.println("\n");

     for(a=0;a<=2;a++)
    {
     for(b=0;b<=3;b++)
     {
         System.out.print("["+a+"]["+b+"]"+matriz[a][b]);



     }
        System.out.println("\n");
    }
        System.out.println("\n");

       System.out.println("Quiere continuar 1-si o 2-no");
       scontinuar=bf.readLine();
        continuar=Integer.parseInt(scontinuar);

   }
  while(continuar!=2);
       





    }

}
