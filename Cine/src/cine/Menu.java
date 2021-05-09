package cine;

import java.util.Scanner;

public class Menu {
    
    private int reserva;
    private int ResAF1;
    private int ResAC1;
    private int ResAF2;
    private int ResAC2;
    private int ResAF3;
    private int ResAC3;
    private int ResAF4;
    private int ResAC4;

    
    public Menu(){
        //System.out.println("Soy el constructor de menu");
        reserva=0;
        ResAF1=0;
        ResAC1=0;
        ResAF2=0;
        ResAC2=0;
        ResAF3=0;
        ResAC3=0;
        ResAF4=0;
        ResAC4=0;
   
    }
    
    public void SetRESERVA(int x){
        reserva= x;
    }
    
    public int GetRESERVA(){
        return reserva;
    }
    
    public void SetRESF1(int x){
        ResAF1= x;
    }
    
    public int GetRESF1(){
        return ResAF1;
    }
    
        public void SetRESC1(int x){
        ResAC1= x;
    }
    
    public int GetRESC1(){
        return ResAC1;
    }
    
        public void SetRESF2(int x){
        ResAF2= x;
    }
    
    public int GetRESF2(){
        return ResAF2;
    }
    
        public void SetRESC2(int x){
        ResAC2= x;
    }
    
    public int GetRESC2(){
        return ResAC2;
    }
    
        public void SetRESF3(int x){
        ResAF3= x;
    }
    
    public int GetRESF3(){
        return ResAF3;
    }
        public void SetRESC3(int x){
        ResAC3= x;
    }
    
    public int GetRESC3(){
        return ResAC3;
    }
        public void SetRESF4(int x){
        ResAF4= x;
    }
    
    public int GetRESF4(){
        return ResAF4;
    }
        public void SetRESC4(int x){
        ResAC4= x;
    }
    
    public int GetRESC4(){
        return ResAC4;
    }
    
    
    public boolean eleccion (int e){//verifica valores de eleccion
        if (e==0){
            return false;
        }
        else{
            if (e==1){
             return true;   
            }
        }
    return false;
    }
    
    public int PedirDato(){//pide cantidad de reserva
        int o;
        Scanner k=new Scanner(System.in);
        o=k.nextInt();  
        return o;
    }
        
    public String PedirPosicion(){//pide la posicion de reserva
        String a;
        Scanner q=new Scanner(System.in);
        a=q.nextLine();
        return a;   
    }
    
