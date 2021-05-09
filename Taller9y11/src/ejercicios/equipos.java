
package ejercicios;

import javax.swing.*;
public class equipos
{

    public static void main(String[] args)
    {
      String ssexo,sestatura,scontinuar;
      int sexo,continuar,con1,con2,con3,con4,congen,mujeres,hombres;
      double estatura,acum1,acum2;

      acum1=acum2=con1=con2=con3=con4=congen=hombres=mujeres=0;



     scontinuar=JOptionPane.showInputDialog("Quiere ingresar 1-si o 2-no");
     continuar=Integer.parseInt(scontinuar);

     while(continuar==1)
     {
      congen++;
      ssexo=JOptionPane.showInputDialog("Cual es su genero 1-masculino o 2-femenino");
      sexo=Integer.parseInt(ssexo);
      sestatura=JOptionPane.showInputDialog("Cual es su estatura");
      estatura=Double.parseDouble(sestatura);

      if(sexo==1)
      {
       hombres++;
       if(estatura>=1.80)
       {
       con1++;
       JOptionPane.showMessageDialog(null, "Es apto para el equipo de Futbol Mayores");
       }
       else
       {
        con2++;
       JOptionPane.showMessageDialog(null, "Es apto para el equipo de Futbol Menores");
       }
      acum1=acum1+estatura;
      }

      if(sexo==2)
      {
       mujeres++;
       if(estatura>=1.80)
       {
        con3++;
       JOptionPane.showMessageDialog(null, "Es apto para el equipo de Baloncesto Mayores");
       }
       else
       {
       con4++;
       JOptionPane.showMessageDialog(null, "Es apto para el equipo de Baloncesto Menores");
       }
      acum2=acum2+estatura;
      }






      scontinuar=JOptionPane.showInputDialog("Quiere continuar 1-si o 2-no");
      continuar=Integer.parseInt(scontinuar);
     }

    JOptionPane.showMessageDialog(null,"el numero total de personas evaludas fue          "+congen );
    JOptionPane.showMessageDialog(null,"El numero de personas seleccionadas para el equipo de Futbol Mayores fue      "+con1 );
    JOptionPane.showMessageDialog(null,"El numero de personas seleccionadas para el equipo de Futbol Menores fue       "+con2 );
    JOptionPane.showMessageDialog(null,"El numero de personas seleccionadas para el equipo de Baloncesto Mayores fue     "+con3 );
    JOptionPane.showMessageDialog(null,"El numero de personas seleccionadas para el equipo de Baloncesto Menores fue"+con4 );
    JOptionPane.showMessageDialog(null,"El numero de mujeres evaluadas fue     "+mujeres );
    JOptionPane.showMessageDialog(null,"El numero de hombre evaluadas fue      "+hombres );
    JOptionPane.showMessageDialog(null,"La suma de estaturas de los hombres fue    "+acum1 );
    JOptionPane.showMessageDialog(null,"La suma de estaturas de las mujeres fue     "+acum2 );
    }

}
