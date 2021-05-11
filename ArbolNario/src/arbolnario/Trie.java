/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolnario;

import java.util.LinkedList;

/**
 *
 * @author sebas
 */
class Trie
{
    private TrieNode root;
 
     /* Constructor */
    public Trie()
    {
        root = new TrieNode('?'); 
    }
     /* Function to insert word */
    public void insert(String word, String mean)
    {
        word = word + "}";
        if (search(word) == true) 
            return;        
        TrieNode current = root; 
        for (char ch : word.toCharArray() )
        {
            TrieNode child = current.subNode(ch);
            if (child != null)
                current = child;
            else 
            {
                 current.childList.add(new TrieNode(ch));
                 current = current.subNode(ch);
            }
            current.count++;
        }

        current.isEnd = true;
        current.meaning = mean;
        
     
    }
    /* Function to search for word */
    public boolean search(String word)
    {
        word = word + "}";
        TrieNode current = root;  
        for (char ch : word.toCharArray() )
        {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
        }      
        if (current.isEnd == true) 
            return true;
        return false;
    }
    /* Function to remove a word */
    public void remove(String word)
    {
        if (search(word) == false)
        {
            System.out.println(word +" does not exist in trie\n");
            return;
        }             
        TrieNode current = root;
        for (char ch : word.toCharArray()) 
        { 
            TrieNode child = current.subNode(ch);
            if (child.count == 1) 
            {
                current.childList.remove(child);
                return;
            } 
            else 
            {
                child.count--;
                current = child;
            }
        }
        current.isEnd = false;
    }
    
    public LinkedList<TrieNode> getPreOrden() {
        LinkedList<TrieNode> preOrder = new LinkedList<>();
        buildPreOrden(this.root,preOrder);
        return preOrder;
    }

    public LinkedList<TrieNode> getPostOrden() {
        LinkedList<TrieNode> postOrder = new LinkedList<>();
        buildPostOrden(this.root, postOrder);
        return postOrder;
    }
    
     public LinkedList<String> getInOrden() {
        LinkedList<String> inOrder = new LinkedList<>();
        buildInOrden(this.root, inOrder);
        return inOrder;
    }
     
         
    public LinkedList<String> buildInOrden(TrieNode node, LinkedList<String> inOrder){
        LinkedList<TrieNode> childs = new LinkedList<>();
        if (node == null)
            return inOrder;
 
        // Total children count
        // All the children except the last
        for(TrieNode k : node.childList){
            childs.add(k);
            //buildInOrden(k,inOrder); 
        }
        
             //obtener lado izquierdo
         for(int i = 0; i <  childs.size()/2; i++){
                   buildInOrden(childs.get(i),inOrder); 
             } 
       
        // Print the current node's data
        inOrder.add(Character.toString(node.content));
        
            //obtener lado derecho
             for(int i = childs.size()/2; i <  childs.size(); i++){
                   buildInOrden(childs.get(i),inOrder); 
             } 
             
        return inOrder;
    }

    private void buildPreOrden(TrieNode node, LinkedList<TrieNode> preOrder) {
        preOrder.add(node);
        for (TrieNode child : node.childList) {
            buildPreOrden(child, preOrder);
        }
    }

    private void buildPostOrden(TrieNode node, LinkedList<TrieNode> postOrder) {
        for (TrieNode child : node.childList) {
            buildPostOrden(child, postOrder);
        }
        postOrder.add(node);
    }
}    