    public void Asignar(){//organiza los datos para asginar la reserva
            System.out.println("Cuantos?:(no puede reservar mas de cuatro)");
            int b= PedirDato();
            String posAF;
            String posAC;
            String posBF;
            String posBC;
            String posCF;
            String posCC;
            String posDF;
            String posDC;
            
            int posaf1=0;
            int posac1=0;
            int posaf2=0;
            int posac2=0;
            int posaf3=0;
            int posac3=0;
            int posaf4=0;
            int posac4=0;
            
            if (b>0 && b<5){
              this.SetRESERVA(b);
              System.out.println("Cuales?: Especifique fila y columna");
              switch(b){
                  case 1:
                      //reserva 1
                      System.out.println("Columna(A-I)");
                      posAC=PedirPosicion();
                      switch (posAC){
                        case "A":
                              posAC="0";
                              break;
                        case "B":
                              posAC="1";
                              break;
                        case "C":
                              posAC="2";
                              break;
                        case "D":
                              posAC="3";
                              break;
                        case "E":
                              posAC="4";
                              break;
                        case "F":
                              posAC="5";
                              break;
                        case "G":
                              posAC="6";
                              break;
                        case "H":
                              posAC="7";
                              break;
                        case "I":
                              posAC="8";
                              break;
                      }
                      System.out.println("Fila(1-8)");
                      posAF=PedirPosicion();
                      switch (posAF){
                          case "1":
                              posAF="7";
                              break;
                          case "2":
                              posAF="6";
                              break;
                          case "3":
                              posAF="5";
                              break;
                          case "4":
                              posAF="4";
                              break;
                          case "5":
                              posAF="3";
                              break;
                          case "6":
                              posAF="2";
                              break;
                          case "7":
                              posAF="1";
                              break;  
                          case "8":
                              posAF="0";
                              break;       
                      }
                      
                      posaf1=Integer.parseInt(posAF);
                      posac1=Integer.parseInt(posAC);
                      break;
                  case 2:
                      //reserva 1
                      System.out.println("Columna(A-I)");
                      posAC=PedirPosicion();
                      switch (posAC){
                        case "A":
                              posAC="0";
                              break;
                        case "B":
                              posAC="1";
                              break;
                        case "C":
                              posAC="2";
                              break;
                        case "D":
                              posAC="3";
                              break;
                        case "E":
                              posAC="4";
                              break;
                        case "F":
                              posAC="5";
                              break;
                        case "G":
                              posAC="6";
                              break;
                        case "H":
                              posAC="7";
                              break;
                        case "I":
                              posAC="8";
                              break;
                      }
                      
                      posac1=Integer.parseInt(posAC);
                      System.out.println("Fila(1-8)");
                      posAF=PedirPosicion();
                        switch (posAF){
                          case "1":
                              posAF="7";
                              break;
                          case "2":
                              posAF="6";
                              break;
                          case "3":
                              posAF="5";
                              break;
                          case "4":
                              posAF="4";
                              break;
                          case "5":
                              posAF="3";
                              break;
                          case "6":
                              posAF="2";
                              break;
                          case "7":
                              posAF="1";
                              break;  
                          case "8":
                              posAF="0";
                              break;       
                      }
                      posaf1=Integer.parseInt(posAF);
                      //Reserva 2

                      System.out.println("Columna(A-I)");
                      posBC=PedirPosicion();
                      switch (posBC){
                        case "A":
                              posBC="0";
                              break;
                        case "B":
                              posBC="1";
                              break;
                        case "C":
                              posBC="2";
                              break;
                        case "D":
                              posBC="3";
                              break;
                        case "E":
                              posBC="4";
                              break;
                        case "F":
                              posBC="5";
                              break;
                        case "G":
                              posBC="6";
                              break;
                        case "H":
                              posBC="7";
                              break;
                        case "I":
                              posBC="8";
                              break;
                      }
                      
                      posac2=Integer.parseInt(posBC);
                      System.out.println("Fila(1-8)");
                      posBF=PedirPosicion();
                        switch (posBF){
                          case "1":
                              posBF="7";
                              break;
                          case "2":
                              posBF="6";
                              break;
                          case "3":
                              posBF="5";
                              break;
                          case "4":
                              posBF="4";
                              break;
                          case "5":
                              posBF="3";
                              break;
                          case "6":
                              posBF="2";
                              break;
                          case "7":
                              posBF="1";
                              break;  
                          case "8":
                              posBF="0";
                              break;       
                      }
                      posaf2=Integer.parseInt(posBF);
                      break;
 
                  case 3:
                      //reserva 1

                      System.out.println("Columna(A-I)");
                      posAC=PedirPosicion();
                      switch (posAC){
                        case "A":
                              posAC="0";
                              break;
                        case "B":
                              posAC="1";
                              break;
                        case "C":
                              posAC="2";
                              break;
                        case "D":
                              posAC="3";
                              break;
                        case "E":
                              posAC="4";
                              break;
                        case "F":
                              posAC="5";
                              break;
                        case "G":
                              posAC="6";
                              break;
                        case "H":
                              posAC="7";
                              break;
                        case "I":
                              posAC="8";
                              break;
                      }
                      posac1=Integer.parseInt(posAC);
                      
                      System.out.println("Fila(1-8)");
                      posAF=PedirPosicion();
                       switch (posAF){
                          case "1":
                              posAF="7";
                              break;
                          case "2":
                              posAF="6";
                              break;
                          case "3":
                              posAF="5";
                              break;
                          case "4":
                              posAF="4";
                              break;
                          case "5":
                              posAF="3";
                              break;
                          case "6":
                              posAF="2";
                              break;
                          case "7":
                              posAF="1";
                              break;  
                          case "8":
                              posAF="0";
                              break;       
                      }
                      posaf1=Integer.parseInt(posAF);
                      
                      //reserva 2

                      System.out.println("Columna(A-I)");
                      posBC=PedirPosicion();
                      switch (posBC){
                        case "A":
                              posBC="0";
                              break;
                        case "B":
                              posBC="1";
                              break;
                        case "C":
                              posBC="2";
                              break;
                        case "D":
                              posBC="3";
                              break;
                        case "E":
                              posBC="4";
                              break;
                        case "F":
                              posBC="5";
                              break;
                        case "G":
                              posBC="6";
                              break;
                        case "H":
                              posBC="7";
                              break;
                        case "I":
                              posBC="8";
                              break;
                      }
                      posac2=Integer.parseInt(posBC);
                      System.out.println("Fila(1-8)");
                      posBF=PedirPosicion();
                      
                        switch (posBF){
                          case "1":
                              posBF="7";
                              break;
                          case "2":
                              posBF="6";
                              break;
                          case "3":
                              posBF="5";
                              break;
                          case "4":
                              posBF="4";
                              break;
                          case "5":
                              posBF="3";
                              break;
                          case "6":
                              posBF="2";
                              break;
                          case "7":
                              posBF="1";
                              break;  
                          case "8":
                              posBF="0";
                              break;       
                      }
                      posaf2=Integer.parseInt(posBF);
                      //reserva 3
                      System.out.println("Columna(A-I)");
                      posCC=PedirPosicion();
                      switch (posCC){
                        case "A":
                              posCC="0";
                              break;
                        case "B":
                              posCC="1";
                              break;
                        case "C":
                              posCC="2";
                              break;
                        case "D":
                              posCC="3";
                              break;
                        case "E":
                              posCC="4";
                              break;
                        case "F":
                              posCC="5";
                              break;
                        case "G":
                              posCC="6";
                              break;
                        case "H":
                              posCC="7";
                              break;
                        case "I":
                              posCC="8";
                              break;
                      }
                      posac3=Integer.parseInt(posCC);
                      
                      System.out.println("Fila(1-8)");
                      posCF=PedirPosicion();
                       
                      switch (posCF){
                          case "1":
                              posCF="7";
                              break;
                          case "2":
                              posCF="6";
                              break;
                          case "3":
                              posCF="5";
                              break;
                          case "4":
                              posCF="4";
                              break;
                          case "5":
                              posCF="3";
                              break;
                          case "6":
                              posCF="2";
                              break;
                          case "7":
                              posCF="1";
                              break;  
                          case "8":
                              posCF="0";
                              break;       
                      }
                      posaf3=Integer.parseInt(posCF);
                      break;
                      
                  case 4:
                      //reserva 1

                      System.out.println("Columna(A-I)");
                      posAC=PedirPosicion();
                    switch (posAC){
                        case "A":
                              posAC="0";
                              break;
                        case "B":
                              posAC="1";
                              break;
                        case "C":
                              posAC="2";
                              break;
                        case "D":
                              posAC="3";
                              break;
                        case "E":
                              posAC="4";
                              break;
                        case "F":
                              posAC="5";
                              break;
                        case "G":
                              posAC="6";
                              break;
                        case "H":
                              posAC="7";
                              break;
                        case "I":
                              posAC="8";
                              break;
                      }
                      posac1=Integer.parseInt(posAC);
                      System.out.println("Fila(1-8)");
                      posAF=PedirPosicion();
                      
                        switch (posAF){
                          case "1":
                              posAF="7";
                              break;
                          case "2":
                              posAF="6";
                              break;
                          case "3":
                              posAF="5";
                              break;
                          case "4":
                              posAF="4";
                              break;
                          case "5":
                              posAF="3";
                              break;
                          case "6":
                              posAF="2";
                              break;
                          case "7":
                              posAF="1";
                              break;  
                          case "8":
                              posAF="0";
                              break;       
                      }
                      posaf1=Integer.parseInt(posAF);
                      //reserva 2
                      System.out.println("Columna(A-I)");
                      posBC=PedirPosicion();
                      switch (posBC){
                        case "A":
                              posBC="0";
                              break;
                        case "B":
                              posBC="1";
                              break;
                        case "C":
                              posBC="2";
                              break;
                        case "D":
                              posBC="3";
                              break;
                        case "E":
                              posBC="4";
                              break;
                        case "F":
                              posBC="5";
                              break;
                        case "G":
                              posBC="6";
                              break;
                        case "H":
                              posBC="7";
                              break;
                        case "I":
                              posBC="8";
                              break;
                      }
                      posac2=Integer.parseInt(posBC);

                      System.out.println("Fila(1-8)");
                      posBF=PedirPosicion();
                      
                        switch (posBF){
                          case "1":
                              posBF="7";
                              break;
                          case "2":
                              posBF="6";
                              break;
                          case "3":
                              posBF="5";
                              break;
                          case "4":
                              posBF="4";
                              break;
                          case "5":
                              posBF="3";
                              break;
                          case "6":
                              posBF="2";
                              break;
                          case "7":
                              posBF="1";
                              break;  
                          case "8":
                              posBF="0";
                              break;       
                      }
                      posaf2=Integer.parseInt(posBF);
                      //reserva 3

                      System.out.println("Columna(A-I)");
                      posCC=PedirPosicion();
                      switch (posCC){
                        case "A":
                              posCC="0";
                              break;
                        case "B":
                              posCC="1";
                              break;
                        case "C":
                              posCC="2";
                              break;
                        case "D":
                              posCC="3";
                              break;
                        case "E":
                              posCC="4";
                              break;
                        case "F":
                              posCC="5";
                              break;
                        case "G":
                              posCC="6";
                              break;
                        case "H":
                              posCC="7";
                              break;
                        case "I":
                              posCC="8";
                              break;
                      }
                      posac3=Integer.parseInt(posCC);
                      System.out.println("Fila(1-8)");
                      posCF=PedirPosicion();
                      
                        switch (posCF){
                          case "1":
                              posCF="7";
                              break;
                          case "2":
                              posCF="6";
                              break;
                          case "3":
                              posCF="5";
                              break;
                          case "4":
                              posCF="4";
                              break;
                          case "5":
                              posCF="3";
                              break;
                          case "6":
                              posCF="2";
                              break;
                          case "7":
                              posCF="1";
                              break;  
                          case "8":
                              posCF="0";
                              break;       
                      }
                      posaf3=Integer.parseInt(posCF);
                     //reserva 4
                      System.out.println("Columna(A-I)");
                      posDC=PedirPosicion();
                      switch (posDC){
                        case "A":
                              posDC="0";
                              break;
                        case "B":
                              posDC="1";
                              break;
                        case "C":
                              posDC="2";
                              break;
                        case "D":
                              posDC="3";
                              break;
                        case "E":
                              posDC="4";
                              break;
                        case "F":
                              posDC="5";
                              break;
                        case "G":
                              posDC="6";
                              break;
                        case "H":
                              posDC="7";
                              break;
                        case "I":
                              posDC="8";
                              break;
                      }
                      posac4=Integer.parseInt(posDC);
                      System.out.println("Fila(1-8)");
                      posDF=PedirPosicion();
                        switch (posDF){
                          case "1":
                              posDF="7";
                              break;
                          case "2":
                              posDF="6";
                              break;
                          case "3":
                              posDF="5";
                              break;
                          case "4":
                              posDF="4";
                              break;
                          case "5":
                              posDF="3";
                              break;
                          case "6":
                              posDF="2";
                              break;
                          case "7":
                              posDF="1";
                              break;  
                          case "8":
                              posDF="0";
                              break;       
                      }
                      posaf4=Integer.parseInt(posDF);
                      break;      
              }
              
              SetRESF1(posaf1);
              SetRESC1(posac1);
              SetRESF2(posaf2);
              SetRESC2(posac2);
              SetRESF3(posaf3);
              SetRESC3(posac3);
              SetRESF4(posaf4);
              SetRESC4(posac4);
            }
                else{
                System.out.println("No se pueden reservar "+b+" asientos, el sistema se ejecutará normalmente...");
                LlenarSec cinas = new LlenarSec();
                Pelicula pel=new Pelicula();
                Sala mos=new Sala();
                System.out.println(" ");
                System.out.println("Distribucion Sala:");
                System.out.println("");
                mos.GenerarMatriz();
                System.out.println(" ");
                System.out.println("Precio entrada");
                System.out.println(mos.GetPRECIO());
                System.out.println(" ");
                System.out.println("Pelicula:");
                pel.peliculas();
                System.out.println("");
                System.out.println("Espectadores en su respectivo puesto:");
                System.out.println(" ");
                cinas.Pos();
                System.out.println(" ");  
            }
    }
    
    public void menu(){//menu principal
        int a;
        System.out.println("Desea reservar asientos?: (0=no, 1=si)");
        a=PedirDato();
        if (eleccion(a)){ 
                Llenar cina = new Llenar();
                cina.Pos();
                System.out.println(" ");              
            }
               else{
        LlenarSec cinas = new LlenarSec();
        Pelicula pel=new Pelicula();
        Sala mos=new Sala();
        System.out.println(" ");
        System.out.println("Distribucion Sala:");
        System.out.println("");
        mos.GenerarMatriz();
        System.out.println(" ");
        System.out.println("Precio entrada");
        System.out.println(mos.GetPRECIO());
        System.out.println(" ");
        System.out.println("Pelicula:");
        pel.peliculas();
        System.out.println("");
        System.out.println("Espectadores en su respectivo puesto:");
        System.out.println(" ");
        cinas.Pos();
        System.out.println(" ");  
        }


            
        }
 

    }

