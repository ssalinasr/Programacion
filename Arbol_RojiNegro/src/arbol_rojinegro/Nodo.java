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


public class Nodo <E extends Comparable>{
    
    protected Nodo padre;    //Padre del nodo seleccionado
    private E valor;         //Valor del nodo seleccionado
    private Nodo hijo_izq;   //Hijo izquierdo del nodo seleccionado
    private Nodo hijo_der;   //Hijo derecho del nodo seleccionado
    private boolean color;   //Color del nodo seleccionado (negro = false, rojo = true)
    
    private static Nodo hoja;

    /**
     * Inicialización de las hojas
     */
    public Nodo(){}
    
    /**
     * Constructor del nodo
     * @param valor 
     */
    public Nodo(E valor){
        this.valor = valor;
        this.hijo_izq = hoja;
        this.hijo_der = hoja;
    }
    
    /**
     * Realiza la impresión del arbol en forma PreOrden (Raúz, Izquierda, Derecha)
     */
    public void PreOrden(){

        if(this.padre == null){
            System.out.println("Recorrido PreOrden: ");
            System.out.println("");
            System.out.println("Raiz:");
            System.out.println("Valor: "+ valor + " Color: " + color);
        }
        else{
            System.out.println("Nodo:");
            System.out.println("Valor: "+ valor + " Color: " + color);  
        }
        
        if(this.hijo_izq != null){
            System.out.println("Lado Izquierdo:");
            hijo_izq.PreOrden();
        }
        
        if(this.hijo_der != null){
            System.out.println("Lado Derecho:");
            hijo_der.PreOrden();
        }
    }
    
    /**
     * Realiza la impresión del arbol en forma InOrden (Izquierda, Raíz, Derecha)
     */
    public void InOrden(){

        if(this.hijo_izq != null){
            System.out.println("Lado Izquierdo:");
            hijo_izq.InOrden();
        }
        
        if(this.padre == null){
            System.out.println("Recorrido PreOrden: ");
            System.out.println("");
            System.out.println("Raiz:");
            System.out.println("Valor: "+ valor + " Color: " + color);
        }
        else{
            System.out.println("Nodo:");
            System.out.println("Valor: "+ valor + " Color: " + color);  
        }
        
        if(this.hijo_der != null){
            System.out.println("Lado Derecho:");
            hijo_der.InOrden();
        }
    }
      
    /**
     * Realiza la impresión del arbol en forma PosOrden (Izquierda, Derecha, Raíz)
     */
    public void PosOrden(){

        if(this.hijo_izq != null){
            System.out.println("Lado Izquierdo:");
            hijo_izq.PosOrden();
        }
        
        if(this.hijo_der != null){
            System.out.println("Lado Derecho:");
            hijo_der.PosOrden();
        }
        
        if(this.padre == null){
            System.out.println("Recorrido PreOrden: ");
            System.out.println("");
            System.out.println("Raiz:");
            System.out.println("Valor: "+ valor + " Color: " + color);
        }
        else{
            System.out.println("Nodo:");
            System.out.println("Valor: "+ valor + " Color: " + color);  
        }
    }
    
    /**
     * Calcula la altura negra del árbol
     * @return altura negra
     */
    public int Altura_negra(){
        int alt = 0;
        
        if(this.hijo_izq != null){
            alt = alt + hijo_izq.Altura_negra();
        }
        
        if(this.color == false){
            alt++;
        }
           
        return alt;
    }
        
    /**
     * Crea las hojas del arbol RojiNegro
     */
    public void Hoja(){
        hoja = new Nodo(null);
        hoja.color = false;
        hoja.hijo_der = null;
        hoja.hijo_izq = null;
        hoja.padre = hoja;
    }
    
    /**
     * Retorna el padre del nodo N
     * @param n
     * @return nodo padre
     */
    Nodo padre(Nodo n){
        return n.padre;
    }
    
    /**
     * Retorna el abuelo(padre del padre) del nodo N
     * @param n
     * @return nodo abuelo
     */
    Nodo abuelo(Nodo n){
        Nodo p = padre(n);
        if(p == null){
            return null;
        }
        else{
           return padre(p); 
        }
    }
    
