package ejercicios1;

import java.io.*;

public class notas
{
  public static void main(String[] args)
  throws IOException
  {  
  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
  String snota1,snota2,snota3;
  int a;
  double nota1,nota2,nota3,def;
  for(a=1;a<=3;a++)
  {
   System.out.println("Alumno  \t"+a);     
   System.out.println("Cual es su primera nota");
   snota1=bf.readLine();
   nota1=Double.parseDouble(snota1);
     System.out.println("Cual es su segunda nota");
     snota2=bf.readLine();
     nota2=Double.parseDouble(snota2);
     System.out.println("Cual es su tercera nota");
     snota3=bf.readLine();
     nota3=Double.parseDouble(snota3);
     
     def=(nota1+nota2+nota3)/3;
     System.out.println("Su definitiva es \t"+def);
  }
      
  }
    
}