/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.controlador;

import ajedrez.modelo.Ficha;
import ajedrez.modelo.Jugador;
import ajedrez.modelo.Tablero;
import java.awt.Point;

/**
 *
 * @author sehjud
 */
public class Juego {
    
    public static Jugador j1,j2;
    public static Tablero t;
    
    public static void iniciarJuego(){
        t = new Tablero();
        j1 = new Jugador(true);
        j2 = new Jugador(false);
        t.mirarMovimientos(2, 0);
    }
    public static void colocarFichaEnTablero(Point p, Ficha f){
        t.colocarFicha(p, f);
    }
    
}
