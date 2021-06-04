package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Pelicula;
import java.util.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.PeliculaDAO;
import com.upiita.model.Director;
import com.upiita.model.Pais;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author iarog
 */
public class SQLPeliculaDAO extends Conexion implements PeliculaDAO {

    private static final String SQL_INSERT = "exec usp_AltaPelicula ?,?,?,?,?";
    private static final String SQL_DELETE = "exec usp_BajaPelicula ?,?";
    private static final String SQL_UPDATE = "exec usp_EditarPelicula ?,?,?,?,?,?,?,?";
    private static final String SQL_REACTIVE = "exec usp_ReactivarPelicula ?,?";
    private static String SQL_READALL = "select * from vReporte order by tituloOriginal";

    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;

    public SQLPeliculaDAO() {
        super();
    }
    
    @Override
    public boolean create(Pelicula o) {

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_INSERT);

            cs.setString(1, o.getTituloOriginal());
            cs.setString(3, o.getTituloExhibicion());
            cs.setInt(4, o.getAnio());
            cs.setString(5, o.getDirectores().get(0).getNombre());
            cs.setString(6, o.getPaises().get(0).getNombre());
            
            
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
    public boolean update(Pelicula o, String directorActual, String paisActual) {
        boolean state = false;

        try {
            cs = conn.prepareCall(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar
            cs.setString(1, o.getIdPelicula());
            cs.setString(2, o.getTituloOriginal());
            cs.setString(3, o.getTituloExhibicion());
            cs.setString(5, o.getDirectores().get(0).getNombre());
            cs.setString(6, o.getPaises().get(0).getNombre());
            cs.setString(7, directorActual);
            cs.setString(8, paisActual);

            if (cs.executeUpdate() > 0) {
                state = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections();
        }

        return state;

    }

    @Override
    public boolean reactive(String field) {
        return false;
    }

    @Override
    public boolean reactive(Pelicula p) {
        boolean state = false;
        
        try{
            cs = this.conn.prepareCall(SQL_REACTIVE);
            cs.setString(1, p.getTituloOriginal());
            cs.setInt(2, p.getAnio());
            
            if (cs.executeUpdate() > 0) {
                state = true;
            }
        }
        catch(SQLException xxx){
            xxx.printStackTrace();
        }
        finally{
            closeAllConnections();
        }
        
        return state;
    }

    @Override
    public boolean delete(Pelicula p) {
        boolean state = false;
        
        try{
            cs = this.conn.prepareCall(SQL_DELETE);
            cs.setString(1, p.getTituloOriginal());
            cs.setInt(2, p.getAnio());
            
            if (cs.executeUpdate() > 0) {
                state = true;
            }
        }
        catch(SQLException xxx){
            xxx.printStackTrace();
        }
        finally{
            closeAllConnections();
        }
        
        return state;
    }

    @Override
    public boolean update(String NombreActual, String NuevoNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String field) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Pelicula> readAll() {
        List<Pelicula> peliculas = new ArrayList<>();
        
        try {

            cs = conn.prepareCall(SQL_READALL);
            rs = cs.executeQuery();
            while (rs.next()) {
                
                Pelicula pelicula = parseResPelicula(rs);
                
                if(peliculas.contains(pelicula)){
                    
                    int i = peliculas.indexOf(pelicula);
                    Director director = parseResDirector(rs);
                    if(!peliculas.get(i).getDirectores().contains(director)){
                        peliculas.get(i).addDirector(parseResDirector(rs));
                    }
                    
                    Pais pais = parseResPais(rs);
                    
                    if(!peliculas.get(i).getPaises().contains(pais)){
                        peliculas.get(i).addPais(parseResPais(rs));
                    }
                    
                }
                else{
                    pelicula.addDirector(parseResDirector(rs));
                    pelicula.addPais(parseResPais(rs));
                    peliculas.add(pelicula);
                }
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return peliculas;
    }
    
//view peliculaTitulos
    /*
    public List<Pelicula> vPeliculaTitulos() {
        ResultSet res;
        List<Pelicula> pelicula = new ArrayList<>();
        SQL_READALL = "SELECT *FROM vPeliculaTitulos";
        try {
            //      ps= conn.prepareStatement(SQL_READALL);     //DUDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                pelicula.add(parse2viewResPelicula(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return pelicula;
    }
*/

    public Pelicula parseResPelicula(ResultSet res) {

        Pelicula pelicula = null;

        try {
            pelicula = new Pelicula(
                    res.getString("idPelicula"), //no necesita el id el usuario, dudaaaaa
                    res.getString("tituloOriginal"),
                    res.getString("tituloExhibicion"),
                    res.getInt("año"),
                    res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }
        
        return pelicula;

    }
    
    private Director parseResDirector(ResultSet res){
        Director director = null;
        
        try{
            director = new Director(res.getString("Director"));
        }
        catch(SQLException xxx){
            xxx.printStackTrace();
        }
        
        return director;
    
    }
    
    private Pais parseResPais(ResultSet res){
        Pais pais = null;
        
        try{
            pais = new Pais(res.getString("Pais"));
        }
        catch(SQLException xxx){
            xxx.printStackTrace();
        }
        
        return pais;
    }

    private void closeAllConnections() {

        if (cs != null) {

            try {
                cs.close();
            } catch (SQLException xxx) {

                xxx.printStackTrace();
            }
        }

        if (rs != null) {

            try {
                rs.close();
            } catch (SQLException xxx) {

            }
        }

        this.closeConn();

    }

}
