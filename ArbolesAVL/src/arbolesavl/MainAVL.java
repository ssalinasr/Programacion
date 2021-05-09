/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesavl;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class MainAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolAVL abb = new ArbolAVL();
        abb.insertar(10);
        abb.insertar(5);
        abb.insertar(13);
        abb.insertar(1);
        abb.insertar(6);
        abb.insertar(17);
        abb.preOrden(abb.obtenerRaiz());
        abb.eliminar(6);
        abb.preOrden(abb.obtenerRaiz());
        
        
    }
    
}
