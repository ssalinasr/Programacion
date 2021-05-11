package narios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flia_Salinas
 */
public class NodoB<T> {
    
    private T dato;
    public NodoB<T> izquierdo;
    public NodoB<T> derecho;
    public NodoB<T> padre;
    
    public NodoB(T dato){
        this.dato = dato;
        this.padre = null;
        this.izquierdo = null;
        this.derecho = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoB<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoB<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoB<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoB<T> derecho) {
        this.derecho = derecho;
    }

    public NodoB<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoB<T> padre) {
        this.padre = padre;
    }
    
    public void insertarNodo(NodoN node){
        System.out.println(node.getDireccion());
        if(node.getDireccion() == 1){
            this.izquierdo = new NodoB(node.getDato().toString());
        }
        else{
            if(this.izquierdo.getDerecho() == null){
                this.izquierdo.setIzquierdo(new NodoB(node.getDato().toString()));
            }
            else{
                this.izquierdo.getDerecho().insertarNodo(node);
            }
        }
        
        
        
    }
    
    public void inOrden(int space){  
        space++;
        
        if(this.izquierdo != null){
            this.izquierdo.inOrden(space);
        }

        for(int i = 0 ; i < space ; i++){
            System.out.print(" ");
        }
        
        System.out.print(this.getDato()+" ");
        System.out.println("");
        
        if(this.derecho != null){
            this.derecho.inOrden(space);
        }
        
    }
    
    
    
}
