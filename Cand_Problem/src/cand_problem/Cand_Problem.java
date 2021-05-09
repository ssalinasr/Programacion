/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cand_problem;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Cand_Problem {

    /**
     * @param m
     * @param n
     * @param args the command line arguments
     */
  
            
    static Scanner l = new Scanner(System.in);
    
    public void calcular(){
        boolean status = true;

        while(status){
            int m = l.nextInt();
            int n = l.nextInt();
            int[][] matriz = new int[m][n];
            if(m <=0 && n<=0) break;

        for(int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                matriz[i][j] = l.nextInt();
            }
        }
            
        int maximos[][] = new int[m][n+2];
        
        for(int k = 0;k<m;k++){
            for(int q = 2;q<n+2;q++){
                maximos[k][q]= matriz[k][q-2];  
                
            }
        }
       
        for(int x = 0;x<m; x++){
            for (int y = 2;y<n+2;y++){
                  maximos[x][y] = max(maximos[x][y-1],maximos[x][y]+maximos[x][y-2]); 
                               
            }

        }       
        int[] soluciones = new int[m+2];
        
        for(int p = 0;p<m;p++){
            soluciones[p] = maximos[p][n+1];
            
        }
            
        for(int p = 2;p<m+2;p++){
            soluciones[p] = max(soluciones[p-1],soluciones[p]+soluciones[p-2]);
        }

       System.out.println(soluciones[m+1]);

        }
    }
    public static void main(String[] args) {
                    
        Cand_Problem object = new Cand_Problem();
        object.calcular();
        


    }
}
