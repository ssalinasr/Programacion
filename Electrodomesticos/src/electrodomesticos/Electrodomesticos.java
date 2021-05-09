
package electrodomesticos;

public class Electrodomesticos {
    
    private double PrecioBase;
    private String Color;
    private char ConsumoEner;
    private double Peso;
    
    public Electrodomesticos(){
        PrecioBase=10;
        Color="blanco";
        ConsumoEner='F';
        Peso=5;
    }
    
    public Electrodomesticos(double precio, double peso){
        PrecioBase=precio;
        Peso=peso;
        Color="blanco";
        ConsumoEner='F';
    }
    
    public Electrodomesticos(double precio, double peso, String color, char consumoenergia){
        PrecioBase=precio;
        Peso=peso;
        Color=color;
        ConsumoEner=consumoenergia;  
    }
    
    double GetPRECIOBASE(){
        return PrecioBase;
    }
    
    public String GetCOLOR(){
        return Color;
    }
    
    public char GetCONSUMOENER(){
        return ConsumoEner;
    }
    
    public double GetPESO(){
        return Peso;
    }
    
    public void SetCONSUMOENER(char x){
        ConsumoEner=x;
    }
    
    public void SetCOLOR(String x){
        Color=x;
    }
    
    
    public char ComprobarConsumoEnergia(char f){
        if(f=='A' || f=='B' || f=='C' || f=='D' || f=='E' || f=='F' || f=='a' || f=='b' || f=='c' || f=='d' || f=='e' || f=='f'){
            SetCONSUMOENER(f);
            return f;
        }
        else{
            f='F';   
            SetCONSUMOENER(f);
            return f;
        }
    }
    
    public String ComprobarColor(String c){
        if (c.equals("blanco") || c.equals("rojo") || c.equals("azul") || c.equals("negro") || c.equals("gris") || c.equals("BLANCO") || c.equals("ROJO")|| c.equals("AZUL")|| c.equals("NEGRO")|| c.equals("GRIS")){
            SetCOLOR(c);
            return c;
            
        }
        else{
            c="blanco";
            SetCOLOR(c);
            return c;
        }
    }
    
    public double PrecioFinal(){
        
        double preciof=0;
        double preciof2=0;
        double precioff=0;
        
        if (this.GetCONSUMOENER()=='A' || this.GetCONSUMOENER()=='a'){//aumento segun consumo de energia
            preciof=GetPRECIOBASE()+100;         
        }
        else{
            if (this.GetCONSUMOENER()=='B'|| this.GetCONSUMOENER()=='b'){
                preciof=GetPRECIOBASE()+80; 
            }
            else{
                if(this.GetCONSUMOENER()=='C'|| this.GetCONSUMOENER()=='c'){
                    preciof=GetPRECIOBASE()+60; 
                }
                else{
                    if(this.GetCONSUMOENER()=='D'|| this.GetCONSUMOENER()=='d'){
                    preciof=GetPRECIOBASE()+50; 
                }
                    else{
                        if(this.GetCONSUMOENER()=='E'|| this.GetCONSUMOENER()=='e'){
                            preciof=GetPRECIOBASE()+30; 
                        }
                        else{
                            if(this.GetCONSUMOENER()=='F'|| this.GetCONSUMOENER()=='f'){
                                preciof=GetPRECIOBASE()+10; 
                            }
                            else{
                                preciof=GetPRECIOBASE()+10;
                            }
                        }
                    }
                }
            }
        }
        if (this.GetPESO()>0 && this.GetPESO()<=19){//aumento segun peso
            preciof2=10; 
        }
        else{
            if(this.GetPESO()>=20 && this.GetPESO()<=49){
                preciof2=50; 
            }
            else{
                if(this.GetPESO()>=50 && this.GetPESO()<=79){
                    preciof2=80; 
                }
                else{
                    if(this.GetPESO()>=80){
                        preciof2=100; 
                    }
                }
            }
        }
        precioff=preciof+preciof2;
        return precioff;    
    }



    
}
