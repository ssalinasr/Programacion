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
public class NodoN<T> {
    
    private T dato;
    private int peso;
    private ArrayList<NodoN<T>> hijos;
    private NodoN<T> padre;
   private int direccion;
   private int distancia;
   private boolean esHoja;
   
   private ArrayList<NodoN<T>> leafs = new ArrayList<>();
   private ArrayList<NodoN<T>> FatherNodes = new ArrayList<>();
    
    public NodoN(NodoN<T> padre, T dato, int peso, ArrayList<NodoN<T>> hijos, int direccion){
        this.dato = dato;
        this.peso = peso;
        this.padre = padre;
        this.hijos = hijos;
        this.direccion = direccion;
        this.distancia = 0;
    }

    public ArrayList<NodoN<T>> getFatherNodes() {
        return FatherNodes;
    }

    public void setFatherNodes(ArrayList<NodoN<T>> FatherNodes) {
        this.FatherNodes = FatherNodes;
    }
    
    

    public boolean isEsHoja() {
        return esHoja;
    }

    public void setEsHoja(boolean esHoja) {
        this.esHoja = esHoja;
    }
    
    public boolean esHoja(){
        return this.getHijos().isEmpty();
    }

    public ArrayList<NodoN<T>> getLeafs() {
        return leafs;
    }

    public void setLeafs(ArrayList<NodoN<T>> leafs) {
        this.leafs = leafs;
    }
    
    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<NodoN<T>> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<NodoN<T>> hijos) {
        this.hijos = hijos;
    }

    public NodoN<T> getPadre(){
        return padre;
    }

    public void setPadre(NodoN<T> padre) {
        this.padre = padre;
    }
    
   public void addHijo(NodoN hijo){
       hijo.setPadre(this);
       this.hijos.add(hijo);
   }
   
   public void removeHijos(){
       this.hijos.clear();
   }
   
  public void setAllHijos(ArrayList<NodoN<T>> hijos){
      for(NodoN e: hijos){
          e.setPadre(this);
      }
      this.setHijos(hijos);
  }
    
   // Function to print the root to leaf
    // path of the given N-ary Tree
    public void printPath(ArrayList<Integer> vec, NodoN destino){
        // Print elements in the vector
        int dist = 0;
        
        for (int ele : vec)
        {
            dist += ele;
            System.out.print(dist + " ");
        }
        destino.setDistancia(dist);
        System.out.println();
    }
    
    public void obtenerHojas(NodoN hoja){
        this.leafs.add(hoja);
    }
    
    public void obtenerNodosPadres(NodoN nodo){
        this.FatherNodes.add(nodo);
    }
 
    // Utility function to print all
    // root to leaf paths of an Nary Tree
    public void printAllRootToLeafPaths(NodoN root, ArrayList<Integer> vec){
        // If root is null
        if (root == null)
            return;
 
        // Insert current node's
        // data into the vector
        vec.add(root.getPeso());
 
        // If current node is a leaf node
        if (root.getHijos().isEmpty()){ 
            // Print the path
            printPath(vec, root);
            obtenerHojas(root);
 
            // Pop the leaf node
            // and return
            vec.remove(vec.size() - 1);
            return;
        }
        
        if(!root.getHijos().isEmpty())this.obtenerNodosPadres(root);
 
        // Recur for all children of
        // the current node
        for (int i = 0; i < root.getHijos().size(); i++)
 
            // Recursive Function Call
            printAllRootToLeafPaths((NodoN) root.getHijos().get(i), vec);
        vec.remove(vec.size() - 1);
    }
 
    // Function to print root to leaf path
    public void printAllRootToLeafPaths(NodoN root){
        // If root is null, return
        if (root == null)
            return;
 
        // Stores the root to leaf path
        ArrayList<Integer> vec = new ArrayList<>();
 
        // Utility function call
        printAllRootToLeafPaths(root, vec);
    }
    
    public int compareTo(NodoN a){
 
            int estado=-1;
            if(this.getDistancia()==a.getDistancia()){
                //Los objetos son iguales
                estado=0;
            }else if(this.getDistancia()>a.getDistancia()){
                //El objeto 1 es mayor que la pasada por parametro
                estado=1;
            }
            return estado;
 
    }
    
 
    

  
  
  
  
  
  
  
  
  
  
  
}
