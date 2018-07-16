package perpus.umum;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fredd
 */
public class Koneksi {
    public static Connection konek(){
        String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "";
        String dbName = "db_perpus";
        String dbUrl = "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false";
        Connection kon = null;
        try {
            Class.forName(JDBC_DRIVER_CLASS).newInstance();
            kon = (Connection) DriverManager.getConnection(dbUrl, username, password);
            //System.out.println("Good");
        } catch (ClassNotFoundException | IllegalAccessException 
                | InstantiationException | SQLException e) {
        }
        return kon;
    }
}
