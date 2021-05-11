/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sebas
 */
public class BTreePrinter {
    
    static String tree = "";

    public String getTree() {
        return tree;
    }

    public static void setTree(String tree) {
        BTreePrinter.tree = tree;
    }
    
    
   
    public  <T extends Comparable<?>> void printNode(NodoB<T> root) {
        int maxLevel = BTreePrinter.maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
        //System.out.println(tree);
    }

    private static <T extends Comparable<?>> String printNodeInternal(List<NodoB<T>> nodes, int level, int maxLevel) {
        
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
            return "";

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<NodoB<T>> newNodes = new ArrayList<>();
        for (NodoB<T> node : nodes) {
            if (node != null) {
                //System.out.print(node.getDato());
                tree+=node.getDato();
                newNodes.add(node.getIzquierdo());
                newNodes.add(node.getDerecho());
            } else {
                newNodes.add(null);
                newNodes.add(null);
                //System.out.print(" ");
                tree+=" ";
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        //System.out.println("");
        tree+="\n";

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).izquierdo != null){
                    //System.out.print("/");
                    tree+="/";
                }
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).derecho != null){
                    //System.out.print("\\");
                    tree+="\\";
                }
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            //System.out.println("");
            tree+="\n";
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
        //System.out.println(tree);
        return tree;
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++){
            //System.out.print(" ");
            tree+= " ";
        }
    }

    private static <T extends Comparable<?>> int maxLevel(NodoB<T> node) {
        if (node == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(node.getIzquierdo()), BTreePrinter.maxLevel(node.getDerecho())) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

    
}
