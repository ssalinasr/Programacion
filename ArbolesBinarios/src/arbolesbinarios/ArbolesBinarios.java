/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author FliaSalinasRodriguez
 * @param <E>
 */
public class ArbolesBinarios<E extends Comparable> {
    Nodo<E> raiz;
    
    public void agregarNodo(E dato){
      if(raiz == null){
        raiz = new Nodo<E>(dato, null);
      }else{
        Nodo<E> nodo = raiz.agregarNodo(dato);         
          raiz.altura();
        if(raiz.FactorEquilibrio()){
          equilibrar(nodo);
        }
      }
    }
    
    public void equilibrar(Nodo<E> rev){
        Nodo<E> P = null, Q = null;
        while(rev.getFactEquilibrio() <=1 && rev.getFactEquilibrio()>=-1){
            rev = rev.getPadre();
        }
        P = rev;
        Q = P.getMaxAltura();
        
        if(P.getFactEquilibrio() > 0 && Q.getFactEquilibrio() > 0){//rotacion simple derecha
            rev = rotarDerecha(rev);

        }
        if(P.getFactEquilibrio() < 0 && Q.getFactEquilibrio() < 0){//rotacion simple izquierda
           rev = rotarIzquierda(rev);
          
        }
        if(P.getFactEquilibrio() < 0 && Q.getFactEquilibrio() > 0){//rotacion doble izquierda P
            rev = rotarDobleIzq(rev);
        }
        if(P.getFactEquilibrio()>0 && Q.getFactEquilibrio() < 0){//rotacion doble derecha P
            rev = rotarDobleDer(rev);
        }
        
        
  
    }
    
    public Nodo<E> rotarIzquierda(Nodo<E> rev){//Rotacion simple por izquierda
        Nodo<E> temp = rev.getLadoDerecho();
        temp.setPadre(rev.getPadre());
        temp.setLadoIzquierdo(rev);
        rev.setPadre(temp);   
        System.out.println("Arbol re-equlibrado...");
        return temp;                
    }
    
    public Nodo<E> rotarDerecha(Nodo<E> rev){//Rotacion simple por derecha
        Nodo<E> temp = rev.getLadoIzquierdo();
        temp.setPadre(rev.getPadre());
        rev.setPadre(temp);
        temp.setLadoDerecho(rev);
        System.out.println("Arbol re-equlibrado...");
        return temp;       
    }
    
    public Nodo<E> rotarDobleIzq(Nodo<E> rev){//Rotacion doble, P por Izquierda
        Nodo<E> nod;
            if(rev.getLadoIzquierdo() == null){
                nod = rev.getLadoDerecho().getMaxAltura();
                nod.setLadoIzquierdo(rev.getLadoDerecho());
                nod.setLadoDerecho(rev);
                nod.setPadre(rev.getPadre());
                rev.setPadre(nod);
                rev.getLadoDerecho().setPadre(nod);
            }
            else{
                nod = rev.getLadoDerecho().getMaxAltura();
                nod.setLadoIzquierdo(rev.getLadoDerecho());
                nod.setLadoDerecho(rev);
                nod.setPadre(rev.getPadre());
                rev.setPadre(nod);
                rev.getLadoDerecho().setPadre(nod);
            }
        
        System.out.println("Arbol re-equlibrado...");
        return nod;
        
    }
    
    public Nodo<E> rotarDobleDer(Nodo<E> rev){//Rotacion doble, P por derecha
             Nodo<E> nod;
            if(rev.getLadoDerecho() == null){
                nod = rev.getLadoIzquierdo().getMaxAltura();
                nod.setLadoIzquierdo(rev.getLadoIzquierdo());
                nod.setLadoDerecho(rev);
                nod.setPadre(rev.getPadre());
                rev.setPadre(nod);
                rev.getLadoIzquierdo().setPadre(nod);
            }
            else{
                nod = rev.getLadoIzquierdo().getMaxAltura();
                nod.setLadoIzquierdo(rev.getLadoIzquierdo());
                nod.setLadoIzquierdo(rev);
                nod.setPadre(rev.getPadre());
                rev.setPadre(nod);
                rev.getLadoIzquierdo().setPadre(nod);
            }
        
        System.out.println("Arbol re-equlibrado...");

        return nod;
    }
      
    public int altura(){
      return raiz.altura();
    }
    
    public Nodo<E> maxAltura(){
        return raiz.getMaxAltura();
    }
    
    public int profundidad(E num){
        return raiz.profundidad(num);
    }
      
        public E getNumero() {
        return raiz.getNumero();
    }

    public Nodo<E> getLadoIzquierdo() {
        return raiz.getLadoIzquierdo();
    }

    public Nodo<E> getLadoDerecho() {
        return raiz.getLadoDerecho();
    }

    public int getAltura() {
        return raiz.getAltura();
    }
    
    public boolean esNodoIzquierdo(E num){
        return raiz.esNodoIzquierdo(num);
    }
    
    public boolean esNodoDerecho(E num){
        return raiz.esNodoDerecho(num);
    }
    
    public int cantidadHijos(){
        return raiz.cantidadHijos();
    }
    
    public boolean esLleno(){
        return raiz.esLleno();
    }
    
    public boolean esCompleto() {
       ArrayList<Integer> profs = raiz.getProfs();
       Iterator it = profs.iterator();
       boolean bool = true;
       int max = Collections.max(raiz.getProfs());
       while(it.hasNext()){
           if(!it.next().equals(max)){
               bool = false;
               break;
           }
       }
       return bool;
    }
    
    public boolean esPerfecto(){
        int nodos = 1 + raiz.cantidadHijos();
        return nodos == (raiz.altura()^(1/2)-1);
    }
    
    public Nodo<E> buscar(E num){
        return raiz.buscarIzqDer(num);
    }

    public void recorrerIRD(){
      raiz.recorrerIRD();
    }
    
    public void recorrerDRI(){
      raiz.recorrerDRI();
    }
    
    public void recorrerRID(){
      raiz.recorrerRID();
    }
    
    public void recorrerRDI(){
      raiz.recorrerRDI();
    }
    
    public static void main(String[] args){
    
     ArbolesBinarios<Integer> ab = new ArbolesBinarios<Integer>();
     ab.agregarNodo(45);
     ab.agregarNodo(53);
     ab.agregarNodo(75);
     
     
     ArbolesBinarios<Integer> ab2 = new ArbolesBinarios<Integer>();
     ab2.agregarNodo(45);
     ab2.agregarNodo(25);
     ab2.agregarNodo(15);
     
     ArbolesBinarios<Integer> ab3 = new ArbolesBinarios<Integer>();
     ab3.agregarNodo(45);
     ab3.agregarNodo(53);
     ab3.agregarNodo(52);
           
     ArbolesBinarios<Integer> ab4 = new ArbolesBinarios<Integer>();
     ab4.agregarNodo(45);
     ab4.agregarNodo(29);
     ab4.agregarNodo(44);
      
    }
}
    


