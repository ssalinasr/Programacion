package ejercicios1;

import java.io.*;

 public class operacion
 {
   public static void main(String [] args)
   throws IOException 
   {
    String snum1,snum2,snum3,snum4,snum5;
    int num1,num2,num3,num4,num5,suma,mult,resta,div,pot,cubo;
    double cuatro,sen;
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Cual es el primer numero");
       snum1=bf.readLine();
       num1=Integer.parseInt(snum1);
       System.out.println("Cual es el segundo numero");
       snum2=bf.readLine();
       num2=Integer.parseInt(snum2);
       System.out.println("Cual es el tercer numero");
       snum3=bf.readLine();
       num3=Integer.parseInt(snum3);
       System.out.println("Cual es el cuarto numero");
       snum4=bf.readLine();
       num4=Integer.parseInt(snum4);
       System.out.println("Cual es el quinto numero");
       snum5=bf.readLine();
       num5=Integer.parseInt(snum5);
       
       
       suma=num1+num2+num3+num4;
       mult=suma*num5;
       resta=mult-suma;
       div=resta/num3;
       pot=(suma/3)*(suma/3);
       cubo=num1*num1*num1;
       cuatro=Math.pow(num2,4);
       sen=Math.sin(num1);
               
       System.out.println("La suma es \t"+suma);
       System.out.println("La multiplicacion es \t"+mult);
       System.out.println("La resta es \t"+resta);  
       System.out.println("La division es \t"+div);
       System.out.println("El cuadrado de la tercera parte de la suma es \t"+pot);
       System.out.println("El cubo del primer numero es \t"+cubo);
       System.out.println("El segundo numero a la cuatro es \t"+cuatro);
       System.out.println("El seno del primer numero es\t "+sen);
               
   }       
 }