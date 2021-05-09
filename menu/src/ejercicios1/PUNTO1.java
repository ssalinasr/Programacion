
package ejercicios1;

import java.io.*;

public class PUNTO1
{
    public static void main(String[] args)
    throws IOException
    {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String Edad,Anti;
    int a,con1,con2,edad,anti;
    double Reco1,Reco2,ahorro,salariod,acum1,acum2,acum3;

    con1=0;
    con2=0;
    acum1=0;
    acum2=0;
    acum3=0;
    salariod=0;

    for(a=1;a<=10;a++)
    {
        System.out.println("Empleado No \t"+a);
        System.out.println("cual es su antiguedad");
        Anti=bf.readLine();
        anti=Integer.parseInt(Anti);
        System.out.println("cual es su edad");
        Edad=bf.readLine();
        edad=Integer.parseInt(Edad);


        if(edad>=65)
        {
        con1=con1+1;
        Reco1=(anti*616000)*0.05;
        Reco2=616000*anti;
        ahorro=0;


        }
        else
        {
        con2=con2+1;
        Reco1=(anti*616000)*0.02;
        ahorro=(616000*anti)*0.03;
        Reco2=0;

        }
        acum1=acum1+Reco1+Reco2+ahorro;
        acum2=con1+con2;
        salariod=616000+Reco1+Reco2+ahorro;
        System.out.println("Sus años de antiguedad son \t"+anti);
        System.out.println("Su salario devengado es \t "+salariod);
        System.out.println("Su reconocimiento 1 es\t"+Reco1);
        System.out.println("Su reconocimiento 2 es\t"+Reco2);
        System.out.println("Su ahorro es\t"+ahorro);

        }
        System.out.println("El numero de personas mayores de 65 años \t"+con1);
        System.out.println("El numero de personas menores de 65 años \t"+con2);
        System.out.println("El total de reconocimientos es\t"+acum1);
        System.out.println("El numero de personas evaluadas es\t"+acum2);


     
    }

}
