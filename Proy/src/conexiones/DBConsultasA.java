/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.*;
import data.DataA;
import javax.swing.JOptionPane;

/**
 *
 * @author a
 */
public class DBConsultasA {//Consulta simulacion
    
    private DBConectar cn;
    
    public DBConsultasA(){
        this.cn = new DBConectar();
    }
    
    public ResultSet getCompByName(String name)throws SQLException{
        PreparedStatement p = cn.getConexion().prepareStatement("SELECT sim_name,"
                + "sim_carac"
                + "FROM tblsimulate"
                + "WHERE sim_name = ?");
        
        p.setString(1, name);
        ResultSet r = p.executeQuery();
        return r;
    }
    
    public ResultSet getComp()throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM tblsimulate"
                + "ORDER BY sim_carac");
        
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public void insertComp(DataA a){
        try{
            PreparedStatement pi = cn.getConexion().prepareStatement("INSERT into tblsimulate"
                    + "(sim_name,"
                    + "sim_carac,"
                    + "sim_type)"
                    + "values(?,?,?)");
            pi.setString(1,a.getName_comp());
            pi.setString(2,Double.toString(a.getCarac_comp()));
            pi.setString(3,a.getType_comp());
            pi.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: insert data action","Warning",0);
        }
        

        
    }
    
    public void updateComp(DataA a){
        try{
            PreparedStatement pa = cn.getConexion().prepareStatement("update tblsimulate set"
                    + "sim_name = ?,"
                    + "sim_carac = ?,"
                    + "sim_type = ?"
                    + "WHERE sim_id = ?");
            pa.setString(1,a.getName_comp());
            pa.setString(2,Double.toString(a.getCarac_comp()));
            pa.setString (3,Integer.toString(a.getId_comp()));
            pa.setString(4, a.getType_comp());
            
            pa.executeUpdate();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"error at: update data action","Warning",0);
            }
                
        }
    
    public void deleteComp(DataA a){
        try{
            PreparedStatement pd = cn.getConexion().prepareStatement("delete from tblsimulate"
                    + "where sim_id = ?");
            pd.setInt(1,a.getId_comp());
            pd.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: delete data action","Warning",0);
        }
    }
    
    public void DeleteAllComp(){
        try{
            PreparedStatement pda = cn.getConexion().prepareStatement("TRUNCATE TABLE"
                    + "tblsimulate");
            
            pda.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: delete all data action","Warning",0);
        }
    }
    
    
    
}
