/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int vertices = lec.nextInt();
          
        ArrayList<Integer>longitudes = new ArrayList<>();
        ArrayList<Integer>sumas = new ArrayList<>();
        for(int i = 0;i < vertices;i++){
            int v = lec.nextInt();
            longitudes.add(v);
        }
        
        for(int i = 0;i < vertices-1;i++){
            sumas.add(longitudes.get(i)+longitudes.get(i+1));
            System.out.print(sumas.get(i)+" ");
        }
    }
    
    
}
