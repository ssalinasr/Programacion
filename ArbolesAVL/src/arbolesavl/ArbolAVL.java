/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesavl;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class ArbolAVL {
    private NodoAVL raiz;
    public ArbolAVL(){
        raiz = null;
    }
    
    public NodoAVL obtenerRaiz(){
        return raiz;
    }
    
    public NodoAVL buscar(int d, NodoAVL r){
        if(raiz == null){
            return null;
        }else{
            if(r.dato == d){
                return r;
            }else{
                if(r.dato<d){
                    return buscar(d,r.hijoDerecho);
                }
                else{
                    return buscar(d,r.hijoIzquierdo);    
                }
            }
        }
    }
    
    public int obtenerFE(NodoAVL x){
        if(x==null){
            return -1;
        }
        else{
            return x.fe;
        }
    }
    
    public NodoAVL rotacionIzquierda(NodoAVL r){
        NodoAVL aux = r.hijoIzquierdo;
        r.hijoIzquierdo = aux.hijoDerecho;
        aux.hijoDerecho = r;
        r.fe = Math.max(obtenerFE(r.hijoIzquierdo),obtenerFE(r.hijoDerecho))+1;
        aux.fe = Math.max(obtenerFE(aux.hijoIzquierdo),obtenerFE(aux.hijoDerecho))+1;
        return aux;
    }
    
    public NodoAVL rotacionDerecha(NodoAVL r){
        NodoAVL aux = r.hijoDerecho;
        r.hijoDerecho = aux.hijoIzquierdo;
        aux.hijoIzquierdo = r;
        r.fe = Math.max(obtenerFE(r.hijoIzquierdo),obtenerFE(r.hijoDerecho))+1;
        aux.fe = Math.max(obtenerFE(aux.hijoIzquierdo),obtenerFE(aux.hijoDerecho))+1;
        return aux;
    }
    
    public NodoAVL rotacionDobleIzquierda(NodoAVL r){
        NodoAVL aux;
        r.hijoIzquierdo = rotacionDerecha(r.hijoIzquierdo);
        aux = rotacionIzquierda(r);
        return aux;
    }
    
    public NodoAVL rotacionDobleDerecha(NodoAVL r){
        NodoAVL aux;
        r.hijoDerecho = rotacionIzquierda(r.hijoDerecho);
        aux = rotacionDerecha(r);
        return aux;
    }
    
    public NodoAVL insertarNodo(NodoAVL nuevo, NodoAVL subAr){
        NodoAVL nuevoPadre = subAr;
        if(nuevo.dato < subAr.dato){
            if(subAr.hijoIzquierdo == null){
                subAr.hijoIzquierdo = nuevo;
            }else{
                subAr.hijoIzquierdo = insertarNodo(nuevo, subAr.hijoIzquierdo);
                if((obtenerFE(subAr.hijoIzquierdo) - obtenerFE(subAr.hijoDerecho)) == 2){
                    if(nuevo.dato < subAr.hijoIzquierdo.dato){
                        nuevoPadre = rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        }else{
            if(nuevo.dato > subAr.dato){
                if(subAr.hijoDerecho == null){
                    subAr.hijoDerecho = nuevo;
                }
                else{
                    subAr.hijoDerecho = insertarNodo(nuevo, subAr.hijoDerecho);
                    if((obtenerFE(subAr.hijoDerecho) - obtenerFE(subAr.hijoIzquierdo) == 2)){
                        if(nuevo.dato > subAr.hijoDerecho.dato){
                            nuevoPadre = rotacionDerecha(subAr);
                        }else{
                            nuevoPadre = rotacionDobleDerecha(subAr);
                        }
                    }
                }
            }else{
                System.out.println("Nodo Duplicado");
            }
            //actualizar altura
            if((subAr.hijoIzquierdo == null) && (subAr.hijoDerecho == null)){
                subAr.fe = subAr.hijoDerecho.fe +1;
            }else{
                if((subAr.hijoDerecho == null) && (subAr.hijoIzquierdo != null)){
                    subAr.fe = subAr.hijoIzquierdo.fe + 1;
                }
                else{
                    subAr.fe = Math.max(obtenerFE(subAr.hijoIzquierdo), obtenerFE(subAr.hijoDerecho))+1;
                }
                
            }
        }
        return nuevoPadre;
    }
    
    public void insertar(int d){
        NodoAVL nuevo = new NodoAVL(d);
        if(raiz == null){
            raiz = nuevo;
        }
        else{
            raiz = insertarNodo(nuevo, raiz);
        }
    }
    
    public boolean eliminar(int d){
        NodoAVL aux = raiz;
        NodoAVL padre  = raiz;
        boolean esHijoIzq = true;
        while(aux.dato != d){
            padre = aux;
            if(d<aux.dato){
                esHijoIzq = true;
                aux = aux.hijoIzquierdo;
            }
            else{
                esHijoIzq = false;
                aux = aux.hijoDerecho;
            }
            if(aux == null){
                return false;
            }
        }
        if(aux.hijoIzquierdo==null && aux.hijoDerecho== null){
            if(aux == raiz){
                raiz = null;
            }
            else{
                if(esHijoIzq){
                    padre.hijoIzquierdo = null;
                }else{
                    padre.hijoDerecho = null;
                }
            }
        }else{
            if(aux.hijoDerecho == null){
                if(aux == raiz){
                    raiz = aux.hijoIzquierdo;
                }
                else{
                if(esHijoIzq){
                    padre.hijoIzquierdo = aux.hijoIzquierdo;
                }else{
                    padre.hijoDerecho = aux.hijoIzquierdo;
                  }
               }
            }else{
                if(aux.hijoIzquierdo == null){
                 if(aux == raiz){
                    raiz = aux.hijoDerecho;
                    }
                    else{
                      if(esHijoIzq){
                         padre.hijoIzquierdo = aux.hijoDerecho;
                      }else{
                    padre.hijoDerecho = aux.hijoDerecho;
                       }
                   }
                }
                else{
                    NodoAVL reemplazo = obtenerNodoReemplazo(aux);
                    if(aux == raiz){
                        raiz = reemplazo;
                    }else{
                        if(esHijoIzq){
                            padre.hijoIzquierdo = reemplazo;
                        }
                        else{
                            padre.hijoDerecho = reemplazo;
                        }
                        reemplazo.hijoIzquierdo = aux.hijoIzquierdo;
                    }
                }
            }
        }
        return true;
    }
    
    public NodoAVL obtenerNodoReemplazo(NodoAVL nodoRemp){
        NodoAVL rempPadre = nodoRemp;
        NodoAVL remp = nodoRemp;
        NodoAVL aux = nodoRemp.hijoDerecho;
        while(aux != null){
            rempPadre = remp;
            remp = aux;
            aux = aux.hijoIzquierdo;
        }
        if(remp != nodoRemp.hijoDerecho){
            rempPadre.hijoIzquierdo = remp.hijoDerecho;
            remp.hijoDerecho = nodoRemp.hijoDerecho;
        }
        System.out.println("El nodo reemplazo es "+ remp);
        return remp;
    }
    
    public void inOrden(NodoAVL r){
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato +" ");
            inOrden(r.hijoDerecho);
        }
    }
    
    public void preOrden(NodoAVL r){
        if(r!=null){
            System.out.println(r.dato +" ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
        
    public void posOrden(NodoAVL r){
        if(r!=null){
            posOrden(r.hijoIzquierdo);
            posOrden(r.hijoDerecho);
            System.out.println(r.dato +" ");        
        }
    }
    
    
    
}
