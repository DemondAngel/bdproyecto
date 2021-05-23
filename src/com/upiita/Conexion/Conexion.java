package com.upiita.Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ELA ALEINAD
 */
public class Conexion {

    public static Conexion instance;
    private Connection conexionn;

    private Conexion() throws SQLException {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); //driver
            conexionn = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "root", "");//url
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized static Conexion saberEstado() {
        if (instance == null) {
            try {
                instance = new Conexion();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return instance;
    }

    public void crerrarConexion() {

        this.instance = null;
    }

    public Connection getConexionn() {
        return conexionn;
    }
}