    /**
     * Retorna el hermano(hijo del padre de N, opuesto a N) del nodo N
     * @param n
     * @return nodo hermano
     */
    Nodo hermano(Nodo n){
        Nodo p = padre(n);
        if(p == null){
            return null;
        }
        if(n == p.hijo_izq){
            return p.hijo_der;
        }
        else{
            return p.hijo_izq;   
        }
    }
    
    /**
     * Retorna el tío (Nodo asociado al abuelo de N, opuesto a P) del nodo N
     * @param n
     * @return nodo tio
     */
    Nodo tio(Nodo n){ 
        Nodo p = padre(n);
        Nodo g = abuelo(n);
        if(g == null){
            return null;
        }
        else{
            return hermano(p);
        }
        
    }
    
    /**
     * Búsqueda en forma recursiva de un nodo existente en el árbol
     * @param raiz
     * @param valor
     * @return Nodo buscado, null si no existe
     */
    public Nodo busqueda(Nodo raiz, E valor){
        if(raiz == null){
            return null;
        }
        else{
        
        if(raiz.valor.compareTo(valor) == 0){
            return raiz;
        }
        else{
           if(raiz.valor.compareTo(valor) >= 0 && raiz.hijo_izq != hoja){
            return busqueda(raiz.hijo_izq, valor);
        }
           else{
              if(raiz.valor.compareTo(valor) < 0 && raiz.hijo_der != hoja){
                return busqueda(raiz.hijo_der, valor);
             }
              else{
                  return null;
              }
           }
        }
        }
    }
    
    /**
     * Realiza una rotación a la izquierda sobre el nodo entrante y sus asociados
     * @param n 
     */
    public void rotarIzq(Nodo n){ 
        Nodo nuevo_n = n.hijo_der;
        Nodo p = padre(n);
        assert nuevo_n != hoja;
        n.hijo_der = nuevo_n.hijo_izq;
        nuevo_n.hijo_izq = n;
        n.padre = nuevo_n;
        
        if(n.hijo_der != null){
            n.hijo_der.padre = n;
        }
        
        if(n.hijo_izq != null){
            n.hijo_izq.padre = n;
        }
          
        if(p != null){
            if(n == p.hijo_izq){
                p.hijo_izq = nuevo_n;
            }
            else{
                if(n == p.hijo_der){
                    p.hijo_der = nuevo_n;
                }
            }
        }
        nuevo_n.padre = p;
    }
    
    /**
     * Realiza una rotación a la derecha sobre el nodo entrante y sus asociados
     * @param n 
     */
    public void rotarDer(Nodo n){ 
        Nodo nuevo_n = n.hijo_izq; 
        Nodo p = padre(n);
        assert(nuevo_n != hoja);
        n.hijo_izq = nuevo_n.hijo_der;
        nuevo_n.hijo_der = n;
        n.padre = nuevo_n;
        
        if(n.hijo_izq != null){
            n.hijo_izq.padre = n;
        }
        
        if(n.hijo_der != null){
            n.hijo_der.padre = n;
        }
        
        if(p != null){
            if(n == p.hijo_izq){
                p.hijo_izq = nuevo_n;
            }else{
                if(n == p.hijo_der){
                    p.hijo_der = nuevo_n;
                }
            }
        }
        
        nuevo_n.padre = p;
    }
    
    public Nodo insercion(Nodo raiz, Nodo n){
        insercion_rec(raiz, n);
        corregir_insercion(n);
        raiz = n;
        while(padre(raiz) != null){
            raiz = padre(raiz);
        }
        return raiz;
    }
    
