
package ejercicios1;
import java.io.*;
public class matriz10
{

    public static void main(String[] args)
    throws IOException
    {
  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int matriz1[][]=new int[3][3];
   int matriz2[][]=new int[3][3];
   int matriz3[][]=new int[3][3];
   int matriz4[][]=new int[3][3];
   String snum1,snum2;
   int a,b,acum1,acum2,acum;
   acum1=acum2=0;
//-----------------------------------------------------------------------------
   System.out.println("CAPTURA DE DATOS PRIMERA MATRIZ");
   for(a=0;a<=2;a++)
   {
    for(b=0;b<=2;b++)
    {
         System.out.print("["+a+"]["+b+"]");
         snum1=bf.readLine();
         matriz1[a][b]=Integer.parseInt(snum1);
         

    }

   }
        System.out.println("\n");

//------------------------------------------------------------------------------
System.out.println("CAPTURA DE DATOS SEGUNDA MATRIZ");
 for(a=0;a<=2;a++)
   {
    for(b=0;b<=2;b++)
    {
         System.out.print("["+a+"]["+b+"]");
         snum2=bf.readLine();
         matriz2[a][b]=Integer.parseInt(snum2);
         
    }

   }
        System.out.println("\n");
//------------------------------------------------------------------------------
System.out.println("IMPRESION MATRICES INTERCAMBIADAS");

//------------------------------------------------------------------------------
System.out.println("MATRIZ 1");

 for(a=0;a<=2;a++)
   {
    for(b=0;b<=2;b++)
    {
        if(b==0)
        {
        matriz3[a][0]=matriz2[a][0];

        }
        if(b==1)
        {
        matriz3[a][1]=matriz1[a][1];
        acum1=acum1+matriz3[a][1];
         }
        if(b==2)
        {
        matriz3[a][2]=matriz2[a][2];

        }

   }

   }

  for(a=0;a<=2;a++)
   {
    for(b=0;b<=2;b++)
    {

 System.out.print("["+a+"]["+b+"]"+matriz3[a][b]);
    }
       System.out.println("\n");
   }
// -----------------------------------------------------------------------------
System.out.println("MATRIZ 2");
 for(a=0;a<=2;a++)
   {
    for(b=0;b<=2;b++)
    {
        if(b==0)
        {
        matriz4[a][0]=matriz1[a][0];

        }
        if(b==1)
        {
        matriz4[a][1]=matriz2[a][1];
        acum2=acum2+matriz4[a][1];
        }
        if(b==2)
        {
        matriz4[a][2]=matriz1[a][2];
        
        }

             }
 }
   for(a=0;a<=2;a++)
   {
    for(b=0;b<=2;b++)
    {

 System.out.print("["+a+"]["+b+"]"+matriz4[a][b]);
    }
       System.out.println("\n");
   }

        System.out.println("\n");
        acum=acum1+acum2;
        System.out.println("La suma de los elementos que no se intercambiaron en la matriz 1 es: \t"+acum1);
        System.out.println("La suma de los elementos que no se intercambiaron en la matriz 2 es: \t"+acum2);
        System.out.println("La suma de los elementos que no se intercambiaron en las matrices es: \t"+acum);
    }

}