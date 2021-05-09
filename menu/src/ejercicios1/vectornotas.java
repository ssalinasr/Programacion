
package ejercicios1;

import java.io.*;
public class vectornotas
{
  public static void main(String[] args)
   throws IOException
  {
   BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
   double vector[]= new double[]{3.5,4.2,1.0,2.9,5.0,4.6,2.3,4.1,4.1,3.0,4.1,3.0,2.8,3.0,5.0,4.1,5.0,3.2,1.7,3.0};
   double adicion[]=new double[20];
   String snum;
   int a,b,c,d,e,f;
   int cont1,cont2,cont3,cont4,cont5,conbus,conbus1,conbus2,conbus3;
   double temp,num,acum1,acum2,acum3,acum4,acum5,prom1,prom2,prom3,prom4,prom5;
   cont1=cont2=cont3=cont4=cont5=0;
   acum1=acum2=acum3=acum4=acum5=0;
   temp=0;
   
   for(a=0;a<=18;a++)
     {
         
       if(vector[a]>=3)
       {
         if(vector[a]<=3.5)
         {
          cont1++;   
             
         }   
         else
         {
           if(vector[a]<=4)
           {
           cont2++;    
           }  
           else
           {
            cont3++;   
           }    
         }  
       }  
        else
       {
        cont4++;   
       } 
         
     }
        double vector1[]=new double[cont1];
        double vector2[]=new double[cont2];
        double vector3[]=new double[cont3];
        double vector4[]=new double[cont4];
        c=d=e=f=0;
        for(a=0;a<=18;a++)
     {
         
       if(vector[a]>=3)
       {
         if(vector[a]<=3.5)
         {
         vector1[c]=vector[a];
         c++;
             
         }   
         else
         {
           if(vector[a]<=4)
           {
           vector2[d]=vector[a];
           c++;
           }  
           else
           {
            vector3[e]=vector[a];   
            e++;  
           }    
         }  
       }  
        else
       {
        vector4[f]=vector[a];
        f++;
       } 
         
     }
        
        System.out.println("VECTOR DE 3.0 A 3.5");
        for(a=0;a<=c-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector1[a]);   
            
        }
        System.out.println("\n");
        System.out.println("VECTOR DE 3.6 A 4.0");
        for(a=0;a<=d-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector2[a]);   
            
        } 
        System.out.println("\n");
        System.out.println("VECTOR MAYORES A 4.0");
        for(a=0;a<=e-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector3[a]);   
            
        }
        System.out.println("\n");
        System.out.println("VECTOR MENORES A 3");
        for(a=0;a<=f-1;a++)
        {
            
         System.out.print("\t["+a+"]"+vector4[a]);   
            
        }   
         
        System.out.println("\n");    
   
   
   
   for(a=0;a<=19;a++)
   {
       
    if(vector[a]>=3&vector[a]<=3.5)
    {
        
        cont1++;
        acum1=acum1+vector[a];
    }

   }
   prom1=acum1/cont1;
      System.out.println("\n");
    System.out.println("El promedio de las notas entre 3 y 3.5 es: \t "+prom1);
      System.out.println("\n");
    
   for(a=0;a<=19;a++)
   {

    if(vector[a]>=3.6&vector[a]<=4)
    {
        
        cont2++;
        acum2=acum2+vector[a];
    }

   }
   prom2=acum2/cont2;
    System.out.println("El promedio de las notas entre 3.6 y 4 es: \t "+prom2);
    System.out.println("\n");

   
   for(a=0;a<=19;a++)
   {

    if(vector[a]<3)
    {
        
        cont3++;
        acum3=acum3+vector[a];
    }

   }
   prom3=acum3/cont3;
      System.out.println("\n");
    System.out.println("El promedio de las notas menores a 3: \t "+prom3);
      System.out.println("\n");

    
   for(a=0;a<=19;a++)
   {

    if(vector[a]>4)
    {
        
        cont4++;
        acum4=acum4+vector[a];
    }

   }
   prom4=acum4/cont4;
      System.out.println("\n");
    System.out.println("El promedio de las notas mayores a 4 es: \t "+prom4);
      System.out.println("\n");

   acum5=acum1+acum2+acum3+acum4;
   cont5=cont1+cont2+cont3+cont4;
   prom5=acum5/cont5;
   System.out.println("El promedio general de las notas es: \t "+prom5);


   for(a=0;a<=18;a++)
   {
    for(b=a+1;b<=19;b++)
    {
     if(vector[a]>vector[b])
     {
       temp=vector[a];
       vector[a]=vector[b];
       vector[b]=temp;
     }

    }
   }
    System.out.println("IMPRESION VECTOR NOTAS EN ORDEN ASCENDENTE");
   for(a=0;a<=19;a++)
   {

       System.out.print("["+a+"]"+vector[a]);
   }
      System.out.println("\n");

      System.out.println("BUSQUEDA NUMERO CUALQUIERA");
      conbus=conbus1=conbus2=conbus3=0;
      num=0;
       System.out.println("Que numero desea buscar");
          snum=bf.readLine();
          num=Double.parseDouble(snum);
      for(a=0;a<=19;a++)
      {
          if(vector[a]==num)
          {

              System.out.println("Posicion ["+a+"]");
              conbus++;

          }
      }
      
System.out.println("El numero "+num+"se encontro "+conbus+" veces");
      System.out.println("\n");

   System.out.println("BUSQUEDA NOTA 5");

for(a=0;a<=19;a++)
      {
          if(vector[a]==5)
          {
              conbus1++;
              System.out.println("Posicion ["+a+"]");
              

          }
      }

System.out.println("El numero 5 se encontro "+conbus1+" veces");
System.out.println("\n");
System.out.println("BUSQUEDA NUMERO 4.1");

for(a=0;a<=19;a++)
      {
          if(vector[a]==4.1)
          {

              System.out.println("Posicion ["+a+"]");
              conbus2++;

          }
      }

System.out.println("El numero 4.1 se encontro "+conbus2+" veces");
      System.out.println("\n");
      System.out.println("BUSQUEDA NUMERO 3");
for(a=0;a<=19;a++)
      {
          if(vector[a]==3)
          {

              System.out.println("Posicion ["+a+"]");
              conbus3++;

          }
      }

System.out.println("El numero 3 se encontro "+conbus3+" veces");
System.out.println("\n");

      System.out.println("ADICION 0.3 DECIMAS AL VECTOR NOTAS");
      for(a=0;a<=19;a++)
      {
       if(vector[a]>=3&&vector[a]<=4)
       {
        adicion[a]=vector[a]+0.3;
        System.out.print("["+a+"]"+adicion[a]);
       }
          
      }

      System.out.println("\n");

 



   }
    }


