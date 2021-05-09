/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.modelo;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author sehjud
 */
public class Tablero {
    private Ficha[][] fichas = new Ficha[8][8];
    public void mirarMovimientos(int x, int y){
        try{
        for(Point p : getFichas()[y][x].posiblesMovimientos()){
            System.out.println(p);
        }
        //TODO agregar movimientos posibles en entorno gráfico
        }catch(NullPointerException e){
            System.out.println("No hay una ficha en esa ubicación");
        }
    }

    /**
     * @return the fichas
     */
    public Ficha[][] getFichas() {
        return fichas;
    }

    /**
     * @param fichas the fichas to set
     */
    public void setFichas(Ficha[][] fichas) {
        this.fichas = fichas;
    }
    
    public void colocarFicha(Point p, Ficha f){
        fichas[p.y][p.x] = f;
    }
}
