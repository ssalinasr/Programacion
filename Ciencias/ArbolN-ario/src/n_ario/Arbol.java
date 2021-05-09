/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_ario;

/**
 *
 * @author Flia_Salinas
 */
public class Arbol {
    
    public Nodo raiz;
    
    public Arbol(Nodo raiz){
        this.raiz = raiz;
    }
    
    public static void main(String[] args) {
        Arbol ar = new Arbol(new Nodo<>("a"));
        ar.raiz.insertarNodo(new Nodo("casa"));
        ar.raiz.insertarNodo(new Nodo("falso"));
        ar.raiz.insertarNodo(new Nodo("que"));
        ar.raiz.insertarNodo(new Nodo("que"));
    }
    
}
