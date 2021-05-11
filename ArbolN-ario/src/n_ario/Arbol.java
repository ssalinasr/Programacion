/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_ario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Flia_Salinas
 */
public class Arbol<T> {
    
    public Nodo<T> raiz;
    
    public Arbol(Nodo<T> raiz){
        this.raiz = raiz;
    }
    
        /**
     *
     * Get the list of nodes arranged by the pre-order traversal of the tree.
     *
     * @return The list of nodes in the tree, arranged in the pre-order
     */
    public ArrayList<Nodo<T>> getPreOrden() {
        ArrayList<Nodo<T>> preOrder = new ArrayList<>();
        buildPreOrden(raiz, preOrder);
        return preOrder;
    }

    public ArrayList<Nodo<T>> getPostOrden() {
        ArrayList<Nodo<T>> postOrder = new ArrayList<>();
        buildPostOrden(raiz, postOrder);
        return postOrder;
    }
    
     public void getInOrden() {
        raiz.buildInorden(raiz);
    }

    private void buildPreOrden(Nodo<T> node, ArrayList<Nodo<T>> preOrder) {
        preOrder.add(node);
        for (Nodo<T> child : node.getHijos()) {
            buildPreOrden(child, preOrder);
        }
    }

    private void buildPostOrden(Nodo<T> node, ArrayList<Nodo<T>> postOrder) {
        for (Nodo<T> child : node.getHijos()) {
            buildPostOrden(child, postOrder);
        }
        postOrder.add(node);
    }
    
    public static void main(String[] args) {
        Arbol ar = new Arbol(new Nodo<>("?"));
        Scanner n = new Scanner(System.in);
        
        String palabra = n.nextLine();
        char[] list = new char[palabra.length() + 1];
        
       for (int x = 0; x < palabra.length(); x++){
           list[x] = palabra.charAt(x);
       }
              
       list[palabra.length()] = '}'
               ;
       ArrayList<String> list_str = new ArrayList<>();
       
        for (int x = 0; x < list.length; x++){
           list_str.add(Character.toString(list[x]));
       }

        System.out.println(list_str);
        System.out.println(list_str.size());
       
        ar.raiz.insertarNodo(list_str, ar.raiz);
       
       
       /*
        ArrayList<Nodo> preorden = ar.getPreOrden();
        for (Nodo k : preorden){
            System.out.print(k.getValor()+  "");
        }
    
    
    ArrayList<Nodo> posorden = ar.getPostOrden();
        for (Nodo k : posorden){
            System.out.print(k.getValor()+  "");
        }
    }
   */ 
    
    
}
}
    
    

