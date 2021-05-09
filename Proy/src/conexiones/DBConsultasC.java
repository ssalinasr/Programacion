/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import data.DataC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class DBConsultasC {//Consulta apuesta
            
    private DBConectar cn;
    
    public DBConsultasC(){
        this.cn = new DBConectar();
    }
    
    public ResultSet getAposByName(String name)throws SQLException{
        PreparedStatement p = cn.getConexion().prepareStatement("SELECT aps_name,"
                + "aps_age,"
                + "aps_value,"
                + "aps_contend"
                + "FROM tblapos"
                + "WHERE aps_name = ?");
        
        p.setString(1, name);
        ResultSet r = p.executeQuery();
        return r;
    }
    
    public ResultSet getApos()throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM tblapos"
                + "ORDER BY aps_value");
        
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public void insertApos(DataC c){
        try{
            PreparedStatement pi = cn.getConexion().prepareStatement("INSERT into tblapos"
                    + "(aps_name,"
                    + "aps_age,"
                    + "aps_value,"
                    + "aps_contend)"
                    + "values(?,?,?,?)");
            pi.setString(1,c.getName_aps());
            pi.setString(2,Integer.toString(c.getAge_aps()));
            pi.setString(3,Double.toString(c.getValue_aps()));
            pi.setString(4,c.getName_contend());
            pi.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: insert data action","Warning",0);
        }
        

        
    }
    
    public void updateApos(DataC c){
        try{
            PreparedStatement pa = cn.getConexion().prepareStatement("update tblapos set"
                    + "aps_name = ?,"
                    + "aps_age = ?,"
                    + "aps_value = ?,"
                    + "aps_contend = ?"
                    + "WHERE aps_id = ?");
            pa.setString(1,c.getName_aps());
            pa.setString(2,Integer.toString(c.getAge_aps()));
            pa.setString(3,Double.toString(c.getValue_aps()));
            pa.setString(4,c.getName_contend());
            pa.setString(5,Integer.toString(c.getId_aps()));          
            pa.executeUpdate();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"error at: update data action","Warning",0);
            }
                
        }
    
    public void deleteApos(DataC c){
        try{
            PreparedStatement pd = cn.getConexion().prepareStatement("delete from tblapos"
                    + "where aps_id = ?");
            pd.setInt(1,c.getId_aps());
            pd.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: delete data action","Warning",0);
        }
    }
    
    public void DeleteAllApos(){
        try{
            PreparedStatement pda = cn.getConexion().prepareStatement("TRUNCATE TABLE"
                    + "tblapos");
            
            pda.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: delete all data action","Warning",0);
        }
    }
    
    

    
}
