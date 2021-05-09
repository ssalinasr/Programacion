/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eps;

import Interfaz.Cancelar_cita;
import Interfaz.Solicitar_cita;


/**
 *
 * @author Guillermo Velez
 */
public class Main {
    public static void main(String[] args) {
        Solicitar_cita mostrar= new Solicitar_cita();
        mostrar.setVisible(true);
        Cancelar_cita cancelar= new Cancelar_cita();
        cancelar.setVisible(true);
                
    }
}
