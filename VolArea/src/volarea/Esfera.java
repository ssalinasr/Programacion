
package volarea;

public class Esfera extends Circulo {
    
    public Esfera(){
        System.out.println("Soy el constructor de Esfera :v"); 
    }
    
    public double CalcularVolumen(){
        double VolEsf;
        VolEsf=(4*super.GetR()*super.CalcularArea())/3;
        return VolEsf;   
    }
    
    public void MostrarVolumen(double z){
        System.out.println("El volumen es: "+z);
    }
    
}
