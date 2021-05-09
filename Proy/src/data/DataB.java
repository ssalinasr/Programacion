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
public class DataB {//Modo elección (3 participantes, n-electores)
    
    private String name_part;
    
    private String grup_part;
    
    private String id_part;
    
    private int count_part;
    
    private int ID_part;
    
    private BigInteger limit_elec;
    
    public DataB(){
        
        this.name_part = "";
        
        this.grup_part = "";
        
        this.id_part = "";
        
        this.count_part = 0;
        
        this.ID_part = 0;
        
        this.limit_elec = new BigInteger("0");
           
}

    public int getID_part() {
        return ID_part;
    }

    public void setID_part(int ID_part) {
        this.ID_part = ID_part;
    }

    public String getName_part() {
        return name_part;
    }

    public void setName_part(String name_part1) {
        this.name_part = name_part1;
    }

    public String getGrup_part() {
        return grup_part;
    }

    public void setGrup_part(String grup_part1) {
        this.grup_part = grup_part1;
    }

    public String getId_part() {
        return id_part;
    }

    public void setId_part(String id_part1) {
        this.id_part = id_part1;
    }

    public int getCount_part() {
        return count_part;
    }

    public void setCount_part(int count_part1) {
        this.count_part = count_part1;
    }

    public BigInteger getLimit_elec() {
        return limit_elec;
    }

    public void setLimit_elec(BigInteger limit_elec) {
        this.limit_elec = limit_elec;
    }
    
}
