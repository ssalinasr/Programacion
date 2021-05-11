/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesnarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

/**
 *
 * @author sebas
 */
public class Nodo<T> {
private T dato;   
private List<Nodo<T>> hijos;   
private Nodo<T> padre;  
private Nodo<T> ultimo;

public Nodo(T dato) {   
    this.dato = dato;
this.hijos = new ArrayList<>();  
}
public Nodo(Nodo<T> nodo) {     
    this.dato = (T) nodo.getDato();
     hijos = new ArrayList<>();   
}

public void insertarPalabra(Nodo<T> raiz, ArrayList<String> palabra){
    boolean enc = false;
    Nodo<T> hal = null; 
    
    if(palabra.size() > 0 && this.ultimo != null){
     System.out.println("Letra actual: "+palabra.get(0));
    
     enc = this.buscarValor(palabra.get(0));
        System.out.println("Coincidencia: "+enc);
        hal = this.buscarValorNode(palabra.get(0));
    }
    
     if(palabra.size() > 0 && this.ultimo == null){
     System.out.println("Letra actual: "+palabra.get(0));
    
     enc = this.buscarValorF(palabra.get(0));
        System.out.println("Coincidencia: "+enc);
        hal = this.buscarValorNodeF(palabra.get(0));
    }
    
    
    if(enc){
        System.out.println("Palabra actual: " +palabra);
            this.ultimo = raiz;
            Nodo temp = hal;
            System.out.println("Ultimo: "+ultimo.getDato());
            System.out.println("Temporal: "+temp.getDato());
            palabra.remove(0);
            System.out.println("Tamaño: "+palabra.size());
            this.insertarPalabra(temp, palabra);       
    }
    else{
        while(palabra.size() > 0){
            System.out.println("Palabra actual: "+palabra);
            this.ultimo = raiz;
            Nodo temp = new Nodo(palabra.get(0));
            System.out.println("Ultimo: "+ultimo.getDato());
            System.out.println("Temporal: "+temp.getDato());
            palabra.remove(0);
            System.out.println("Tamaño:"+ palabra.size());
            this.ultimo.agregarHijo(temp);
            this.insertarPalabra(temp, palabra);
        }
        this.ultimo = null;
    }
    
    
    
}


    public static Comparator<Nodo> LetraNodo = new Comparator<Nodo>() {
        @Override
        public int compare(Nodo t, Nodo t1) {
            	   String LetraNodo1 = (String)t.dato;
	   String LetraNodo2 = (String)t1.dato;

	   //ascending order
	   return LetraNodo1.compareTo(LetraNodo2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
        }
    };

   public boolean buscarValor(String valor){
     boolean encontrado = false;
     Nodo fin = new Nodo(valor);
     for(Nodo k : this.ultimo.getHijos()){
         System.out.print("Dato busqueda:" +k.getDato()+ " ");
         if(k.getDato().equals(fin.getDato())){
             encontrado = true;
             break;
         }
     }
     
      return encontrado; 
   }
   
 public Nodo<T> buscarValorNode(String valor){
     Nodo fin = new Nodo(valor);
     Nodo hallado = null;
     for(Nodo k : this.ultimo.getHijos()){
         if(k.getDato().equals(fin.getDato())){
             hallado = k;
             break;
         }
     }
     
      return hallado; 
   }
 
  public boolean buscarValorF(String valor){
     boolean encontrado = false;
     Nodo fin = new Nodo(valor);
     for(Nodo k : this.getHijos()){
         System.out.print("Dato busqueda:" +k.getDato()+ " ");
         if(k.getDato().equals(fin.getDato())){
             encontrado = true;
             break;
         }
     }
     
      return encontrado; 
   }
   
 public Nodo<T> buscarValorNodeF(String valor){
     Nodo fin = new Nodo(valor);
     Nodo hallado = null;
     for(Nodo k : this.getHijos()){
         if(k.getDato().equals(fin.getDato())){
             hallado = k;
             break;
         }
     }
     
      return hallado; 
   }
   
    public void agregarHijo(Nodo<T> hijo) {     
        hijo.setPadre(this);
         hijos.add(hijo);   
    }    
    
    public void agregarHijoEn(int posicion, Nodo<T> hijo) {  
        hijo.setPadre(this);    
        this.hijos.add(posicion, hijo);
    }
    
    public void setHijos(List<Nodo<T>> hijos) { 
        for (Nodo<T> hijo : hijos)       
            hijo.setPadre(this);      
        this.hijos = hijos;   
    }    
    
    public void eliminarHijos() {    
        this.hijos.clear();   
    } 
    
    public Nodo<T> eliminarHijoEn(int posicion) { 
        return hijos.remove(posicion); 
    }       
    
    public void eliminarHijo(Nodo<T> hijoABorrar)   {
        List <Nodo<T>> list = getHijos();     
        list.remove(hijoABorrar);   
    }    
    
    public T getDato() {    
        return this.dato;   
    }
    
    public void setDato(T dato) {     
        this.dato = dato;
    }
    
    public Nodo<T> getPadre() {     
        return this.padre;
    } 
    
    public void setPadre(Nodo<T> padre) {
        this.padre = padre;  
    }

    public List<Nodo<T>> getHijos() {
        return this.hijos;   
    } 
    
    public Nodo<T> getHijoEn(int posicion) { 
        return hijos.get(posicion);  
    }

    @Override   public boolean equals(Object obj) {
        if (null == obj)      
            return false;      
        if (obj instanceof Nodo) {      
            if (((Nodo<?>) obj).getDato().equals(this.dato))      
                return true;    
        }      
        return false;  
    } 
    
    @Override   
    public String toString() { 
        return this.dato.toString(); 
    }
    
}
