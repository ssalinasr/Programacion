

package ejercicios;

import javax.swing.*;
public class almacen {

    public static void main(String[] args)
    {
    String santi,svcompra,scontinuar;
    int continuar;
    long anti,vcompra,desc,bono,vpagar,con1,con2,con3,con4,acum1,acum2;
   
    con1=con2=con3=con4=acum1=acum2=0;
    scontinuar=JOptionPane.showInputDialog("Quiere ingresar si-1 o no-2");
    continuar=Integer.parseInt(scontinuar);

   while(continuar==1)
   {
   con4++;
   santi=JOptionPane.showInputDialog("Cual es su antiguedad");
   anti=Long.parseLong(santi);
   svcompra=JOptionPane.showInputDialog("Cual es el valor de su compra");
   vcompra=Long.parseLong(svcompra);

   if(anti>=2)
   {
     if(anti<=5)
     {
     con1++;
     desc=vcompra*3/100;
     bono=25000;
     }
     else
     {
     con2++;
     desc=vcompra*4/100;
     bono=35000;
     }
   }
   else
   {
    con3++;
    desc=vcompra*2/100;
    bono=20000;
   }
   vpagar=vcompra-desc-bono;
   acum1=acum1+desc;
   acum2=acum2+desc;
   JOptionPane.showMessageDialog(null,"Su valor a pagar es       "+vpagar);
   scontinuar=JOptionPane.showInputDialog("Quiere continuar si-1 o no-2");
   continuar=Integer.parseInt(scontinuar);
   }

    JOptionPane.showMessageDialog(null,"El numero total de personas evaluadas fue    "+con4);
    JOptionPane.showMessageDialog(null,"El numero de personas con antiguedad entre 2 y 5 años fue       "+con1);
    JOptionPane.showMessageDialog(null,"El numero de personas con antiguedad mayor a 5 años fue       "+con2);
    JOptionPane.showMessageDialog(null,"El numero de personas con antiguedad menor a 2 años fue       "+con3);
    JOptionPane.showMessageDialog(null,"El acumulado de descuentos hechos fue        "+acum1);
    JOptionPane.showMessageDialog(null,"El acumulado de bonos dados fue       "+acum2);
    }

}
