
package Datos_alumnos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AlumnoDAO {
    
    private String mensaje = "";
    
    public String agregarAlumno(Connection con, Alumno alm){
        PreparedStatement pst = null;
        String sql = "INSERT INTO  ALUMNOS (idalumno, nombres, apellidos, edad, ciclo, genero, universidad)"
                   + "VALUES(ALUMNO_SEQ.NEXTVAL, ?, ?, ? ,?, ?, ?)";
        
        try {
            //pst ejecutara nuestra secuencia sql
            pst = con.prepareStatement(sql);
            pst.setString(1, alm.getNombres());
            pst.setString(2, alm.getApellidos());
            pst.setInt(3, alm.getEdad());
            pst.setInt(4, alm.getCiclo());
            pst.setString(5, alm.getGenero()+"");
            pst.setString(6, alm.getUniversidad());
            mensaje = "Guardado completamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo guadar correctamente\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarAlumno(Connection con, Alumno alm){
        PreparedStatement pst = null;
        String sql = "UPDATE ALUMNOS SET NOMBRES = ?, APELLIDOS = ?, EDAD = ?, CICLO = ?, GENERO = ?, UNIVERSIDAD = ?"
                   +"WHERE IDALUMNO = ?";
        
        try {
            //pst ejecutara nuestra secuencia sql
            pst = con.prepareStatement(sql);
            pst.setString(1, alm.getNombres());
            pst.setString(2, alm.getApellidos());
            pst.setInt(3, alm.getEdad());
            pst.setInt(4, alm.getCiclo());
            pst.setString(5, alm.getGenero()+"");
            pst.setString(6, alm.getUniversidad());
            pst.setInt(7, alm.getIdAlumno());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo Modificar correctamente\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarAlumno(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM ALUMNOS WHERE IDALUMNO = ?";
        
        try {
            //pst ejecutara nuestra secuencia sql
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo ELIMINAR correctamente\n"+e.getMessage();
        }
        return mensaje;
    }
    
    public void listarAlumno(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID", "NOMBRES", "APELLIDOS", "EDAD", "CICLO", "GENERO", "UNIVERSIDAD"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM ALUMNOS BY ORDEN IDALUMNO";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
        
    }
}
