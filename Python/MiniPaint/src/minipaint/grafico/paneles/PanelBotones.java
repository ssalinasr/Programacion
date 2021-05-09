/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.grafico.paneles;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sehjud
 */
public class PanelBotones extends JPanel {
    
    private JButton circulo;
    private JButton rectangulo;
    private JButton triangulo;
    private JButton linea;

    public PanelBotones() {
        this.setBounds(340, 5, 140, 200);
        circulo = new JButton("C");
        rectangulo = new JButton("R");
        triangulo = new JButton("T");
        linea = new JButton("L");
        this.add(circulo);        
        this.add(rectangulo);
        this.add(triangulo);
        this.add(linea);
    }

    /**
     * @return the circulo
     */
    public JButton getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(JButton circulo) {
        this.circulo = circulo;
    }

    /**
     * @return the rectangulo
     */
    public JButton getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(JButton rectangulo) {
        this.rectangulo = rectangulo;
    }

    /**
     * @return the triangulo
     */
    public JButton getTriangulo() {
        return triangulo;
    }

    /**
     * @param triangulo the triangulo to set
     */
    public void setTriangulo(JButton triangulo) {
        this.triangulo = triangulo;
    }

    /**
     * @return the linea
     */
    public JButton getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(JButton linea) {
        this.linea = linea;
    }
    
    
    
}