    /**
     * Realiza la inserción de un nuevo Nodo N al árbol
     * @param raiz
     * @param n 
     */
    public void insercion_rec(Nodo raiz, Nodo n){
        if(raiz != null && n.valor.compareTo(raiz.valor) < 0){
            if(raiz.hijo_izq != hoja){
                insercion_rec(raiz.hijo_izq, n);
            }
            else{
                raiz.hijo_izq = n;
               n.padre = raiz;
               n.hijo_izq = hoja;
               n.hijo_der = hoja;
               n.color = true;
            }
        }else{
            if(raiz != null && n.valor.compareTo(raiz.valor) >= 0){
                if(raiz.hijo_der != hoja){
                    insercion_rec(raiz.hijo_der, n);
                }
                else{
                    raiz.hijo_der = n;
                    n.padre = raiz;
                    n.hijo_izq = hoja;
                    n.hijo_der = hoja;
                    n.color = true;
                } 
            }
            else{
                System.out.println("Insercion incorrecta...");
            }
            }
    }
    
    /**
     * Corrige la inserción del Nodo N instertado anteriormente, evaluando
     * alguno de los cuatro casos posibles
     * @param n 
     */
    public void corregir_insercion(Nodo n){
        if(padre(n) == null){
            ins_caso_1(n);
        }
        else{
            if(padre(n).color == false){
                ins_caso_2(n);
            }
            else{
                if(tio(n).color == true){
                    ins_caso_3(n);
                }
                else{
                    ins_caso_4(n);
                }
            }
        }
    }
    
    /**
     * Caso 1 de inserción: El nodo insertado es la raíz, por consiguiente, se 
     * establece el color de éste como negro, para conservar la altura negra 
     * del árbol
     * @param n 
     */
    public void ins_caso_1(Nodo n){
        if(padre(n) == null){
            n.color = false;
        }
        else{
            ins_caso_2(n);
        }
        
    }
    
    /**
     * Caso 2 de inserción: El nodo insertado satisface la propiedad de que su 
     * padre debe tener uno o dos hijos de color negro, respetando la altura
     * negra del árbol y la regla de dos rojos consecutivos
     * @param n 
     */
    public void ins_caso_2(Nodo n){
        if(!n.padre.color == false){
            ins_caso_3(n);
        }
        else{
            //este valor es válido
        }
    }
    
    /**
     * Caso 3 de Inserción: Cuando el padre P y tio T del nodo insertado, son
     * rojos, coloreando estos de negro, y a su abuelo A de rojo, para conservar
     * la propiedad de coloreado del árbol.
     * @param n 
     */
    public void ins_caso_3(Nodo n){
        padre(n).color = false;
        tio(n).color = false;
        abuelo(n).color = true;
        corregir_insercion(abuelo(n));
    }
    
    /**
     * Caso 4 de Inserción: Cuando el nodo padre P es rojo, pero el tio T es negro,
     * y P tiene un hijo derecho o izquierdo rojo, lo cual provoca una rotación 
     * hacia la izquierda o a la derecha (depende de la dirección de N),
     * sobre P y su hijo N asociado.
     * @param n 
     */
    public void ins_caso_4(Nodo n){
        Nodo p = padre(n);
        Nodo g = abuelo(n);
        if(n == g.hijo_izq.hijo_der){
            rotarIzq(p);
            n = n.hijo_izq;
        }
        else{
            if(n == g.hijo_der.hijo_izq){
                rotarDer(p);
                n = n.hijo_der;
            }
        }
         ins_caso_4_2(n);
    }
    
    /**
     * Segundo paso del Caso 4 de Inserción:
     * @param n 
     */
    public void ins_caso_4_2(Nodo n){
        Nodo p = padre(n);
        Nodo g = abuelo(n);
        if(n == p.hijo_izq){
            rotarDer(g);
        }
        else{
            rotarIzq(g);
        }
        
        p.color = false;
        g.color = true;
        
    }
    

    /**
     * Realiza la sustitución del nodo eliminado, por su hijo existente
     * @param n
     * @param hijo 
     */
    public void reemplazar_nodo(Nodo n, Nodo hijo){
        hijo.padre = n.padre;
        if(n == n.padre.hijo_izq){
            n.padre.hijo_izq = hijo;
        }
        else{
            n.padre.hijo_der = hijo;
        }
    }
    
