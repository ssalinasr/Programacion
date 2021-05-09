/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class Data {
    
    private String nombre;
    private int edad;
    private int contendiente;
    private double valorapos;
    
    public Data(){
        this.nombre = "";
        this.edad = 0;
        this.contendiente = 0;
        this.valorapos = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getContendiente() {
        return contendiente;
    }

    public void setContendiente(int contendiente) {
        this.contendiente = contendiente;
    }

    public double getValorapos() {
        return valorapos;
    }

    public void setValorapos(double valorapos) {
        this.valorapos = valorapos;
    }
    
}
