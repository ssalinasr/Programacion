package AVL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class NodoAVL {
    public int altura;
    public String valor;
    public NodoAVL izquierdo,derecho;
    public int balance;
    
    public NodoAVL(String valor){
        this.valor = valor;
        this.altura = 1;
        this.balance = 0;
    }
}
