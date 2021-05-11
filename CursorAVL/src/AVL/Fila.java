/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVL;

/**
 *
 * @author sebas
 */
public class Fila {
    
    public int id;
    public String value;
    public int izq;
    public int der;
    public int eq;
    
    public Fila(int id, int der){
        this.id = id;
        this.value = " ";
        this.izq = 0;
        this.der = der;
        this.eq = 0;
    }
}
