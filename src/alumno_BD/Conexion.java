
package alumno_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static Connection conn  = null;
    private static String login     = "ALUMNOS";
    private static String clave     = "123";
    private static String url       = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion exitosa");
                
            }
            else{
                System.out.println("Conexion erronea");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea" + e.getMessage());
        }
        return conn;
    }
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConnection();
    }
}
