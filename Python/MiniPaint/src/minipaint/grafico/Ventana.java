/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipaint.grafico;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ScrollPaneLayout;
import minipaint.grafico.paneles.Lienzo;
import minipaint.grafico.paneles.PanelBotones;
import minipaint.grafico.paneles.PanelFiguras;

/**
 *
 * @author sehjud
 */
public class Ventana extends JFrame{
    
    private Lienzo lienzo;
    private PanelBotones botones;
    private PanelFiguras portapapeles;
    

    public Ventana(String title) throws HeadlessException {
        super(title);
        lienzo = new Lienzo(Color.CYAN);
        botones = new PanelBotones();
        portapapeles = new PanelFiguras();
        this.setBounds(0, 0, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(lienzo);
        this.add(botones);
        this.add(portapapeles);
        this.setVisible(true);
    }

    /**
     * @return the lienzo
     */
    public Lienzo getLienzo() {
        return lienzo;
    }

    /**
     * @param lienzo the lienzo to set
     */
    public void setLienzo(Lienzo lienzo) {
        this.lienzo = lienzo;
    }

    /**
     * @return the botones
     */
    public PanelBotones getBotones() {
        return botones;
    }

    /**
     * @param botones the botones to set
     */
    public void setBotones(PanelBotones botones) {
        this.botones = botones;
    }

    /**
     * @return the portapapeles
     */
    public PanelFiguras getPortapapeles() {
        return portapapeles;
    }

    /**
     * @param portapapeles the portapapeles to set
     */
    public void setPortapapeles(PanelFiguras portapapeles) {
        this.portapapeles = portapapeles;
    }

    

    
    
    
}
