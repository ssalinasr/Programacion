/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author a
 */
public class DBConectar {
    
    static String bd = "systemain";
    static String login = "root";
    static String password = "mysql2019";
    static String url = "jdbc:mysql://localhost/"+bd;
    static String mensaje = "";
    
    Connection conexion = null;
    
    public DBConectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url,login,password);
            if(conexion!=null){
                JOptionPane.showMessageDialog(null,"Connection to"+bd+" established...","OK",1);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error at try to link to"+bd+"...","Warning",0);
        }
    }
    
    public static String getMensaje() {
        return mensaje;
    }
    
    public static void setMensaje(String mensaje) {
        DBConectar.mensaje = mensaje;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void desconectar(){
        conexion = null;
    }

}
