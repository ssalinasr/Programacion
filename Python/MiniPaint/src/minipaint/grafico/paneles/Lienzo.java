/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.grafico.paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author sehjud
 */
public class Lienzo extends JPanel{
    
    private Color fondo;

    public Lienzo(Color fondo) {
        setBounds(5,5,330, 465);
        setBackground(fondo);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        minipaint.MiniPaint.dibujarC((Graphics2D) g);
    }

    /**
     * @return the fondo
     */
    public Color getFondo() {
        return fondo;
    }

    /**
     * @param fondo the fondo to set
     */
    public void setFondo(Color fondo) {
        this.fondo = fondo;
        this.setBackground(fondo);
    }
    
    
}
