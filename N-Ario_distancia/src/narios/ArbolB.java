/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flia_Salinas
 */
public class ArbolB<T> {
    
    private NodoB<T> raiz;
    
    public ArbolB(){
        
    }
    
    public ArbolB(NodoB raiz){
        this.raiz = raiz;
    }
    
    public ArbolB(NodoN<T> raiz){
        this.raiz = new NodoB(raiz.getDato().toString());
    }

    public NodoB<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoB<T> raiz) {
        this.raiz = raiz;
    }
    
    public void inOrden(int space){
        this.raiz.inOrden(space);
    }
    
    public void insertarNodo(NodoN node){
        if(node.getDireccion()== 0){
            NodoB root =new NodoB(node.getDato().toString());
            this.setRaiz(root);
        }
        else{
            this.raiz.insertarNodo(node);
        }
    }
    
    public void insertarBusquedaNodo(NodoN bus, NodoB root, T key){
        if(root.getDato().equals(key)){
            ArrayList<NodoN> childs = bus.getHijos();
            for(NodoN a : childs){
                root.insertarNodo(a);
            }
        }
        else{
            if(root.getIzquierdo() !=null){
                this.insertarBusquedaNodo(bus, root.getIzquierdo(), key);
            }

           if(root.getDerecho() != null){
                 this.insertarBusquedaNodo(bus, root.getDerecho(), key);
            }
                

        }
    }
    
        public String print(NodoB root)
    {
        String tree = "";
        List<List<String>> lines = new ArrayList<>();

        List<NodoB> level = new ArrayList<>();
        List<NodoB> next = new ArrayList<>();

        level.add(root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();

            nn = 0;

            for (NodoB n : level) {
                if (n == null) {
                    line.add(null);

                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.getDato().toString();
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.getIzquierdo());
                    next.add(n.getDerecho());

                    if (n.getIzquierdo() != null) nn++;
                    if (n.getDerecho() != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<NodoB> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest); //Espacio
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '└';
                        }
                    }
                    tree += c;

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            tree += " ";
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            String t = j % 2 == 0 ? " " : "─"; 
                            tree += t;
                            
                        }
                        String ka = j % 2 == 0 ? "┌" : "┐";
                        tree+= ka;
                        for (int k = 0; k < hpw; k++) {
                            String p = j % 2 == 0 ? "─" : " ";
                            tree+=p;
                        }
                    }
                }
                tree+="\n";
            }

            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(1.4*perpiece - (f.length()*1.5));
                int gap2 = (int) Math.floor(1.7*perpiece- (f.length()*1.5));

                // a number
                for (int k = 0; k < gap1; k++) {
                    tree+=" ";
                }
                tree+=f;
                for (int k = 0; k < gap2; k++) {
                    tree+=" ";
                }
            }
            tree+="\n";

            perpiece /= 2.25;
        }
            return tree;
    }
        

    
    
    /*
    public static void main(String[] args) {
       NodoN root = new NodoN(null,"a",0,new ArrayList<>(), 0);
       ArbolB con = new ArbolB(root);
       con.insertarNodo(new NodoN(null,"b",0,new ArrayList<>(), 1));
       con.insertarNodo(new NodoN(null,"c",0,new ArrayList<>(), 2));
       con.insertarNodo(new NodoN(null,"d",0,new ArrayList<>(), 2));
       con.insertarNodo(new NodoN(null,"e",0,new ArrayList<>(), 2));
       con.insertarNodo(new NodoN(null,"f",0,new ArrayList<>(), 2));
       con.insertarNodo(new NodoN(null,"g",0,new ArrayList<>(), 2));
       
       ArrayList<NodoN> pr = new ArrayList<>();
       pr.add(new NodoN(null,"z",0,new ArrayList<>(), 1));
       pr.add(new NodoN(null,"p",0,new ArrayList<>(), 2));
       con.insertarBusquedaNodo(new NodoN(null,"g",0,pr, 2), con.getRaiz(), "g");
       con.inOrden(-1);
       
    }
    
    */
    
}
