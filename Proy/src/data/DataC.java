/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.math.BigInteger;

/**
 *
 * @author estudiantes
 */
public class DataC {//Modo apuesta
    
    private String name_contend;  
    private String name_aps;
    private int age_aps;
    private double value_aps;
    private int id_aps;
    
    private BigInteger limit_aps;
    
    
    public DataC(){
        this.name_contend = "";
        this.id_aps= 0; 
        this.name_aps = "";
        this.age_aps = 0;
        this.value_aps = 0.0;
        this.limit_aps = new BigInteger("0");
        
    }

    public int getId_aps() {
        return id_aps;
    }

    public void setId_aps(int id_aps) {
        this.id_aps = id_aps;
    }

    public String getName_contend() {
        return name_contend;
    }

    public void setName_contend(String name_contend1) {
        this.name_contend = name_contend1;
    }


    public String getName_aps() {
        return name_aps;
    }

    public void setName_aps(String name_aps) {
        this.name_aps = name_aps;
    }

    public int getAge_aps() {
        return age_aps;
    }

    public void setAge_aps(int edad_aps) {
        this.age_aps = edad_aps;
    }

    public double getValue_aps() {
        return value_aps;
    }

    public void setValue_aps(double valor_aps) {
        this.value_aps = valor_aps;
    }

    public BigInteger getLimit_aps() {
        return limit_aps;
    }

    public void setLimit_aps(BigInteger limit_aps) {
        this.limit_aps = limit_aps;
    }
    
}
