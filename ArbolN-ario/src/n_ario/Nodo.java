/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_ario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flia_Salinas
 * @param <T>
 */
public class Nodo<T>{
    
    public T valor;
    public ArrayList<Nodo<T>> hijos;
    public Nodo<T> padre;
    private Nodo<T> ultimo;
    
    public Nodo(T Valor){
        this.valor = Valor;
        this.hijos = new ArrayList<>();
        this.padre = null; 
    }
    
     T createContents(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void insertarNodo(ArrayList<String> cad_array, Nodo<T> asociado){
       boolean encontrado = this.buscarValor(cad_array.get(0));        
        Nodo first = new Nodo ((T) cad_array.get(0));
        System.out.println(first.getValor());
        
        
        if(encontrado){
            
        }
      
        }
        /*
        for(Nodo k : this.getHijos()){
            System.out.println("Nodo:"+k.getValor()+", Hijos: ");
            k.impHijos();
        }
          */
    
       
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

   public boolean buscarValor(String valor){
     boolean encontrado = false;
     Nodo fin = new Nodo(valor);
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
    
        // Function to print the inorder traversal
    // of the n-ary tree
    public void buildInorden(Nodo node){
        if (node == null)
            return;
 
        // Total children count
        // All the children except the last
        node.getHijos().forEach((k) -> {
            buildInorden((Nodo) k);
        });
         
        // Print the current node's data
        System.out.print("" + node.getValor() + " ");
 
        // Last child
        if(node.getHijos().size() > 0){
        buildInorden((Nodo) node.getHijos().get(node.getHijos().size() -1));
        }
    }
    
    


    
    
    
    
}
