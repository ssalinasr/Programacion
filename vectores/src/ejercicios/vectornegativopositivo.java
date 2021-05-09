
package ejercicios;

import java.io.*;
public class vectornegativopositivo
{
    @SuppressWarnings("empty-statement")
 public static void main(String[] args)
 throws IOException
{
  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
  int vector[]=new int[5];
  int mayor,menor;
  int a,cont1,cont2,cont3,cont4,cont5,cont6;
  String svector;
    System.out.println("CAPTURA DE DATOS");
  for(a=0;a<=4;a++)
  {
      System.out.print("posicion ["+a+"]");
      svector=bf.readLine();
      vector[a]=Integer.parseInt(svector);

  }

    System.out.println("IMPRESION DE DATOS");
  for(a=0;a<=4;a++)
  {
      System.out.print("["+a+"]"+vector[a]);

  }
    System.out.println("\n");
    System.out.println("NUMEROS POSITIVOS");
    cont1=0;
   for(a=0;a<=4;a++)
   {
   if(vector[a]>=0)
   {
   cont1++;
       System.out.print("["+a+"]");
   }
   }
    System.out.println("\n");
    System.out.println("Son positivos: \t "+cont1);
    System.out.println("\n");

    System.out.println("NUMEROS NEGATIVOS");
    cont2=0;
   for(a=0;a<=4;a++)
   {
   if(vector[a]<0)
   {
   cont2++;
       System.out.print("["+a+"]");
   }
   }
    System.out.println("\n");
    System.out.println("Son negativos: \t "+cont2);
    System.out.println("\n");
   System.out.println("NUMEROS PARES");
    cont5=0;
   for(a=0;a<=4;a++)
   {
   if(vector[a]%2==0)
   {
   cont5++;
       System.out.print("["+a+"]");
   }
   }
    System.out.println("\n");
    System.out.println("Son pares: \t "+cont5);
    System.out.println("\n");
     System.out.println("NUMEROS IMPARES");
    cont6=0;
   for(a=0;a<=4;a++)
   {
   if(vector[a]%2!=0)
   {
   cont6++;
       System.out.print("["+a+"]");
   }
   }
    System.out.println("\n");
    System.out.println("Son impares: \t "+cont6);
    System.out.println("\n");

    mayor=vector[0];
    menor=vector[0];
    for(a=0;a<=4;a++)
    {
      if(menor>vector[a])
      {
         menor=vector[a];
         
      }
      if(mayor<vector[a])
      {
       mayor=vector[a];
       
      }
    }
    System.out.println("El mayor es "+mayor);
    System.out.println("El menor es "+menor);
    }

    }



