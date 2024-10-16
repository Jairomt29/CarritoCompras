package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
Autor: Yaac Jairo Mergildo Trinidad
 */

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bdcarritocompras";
    String user="root";
    String pass="";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No se puedo establecer la conexion a la base de datos");
        }
        return con;
    }
}
