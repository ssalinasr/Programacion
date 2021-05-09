/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinarios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author FliaSalinasRodriguez
 * @param <E>
 */
public class Nodo<E extends Comparable>{
    private E numero;
    private Nodo<E> ladoIzquierdo, ladoDerecho;
    private Nodo<E> padre;
    private int altura, profundidad, fe;
    private boolean izq, der;
    private ArrayList<Integer> profs;
    

    public Nodo(E n, Nodo<E> padre){
      this.numero = n;
      this.ladoIzquierdo=null;
      this.ladoDerecho=null;
      this.altura = 0;
      this.profundidad = 0;
      this.fe = 0;
      this.padre = padre;
      this.izq = false;
      this.der = false;
      this.profs = new ArrayList<Integer>();
    }
    

    public Nodo<E> agregarNodo(E dato){
      if(((Comparable<E>)dato).compareTo(numero)>=0){
        if(ladoDerecho==null){
          ladoDerecho = new Nodo<E>(dato, this);
          return ladoDerecho;
        }else{
          return ladoDerecho.agregarNodo(dato);
        }
      }else{
        if(ladoIzquierdo==null){
          ladoIzquierdo = new Nodo<E>(dato, this);
          return ladoIzquierdo;
        }else{
          return ladoIzquierdo.agregarNodo(dato);
        }
      }
    }


    
    public E getNumero() {
        return numero;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<Integer> getProfs() {
        return profs;
    }

    public void setProfs(ArrayList<Integer> profs) {
        this.profs = profs;
    }
    
    public Nodo<E> getLadoIzquierdo() {
        return ladoIzquierdo;
    }

    public Nodo<E> getLadoDerecho() {
        return ladoDerecho;
    }

    public void setLadoIzquierdo(Nodo<E> ladoIzquierdo) {
        this.ladoIzquierdo = ladoIzquierdo;
    }

    public void setLadoDerecho(Nodo<E> ladoDerecho) {
        this.ladoDerecho = ladoDerecho;
    }
    
 
    public Nodo<E> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<E> padre) {
        this.padre = padre;
    }
    
    

    public int getProfundidad() {
        return profundidad;
    }
      
    public int getAltura() {
        return altura;
    }

    public int getFactEquilibrio(){
        return fe;
    }
    
    public void setFactEquilibrio(int fe) {
        this.fe = fe;
    }
    
    public Nodo<E> getMaxAltura(){
        try{
        if(ladoDerecho.getAltura() > ladoIzquierdo.getAltura()){
            return ladoDerecho;
        }
        else{
            return ladoIzquierdo;
        }
        }catch(NullPointerException e){
            if(ladoDerecho == null){
                return ladoIzquierdo;
            }
            else{
                return ladoDerecho;
            }
        }
    }
    
    public boolean FactorEquilibrio(){
      if(ladoIzquierdo != null && ladoDerecho != null){
        fe = ladoIzquierdo.getAltura()-ladoDerecho.getAltura();
        return ladoIzquierdo.FactorEquilibrio()| ladoDerecho.FactorEquilibrio()|fe>1|fe<-1;
      }
      if(ladoIzquierdo == null && ladoDerecho == null){
        fe = 0;
        return false;
      }
      if(ladoDerecho == null){
        fe = ladoIzquierdo.getAltura();
        return ladoIzquierdo.FactorEquilibrio()|fe>1|fe<-1;
      }
      if(ladoIzquierdo == null){
        fe = -ladoDerecho.getAltura();
        return ladoDerecho.FactorEquilibrio()|fe>1|fe<-1;
      }
      return false;
    }
    public int ValorFactorEquilibrio(){
      if(ladoIzquierdo != null && ladoDerecho != null){
        fe = ladoIzquierdo.getAltura()-ladoDerecho.getAltura();
        return fe;
      }
      if(ladoIzquierdo == null && ladoDerecho == null){
        fe = 0;
        return fe;
      }
      if(ladoDerecho == null){
        fe = ladoIzquierdo.getAltura();
        return fe;
      }
      if(ladoIzquierdo == null){
        fe = -ladoDerecho.getAltura();
        return fe;
      }
      return fe;
    }
    
