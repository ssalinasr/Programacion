/*
 * DBContactos.java
 * 
 * Created on 7/04/2008, 10:26:02 PM
 */
package baseDatos;

import baseDatos.DBconectar;
import hilos.Data;
import java.sql.*;
import javax.swing.JOptionPane;


public class DBconsultas {

    DBconectar cn;
    
    public DBconsultas() {
        cn = new DBconectar();
    }

    public ResultSet getValorById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT aps_id, "
                + "aps_nombre, "
                + "aps_edad, "
                + "aps_contendiente, "
                + "aps_valorapos "
                + "FROM datoshilos "
                + "WHERE aps_id = ?");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla contactos
     */
    public ResultSet getValores() throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT * "
                + " FROM datoshilos "
                + " ORDER BY aps_id");


        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarValores(Data c) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("insert into datoshilos (aps_nombre,"
                + "aps_edad, "
                + "aps_contendiente, "
                + "aps_valorapos) "
                + "values(?,?,?,?)");
            pstm.setString(1, c.getNombre());
            pstm.setString(2, Integer.toString(c.getEdad()));
            pstm.setString(3, Integer.toString(c.getContendiente()));
            pstm.setString(4, Double.toString(c.getValorapos()));
            pstm.executeUpdate();


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en Base de Datos","Error",0);
        }

    }
    
        public void borrarValor() {

        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("TRUNCATE TABLE"
                    + " datoshilos");
            
            pstm.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en Base de Datos","Error",0);
        }

}
}
