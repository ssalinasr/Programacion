
package simulador;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
 
public class Reloj {
    Timer timer = new Timer();
    public int segundos;
    public boolean frozen;
 
    TimerTask timera = new TimerTask() {
        @Override
        public void run() {
            System.out.println("segundos");
            int k = segundos;
            while ( k < 1000){
                System.out.println(k);
                segundos++;
                k = segundos;
            }

        }
    };

        
    public void Start (int pSeg) throws Exception{
        frozen = false;
        timer.schedule(timera, pSeg);
    } 
    
    public void Stop(){
        System.out.println("Stop");
        frozen = true;
        
    }
    
    public void Reset (){
        System.out.println("Reset");
        frozen = true;
        segundos = 0;
    }
}
   