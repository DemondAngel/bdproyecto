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
    
    private final String user = "";
    private final String password = "";
    private final String url = "";
    
    
    public Conexion(){
        try{
            conn = (Connection) DriverManager.getConnection(url, user, password);//url
            System.out.println("Hay conexion");
        }
        catch(SQLException xxx){
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
