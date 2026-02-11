import javax.swing.JOptionPane;
import java.sql.*;
public class koneksi {
    Connection con;
    Statement stm;

    public void config() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbperpustakaan", "root", "");
            stm = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal! " + e.getMessage());
        }
    }
}
