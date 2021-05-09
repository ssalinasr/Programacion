

package ejercicios1;
import java.io.*;
public class matriz9
{

    public static void main(String[] args) 
    throws IOException
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     long matriz[][]=new long [3][3];
     long factorial[][]=new long[3][3];
     int a,b,i;
     String snum;
    
        System.out.println("CAPTURA NUMEROS DEL 1 AL 9");
        for(a=0;a<=2;a++)
        {
          for(b=0;b<=2;b++)
          {
              System.out.print("["+a+"]["+b+"]");
              snum=bf.readLine();
              matriz[a][b]=Long.parseLong(snum);
            
             

          }

        }
       i=1;
        for(a=0;a<=2;a++)
        {
	for(b=0;b<=2;b++)
        
        {
       
	if(matriz[a][b]==1)
        {

        factorial[a][b]=matriz[a][b]*1;
	}
        if(matriz[a][b]==2)
        {

          factorial[a][b]=matriz[a][b]*1;
	}
        if(matriz[a][b]==3)
        {

          factorial[a][b]=matriz[a][b]*2*1;
	}
        if(matriz[a][b]==4)
        {

           factorial[a][b]=matriz[a][b]*1*2*3;
	}
        if(matriz[a][b]==5)
        {

           factorial[a][b]=matriz[a][b]*1*2*3*4;
	}
        if(matriz[a][b]==6)
        {
           factorial[a][b]=matriz[a][b]*1*2*3*4*5;

	}
        if(matriz[a][b]==7)
        {

           factorial[a][b]=matriz[a][b]*1*2*3*4*5*6;
	}
        if(matriz[a][b]==8)
        {

            factorial[a][b]=matriz[a][b]*1*2*3*4*5*6*7;
	}
        if(matriz[a][b]==9)
        {

            factorial[a][b]=matriz[a][b]*1*2*3*4*5*6*7*8;
	}
        }
        }
        System.out.println("\n");
        System.out.println("IMPRESION NUMEROS FACTORIALES");
        for(a=0;a<=2;a++)
        {
        for(b=0;b<=2;b++)
        {
            
            System.out.print("["+a+"]["+b+"]"+factorial[a][b]);  

        }
            System.out.println("\n");
        }




    }

}