    public void ReturnZero(){
      try{
        ladoIzquierdo.ReturnZero();
      }catch(Exception e){}
      altura = 0;
      fe = 0;
      try{
        ladoDerecho.ReturnZero();
      }catch(Exception e){}
    }
    
    public int altura(){
      int h = 1;
      try{
        h += Math.max(ladoIzquierdo.altura(), ladoDerecho.altura());
      }catch(NullPointerException e){
        try{
          h += ladoIzquierdo.altura();
        }catch(NullPointerException e1){}
        try{
          h += ladoDerecho.altura();
        }catch(NullPointerException e1){}
      }
      this.altura = h;
      return h;
    }
    
    public Nodo<E> buscarIzqDer(E num){
      Nodo<E> abb = null;
      if(num == this.numero){
          return this;
      }
      else{
          if(((Comparable<E>)num).compareTo(numero)>0){
              abb = ladoDerecho.buscarIzqDer(num);
          }
          else{
              abb = ladoIzquierdo.buscarIzqDer(num);
          }
      }         
     return abb;
    }
    
    public int profundidad(E num){
      int prof = 0;
      if(num == this.numero){
          return prof;
      }
      else{
          if(((Comparable<E>)num).compareTo(numero)>0){
              prof = 1 + ladoDerecho.profundidad(num);
          }
          else{
              prof = 1 + ladoIzquierdo.profundidad(num);
          }
      }         
    this.profs.add(prof);
    this.profundidad = prof;
    return prof;    
    }
    
   public boolean esNodoIzquierdo(E num){
       Nodo<E> result = this.buscarIzqDer(num);
       if(((Comparable<E>)result.numero).compareTo(numero)<0){
           izq = true;
           return true;
       }
       return false;
    }
    
    public boolean esNodoDerecho(E num){
    Nodo<E> result = this.buscarIzqDer(num);
       if(((Comparable<E>)result.numero).compareTo(numero)>0){
           der = true;
           return true;
       }
       return false;
    }
    
    public int cantidadHijos(){
        int cant = 0;
        if(ladoDerecho!=null){
            cant += 1 + ladoDerecho.cantidadHijos();
        }
        if(ladoIzquierdo!=null){
            cant += 1 + ladoIzquierdo.cantidadHijos();
        }
        return cant;
    }
    
    public boolean nodoLleno(){
        if(ladoDerecho != null && ladoIzquierdo != null){
            return true;
        }
        else{
            if(ladoDerecho == null && ladoIzquierdo == null){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public boolean esLleno(){
    ArrayList<Boolean> bool = new ArrayList<Boolean>();
    try{
        bool.add(this.nodoLleno());
    }catch(NullPointerException e){}
    try{
        bool.add(ladoIzquierdo.nodoLleno());
        ladoIzquierdo.esLleno();
        
    }catch(NullPointerException e){}
    try{
        bool.add(ladoDerecho.nodoLleno());
        ladoDerecho.esLleno();
        
    }catch(NullPointerException e){}
    
    Iterator it = bool.iterator();
    while(it.hasNext()){
        if(it.next().equals(false)){
            return false;          
        }
    }
    return true;
    }
    
    public void recorrerIRD(){
      try{
        ladoIzquierdo.recorrerIRD();
      }catch(Exception e){}
      System.out.print(numero+" ");
      try{
        ladoDerecho.recorrerIRD();
      }catch(Exception e){}
    }
    
    public void recorrerDRI(){
      try{
        ladoDerecho.recorrerDRI();
      }catch(Exception e){}
      System.out.print(numero+" ");
      try{
        ladoIzquierdo.recorrerDRI();
      }catch(Exception e){}
    }
    
    public void recorrerRID(){
        System.out.print(numero+" ");
        try{
        ladoIzquierdo.recorrerRID();
      }catch(Exception e){}
      try{
        ladoDerecho.recorrerRID();
      }catch(Exception e){}
    }
    
    public void recorrerRDI(){
        System.out.print(numero+" ");
        try{
        ladoDerecho.recorrerRDI();
      }catch(Exception e){}
      try{
        ladoIzquierdo.recorrerRDI();
      }catch(Exception e){}
    }
}
