/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVL;

/**
 *
 * @author sebas
 */
public class ArbolAVL {
    
    public NodoAVL raiz;
    
    public ArbolAVL(){
        this.raiz = null;
    }
    
    public int height(NodoAVL n){
        if(n == null) return 0;
        return n.altura;
    }
    
    public int max(int a, int b){
        return (a>b) ? a:b;
    }
// A utility function to right rotate subtree rooted with y
    // See the diagram given above.
    NodoAVL rightRotate(NodoAVL y) {
        NodoAVL x = y.izquierdo;
        NodoAVL T2 = x.derecho;
 
        // Perform rotation
        x.derecho = y;
        y.izquierdo = T2;
 
        // Update heights
        y.altura = max(height(y.izquierdo), height(y.derecho)) + 1;
        x.altura = max(height(x.izquierdo), height(x.derecho)) + 1;
 
        // Return new root
        return x;
    }
 
    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    NodoAVL leftRotate(NodoAVL x) {
        NodoAVL y = x.derecho;
        NodoAVL T2 = y.izquierdo;
 
        // Perform rotation
        y.izquierdo = x;
        x.derecho = T2;
 
        //  Update heights
        x.altura = max(height(x.izquierdo), height(x.derecho)) + 1;
        y.altura = max(height(y.izquierdo), height(y.derecho)) + 1;
 
        // Return new root
        return y;
    }
 
    // Get Balance factor of node N
    int getBalance(NodoAVL N) {
        if (N == null)
            return 0;
       
        return height(N.izquierdo) - height(N.derecho);
    }
 
    NodoAVL insert(NodoAVL node, String key) {
 
        /* 1.  Perform the normal BST insertion */
        if (node == null){
            //System.out.println("Nodo "+key+" insertado");
            return (new NodoAVL(key));
        }
        

 
        if (key.compareTo(node.valor)<0)
            node.izquierdo = insert(node.izquierdo, key);
        else if (key.compareTo(node.valor)>0)
            node.derecho = insert(node.derecho, key);
        else // Duplicate keys not allowed
            return node;
 
        /* 2. Update height of this ancestor node */
        node.altura = 1 + max(height(node.izquierdo),
                              height(node.derecho));
 
        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);
 
        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key.compareTo(node.izquierdo.valor)<0)
            return rightRotate(node);
 
        // Right Right Case
        if (balance < -1 && key.compareTo(node.derecho.valor)>0)
            return leftRotate(node);
 
        // Left Right Case
        if (balance > 1 && key.compareTo(node.izquierdo.valor)>0) {
            node.izquierdo = leftRotate(node.izquierdo);
            return rightRotate(node);
            
            
        }
 
        // Right Left Case
        if (balance < -1 && key.compareTo(node.derecho.valor)<0) {
            node.derecho = rightRotate(node.derecho);
            return leftRotate(node);
        }
 
        /* return the (unchanged) node pointer */
        return node;
    }
    
    public void actBalance(NodoAVL raiz){
        if(raiz != null) {
         raiz.balance = getBalance(raiz);
        System.out.print(raiz.balance+" ");
        actBalance(raiz.izquierdo);
        actBalance(raiz.derecho);
        }
    }
    
    public void preOrden(NodoAVL raiz){
        if(raiz != null) {
         System.out.print(raiz.valor+" ");
        preOrden(raiz.izquierdo);
        preOrden(raiz.derecho);
        }
    }
    
    public void inOrden(NodoAVL raiz){
        if(raiz != null) {
        inOrden(raiz.izquierdo);
        System.out.print(raiz.valor+" ");
        inOrden(raiz.derecho);
        }
    }
        
     public void posOrden(NodoAVL raiz){
        if(raiz != null) {
        posOrden(raiz.izquierdo);
        posOrden(raiz.derecho);
        System.out.print(raiz.valor+" ");
        }
    }
   
         NodoAVL minValueNode(NodoAVL node) 
    { 
        NodoAVL current = node; 
  
        /* loop down to find the leftmost leaf */
        while (current.izquierdo != null){ 
        current = current.izquierdo; 
        }
  
        return current; 
    }         
         
