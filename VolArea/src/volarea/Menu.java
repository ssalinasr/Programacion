
package volarea;

import java.util.Scanner;

public class Menu {
    
    public void MenuP(){
        Esfera obj;
        int opc=0;
        Scanner s=new Scanner (System.in);
        System.out.println("Desea calcular el Área o el Volumen?: (1=area, 2=volumen)");
        opc=s.nextInt();
        
        if (opc==1){
            obj=new Esfera();
            obj.PedirRadio();
            obj.MostrarArea(obj.CalcularArea());
        }
        else{
            if (opc==2){
                obj=new Esfera();
                obj.PedirRadio();
                obj.MostrarVolumen(obj.CalcularVolumen());
            }
            else{
                System.out.println("Valor no valido");
            }
        }
        
    }
    
}
