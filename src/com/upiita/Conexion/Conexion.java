package com.upiita.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ELA ALEINAD
 */

public class Conexion {
    
    protected Connection conn = null;
    
    private final String user = "root";
    private final String password = "n0m3l0";
    private final String url = "jdbc:sqlserver://localhost:1433;database=Cineteca;integratedSecurity=true";
    
    public Conexion(){
        try{
            
            conn = (Connection) DriverManager.getConnection(url, user, password);//url
            System.out.println("Hay conexion");
            
        }
        catch(SQLException e){
             System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            System.exit(-1);
        } 
    }
    
    public void closeConn(){
        
        if(conn != null){
            try{
                conn.close();
            }
            catch(SQLException xxx){
            }
        }
        
    }
    
}
