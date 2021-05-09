/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancera;

import java.util.ArrayList;
import java.util.Hashtable;

public class Tabla{
    public Hashtable<Integer, Columna> Colas;
    public ArrayList<String> cars;
    public Tabla(){
    }
    public Tabla(int i){
    }
    public Tabla(Tabla t){
        this.cars = new ArrayList<>();
        for (int i = 0; i < t.cars.size();i++){
            this.cars.add(t.cars.get(i));
        }
        this.Colas = new Hashtable<>();
        for (int i = 0; i < t.Colas.size();i++){
            this.Colas.put(i,new Columna(t.Colas.get(i)));
        }
    }
    
    public Tabla(Hashtable<String, Integer> h){
        this.cars = new ArrayList<>();
        this.extraerLetras(h);
        this.Colas = new Hashtable<>();
        for (int i = 0; i < (h.size()*2)-1;i++){
            try{
                this.Colas.put(i, new Columna(i, cars.get(i),h.get(cars.get(i))));
            }catch (IndexOutOfBoundsException IOOB1){
                this.Colas.put(i, new Columna(i, "", 0));
            }
        }
    }
    public void extraerLetras(Hashtable<String, Integer> table){
        table.forEach((k, v) -> {
            if (cars.isEmpty()){
                cars.add(k);
            }else{
                for (int i=0; i<cars.size();i++){
                    //System.out.println(cars);
                    if(k.compareTo(cars.get(i))<0){
                        cars.add(i,k);
                        break;
                    }else if(i==cars.size()-1){
                        cars.add(k);
                        break;
                    }/*else if (k.compareTo(cars.get(i))>0 && k.compareTo(cars.get(i+1))<0){
                        cars.add(i+1, k);
                        break;
                    }*/
                }
            }
        }); 
        
    }
    
    @Override
    public String toString(){
        String retrum="          ";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- Integer.toString(this.Colas.get(i).id).length();j++){
                esp +=" ";
            }
            retrum +=" " + this.Colas.get(i).id + esp;
        }
        retrum +="\nSIMBOLO   ";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- this.Colas.get(i).cad.length();j++){
                esp +=" ";
            }
            retrum +=" " + this.Colas.get(i).cad + esp;
        }
        retrum +="\nFRECUENCIA";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- Integer.toString(this.Colas.get(i).frec).length();j++){
                esp +=" ";
            }
            retrum +=" " + this.Colas.get(i).frec + esp;
        }
        retrum +="\nPADRE     ";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- Integer.toString(this.Colas.get(i).paidre).length();j++){
                esp +=" ";
            }
            retrum +=" " + this.Colas.get(i).paidre + esp;
        }
        retrum +="\nORIENTACIO";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- Integer.toString(this.Colas.get(i).orident).length();j++){
                esp +=" ";
            }
            retrum +=" "+this.Colas.get(i).orident + esp;
        }
        retrum +="\nIZQ       ";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- Integer.toString(this.Colas.get(i).hidjoizq).length();j++){
                esp +=" ";
            }
            retrum +=" " + this.Colas.get(i).hidjoizq + esp;
        }
        retrum +="\nDER       ";
        for (int i = 0; i < this.Colas.size();i++){
            String esp=" ";
            for (int j = 0; j < Integer.toString(this.Colas.size()).length()- Integer.toString(this.Colas.get(i).hidjoder).length();j++){
                esp +=" ";
            }
            retrum +=" " + this.Colas.get(i).hidjoder + esp;
        }
        return retrum;
    }
    
    public void aPadrinar(int p, int i, int d){
        this.Colas.get(i).paidre = p;
        this.Colas.get(i).orident = 1;
        this.Colas.get(d).paidre = p;
        this.Colas.get(d).orident = 2;
        this.Colas.get(p).hidjoizq = i;
        this.Colas.get(p).hidjoder = d;
        this.Colas.get(p).frec = this.Colas.get(i).frec + this.Colas.get(d).frec;
    }
    
    public String encriptar(String k){
        String cripy = "";
        int crPa = 0;
        for (int i = 0; i < this.cars.size();i++){
            if (this.Colas.get(i).cad.equals(k)){
                cripy = Integer.toString(this.Colas.get(i).orident-1) + cripy;
                crPa = this.Colas.get(i).paidre;
                break;
            }
        }
        while(this.Colas.get(crPa).paidre!=0){
            cripy = Integer.toString(this.Colas.get(crPa).orident-1)  + cripy;
            crPa = this.Colas.get(crPa).paidre;
        }
        return cripy;
    }
}
