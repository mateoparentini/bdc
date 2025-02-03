/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 56929006
 */
public class ConexionBD {
    
     private static final String db = "usuariobd"; // bd
    private static final String user = "root"; // usuario predt MySQL
    private static final String pass = ""; // contraseña predt
    private static final String url = "jdbc:mysql://localhost:3306/"+db; //direccion
    private static Connection con; //obj para invocar la conexion
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Conecion ecitpsa");
        } catch (Exception e) {
            System.out.println("Error en la conexion" +e.getMessage());
        }
        return con;
    }
    
    public void cerrarDB() {
        try {
            if(!con.isClosed()) {
                con.close();
                
            }else {
                JOptionPane.showMessageDialog(null, "La BD ya esta cerrada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
