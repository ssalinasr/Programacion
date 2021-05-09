/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        boolean stat = true;       
       while(stat){ 
        int tam;
        Scanner lt = new Scanner(System.in);
        tam=lt.nextInt();
        
        if(tam <=0){
            stat = false;
            break;
        }
       int[] array = new int[tam];
       for(int i = 0; i<array.length;i++){
           array[i] = lt.nextInt();
       }       
       int n=0; 
       for(int x = 0; x <array.length;x++){
           for (int y = 0; y < array.length -1;y++){
               if(array[y] > array[y+1]){
                   int aux = array[y];
                   array[y] = array[y+1];
                   array[y+1] = aux;
                   n++;
               }
           }
       }
           
       if(n%2==0){
           System.out.println("Carlos");
       }
       else{
           System.out.println("Marcelo");
       }
       
       }

       
    }
    
}
