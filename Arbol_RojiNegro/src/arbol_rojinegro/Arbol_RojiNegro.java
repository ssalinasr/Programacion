/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_rojinegro;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Arbol_RojiNegro<E extends Comparable>{

   private Nodo raiz;
    
    public Arbol_RojiNegro(){
        this.raiz = null; 
}
    
    public void insercion(E valor){
      if(raiz == null){
        raiz = new Nodo(valor);
        raiz.padre = null;
      }else{
        raiz.insercion(raiz, new Nodo(valor));         
      }
    }
    
    public void eliminacion(E valor){
        if(this.busqueda(raiz, valor) != null){
            raiz.eliminar(this.busqueda(raiz, valor));
        }
        else{
            System.out.println("Ese nodo no existe en el árbol...");
        }
    }
    
    public void PreOrden(){
        raiz.PreOrden();
    }
    
    public void PosOrden(){
        raiz.PosOrden();
    }
        
    public void InOrden(){
        raiz.InOrden();
    }
    
    public int Altura_negra(){
        return raiz.Altura_negra();
    }
    
    public Nodo busqueda(Nodo raiz, E valor){
        return raiz.busqueda(raiz, valor);
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Nodo h = new Nodo();
        h.Hoja();
        
        //Creación de un árbol Rojinegro
        Arbol_RojiNegro<Integer> ab = new Arbol_RojiNegro<Integer>();
            ab.insercion(25);
            ab.insercion(45);
            ab.insercion(15);
            ab.insercion(38);
            ab.insercion(-15);
            ab.insercion(-33);
            ab.insercion(8);
            ab.insercion(46);
            ab.insercion(-17);
            ab.insercion(104);
            ab.PreOrden();
            System.out.println("Altura negra: "+ ab.Altura_negra());
            System.out.println("");
            System.out.println("");
            //Eliminación de los nodos 46 y 8
            ab.eliminacion(46);
            ab.eliminacion(8);
            ab.PreOrden();
            System.out.println("Altura negra: "+ ab.Altura_negra());
            
        System.out.println("");
        System.out.println("");
        
        //Creación de otro árbol rojinegro
        Arbol_RojiNegro<Integer> ab2 = new Arbol_RojiNegro<Integer>();
            ab2.insercion(37);
            ab2.insercion(26);
            ab2.insercion(44);
            ab2.insercion(65);
            ab2.insercion(1);
            ab2.insercion(0);
            ab2.insercion(28);
            ab2.insercion(-35);
            ab2.insercion(102);
            ab2.insercion(-115);
            ab2.PreOrden();
            System.out.println("Altura negra: "+ ab2.Altura_negra());
            System.out.println("");
            System.out.println("");
            //Se eliminan los nodos 102 y 26
            ab2.eliminacion(102);
            ab2.eliminacion(26);
            ab2.PreOrden();
            System.out.println("Altura negra: " + ab2.Altura_negra());
            
            Arbol_RojiNegro<Integer> ab3 = new Arbol_RojiNegro<Integer>();
            ab3.insercion(26);
            ab3.insercion(17);
            ab3.insercion(41);
            ab3.insercion(14);
            ab3.insercion(30);
            ab3.insercion(10);
            ab3.insercion(47);
            ab3.eliminacion(41);
            ab3.PreOrden();
   
    }
    
}
