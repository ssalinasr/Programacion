/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.d;

import java.util.*;
    /*
class Solution{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N, i, totPer, verLen, j, arcLen, k;
    int[] X;
    boolean[] per;
    boolean isPos = true;
    while(true) {
    N = in.nextInt();
    if(N == 0) break;
    X = new int[N];
    totPer = 0;
    for(i = 0; i < N; i++) {
        X[i] = in.nextInt();
        totPer = totPer + X[i];
    }
    per = new boolean[totPer];
    Arrays.fill(per, false);
    verLen = 0;
    for(i = 0; i < N; i++) {
        per[verLen] = true;
        verLen = verLen + X[i];
    }
    for(i = N; i >= 3; i--) {
        if((totPer % i) == 0) {
           arcLen = totPer / i;
     for(j = 0; j < arcLen; j++) {
          isPos = true;
          k = j;
     while(k < totPer) {
        if(per[k] == false) isPos = false;
          k = k + arcLen;
        }
        if(isPos == true) break;
        }
     }
     isPos = false;
    }
    if(isPos == true) System.out.println(N - i);
    else System.out.println("-1");
        }
    }
}
*/