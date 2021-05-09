
package interfaz;

import java.util.Scanner;

public class Menu {
    
    public void Elegir(){
        int a;
        Scanner l= new Scanner(System.in);
        System.out.println("valor:");
        a=l.nextInt();
        Gallina g=new Gallina();
        Perro p=new Perro();
        Camaleon c=new Camaleon();
        if (a>0 && a<4){
            switch(a){
            case 1:
                System.out.println("Gallina:");
                g.comer();
                g.comunicar();
                g.mover();
                break;
            case 2:
                System.out.println("Perro:");
                p.comer();
                p.comunicar();
                p.mover();
                break;
            case 3:
                System.out.println("Camaleon:");
                c.comer();
                c.comunicar();
                c.mover();
            
        }   
        }
        else{
            System.out.println("valor no valido");
        }
        

        
    }
    
}
