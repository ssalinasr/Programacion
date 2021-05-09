/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.modelo;

import ajedrez.controlador.Juego;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sehjud
 */
public class Jugador {
    
    private ArrayList<Ficha> fichas;
    private String Color;
    private boolean jug1;

    public Jugador(boolean jug1) {
        this.jug1 = jug1;
        this.setColor(jug1?"blanco":"negro");
        //Agregar Fichas del color que son
        fichas = new ArrayList<Ficha>();
        
        //Peón
        for(int i=0; i<8;i++){
            Point p = new Point(i, jug1?1:6);
            Ficha f = new Peon(this.getColor(), p);
            fichas.add(f);
            Juego.colocarFichaEnTablero(p, f);
        }
        
        //Torre
        for(int i=0; i<8;i+=7){
            Point p = new Point(i, jug1?0:7);
            Ficha f = new Torre(this.getColor(), p);
            fichas.add(f);
            Juego.colocarFichaEnTablero(p, f);
        }
        
        //Caballo
        for(int i=1; i<8;i+=5){
            Point p = new Point(i, jug1?0:7);
            Ficha f = new Caballo(this.getColor(), p);
            fichas.add(f);
            Juego.colocarFichaEnTablero(p, f);
        }
        
        //Alfil
        for(int i=2; i<8;i+=3){
            Point p = new Point(i, jug1?0:7);
            Ficha f = new Alfil(this.getColor(), p);
            fichas.add(f);
            Juego.colocarFichaEnTablero(p, f);
        }
        
        //Reina
            Point p = new Point(3, jug1?0:7);
            Ficha f = new Reina(this.getColor(), p);
            fichas.add(f);
            Juego.colocarFichaEnTablero(p, f);
            
        //Rey
            Point p2 = new Point(4, jug1?0:7);
            Ficha f2 = new Rey(this.getColor(), p2);
            fichas.add(f2);
            Juego.colocarFichaEnTablero(p2, f2);      
    }

    /**
     * @return the fichas
     */
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
}
