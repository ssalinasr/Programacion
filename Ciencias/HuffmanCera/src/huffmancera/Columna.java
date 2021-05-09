/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancera;

public class Columna {
    public int id;
    public String cad;
    public int frec;
    public int paidre;
    public int orident;
    public int hidjoizq;
    public int hidjoder;

    public Columna(Columna c) {
        this.id = c.id;
        this.cad = c.cad;
        this.frec = c.frec;
        this.paidre = c.paidre;
        this.orident = c.orident;
        this.hidjoizq = c.hidjoizq;
        this.hidjoder = c.hidjoder;
    }
    
    public Columna(int id, String cad, int frec, int paidre, int orident, int hidjoizq, int hidjoder) {
        this.id = id;
        this.cad = cad;
        this.frec = frec;
        this.paidre = paidre;
        this.orident = orident;
        this.hidjoizq = hidjoizq;
        this.hidjoder = hidjoder;
    }
    
    public Columna(int Id, String car, int hz){
        this.id = Id;
        this.cad = car;
        this.frec = hz;
        this.paidre = 0;
        this.orident = 0;
        this.hidjoizq = 0;
        this.hidjoder = 0;
    }
    
    @Override
    public String toString(){
        return "{id: " + id+", simbolo: \"" + cad+"\", frecuencia: " + frec+", padre: " + paidre+", orientacion: " + orident+", izq: " + hidjoizq+", der: " + hidjoder+"}";
    }
}
