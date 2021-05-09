/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_ario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Flia_Salinas
 * @param <T>
 */
public class Nodo<T>{
    
    public T valor;
    public ArrayList<Nodo<T>> hijos;
    public Nodo<T> padre;
    
    public Nodo(T Valor){
        this.valor = Valor;
        this.hijos = new ArrayList<>();
        this.padre = null; 
    }
    
    public void insertarNodo(Nodo<T> n){
        boolean existe = false;
        Nodo<T> igual = null;
        Nodo<T> fin = new Nodo("}");

        
        for(Nodo e : this.getHijos()){
            if(n.getValor().equals(e.getValor())){
                igual = e;
                existe = true;
                System.out.println("Hay igual");
                break;
            }
        }
        
        if(existe){
            n.setPadre(igual);
            igual.getHijos().add(n);
            if(!igual.buscarValor()){
                igual.getHijos().add(new Nodo("}"));
            }
            Collections.sort(igual.getHijos(), LetraNodo);

        }
        else{
            n.setPadre(this);
            this.getHijos().add(n);
            if(!this.buscarValor()){
                this.getHijos().add(new Nodo("}"));
            }
            Collections.sort(this.hijos, LetraNodo);
        }
        
        for(Nodo k : this.getHijos()){
            System.out.println("Nodo:"+k.getValor()+", Hijos: ");
            k.impHijos();
        }
          
    }
       
    public static Comparator<Nodo> LetraNodo = new Comparator<Nodo>() {
        @Override
        public int compare(Nodo t, Nodo t1) {
            	   String LetraNodo1 = (String)t.valor;
	   String LetraNodo2 = (String)t1.valor;

	   //ascending order
	   return LetraNodo1.compareTo(LetraNodo2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
        }
    };

   public boolean buscarValor(){
     boolean encontrado = false;
     Nodo fin = new Nodo("}");
     for(Nodo k : this.getHijos()){
         if(k.getValor().equals(fin.getValor())){
             encontrado = true;
             break;
         }
     }
      return encontrado; 
   } 
    
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public ArrayList<Nodo<T>> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo<T>> hijos) {
        this.hijos = hijos;
    }

    public Nodo<T> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<T> padre) {
        this.padre = padre;
    }
    
    public void impHijos(){
        for(Nodo k : this.getHijos()){
            System.out.print(k.getValor()+" ");
        }
    }
    
    


    
    
    
    
}
