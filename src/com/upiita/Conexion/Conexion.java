package com.upiita.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ELA ALEINAD
 */
public class Conexion {
    
    protected Connection conn = null;
    
    private final String user = "";
    private final String password = "";
    private final String url = "";
    
    private  String consultaSQL = null;
    private  PreparedStatement insertSQL = null;
    private  Statement statement = null;
    private  ResultSet resultado = null;
    private  ResultSetMetaData resInfo = null;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setConsultaSQL(String consultaSQL) {
        this.consultaSQL = consultaSQL;
    }

    public void setInsertSQL(PreparedStatement insertSQL) {
        this.insertSQL = insertSQL;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    public void setResInfo(ResultSetMetaData resInfo) {
        this.resInfo = resInfo;
    }

    public Connection getConn() {
        return conn;
    }

    public String getConsultaSQL() {
        return consultaSQL;
    }

    public PreparedStatement getInsertSQL() {
        return insertSQL;
    }

    public Statement getStatement() {
        return statement;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public ResultSetMetaData getResInfo() {
        return resInfo;
    }


    
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
    
    public boolean ejecutaStoredProcedure(String parametros) {
        boolean state = false;
        setConsultaSQL("Exec " + parametros);
        try {
            setInsertSQL(getConn().prepareStatement(getConsultaSQL()));
            
            
             if (getInsertSQL().execute() != false) {                //dudaaaaaaa
                state = true;
            }
        }
        catch (SQLException ex) {
            System.out.println("No se pudo ejecutar el SP: " + ex.getMessage());
        }
        return false;
    }

}
