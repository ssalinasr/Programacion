package ejercicios1;
import java.io.*;
public class PUNTO5
{
  public static void main(String [] args)
  throws IOException
  {
   BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
   String satracc,stiquete;
   int a,atracc,tiquete,con1,con2,con3,con4,con5,con6,con7,con8,con9,gold,silver,pref;
   double descue,vcomercial,acumdescu,acumcomercial;
   con1=0;
   con2=0;
   con3=0;
   con4=0;
   con5=0;
   con6=0;
   con7=0;
   con8=0;
   con9=0;
   descue=0;
   vcomercial=0;
   acumdescu=0;
   acumcomercial=0;


           
   for(a=1;a<=10;a++)
   {
       System.out.println("Usuario No \t"+a);
       System.out.println("Que tarjeta desea comprar: 1.Gold 2.Silver 3.Preferencial");
       stiquete=bf.readLine();
       tiquete=Integer.parseInt(stiquete);
       System.out.println("En que atraccion desea montar: 1Carros chocones 2Montaña Rusa 3.Tronquitos");
       satracc=bf.readLine();
       atracc=Integer.parseInt(satracc);
  if(atracc==1)
  {
   if(tiquete==1)
   {
   con1=con1+1;
   descue=10000*0.1;
   vcomercial=10000-descue;
   }
   if(tiquete==2)
   {
    con2=con2+1;
    descue=12000*0.08;
    vcomercial=12000-descue;
   }
   if(tiquete==3)
   {
    con3=con3+1;
    descue=8000*0.05;
    vcomercial=8000-descue;
   }
  }

 if(atracc==2)
 {
  if(tiquete==1)
  {
  con4=con4+1;
  descue=10000*0.012;
  vcomercial=10000-descue;
  }
  if(tiquete==2)
  {
   con5=con5+1;
   descue=12000*0.09;
   descue=12000-descue;

  }
  if(tiquete==3)
  {
  con6=con6+1;
  descue=8000*0.06;
  vcomercial=8000-descue;
  }
 }

if(atracc==3)
{
  if(tiquete==1)
  {
  con7=con7+1;
  descue=10000*0.15;
  vcomercial=10000-descue;
  }
  if(tiquete==2)
  {
  con8=con8+1;
  descue=12000*0.14;
  vcomercial=12000-descue;
  }
  if(tiquete==3)
  {
  con9=con9+1;
  descue=8000*0.12;
  vcomercial=8000-descue;
  }

}


acumdescu=acumdescu+descue;
acumcomercial=acumcomercial+vcomercial;


 System.out.println("El valor del descuento es \t"+descue);
 System.out.println("El valor comercial es \t"+vcomercial );

   }
 gold=con1+con4+con7;
 silver=con2+con5+con8;
 pref=con3+con6+con9;

      System.out.println("El numero de personas que usaron tarjeta gold \t"+gold);
      System.out.println("El numero de personas que usron tarjeta silver\t"+silver);
      System.out.println("El numero de personas que usaron tarjeta preferencial \t"+pref);
      System.out.println("El acumulado de descuentos es \t"+acumdescu);
      System.out.println("El acumulado ganado por el parque en entradas fue \t"+acumcomercial);


  }
}


