
package electrodomesticos;

public class Lavadora extends Electrodomesticos{
    private double Carga; 
    
    public Lavadora(){
        super();
        Carga=5;
    }
    
    public Lavadora(double precio, double peso){
        super(precio,peso);
        Carga=5;
    }
    
    public Lavadora(double precio, double peso, String color, char consumoenergia,double carga){
        super(precio,peso,color,consumoenergia);
        Carga=carga;    
    }
    
    public double GetCARGA(){
        return Carga;
    }
    
    public double PrecioFinal(){//precio final para lavadora
        double preciofp=0;
        double preciofl=0;
        double precioff=0;
        preciofp=super.PrecioFinal();
        if (this.GetCARGA()>30){
            preciofl=super.GetPRECIOBASE()+50;
            precioff=preciofl+preciofp;
            return precioff; 
        }
        else{
            precioff=preciofp;
            return precioff;
        }
     
    }
    
}


