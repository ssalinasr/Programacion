/*
 * DBContactos.java
 * 
 * Created on 7/04/2008, 10:26:02 PM
 */
package hilos;

import java.sql.*;


public class DBconsultas {

    DBconectar cn;
    
    public DBconsultas() {
        cn = new DBconectar();
    }

    public ResultSet getPersonajeById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT per_id, "
                + "per_user, "
                + "per_legion, "
                + "per_affinity, "
                + "per_title, "
                + "per_level, "
                + "per_gender "
                + "FROM personaje "
                + "WHERE per_id = ?");
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
            pstm.setString(3, c.getContendiente());
            pstm.setString(4, Double.toString(c.getValorapos()));
            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public String getMensaje() {
        return cn.getMensaje();
    }
}
