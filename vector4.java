
package ejercicios;

import javax.swing.*;
public class vector4 
{

    
   public static void main(String[] args) 
   {
     String svalor; 
     int vector[]=new int[11];
     int a,contneg,conta;
     JOptionPane.showMessageDialog(null,"CAPTURA DE DATOS" );
     for(a=0;a<=10;a++)
     {
        svalor=JOptionPane.showInputDialog("Posicion ["+a+"]");
        vector[a]=Integer.parseInt(svalor);  
     } 
     JOptionPane.showMessageDialog(null, "IMPRESION DE DATOS");
     for(a=0;a<=10;a++)
     {
      JOptionPane.showMessageDialog(null, "["+a+"]"+vector[a]);   
         
         
     }
     contneg=0;
     JOptionPane.showMessageDialog(null, "NUMEROS NEGATIVOS");
     for(a=0;a<=10;a++)
     {
        if(vector[a]<0)
        {
         contneg++; 
        JOptionPane.showMessageDialog(null, "Posicion    ["+a+"]");    
        }   
         
         
     }   
     JOptionPane.showMessageDialog(null,"Son negativos "+contneg);  
     
     JOptionPane.showMessageDialog(null,"VECTOR AL INVERSO" );
      for(a=10;a>=0;a--)
      {
       JOptionPane.showMessageDialog(null, "["+a+"]"+vector[a]);   
      } 
      
    JOptionPane.showMessageDialog(null,"BUSCADOR" );  
    
    conta=0;
    for(a=0;a<=10;a++)
    {
     if(vector[a]==7)
     {
      conta++;   
      JOptionPane.showMessageDialog(null, "Posicion    ["+a+"]");      
     }  
     
    }
    JOptionPane.showMessageDialog(null,"Se encuentra "+conta+" veces el numero 7");
   }
    
}
