/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Stack<Integer> i = new Stack<Integer>();
         i.push(3);
         i.push(15);
         i.push(50);
         i.push(-2);
         i.push(10);
         i.push(3);
         i.push(7);
         i.pop();
        System.out.println(i);
         i.pop();
                  System.out.println(i);
         i.peek();
                  System.out.println(i);
         i.pop();
         i.push(12);
                  System.out.println(i);
         i.push(11);
                  System.out.println(i);
         i.push(7);
                  System.out.println(i);
         i.pop();
                  System.out.println(i);
         System.out.println(i.peek());
         
        
        Queue<Integer> e = new LinkedList();     
        e.add(7);
        e.add(3);
        e.add(10);
        e.add(2);
        e.add(-2);
        e.add(50);
        e.add(15);
        e.add(3);
        System.out.println(e);
        e.poll();
        System.out.println(e);
        e.peek();
        System.out.println(e);
        e.offer(2);
        System.out.println(e);
        e.poll();
        System.out.println(e);
        e.poll();
        System.out.println(e);
        System.out.println(e.peek());


    }
    
}
