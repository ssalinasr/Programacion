package ejercicios1;

import javax.swing.*;

public class parque
{
 public static void main(String [] args)
 {
  String starjeta,satraccion;
  long tarjeta,atraccion,desc,vfinal,conta,contb,contc,acum,acumgen,a;
  conta=contb=contc=acum=acumgen=0;
  for(a=1;a<=5;a++)
  {
   starjeta=JOptionPane.showInputDialog("Su tarjeta es 1=gold 2=silver 3=preferencial");
   tarjeta=Long.parseLong(starjeta);
   satraccion=JOptionPane.showInputDialog("La atraccion a la que subira es 1.Carros chocones 2.Montaña rusa 3.Tronquitos");
   atraccion=Long.parseLong(satraccion);
   
   desc=0;
   vfinal=0;
   
   
   if(tarjeta==1)
   {
      conta++; 
      if(atraccion==1)
      {
      desc=10000*10/100;    
      } 
      if(atraccion==2)
      {
      desc=10000*12/100;   
      }   
      if(atraccion==3)
      {
      desc=10000*15/100;    
      }  
     vfinal=10000-desc; 
   }  
     if(tarjeta==2)
   {
      contb++; 
      if(atraccion==1)
      {
      desc=12000*8/100;    
      } 
      if(atraccion==2)
      {
      desc=12000*9/100;    
      }   
      if(atraccion==3)
      {
      desc=12000*14/100;   
      } 
      vfinal=12000-desc;
   }  
     if(tarjeta==3)
   {
      contc++;
      if(atraccion==1)
      {
      desc=8000*5/100;    
      } 
      if(atraccion==2)
      {
       desc=8000*6/100;   
      }   
      if(atraccion==3)
      {
       desc=8000*12/100;   
      }  
      vfinal=8000-desc;
   }
     acum=acum+desc;
     acumgen=acumgen+vfinal;
    JOptionPane.showMessageDialog(null,"El descuento es             "+desc);
    JOptionPane.showMessageDialog(null,"El valor total a pagar es       "+vfinal);
   
  } 
  
  JOptionPane.showMessageDialog(null,"El total de usuarios de tarjeta gold es       "+conta);
  JOptionPane.showMessageDialog(null,"El total de usuarios de tarjeta silver es       "+contb);
  JOptionPane.showMessageDialog(null,"El total de usuarios de tarjeta preferencial es       "+contc);
  JOptionPane.showMessageDialog(null,"El total de descuentos es       "+acum);
  JOptionPane.showMessageDialog(null,"El total recogido por el parque fue       "+acumgen);
 }      
}
     