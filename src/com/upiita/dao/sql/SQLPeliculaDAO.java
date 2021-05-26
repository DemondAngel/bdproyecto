package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Pelicula;
import java.util.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.PeliculaDAO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author iarog
 */
public class SQLPeliculaDAO extends Conexion implements PeliculaDAO {

    private static final String SQL_INSERT = "";
    private static final String SQL_DELETE = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_READ = "";
    private static final String SQL_READALL = "";
    
    private CallableStatement cs;
    private ResultSet rs;
    
    public SQLPeliculaDAO(){
        super();
    }
    
    @Override
    public boolean create(Pelicula o) {
        
        boolean state = false;
        
        try {

            cs = conn.prepareCall(SQL_INSERT);
            
            cs.setInt(1, o.getIdPelicula());
            cs.setString(2, o.getTituloOriginal());
            cs.setString(3, o.getTituloExhibicion());
            cs.setInt(4, o.getAnio());
            
            if (cs.executeUpdate() > 0) {
                state = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections();
        }

        return state;

    }

    @Override
    public boolean update(Pelicula o) {
            boolean state = false;
            
        try {

            cs = conn.prepareCall(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar
            cs.setInt(1, o.getIdPelicula());
            cs.setString(2, o.getTituloOriginal());
            cs.setString(3, o.getTituloExhibicion());
            cs.setInt(4, o.getAnio());

            if (cs.executeUpdate() > 0) {
                state = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections();
        }

        return false;

    }

    @Override
    public List<Pelicula> readAll() {
        ResultSet res;
        List<Pelicula> peliculas = new ArrayList<>();
        
        try {
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                peliculas.add(parseResPelicula(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }
        
        return peliculas;
    }

    @Override
    public boolean delete(Integer id) { //SE LE DA LA LLAVE PARA BORRAR
        
        boolean state = false;
        
        try {

            cs = conn.prepareCall(SQL_DELETE);
            cs.setInt(1, id);
            if (cs.executeUpdate() > 0) {
                state = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return state;

    }

    @Override
    public Pelicula readOne(Pelicula o) {
        Pelicula pe = null;
        
        try {
            cs = conn.prepareCall(SQL_READ);
            cs.setInt(1, o.getIdPelicula());
            rs = cs.executeQuery();
            //se recorre detro de la base
            while (rs.next()) {
                pe = parseResPelicula(rs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }
        return pe;

    }
    
    public Pelicula parseResPelicula(ResultSet res){
        
        Pelicula pelicula = null;
        
        try{
            pelicula = new Pelicula(
                    res.getInt("idPelicula"),
                    res.getString("tituloOriginal"),
                    res.getString("tituloExhibicion"),
                    res.getInt("año"),
                    res.getByte("estado")
            );
        }
        catch(SQLException xxx){
            xxx.printStackTrace();
        }
        
        return pelicula;
    
    }
    
    public void closeAllConnections(){
    
        if(cs != null){
        
            try{
                cs.close();
            }
            catch(SQLException xxx){
                
                xxx.printStackTrace();
            }
        }
        
        if(rs != null){
        
            try{
                rs.close();
            }
            catch(SQLException xxx){
                
            
            }
        }
        
        this.closeConn();
        
    }

}
