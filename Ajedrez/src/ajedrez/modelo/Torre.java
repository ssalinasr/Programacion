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
public class Torre extends Ficha{

    public Torre(String color, Point posicion) {
        super(color, posicion);
        this.cargarAnimacion("animacionTorre.gif");
    }

    @Override
    public ArrayList<Point> posiblesMovimientos() {
        ArrayList<Point> pm = new ArrayList<Point>();
        
        //Movimientos aumentando X y Y
        for(int i = this.getPosicion().x;i<8;i++){
            if(i != this.getPosicion().y){
               pm.add(new Point(i,this.getPosicion().y)); 
            }      
        }
        
        for(int j = this.getPosicion().y;j<8;j++){
            if(j != this.getPosicion().x){
              pm.add(new Point(this.getPosicion().x,j));    
            }         
        }
        
        //Movimientos reduciendo X y Y
        for(int i = this.getPosicion().x;i==0;i--){
            if(i != this.getPosicion().y){
              pm.add(new Point(i,this.getPosicion().y));   
            }     
        }
        
        for(int j = this.getPosicion().y;j==0;j--){
            if(j != this.getPosicion().x){
               pm.add(new Point(this.getPosicion().x,j));  
            }     
            }
        return pm;
    }

    
}