NodoAVL find(String key) {
    NodoAVL current = raiz;
    while (current != null) {
        if (current.valor.equals(key)) {
            break;
        }
        current = current.valor.compareTo(key) < 0 ? current.derecho : current.izquierdo;
    }
    return current;
}
         
    NodoAVL deleteNode(NodoAVL root, String key) 
    { 
        // STEP 1: PERFORM STANDARD BST DELETE 
        if (root == null) 
            return root; 
  
        // If the key to be deleted is smaller than 
        // the root's key, then it lies in left subtree
        //key.compareTo(root.key) == -1
        if (key.compareTo(root.valor)<0) 
            root.izquierdo = deleteNode(root.izquierdo, key); 
  
        // If the key to be deleted is greater than the 
        // root's key, then it lies in right subtree 
        else if (key.compareTo(root.valor)>0) 
            root.derecho = deleteNode(root.derecho, key); 
  
        // if key is same as root's key, then this is the node 
        // to be deleted 
        else
        { 
  
            // node with only one child or no child 
            if ((root.izquierdo == null) || (root.derecho == null)) 
            { 
                NodoAVL temp = null; 
                if (temp == root.izquierdo) 
                    temp = root.derecho; 
                else
                    temp = root.izquierdo; 
  
                // No child case 
                if (temp == null) 
                { 
                    temp = root; 
                    root = null; 
                } 
                else // One child case 
                    root = temp; // Copy the contents of 
                                // the non-empty child 
            } 
            else
            { 
  
                // node with two children: Get the inorder 
                // successor (smallest in the right subtree) 
                NodoAVL temp = minValueNode(root.derecho); 
  
                // Copy the inorder successor's data to this node 
                root.valor = temp.valor; 
  
                // Delete the inorder successor 
                root.derecho = deleteNode(root.derecho, temp.valor); 
            } 
        } 
  
        // If the tree had only one node then return 
        if (root == null) 
            return root; 
  
        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE 
        root.altura = max(height(root.izquierdo), height(root.derecho)) + 1; 
  
        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether 
        // this node became unbalanced) 
        int balance = getBalance(root); 
  
        // If this node becomes unbalanced, then there are 4 cases 
        // Left Left Case 
        if (balance > 1 && getBalance(root.izquierdo) >= 0) 
            return rightRotate(root); 
  
        // Left Right Case 
        if (balance > 1 && getBalance(root.izquierdo) < 0) 
        { 
            root.izquierdo = leftRotate(root.izquierdo); 
            return rightRotate(root); 
        } 
  
        // Right Right Case 
        if (balance < -1 && getBalance(root.derecho) <= 0) 
            return leftRotate(root); 
  
        // Right Left Case 
        if (balance < -1 && getBalance(root.derecho) > 0) 
        { 
            root.derecho = rightRotate(root.derecho); 
            return leftRotate(root); 
        } 
  
        return root; 
    } 
     
    /*
    
    public static void main(String[] args) {
        
        ArbolAVL arb = new ArbolAVL();
        arb.raiz = arb.insert(arb.raiz, "Adolfo");
        arb.raiz = arb.insert(arb.raiz, "Nicolas");
        arb.raiz = arb.insert(arb.raiz, "Sergio");
        arb.raiz = arb.insert(arb.raiz, "Abel");
        arb.raiz = arb.insert(arb.raiz, "Laura");
        
        preOrden(arb.raiz);
        System.out.println("");
        inOrden(arb.raiz);
        System.out.println("");
        posOrden(arb.raiz);
        System.out.println("");
        arb.raiz = arb.deleteNode(arb.raiz, "Kuwait");
        preOrden(arb.raiz);
        System.out.println("");
        inOrden(arb.raiz);
        System.out.println("");
        posOrden(arb.raiz);
        
        arb.actBalance(arb.raiz);
        
        System.out.println(arb.find("Laura").valor);
        try{
            System.out.println(arb.find("Kuwait").valor);
        }catch(Exception e){
            System.out.println("No existe :v");
        }
        
       
    }
    */
}
