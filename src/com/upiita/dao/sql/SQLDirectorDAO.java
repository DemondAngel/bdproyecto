package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Director;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.DirectorDAO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ELA ALEINAD
 */
public class SQLDirectorDAO extends Conexion implements DirectorDAO {

    private static final String SQL_INSERT = "exec usp_AltaDirector ?";
    private static final String SQL_DELETE = " exec usp_BajaDirector ?";
    private static final String SQL_UPDATE = "exec usp_EditarDirector ?, ?";
    private static final String SQL_REACTIVE = "exec usp_ReactivarDirector ?";
    private static final String SQL_READ = "";
    private static  String SQL_READALL = "";

    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;

    public SQLDirectorDAO() {
        super();
    }
//ejecuta el usp_altadirector
    @Override
    public boolean create(Director o) {

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_INSERT);
      
            cs.setString(1, o.getNombre());
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
    public boolean update(String NombreActual, String NuevoNombre) {
        boolean state = false;

        try {
            cs = conn.prepareCall(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar

            cs.setString(1, NombreActual);
            cs.setString(2, NuevoNombre);
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
    public boolean delete(String NombreDirector) {//SE LE DA LA LLAVE PARA BORRAR

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_DELETE);
            cs.setString(1, NombreDirector);
            if (cs.executeUpdate() > 0) {
                state = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //this.closeAllConnections(); //CIERRA CONEXION 
        }

        return state;
    }

 @Override
    public boolean reactive(String NombreDirector) {
               boolean state = false;

        try {

            cs = conn.prepareCall(SQL_REACTIVE);
      
            cs.setString(1,NombreDirector);
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
   
    
//muestra vistadirectores    
    @Override
    public List<Director> readAll() {
        List<Director> director = new ArrayList<>();
        
         SQL_READALL = "SELECT *FROM vDirector ORDER BY nombre";
        try {
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            rs = cs.executeQuery();
            //se recorre detro de la base
            while (rs.next()) {
                //LLENA LA LISTA
                director.add(parseResDirector(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //this.closeAllConnections(); //CIERRA CONEXION 
        }

        return director;
    }

//muestra vistad nombres directores    
/*
    public List<Director> vDirectorNombre() {
        ResultSet res;
        List<Director> director = new ArrayList<>();
         SQL_READALL = "SELECT *FROM vDirectorNombre";
        try {
    //      ps= conn.prepareStatement(SQL_READALL);     //DUDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                director.add(parse2viewResDirector(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return director;
    }
    */

    public Director parseResDirector(ResultSet res) {

        Director director = null;
        
        try {
            director = new Director(
                    res.getInt("idDirector"),
                    res.getString("nombre"),
                    res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return director;

    }
    public Director parse2viewResDirector(ResultSet res) {

        Director director = null;

        try {
            director = new Director(
       
                    res.getString("nombre")
                  //  res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return director;

    }
    public void closeAllConnections() {

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
