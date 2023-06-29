

package Konektor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() throws SQLException {
        if (koneksi == null) {
            try {
                String db = "jdbc:mysql://localhost:3306/senhim";
                String user = "root";
                String pass = "";
                
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection(db, user, pass);
                
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Terkoneksi: " + e.getMessage());
                throw new SQLException("Gagal Terkoneksi: " + e.getMessage());
            }
        }
        
        return koneksi;
    }
    
    public static void closeKoneksi() {
        if (koneksi != null) {
            try {
                koneksi.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Menutup Koneksi: " + e.getMessage());
            }
        }
    }
}
