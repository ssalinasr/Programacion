/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import data.DataB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class DBConsultasB {//Consulta elección
        
    private DBConectar cn;
    
    public DBConsultasB(){
        this.cn = new DBConectar();
    }
    
    public ResultSet getPartByName(String name)throws SQLException{
        PreparedStatement p = cn.getConexion().prepareStatement("SELECT elec_name,"
                + "elec_group,"
                + "elec_id,"
                + "elec_count"
                + "FROM tblelec"
                + "WHERE elec_name = ?");
        
        p.setString(1, name);
        ResultSet r = p.executeQuery();
        return r;
    }
    
    public ResultSet getPart()throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM tblelec"
                + "ORDER BY elec_count");
        
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public void insertPart(DataB b){
        try{
            PreparedStatement pi = cn.getConexion().prepareStatement("INSERT into tblelec"
                    + "(elec_name,"
                    + "elec_group,"
                    + "elec_id,"
                    + "elec_count)"
                    + "values(?,?,?,?)");
            pi.setString(1,b.getName_part());
            pi.setString(2,b.getGrup_part());
            pi.setString(3,b.getId_part());
            pi.setString(4,Integer.toString(b.getCount_part()));
            pi.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: insert data action","Warning",0);
        }
        

        
    }
    
    public void updatePart(DataB b){
        try{
            PreparedStatement pa = cn.getConexion().prepareStatement("update tblelec set"
                    + "elec_name = ?,"
                    + "elec_group = ?,"
                    + "elec_id = ?,"
                    + "elec_count = ?"
                    + "WHERE elec_id = ?");
            pa.setString(1,b.getName_part());
            pa.setString(2,b.getGrup_part());
            pa.setString(3,b.getId_part());
            pa.setString(4,Integer.toString(b.getCount_part()));
            pa.setString(5,Integer.toString(b.getID_part()));
            
            pa.executeUpdate();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"error at: update data action","Warning",0);
            }
                
        }
    
    public void deletePart(DataB b){
        try{
            PreparedStatement pd = cn.getConexion().prepareStatement("delete from tblelec"
                    + "where elec_id = ?");
            pd.setInt(1,b.getID_part());
            pd.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: delete data action","Warning",0);
        }
    }
    
    public void DeleteAllPart(){
        try{
            PreparedStatement pda = cn.getConexion().prepareStatement("TRUNCATE TABLE"
                    + "tblelec");
            
            pda.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error at: delete all data action","Warning",0);
        }
    }
    
    

    
}
