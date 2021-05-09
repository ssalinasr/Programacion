package eps;

import Interfaz.Consultar_Cita;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventanas_EPS {

    private Consultar_Cita cc = new Consultar_Cita();
    private Resultado_Busqueda rb = new Resultado_Busqueda();
    
    public static void main(String[] args) {
        
        new Ventanas_EPS();
    }

    public Ventanas_EPS() {
        
        Icon check = new ImageIcon(getClass().getResource("/ventanas_eps/Check.png"));
        Icon cross = new ImageIcon(getClass().getResource("/ventanas_eps/Cross.png"));
       
        
   
        
        cc.setVisible(true);
        rb.setVisible(true);
    }
    
     
}