     /**
     * Realiza la eliminación de un Nodo existente en el árbol
     * @param n
     */
    public void eliminar(Nodo n){
        Nodo hijo = (n.hijo_der == hoja) ? n.hijo_izq:n.hijo_der;
        reemplazar_nodo(n, hijo);
        if(n.color == false){
            if(hijo.color){
                hijo.color = false;
            }
            else{
                elim_caso_1(hijo);
            }
        }
    }
    
    /**
     * Caso 1 de eliminación: Cuando n es el único nodo en el árbol, o bien, es
     * un nodo cuyos hijos son hojas
     * @param n 
     */
    public void elim_caso_1(Nodo n){
        if(n.padre != null){
            elim_caso_2(n);
        }
    }
    
    /**
     * Caso 2 de eliminación: El hermano de N es rojo. En este caso los colores 
     * del padre P y el hermano S se invierten, realizando una rotación 
     * izquierda o derecha del hermano S.
     * @param n 
     */
    public void elim_caso_2(Nodo n){
        Nodo s = hermano(n);
        
        if(s.color){
            n.padre.color = true;
            s.color = false;
            if(n == n.padre.hijo_izq){
                rotarIzq(n.padre);
            }
            else{
                rotarDer(n.padre);
            }
        }
        elim_caso_3(n);
    }
    
    /**
     * Caso 3 de eliminación: El padre P y el hermano S junto a sus hijos, son
     * negros, se sustituye el color de S a rojo, retornando al caso 1 pero con
     * el padre P de N.
     * @param n 
     */
    public void elim_caso_3(Nodo n){
        Nodo s = hermano(n);
        if((n.padre.color == false) && (s.color == false) && (s.hijo_izq.color == false)
                && (s.hijo_der.color == false)){
            s.color = true;
            elim_caso_1(n.padre);
        }
        else{
            elim_caso_4(n);
        }
    }
    
    /**
     * Caso 4 de eliminación: Cuando el hermano S y sus hijos son negros. Se 
     * hace el cambio de color del hermano S y el padre P de N.
     * @param n 
     */
    public void elim_caso_4(Nodo n){
        Nodo s = hermano(n);
         if((n.padre.color) && (s.color == false) && (s.hijo_izq.color == false)
                && (s.hijo_der.color == false)){
            s.color = true;
            n.padre.color = false;
        }
        else{
            elim_caso_5(n);
        }
    }
    
    /**
     * Caso 5 de eliminación: El hermano S es negro, su hijo izquierdo es rojo, el derecho 
     * es negro, y N es el hijo izquierdo de su padre. En este caso se rota a la
     * derecha por S, así su hijo izquierdo se convierte en su padre y en el hermano 
     * de N. Entonces se intercambian los colores de S y su padre P. 
     * @param n 
     */
    public void elim_caso_5(Nodo n){
        Nodo s = hermano(n);
        
        if(s.color == false){
            if((n == n.padre.hijo_izq)&&(s.hijo_der.color == false)&&(s.hijo_izq.color)){
                s.color = true;
                s.hijo_izq.color = false;
                rotarDer(s);
            }
        }
        else{
            if((n == n.padre.hijo_der)&&(s.hijo_der.color)&&(s.hijo_izq.color == false)){
                s.color = true;
                s.hijo_der.color = false;
                rotarIzq(s);
            }
        elim_caso_6(n);
        }
    }
    
    /**
     * Caso 6 de eliminación:  El hermano S es negro, su hijo derecho es rojo, y N es el 
     * hijo izquierdo de  u padre. En este caso se rota a la izquierda por P, 
     * así que S se convierte en el padre de P y éste en el hijo derecho de S. 
     * Entonces se intercambian los colores de P y S, y el hijo derecho o izquierdo
     *  de S pasa a ser negro.
     * @param n 
     */
    public void elim_caso_6(Nodo n){
        Nodo s = hermano(n);
        s.color = n.padre.color;
        n.padre.color = false;
        
        if (n == n.padre.hijo_izq) {
            s.hijo_der.color = false;
            rotarIzq(n.padre);
        } else {
            s.hijo_der.color = false;
            rotarDer(n.padre);
        }
    }
      
    
}


