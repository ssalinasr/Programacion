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
public class Reina extends Ficha{

    public Reina(String color, Point posicion) {
        super(color, posicion);
        this.cargarAnimacion("animacionReina.gif");
    }

    @Override
    public ArrayList<Point> posiblesMovimientos() {
        ArrayList<Point> pm = new ArrayList<Point>();
        if(this.getColor().equals("blanco")){
            pm.add(new Point(this.getPosicion().x,this.getPosicion().y+1));
        }else{
            pm.add(new Point(this.getPosicion().x,this.getPosicion().y-1));
        }
        
        return pm;
    }

    
}
