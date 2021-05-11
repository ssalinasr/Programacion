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
class TrieNode 
{
    public char content; 
   public boolean isEnd; 
    public int count;  
   public LinkedList<TrieNode> childList; 
   public String meaning;
 
    /* Constructor */
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
        meaning = "";
    }  
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }

}
