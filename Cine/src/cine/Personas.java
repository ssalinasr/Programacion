package cine;

public class Personas {
    
    private String Nombre;
    private int Edad;
    private double Dinero;
    
    public Personas(){
       //System.out.println("Soy el constructor Personas");
        Nombre="0";
        Edad=0;
        Dinero=0;
    }
    public void SetNOMBRE(String x){
        Nombre = x;
    }
    public String GetNOMBRE(){
        return Nombre;
    }
    public void SetEDAD(int y){
        Edad= y;
    }
    public int GetEDAD(){
        return Edad;
    }
    public void SetDINERO(double z){
        Dinero = z;
    }
    public double GetDINERO(){
        return Dinero;
    }
    public void RandomNombre(){
        int n=0;
        n = (int) (Math.random() * 20) + 1;
        switch (n){
            case 1:
                this.SetNOMBRE("Sofia");
                break;
            case 2:
                this.SetNOMBRE("Juan");
                break;
            case 3:
                this.SetNOMBRE("Natalia");
                break;
            case 4:
                this.SetNOMBRE("David");
                break;
            case 5:
                this.SetNOMBRE("Isabella");
                break;
            case 6:
                this.SetNOMBRE("Sergio");
                break;
            case 7:
                this.SetNOMBRE("Laura");
                break;
            case 8:
                this.SetNOMBRE("Andres");
                break;
            case 9:
                this.SetNOMBRE("Maria");
                break;
            case 10:
                this.SetNOMBRE("Felipe");
                break;
            case 11:
                this.SetNOMBRE("Matias");
                break;
            case 12:
                this.SetNOMBRE("Diana");
                break;
            case 13:
                this.SetNOMBRE("Julio");
                break;
            case 14:
                this.SetNOMBRE("Sebastian");
                break;
            case 15:
                this.SetNOMBRE("Nicolas");
                break;
            case 16:
                this.SetNOMBRE("Lucia");
                break;
            case 17:
                this.SetNOMBRE("Orlando");
                break;
            case 18:
                this.SetNOMBRE("Adriana");
                break;
            case 19:
                this.SetNOMBRE("Mariela");
                break;
            case 20:
                this.SetNOMBRE("Hernan");
                break;        
        }

    }
    public int RandomEdad(){
        int x=(int)(Math.random() * 20) + 10;
        SetEDAD(x);
        return x;

    }
    public double RandomDinero(){
        double x=(double)(Math.floor(Math.random()*1000)+20000);
        SetDINERO(x);
        return x;
    }
    public void Random(){
        RandomNombre();
        RandomEdad();
        RandomDinero();
    }
}
