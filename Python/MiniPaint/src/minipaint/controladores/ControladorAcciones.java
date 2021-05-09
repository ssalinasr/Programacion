/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import minipaint.MiniPaint;
import minipaint.grafico.paneles.PanelBotones;
import minipaint.modelo.figuras.Circulo;

/**
 *
 * @author sehjud
 */
public class ControladorAcciones implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(MiniPaint.v.getBotones().getCirculo())){
            MiniPaint.p.getLista().add(new Circulo((int)(Math.random()*300), (int)(Math.random()*300), 2, "rojo", (int)(Math.random()*100)));
        }
        MiniPaint.v.getLienzo().repaint();
    }
    
    public void agregarEscucha(){
        minipaint.MiniPaint.v.getBotones().getCirculo().addActionListener(minipaint.MiniPaint.ca);
        minipaint.MiniPaint.v.getBotones().getRectangulo().addActionListener(minipaint.MiniPaint.ca);
        minipaint.MiniPaint.v.getBotones().getTriangulo().addActionListener(minipaint.MiniPaint.ca);
        minipaint.MiniPaint.v.getBotones().getLinea().addActionListener(minipaint.MiniPaint.ca);
        
        
    }
    
}
