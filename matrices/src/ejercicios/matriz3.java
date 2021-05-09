
package ejercicios;

import java.io.*;
public class matriz3
{

 
    public static void main(String[] args) 
    throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    double notas[][]=new double[4][4];
    String snum,sf;

    int a,b,c,d,e,f;
    int conta,contb,contc;
    double acuma,acumb,acumc,proma,promb,promc;
    //------------------------------------------------------------------------
    System.out.println("CAPTURA DATOS MATRIZ");

    for(a=0;a<=3;a++)
    {
      for(b=0;b<=3;b++)
      {
          System.out.print("["+a+"]["+b+"]");
          snum=bf.readLine();
          notas[a][b]=Double.parseDouble(snum);
      }
    }
    //------------------------------------------------------------------------
    System.out.println("IMPRESION MATRIZ");
    for(a=0;a<=3;a++)
    {
     for(b=0;b<=3;b++)
     {
      System.out.print("["+a+"]["+b+"]"+notas[a][b]);
         
     }
     System.out.println("\n");
    }
//----------------------------------------------------------------------------
    conta=contb=contc=0;
    acuma=acumb=acumc=0;
    for(a=0;a<=3;a++)
    {
     for(b=0;b<=3;b++)
     {
      if(notas[a][b]>=3)
      {
       if(notas[a][b]<=4)
       {
        conta++;
        acuma=acuma+notas[a][b];
       }
       else
       {
         contb++;
         acumb=acumb+notas[a][b];
       }
      }
      else
      {

      contc++;
      acumc=acumc+notas[a][b];
      }

     }

    }

    proma=acuma/conta;
    promb=acumb/contb;
    promc=acumc/contc;
    System.out.println("El promedio de las notas entre 3 y 4 fue: \t "+proma);
    System.out.println("El promedio de las notas mayores a 4 fue: \t "+promb);
    System.out.println("El promedio de las notas menores a 3  fue: \t "+promc);
    double vectora[]=new double[conta];
    double vectorb[]=new double[contb];
    double vectorc[]=new double[contc];
c=d=e=0;
//-------------------------------------------------------------------------------
    for(a=0;a<=3;a++)
    {
     for(b=0;b<=3;b++)
     {
      if(notas[a][b]>=3)
      {
       if(notas[a][b]<=4)
       {
        vectora[c]=notas[a][b];
        c++;
       }
       else
       {
         vectorb[d]=notas[a][b];
         d++;
       }
      }
      else
      {
      vectorc[e]=notas[a][b];
      e++;
      }

     }

    }

   //------------------------------------------------------------------------
    System.out.println("VECTOR NOTAS 3 Y 4");
    
    for(a=0;a<=c-1;a++)
    {
        System.out.print("["+a+"]"+vectora[a]);


    }
        System.out.println("\n");
    System.out.println("VECTOR MAYORES A 4");

    for(a=0;a<=d-1;a++)
    {
        System.out.print("["+a+"]"+vectorb[a]);


    }
        System.out.println("\n");
    System.out.println("VECTOR MENORES A 3");

    for(a=0;a<=e-1;a++)
    {
        System.out.print("["+a+"]"+vectorc[a]);


    }
        System.out.println("\n");

    }

}
