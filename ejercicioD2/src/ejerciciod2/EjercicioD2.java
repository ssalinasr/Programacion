
package ejerciciod2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class EjercicioD2 {
    public static void main(String[] args) {
        int N = 1000 + 1;
        int n = 1;
        int[] a = new int[N];
        int sum;
        ArrayList<Integer> st = new ArrayList();
        Scanner p = new Scanner(System.in); 
        
        while(n!=0){
          n = p.nextInt();
          sum = 0;
          st.clear();
          
          for(int i = 0; i < n;i++){
              int v = p.nextInt();
              a[i]=v;
              sum+=a[i];
              st.add(sum);
          }
          
          int res = -1;
          
      for(int i = n, side; i >= 3 && res == -1; --i) {
      if(sum % i == 0) {
        side = sum / i;

        for(int j = 0, s = 0; s <= side; s += a[j], ++j) {
          boolean ok = true;
          for(int k = s; k < sum && ok; k += side)
                System.out.println(k+" "+st.equals(k));
            //ok &= st.equals(k);
           
          if(ok) {
            res = n - i;
            break;
          }
        }
      }
    }
   System.out.println(res);
          
    }
        
        
        

    }
}
