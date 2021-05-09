/*
 * DBConexion.java
 * 
 * Created on 7/04/2008, 10:01:58 PM
 * 
 */

package baseDatos;


import java.sql.*;
import javax.swing.JOptionPane;

public class DBconectar {
    static String bd = "hilos";
    static String login = "root";
    static String password = "mysql2019";
    static String url = "jdbc:mysql://localhost/"+bd;
    static String mensaje = "";
    
    Connection conexion = null;
    /**
     * Constructor de la clase
     */
    public DBconectar() {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url,login,password);

                if (conexion!=null){
                        System.out.println("Link zum "+bd+" OK");
                }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error en Base de Datos","Error",0);
        }catch(ClassNotFoundException e){
                JOptionPane.showMessageDialog(null,"Error en Conexion","Error",0);
        }
    }
    
    /**
     * Metodo para retornar mensajes de control
     * @return 
     */
    public static String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo para setear mensajes de control
     * @param mensaje 
     */
    public static void setMensaje(String mensaje) {
        DBconectar.mensaje = mensaje;
    }
     
    /**
     * metodo que retorna la conexion a la bd
     * @return 
     */
    public Connection getConexion(){
        return conexion;
    }

    /**
     * metodo que desconecta la base de datos
     */
    public void desconectar(){
        conexion = null;
    }

}
