/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author estudiantes
 */
public class DataA {//Modo simulacion
    
    private int id_comp;
    private String name_comp;
    private int duration;
    private double carac_comp;
    private String type_comp;

    
    public DataA(){
        this.name_comp = "";
        this.duration = 0;
        this.carac_comp = 0.0;
        this.type_comp = "";
    }

    public String getType_comp() {
        return type_comp;
    }

    public void setType_comp(String type_comp) {
        this.type_comp = type_comp;
    }

    public int getId_comp() {
        return id_comp;
    }

    public void setId_comp(int id_comp) {
        this.id_comp = id_comp;
    }

    public String getName_comp() {
        return name_comp;
    }

    public void setName_comp(String name_comp1) {
        this.name_comp = name_comp1;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCarac_comp() {
        return carac_comp;
    }

    public void setCarac_comp(double carac_comp1) {
        this.carac_comp = carac_comp1;
    }


}
