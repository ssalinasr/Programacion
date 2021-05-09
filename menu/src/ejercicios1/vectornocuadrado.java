
package ejercicios1;

import java.io.*;
public class vectornocuadrado {

    public static void main(String[] args)
    throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int num[]=new int[11];
    String sbuscar;
    int buscar[]=new int[11];
    int acum1,media;
    int a;
    System.out.println("LOS 10 PRIMEROS NUMEROS CUADRADOS");
    acum1=0;
    for(a=1;a<=10;a++)
    {
    num[a]= (int) Math.pow(a,2);
    acum1=num[a]+acum1;
        System.out.print("["+a+"]"+num[a]);

    }
        System.out.println("\n");
    media=acum1/a-1;
    System.out.println("La media es de los numeros cuadrados es: "+media);
        
        
     System.out.println("BUSQUEDA DEL NUMERO");
     for(a=1;a<=10;a++)
     {
     System.out.println("Que numero desea buscar en el vector\t["+a+"]");
     sbuscar=bf.readLine();
     buscar[a]=Integer.parseInt(sbuscar);
     }
    for(a=1;a<=10;a++)
    {
       if(num[a]==buscar[a])
       {
           System.out.println("Numero "+buscar[a]+" encontrado en la posicion"+a);
       }
       else
       {
           System.out.println("Numero no encontrado");
       }
    }
      }
    }


