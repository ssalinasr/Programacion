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
public class NodoAVL {
    
    int dato, fe;
    NodoAVL hijoIzquierdo, hijoDerecho;
    
    public NodoAVL(int d){
        this.dato = d;
        this.fe = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
        
    }
    
}
