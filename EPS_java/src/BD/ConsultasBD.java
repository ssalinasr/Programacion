/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author FliaSalinasRodriguez
 */
public class ConsultasBD {
    
    ConexionBD cn;
    
    public ConsultasBD(){
        this.cn = new ConexionBD();
        
    }
     
    public void insertarSede(String id, String nombre, String dir, int cant) throws SQLException{
        String statement = "INSERT INTO sede VALUES (?,?,?,?)";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setString(1, id);
        pg.setString(2, nombre);
        pg.setString(3,dir);
        pg.setInt(4, cant);
        pg.executeUpdate();
        pg.close();     
    }
    
    public void insertarUsuario(int id, String tipo, String email, String sexo, 
            Date fecha, String nombre, String apellido) throws SQLException{
        
        String statement = "INSERT INTO usuario VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setInt(1, id);
        pg.setString(2, tipo);
        pg.setString(3, email);
        pg.setString(4, sexo);
        pg.setDate(5, fecha);
        pg.setString(6, nombre);
        pg.setString(7, apellido);     
        pg.executeUpdate();
        pg.close();             
    }
    
    public void insertarMedico(int id, int registro, String tipo, int especialidad) throws SQLException{
        String statement = "INSERT INTO medico VALUES (?,?,?,?)";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setInt(1, id);
        pg.setInt(2, registro);
        pg.setString(3, tipo);
        pg.setInt(4, especialidad);
        pg.executeUpdate();
        pg.close();     
    }
    
    public void insertarPaciente(String estado, String categoria, int id, String tipo) throws SQLException{
        String statement = "INSERT INTO paciente VALUES (?,?,?,?)";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setString(1, estado);
        pg.setString(2, categoria);
        pg.setInt(3, id);
        pg.setString(4, tipo);
        pg.executeUpdate();
        pg.close();     
    }
    
    public ResultSet obtenerUsuario(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM usuario WHERE k_id = ?");
        
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public void actualizarEstadoAgenda(String estado, int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("UPDATE agenda SET i_estado = ? WHERE k_id_medico = ?");       
        pg.setString(1, estado);
        pg.setInt(2, id);
        pg.executeUpdate();
        System.out.println("Actualización exitosa...");
    }
    
    public void crearCita(String tipo, String estado, int id_agenda
            , Time hora_inicial, int id_paciente, Time hora_final, int copago, String tipo_paciente, int dia, int mes, int año) throws SQLException{
        String statement = "insert into cita(i_tipo_cita, i_estado_cita, k_id_agenda, "
                + "f_hora_inicial, k_id_paciente,f_hora_final, q_copago, k_id_tipo, q_dia, q_mes, q_año) " + "values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setString(1, tipo);
        pg.setString(2, estado);
        pg.setInt(3, id_agenda);
        pg.setTime(4, hora_inicial);
        pg.setInt(5, id_paciente);
        pg.setTime(6, hora_final);
        pg.setInt(7, copago);
        pg.setString(8, tipo_paciente);
        pg.setInt(9, dia);
        pg.setInt(10, mes);
        pg.setInt(11, año);
        pg.executeUpdate();
        pg.close();
    }
    
    public ResultSet obtenerAgenda(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM agenda WHERE k_id_medico = ?");
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet obtenerAgendaId(int id_ag) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM agenda WHERE k_id_agenda = ?");
        pg.setInt(1, id_ag);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet obtenerCitas(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM cita WHERE k_id_agenda = ?");
        
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet obtenerCitasId(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM cita WHERE k_id_cita= ?");
        
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet obtenerMedico(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM medico WHERE k_id_medico = ?");
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
        
   public ResultSet obtenerPaciente(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM paciente WHERE k_id_paciente = ?");
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
   
    public ResultSet obtenerEspecialidad(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM especialidad WHERE k_id_especialidad = ?");
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
   
    public ResultSet obtenerConsultorio(int id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM consultorio WHERE k_id_especialidad = ?");
        pg.setInt(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet obtenerSede(String id) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM sede WHERE k_id_sede = ?");
        pg.setString(1, id);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet obtenerCitas(String tipo) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM cita WHERE i_tipo_cita = ?");
        pg.setString(1, tipo);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public void actualizarCita(int id_pac, String tipo_pac, int copago, String estado,  int id_cita) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("UPDATE cita SET k_id_paciente = ?, k_id_tipo = ?,"
                + " q_copago = ?, i_estado_cita = ? WHERE k_id_cita = ?");       
        pg.setInt(1, id_pac);
        pg.setString(2, tipo_pac);
        pg.setInt(3, copago);
        pg.setString(4, estado);
        pg.setInt(5, id_cita);
        pg.executeUpdate();
        System.out.println("Actualización exitosa...");
    }
    
    public ResultSet consultarCita(String tipo, int id, int dia, int mes, int año) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM cita WHERE k_id_tipo = ? AND k_id_paciente = ? AND q_dia = ? AND q_mes = ? AND q_año = ? AND i_estado_cita = ?");
        
        pg.setString(1, tipo);
        pg.setInt(2, id);
        pg.setInt(3, dia);
        pg.setInt(4, mes);
        pg.setInt(5, año);
        pg.setString(6, "NO DISPONIBLE");
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public ResultSet consultarCitaCop(int id_cita) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("SELECT *"
                + "FROM cita WHERE k_id_cita = ?");
        
        pg.setInt(1, id_cita);
        ResultSet rg = pg.executeQuery();
        return rg;
    }
    
    public void eliminarCita(String estado, int id, int dia, int mes, int año) throws SQLException{
        PreparedStatement pg = cn.getConexion().prepareStatement("UPDATE cita SET i_estado_cita = ?, i_estado_cita = ?"
                + " WHERE k_id_paciente = ? AND q_dia = ? AND q_mes = ? AND q_año = ?");
        
        pg.setString(1,estado);
        pg.setInt(2, -1);
        pg.setInt(3, id);
        pg.setInt(4, dia);
        pg.setInt(5, mes);
        pg.setInt(6, año);
        pg.executeUpdate();
    }
    
    public ResultSet obtenerConsultorios(int esp) throws SQLException{
        String statement = "SELECT * FROM consultorio WHERE k_id_especialidad = ? AND i_estado = ?";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setInt(1, esp);
        pg.setString(2, "DISPONIBLE");
        ResultSet res = pg.executeQuery();
        return res;
    }
    
    public void actualizarConsultorio(String estado, int id) throws SQLException{
       PreparedStatement pg = cn.getConexion().prepareStatement("UPDATE consultorio SET i_estado = ? WHERE k_numero_consultorio = ?");       
        pg.setString(1, estado);
        pg.setInt(2, id);
        pg.executeUpdate();
        System.out.println("Actualización exitosa...");
    }
    
    public void crearAgenda(int id, Date fecha_inicio, Date fecha_fin, int id_med, String estado, String tipo) throws SQLException{
        String statement = "INSERT INTO agenda VALUES (?,?,?,?,?,?)";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        pg.setInt(1, id);
        pg.setDate(2, fecha_inicio);
        pg.setDate(3, fecha_fin);
        pg.setInt(4, id_med);
        pg.setString(5, estado);
        pg.setString(6, tipo);
        pg.executeUpdate();
        pg.close();     
    }
    
    public ResultSet obtenerAgendas() throws SQLException{
        String statement = "SELECT * FROM agenda";
        PreparedStatement pg = cn.getConexion().prepareStatement(statement);
        ResultSet res = pg.executeQuery();
        return res;
    }
}
