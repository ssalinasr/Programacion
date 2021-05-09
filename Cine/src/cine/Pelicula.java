
package cine;


public class Pelicula {
    private String Titulo;
    private int RestEdad;
    private String Director;
    private int Duracion;
    private int Random;
    //Constructor 
    public Pelicula(){
        //System.out.println("Soy el constructor de pelicula");
        Titulo = " ";
        RestEdad = 16; 
        Director = " ";
        Duracion = 0;
        Random = (int) (Math.random() * 4) + 1;

    }
    // Sets y Gets de los atributos
    public void SetTITULO(String x){
       this.Titulo = x;       
    }
    public String GetTITULO(){
       return this.Titulo;
    }
    public void SetRESTEDAD(int x){
        this.RestEdad = x;     
    }
    public double GetRESTEDAD(){
        return this.RestEdad;        
    }
    public void SetDIRECTOR(String x){
        this.Director = x;
    }
    public String GetDIRECTOR(){
        return this.Director;
    } 
    public void SetDURACION(int x){
        this.Duracion = x; 
    }
    public int GetDURACION(){
        return this.Duracion ;
    }
    
        public void Asignar(){ 
            int a;
            String b;
            String c;
            
        if (Random==1){
            c="Que paso ayer";
            a=100;
            b="Legendary Pictures";
            this.SetTITULO(c);
            this.SetDURACION(a);
            this.SetDIRECTOR(b);           
        }
        
        if (Random==2){
            c="La monja";
            a=96;
            b="Corin Hardy";
            this.SetTITULO(c);
            this.SetDURACION(a);
            this.SetDIRECTOR(b);           
        }
        if (Random==3){
            c="50 sombras de Grey";
            a=125;
            b="Sam Taylor-Johnson";
            this.SetTITULO(c);
            this.SetDURACION(a);
            this.SetDIRECTOR(b);           
        }
        if (Random==4){
            c="Infinity War";
            a=149;
            b="Anthony Russo";
            this.SetTITULO(c);
            this.SetDURACION(a);
            this.SetDIRECTOR(b);           
        }           
    }
    
    public void peliculas(){
        
        System.out.println("Todas las peliculas tienen la misma restriccion de Edad (16 años)");
        System.out.println("");

        if (Random==1){
            System.out.println("Pelicula 1:");
            System.out.println("Titulo: Que paso ayer");
            System.out.println("Duracion: 100 minutos");
            System.out.println("Director: Legendary Pictures");
        } 
        
        if (Random==2){
            System.out.println("Pelicula 2:");
            System.out.println("Titulo: La monja");
            System.out.println("Duracion: 96 minutos");
            System.out.println("Director: Corin Hardy");
           
        }
        if (Random==3){
            System.out.println("Pelicula 3:");
            System.out.println("Titulo: 50 Sombras de Grey");
            System.out.println("Duracion: 125 minutos");
            System.out.println("Director: Sam Taylor-Johnson");
        }
        if (Random==4){
            System.out.println("Pelicula 4:");
            System.out.println("Titulo: Infinity War");
            System.out.println("Duracion: 149 minutos");
            System.out.println("Director: Anthony Russo");
        }
        
    }

            
    
}

