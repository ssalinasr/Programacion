package ejercicios1;

import java.io.*;
public class Multidata
{
   public static void main (String [] args)
   throws IOException        
 
   {
       
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String sedad,dev,santi,scontinuar;
    int edad,anti,conta,contb,contc,contd,conte,contf,continuar;
    long sdev,recon1,recon2,ahorro,acuma,acumb,acumc,acumd,sneto,prom;
    
       System.out.println("Quiere ingresar 1=si o 2=no");
       scontinuar=bf.readLine();
       continuar=Integer.parseInt(scontinuar);
       acuma=acumb=acumc=acumd=0;
       conta=contb=contc=contd=conte=contf=0;
       
    while(continuar==1)
    {
        System.out.println("Cual es su edad");
        sedad=bf.readLine();
        edad=Integer.parseInt(sedad);
        System.out.println("Cual es su salario devengado");
        dev=bf.readLine();
        sdev=Long.parseLong(dev);
        System.out.println("Cual es su antiguedad");
        santi=bf.readLine();
        anti=Integer.parseInt(santi);
        
        recon1=0;
        ahorro=0;
        recon2=0;
        
        conta++;
        if(edad>=20)
        {
         if(edad<=30)
         {
         contb++;    
         recon1=50000*anti;
         ahorro=sdev*3/100;
         } 
         else
         {
           if(edad<=60)
           {
            contc++; 
            recon1=90000*anti;
            ahorro=sdev*4/100;
           }  
           else
           {
            if(edad<=65)
            {
            contd++;    
            ahorro=edad*10000;
            recon1=sdev*5/100*anti;
            } 
            else
            {
             conte++;   
             recon1=sdev*4/100*anti;
             recon2=(edad-65)*2000000;
            }   
           }    
         }   
        }
        else
        {
        contf++;
        recon1=sdev*7/100;    
        } 
        
        sneto=sdev+recon1+recon2-ahorro;
        acuma=acuma+recon1+recon2;
        acumb=acumb+ahorro;
        acumc=acumc+sdev;
        acumd=acumd+sneto;
        
        System.out.println("El salario devengado es \t"+sdev);
        System.out.println("El reconocimiento 1 es \t"+recon1);
        System.out.println("El ahorro es \t"+ahorro);
        System.out.println("El reconocimiento es \t"+recon2);
        System.out.println("El sueldo neto es \t"+sneto);
        
        System.out.println("Quiere continuar si=1 o no=2");
        scontinuar=bf.readLine();
        continuar=Integer.parseInt(scontinuar);
        
    }  
    prom=acumd/conta;
       System.out.println("El numero de empleados menores que 20 años son \t"+contf);
       System.out.println("El numero de empleados entre 20 y 30 años son \t"+contb);
       System.out.println("El numero de empleados entre 31 y 60 años son \t"+contc);
       System.out.println("El numero de empleados entre 61 y 65 años son \t"+contd);
       System.out.println("El numero de empleados mayores a 65 años son \t"+conte);
       System.out.println("El total de empleados evaluados son \t"+conta);
       System.out.println("El acumulado de reconocimientos es \t"+acuma);
       System.out.println("el acumulado de ahorro es \t"+acumb);
       System.out.println("El acumulado de de salarios devengados es \t"+acumc);
       System.out.println("El acumulado de sueldos netos es \t"+acumd);
       System.out.println("El promedio de sueldos netos es \t"+prom);
    
   }
}