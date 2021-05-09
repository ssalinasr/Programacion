/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class ConexionBD {
    static String bd = "EPS";
    static String login = "postgres";
    static String password = "senshi";
    static String url = "jdbc:postgresql://localhost/"+bd;
    static String mensaje = "";
    
    Connection conexion = null;
    
    public ConexionBD(){
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,login,password);
            if(conexion!=null){
                System.out.println("Connection to "+bd+ " established...");
            }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Failed at: Connect to "+bd+" ...","Warning",0);
            System.out.println(e);
        }
    }
    
    public static String getMensaje() {
        return mensaje;
    }
    
    public static void setMensaje(String mensaje) {
        ConexionBD.mensaje = mensaje;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void desconectar(){
        conexion = null;
    }
}
