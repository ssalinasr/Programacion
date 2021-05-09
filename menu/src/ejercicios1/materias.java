
package ejercicios1;

import java.io.*;
public class materias
{

    public static void main(String[] args) 
    throws IOException
    {
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     String smateria,scontinuar;
     long materia,vpagar,desc,acum1,acum2,continuar;

     acum1=acum2=0;
     desc=vpagar=0;



        System.out.println("Quiere ingresar 1-si o 2-no");
        scontinuar=bf.readLine();
        continuar=Long.parseLong(scontinuar);


       while(continuar==1)
       {
           System.out.println("Cuantas materias va a tomar este semestre");
           smateria=bf.readLine();
           materia=Long.parseLong(smateria);

           if(materia>=4)
           {
           vpagar=(4*150000)+((4-materia)*120000);
           }
           else
           {
            vpagar=materia*150000;
           }
           acum1=acum1+vpagar;


           if(vpagar>=150000)
           {
            if(vpagar<=300000)
            {
            desc=vpagar*3/100;
            }
            else
            {
             if(vpagar<=450000)
             {
             desc=vpagar*7/100;
             }
             else
             {
               if(vpagar<=600000)
               {
               desc=vpagar*10/100;
               }
               else
               {
                if(vpagar<=750000)
                {
                 desc=vpagar*12/100;
                }
                else
                {
                 if(vpagar<=850000)
                 {
                 desc=vpagar*15/100;
                 }
                 else
                 {
                 desc=vpagar*18/100;
                 }
                }
               }

             }
            }
           }
           acum2=acum2+desc;

           System.out.println("El valor a pagar es \t"+vpagar);
           System.out.println("El descuento es \t"+desc);

           System.out.println("Quiere continuar 1-si o 2-no");
           scontinuar=bf.readLine();
           continuar=Long.parseLong(scontinuar);

       }
        System.out.println("El acumulado de descuentos es \t"+acum2);
        System.out.println("El acumulado de valor a pagar es \t"+acum1);

    }

}
