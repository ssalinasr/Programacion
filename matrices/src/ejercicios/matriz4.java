

package ejercicios;
import java.io.*;
public class matriz4
{
    public static void main(String[] args)
    throws IOException
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     double notas[][]=new double[8][4];
     int a,b,c,d,e,f,g;
     String sprim,ssec,ster;
     double primnota[]=new double[8];
     double secnota[]=new double[8];
     double ternota[]=new double[8];
     double cuarnota[]=new double[8];
     //-----------------------------------------------------------------------
     System.out.println("CAPTURA DE DATOS PRIMERA NOTA");
     for(c=0;c<=7;c++)
     {
         System.out.print("["+c+"]");
         sprim=bf.readLine();
         primnota[c]=Double.parseDouble(sprim);

     }
        System.out.println("\n");
     //-----------------------------------------------------------------------
    System.out.println("CAPTURA DATOS SEGUNDA NOTA");
     for(d=0;d<=7;d++)
     {
         System.out.print("["+d+"]");
         ssec=bf.readLine();
         secnota[d]=Double.parseDouble(ssec);

     }
        System.out.println("\n");
     //----------------------------------------------------------------------
    System.out.println("CAPTURA DATOS TERCERA NOTA");
     for(e=0;e<=7;e++)
     {
         System.out.print("["+e+"]");
         ster=bf.readLine();
         ternota[e]=Double.parseDouble(ster);

     }
        System.out.println("\n");
//--------------------------------------------------------------------------
      
       for(f=0;f<=7;f++)
       {
        c=d=e=f;
        cuarnota[f]=((primnota[c]*30/100)+(secnota[d]*30/100)+(ternota[e]*40/100));
        c++;
        d++;
        e++;

       }
//-----------------------------------------------------------------------------

      for(a=0;a<=7;a++)
      {
         for(b=0;b<=3;b++)
         {
           
             if(b==0)
            {

             notas[a][b]=primnota[a];
           
            }
            if(b==1)
            {
             notas[a][b]=secnota[a];
            
            }
            if(b==2)
            {
             notas[a][b]=ternota[a];
            
            }
            if(b==3)
            {
            notas[a][b]=cuarnota[a];
            
            }
         }

      }
 //----------------------------------------------------------------------------
        System.out.println("IMPRESION MATRIZ NOTAS");
        for(a=0;a<=7;a++)
        {
          for(b=0;b<=3;b++)
          {

              System.out.print("["+a+"]["+b+"]"+notas[a][b]);

          }
            System.out.println("\n");
        }
        System.out.println("\n");
    //----------------------------------------------------------------------------
    System.out.println ("INCREMENTO PARA QUIEN TENGA LA MAYOR NOTA");
    double mayor;
    mayor=notas[0][3];
    for(a=0;a<=7;a++)
    {
     for(b=0;b<=3;b++)
     {
        if(mayor<notas[a][b])
        {
         notas[a][1]=5.0;

        }

     }
        
    }
        System.out.println("\n");
    //----------------------------------------------------------------------
    System.out.println("RE-IMPRESION MATRIZ NOTAS");
        for(a=0;a<=7;a++)
        {
          for(b=0;b<=3;b++)
          {

              System.out.print("["+a+"]["+b+"]"+notas[a][b]);

          }
            System.out.println("\n");
        }
        System.out.println("\n");
    //---------------------------------------------------------------------
        System.out.println("IMPRESION VECTOR NOTAS DEFINITIVAS");

        double definitiva []=new double[8];

        for(g=0;g<=7;g++)
        {
          definitiva[g]=notas[g][3];

        }
        System.out.println("\n");

        int h;
        double temp;
        for(h=0;h<=6;h++)
        {
         for(g=h+1;g<=7;g++)
         {
          if(definitiva[g]<definitiva[h])
          {
              temp=definitiva[h];
              definitiva[h]=definitiva[g];
              definitiva[g]=temp;
          }

             
         }

        }

        for(g=0;g<=7;g++)
        {
          System.out.print("["+g+"]"+definitiva[g]);


        }
        System.out.println("\n");
        int conta,contb,contc;
        conta=contb=contc=0;
        for(g=0;g<=7;g++)
        {

            if(definitiva[g]>=3.0)
            {
                if(definitiva[g]<=3.8)
                {
                 conta++;
                }
                else
                {
                 contb++;
                }

            }
            else
            {
             contc++;
            }

            
        }
        System.out.println("El numero de estudiantes con definitiva entre 3 y 3.8 es:\t "+conta);
        System.out.println("El numero de estudiantes con definitiva mayor a 3.8 es:\t "+contb);
        System.out.println("El numero de estudiantes con definitiva menor a 3  es:\t "+contc);
    
    }


}
