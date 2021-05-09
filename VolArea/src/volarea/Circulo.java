
package volarea;

import java.util.Scanner;


public class Circulo {
        
    private double r;
    
    public Circulo(){
        r=0;
        System.out.println("Soy el constructor de Circulo :v");    
    }
    
    public double GetR(){
        return r;    
    }
    
    public void SetR(double x){
        r=x;   
    }
    
    public void PedirRadio(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Radio:");
        SetR(leer.nextDouble());
    }
    
    public double CalcularArea(){
        double rad;
        rad=Math.PI*Math.pow(this.GetR(),2);
        return rad;
    }
    
    public void MostrarArea(double y){
        System.out.println("El area es: "+y);
    }
    
}
