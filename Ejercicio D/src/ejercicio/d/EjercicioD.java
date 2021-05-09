
package ejercicio.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EjercicioD {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int vertices = lec.nextInt();
        while(vertices>0){            
        ArrayList<Integer>longitudes = new ArrayList<>();
        for(int i = 0;i < vertices;i++){
            int v = lec.nextInt();
            longitudes.add(v);
        }
        
        int maximo = Collections.max(longitudes);
        boolean status = true;
        
        int co = 0;
        if(vertices<=3 && vertices>0){
            for(int b = 0;b<longitudes.size();b++){
                if(longitudes.get(b)==maximo){
                    co++;
                }
            }
        
            if(co==longitudes.size() && vertices==3){
                System.out.println(0);
                status = false;
            }
            else{
                System.out.println(-1);
                status = false;
            }
            
        }
        
        int iterador = 0;
        while(status){
            int verifier = 0;
        for(int c = 0;c<longitudes.size();c++){
            if(longitudes.get(c)==maximo){
                verifier++;
            }
        }
        
        if(verifier==vertices){
            System.out.println(0);
            break;
        }
                        
        try{
        for(int i = 0;i<longitudes.size();i++){
            int suma = longitudes.get(i)+longitudes.get(i+1);
            if(suma == maximo){
                longitudes.set(i+1, suma);
                longitudes.remove(i);
                iterador++;
               break;
            }
            if(suma < maximo){
                longitudes.set(i+1, suma);
                longitudes.remove(i);
                iterador++;
               break;
               
            }            
                        
             if(suma > maximo){
                 continue;
             }
            
        }
        }catch(Exception e){
            System.out.println(-1);
            status = false;
        }
        
        int count=0;
        for(int j = 0;j<longitudes.size();j++){
            if(longitudes.get(j)==maximo){
                count++;
            }
        }
        
        if(count==longitudes.size()){
            status = false;
            System.out.println(iterador);
            break;         
        }
        
    }
        vertices = lec.nextInt();
        }

              
        
    }
    
}
