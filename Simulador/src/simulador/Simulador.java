
package simulador;

import java.util.Scanner;

public class Simulador {
  
    private int NivelA;//equipo 1
    private int NivelB;//equipo 1
    private int NivelC;//equipo 1
    private int NivelD;//equipo 2
    private int NivelE;//equipo 2
    private int NivelF;//equipo 2

    public Simulador() {
        this.NivelA = 1;
        this.NivelB = 1;
        this.NivelC = 1;
        this.NivelD = 1;
        this.NivelE = 1;
        this.NivelF = 1;
    }

    public int getNivelA() {
        return NivelA;
    }

    public void setNivelA(int NivelA) {
        this.NivelA = NivelA;
    }

    public int getNivelB() {
        return NivelB;
    }

    public void setNivelB(int NivelB) {
        this.NivelB = NivelB;
    }

    public int getNivelC() {
        return NivelC;
    }

    public void setNivelC(int NivelC) {
        this.NivelC = NivelC;
    }

    public int getNivelD() {
        return NivelD;
    }

    public void setNivelD(int NivelD) {
        this.NivelD = NivelD;
    }

    public int getNivelE() {
        return NivelE;
    }

    public void setNivelE(int NivelE) {
        this.NivelE = NivelE;
    }

    public int getNivelF() {
        return NivelF;
    }

    public void setNivelF(int NivelF) {
        this.NivelF = NivelF;
    }
    
    public int leerValor(){
        Scanner lectura= new Scanner(System.in);
        int val=lectura.nextInt(); 
        return val;
    }
    
    /*public int Cronometro(){
        int minutos = 0;
        int segundos = 0;
        int acumular = 0;
        for (minutos=0 ; minutos<60; minutos++){
            for (segundos = 0; segundos<60; segundos++){
                System.out.println(minutos+":"+segundos);     
            try {//contador de tiempo
                 Thread.sleep (10);
            } 
     
             catch (InterruptedException ex) {
            }
        acumular++;
            }
        }
        return acumular;
    }*/
    
    
    
    public void AsignarValor(String A, String B, String C, String D, String E, String F){ 
     int a = Integer.parseInt(A);
     this.setNivelA(a);
          int b = Integer.parseInt(B);
     this.setNivelB(b);
          int c = Integer.parseInt(C);
     this.setNivelC(c);
          int d = Integer.parseInt(D);
     this.setNivelD(d);
          int e = Integer.parseInt(E);
     this.setNivelE(e);   
     int f = Integer.parseInt(F);
     this.setNivelF(f);
     
    }
    
    

    
    
}
