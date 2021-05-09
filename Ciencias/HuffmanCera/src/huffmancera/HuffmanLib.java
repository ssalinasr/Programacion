/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancera;

import java.util.ArrayList;
import java.util.Hashtable;

public class HuffmanLib {
    public String mensaje;
    public ArrayList<String> Encriptor;
    public ArrayList<String> Decriptor;
    public ArrayList<Tabla> Tablas;
    public Hashtable<String, Integer> frecu;
    public Hashtable<String, String> crips;
    
    public HuffmanLib(){
        this.mensaje = "";
        this.frecu = new Hashtable<>();
        this.extraerLetras();
        this.Tablas = new ArrayList<>();
        this.Tablas.add(new Tabla(this.frecu));
        this.crips = new Hashtable<>();
        this.Decriptor = new ArrayList<>();
        this.Encriptor = new ArrayList<>();
    }
    
    public HuffmanLib(String mens){
        this.mensaje = mens;
        this.frecu = new Hashtable<>();
        this.extraerLetras();
        this.Tablas = new ArrayList<>();
        this.Tablas.add(new Tabla(this.frecu));
        this.crips = new Hashtable<>();
        this.Decriptor = new ArrayList<>();
        this.Encriptor = new ArrayList<>();
    }
    
    public void extraerLetras(){
        for (int i = 0; i < this.mensaje.length();i++){
            String act = Character.toString(this.mensaje.charAt(i));
            if (this.frecu.containsKey(act)){
                this.frecu.put(act, this.frecu.get(act) + 1);
            }else{
                this.frecu.put(act, 1);
            }
        }
    }
    
    public int calcularN(){
        if (this.frecu.isEmpty()){
            this.extraerLetras();
        }
        try{
            return (2*this.frecu.size())-1;
        }catch(Exception e1){
            System.out.println(e1);
            return 0;
        }
    }
    
    public int calcularB(){
        try{
            return 8*this.mensaje.length();
        }catch(Exception e1){
            System.out.println(e1);
            return 0;
        }
    }
    
    public void calcularSiguienteT(){
        this.Tablas.add(new Tabla(this.Tablas.get(this.Tablas.size()-1)));
        Tabla acT = this.Tablas.get(this.Tablas.size()-1);
        String[] men = new String[] {null,null};
        for (int i = 0; i < acT.Colas.size();i++){
            if (acT.Colas.get(i).frec != 0 && acT.Colas.get(i).paidre == 0){
                if (men[0] == null){
                    men[0]=Integer.toString(i);
                }else{
                    if (acT.Colas.get(i).frec < acT.Colas.get(Integer.parseInt(men[0])).frec){
                        if (men[1] == null){
                            men[1]=men[0];
                            men[0]=Integer.toString(i);
                        }else{
                            if (acT.Colas.get(Integer.parseInt(men[0])).frec <= acT.Colas.get(Integer.parseInt(men[1])).frec){
                                men[1]=men[0];
                                men[0]=Integer.toString(i);
                            }
                        }
                    }else{
                        if (men[1] == null){
                            men[1]=Integer.toString(i);
                        }else{
                            if (acT.Colas.get(i).frec < acT.Colas.get(Integer.parseInt(men[1])).frec){
                                men[1]=Integer.toString(i);
                            }
                        }
                    }
                }
            }
        }
        acT.aPadrinar(this.Tablas.size()-2+this.frecu.size(),Integer.parseInt(men[0]), Integer.parseInt(men[1]));
        //System.out.println(men[0] + men[1]);
    }
    
    public void calcularT(){
        Tabla acT = this.Tablas.get(this.Tablas.size()-1);
        Boolean ver = true;
        for (int i = 0; i < acT.Colas.size()-1;i++){
            if (acT.Colas.get(i).paidre == 0){
                ver = false;
                break;
            }            
        }
        if (!ver) {
            this.calcularSiguienteT();
            this.calcularT();
        }
    }
    
    @Override
    public String toString(){
        String retrum="";
        for (int i = 0; i < this.Tablas.size();i++){
            retrum+="\nTabla: "+ i + "\n"+this.Tablas.get(i).toString() + "\n";
        }
        return retrum;
    }
    
    public void encriptar(){
        this.calcularT();
        Tabla acT = this.Tablas.get(this.Tablas.size()-1);
        acT.cars.forEach((k) -> {
            this.crips.put(k, acT.encriptar(k));
        });
        this.extraerMensaje();
    }
    
    public String cripString(){
        String retrum = "";
        Tabla acT = this.Tablas.get(this.Tablas.size()-1);
        for (int i = 0; i < acT.cars.size();i++){
            retrum += acT.cars.get(i) + ": " + this.crips.get(acT.cars.get(i)) + "\n";
        }
        return retrum;
    }
    
    public String menString(){
        String retrum1 = "Mensaje: ";
        String retrum2 = "Codificado: ";
        for (int i = 0; i < this.mensaje.length();i++){
            retrum1 += this.Decriptor.get(i);
            retrum2 += this.Encriptor.get(i);
        }
        return retrum1+"\n"+retrum2;
    }    

    public void extraerMensaje(){
        for (int i = 0; i < this.mensaje.length();i++){
            String act = Character.toString(this.mensaje.charAt(i));
            this.Decriptor.add(act);
            this.Encriptor.add(this.crips.get(act));
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
