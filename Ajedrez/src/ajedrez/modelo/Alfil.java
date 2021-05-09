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
public class Alfil extends Ficha{

    public Alfil(String color, Point posicion) {
        super(color, posicion);
        this.cargarAnimacion("animacionAlfil.gif");
    }

    @Override
    public ArrayList<Point> posiblesMovimientos() {
        ArrayList<Point> pm = new ArrayList<Point>();
        int diferencia = Math.abs(this.getPosicion().x-this.getPosicion().y);
        //Movimientos aumentando X y Y
        for(int i = this.getPosicion().x;i<8;i++){
            for(int j = this.getPosicion().y;j<8;j++){
                if(i - j == diferencia){
                    pm.add(new Point(i,j));
                }              
            }
        }
        
        for(int i = this.getPosicion().x;i==0;i--){
            for(int j = this.getPosicion().y;j==0;j--){
                if(i - j == diferencia){
                    pm.add(new Point(i,j));
                }              
            }
        }
   /*     
   //Movimientos disminuyendo X y Y
        for(int i = this.getPosicion().x;i<8;i++){
            for(int j = this.getPosicion().y;j<8;j++){
                if(i+j == 7){
                    pm.add(new Point(i,j));
                }              
            }
        }
*/
        return pm;
    }


    
}
