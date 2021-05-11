/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesnarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ArbolesNArios {
    
    public static void main(String[] args) {
       ArbolNArio ar = new ArbolNArio(new Nodo("?"));
       ar.InsertarPalabra("Alpha");
       ar.InsertarPalabra("Algo");
       ar.InsertarPalabra("Alg");
       ar.InsertarPalabra("Gamma");
       ar.InsertarPalabra("Beta");
        //System.out.println(ar.getRamas());
        System.out.println(ar.getPreOrder());
        System.out.println(ar.getPostOrder());
        List<Nodo> hijos = ar.getRaiz().getHijos();
        for(Nodo e: hijos){
            System.out.print(e.getDato()+" ");
        }
    }
    
}
