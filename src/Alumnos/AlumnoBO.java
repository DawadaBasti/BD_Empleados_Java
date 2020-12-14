
package Alumnos;

import Datos_alumnos.AlumnoDAO;
import Entidades.Alumno;
import alumno_BD.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JTable;
import oracle.jdbc.OracleConnection;


public class AlumnoBO {
    
    private String mensaje = "";
    private AlumnoDAO edao = new AlumnoDAO();
    
    public String agregarAlumno(Alumno alm){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarAlumno(conn, alm);
            
        } catch (Exception e) {
            mensaje = mensaje +" "+ e.getMessage();
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje +" "+ e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarAlumno(Alumno alm){
    Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modificarAlumno(conn, alm);
        } catch (Exception e) {
            mensaje = mensaje +" "+ e.getMessage();
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje +" "+ e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarAlumno( int id){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarAlumno(conn, id);
           
        } catch (Exception e) {
            mensaje = mensaje +" "+ e.getMessage();
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje +" "+ e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listarAlumno(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.listarAlumno(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
