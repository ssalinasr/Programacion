/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narios;

import java.util.ArrayList;

/**
 *
 * @author Flia_Salinas
 */
public class ArbolN<T> {
    
    private NodoN<T> raiz;
    
    public ArbolN(NodoN<T> raiz){
        this.raiz = raiz;
    }

    public NodoN<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoN<T> raiz) {
        this.raiz = raiz;
    }
    
  public NodoN<T> findNodo(NodoN<T> node, T keyNode) {
        if (node == null)
            return null;
        if (node.getDato().equals(keyNode))
            return node;
        else {
            NodoN<T> cnode = null;
            for (NodoN<T> child : node.getHijos())
                if ((cnode = findNodo(child, keyNode)) != null)
                    return cnode;
        }
        return null;
    } 
  
  
  public void mostrarRamas() {
        // lista para guardar los valores de los de la rama
        ArrayList<T> rama = new ArrayList<>();
        // agregar el valor de la raiz
        rama.add(raiz.getDato());

        mostrarRamas(raiz, rama);
    }

    private void mostrarRamas(NodoN<T> nodo, ArrayList<T> rama) {
        // si el nodo no tiene hijos imprimir la colección de valores
        if (nodo.getHijos().isEmpty()) {
            System.out.println(rama);
        }
        // recorrer los hijos del nodo
        for (NodoN<T> n : nodo.getHijos()) {
            // agregar el valor  del nodo a la lista
            rama.add(n.getDato());
            // llamada recursiva
            mostrarRamas(n, rama);
            // retirar el ultimo valor insertado
            rama.remove(rama.size() - 1);
        }
    }      
}


