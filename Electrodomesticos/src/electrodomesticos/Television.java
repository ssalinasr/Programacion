
package electrodomesticos;

public class Television extends Electrodomesticos {
    
    private double Resolucion;
    private boolean Sintonizador;
    
    
    public Television(){
        super();
        Resolucion=20;
        Sintonizador=false;
    }
    
    public Television (double precio, double peso){
        super(precio,peso);
        Resolucion=20;
        Sintonizador=false;
    }
    
    public Television (double precio, double peso, String color, char consumoenergia, double resolucion, boolean sintonizador){
        super(precio,peso,color,consumoenergia);
        Resolucion=resolucion;
        Sintonizador=sintonizador;
    }
    
    public double GetRESOLUCION(){
        return Resolucion;
    }
    
    public boolean GetSINTONIZADOR(){
        return Sintonizador;
    }
    
    public double PrecioFinal(){
        double preciopf=0;
        double preciopt=0;
        double porcentual=0;
        double precioff=0;      
        precioff=super.PrecioFinal();
        
        if (this.GetRESOLUCION()>40){
            porcentual=precioff*0.3;
            preciopf=precioff+porcentual;
        }
        else{
            preciopf=precioff;
        }
        
        if (this.GetSINTONIZADOR()){
            precioff=precioff;
            return precioff;
        }
        else{
            return precioff;
        }     
    }
    
}
