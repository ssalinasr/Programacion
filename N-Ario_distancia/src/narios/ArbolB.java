/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

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
    
        public void print(NodoB root, JTextPane Txt)
    {
        BTreePrinter b = new BTreePrinter();
        b.printNode(root);
        Txt.setText("");
        StyledDocument doc = Txt.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center , StyleConstants.ALIGN_CENTER);
        
        try{
            doc.setParagraphAttributes(doc.getLength(), 1, center, false);
            doc.insertString(doc.getLength(), b.getTree(), center );
        }catch(BadLocationException e){
            JOptionPane.showMessageDialog(null,"Error al intentar mostrar el árbol","Error",0);
            System.out.println(e);
        }
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
