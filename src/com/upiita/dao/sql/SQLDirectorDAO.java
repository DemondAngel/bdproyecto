package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Director;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.DirectorDAO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ELA ALEINAD
 */
public class SQLDirectorDAO extends Conexion implements DirectorDAO {

    private static final String SQL_INSERT = "";
    private static final String SQL_DELETE = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_READ = "";
    private static  String SQL_READALL = "";

    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;

    public SQLDirectorDAO() {
        super();
    }

    public boolean usp_AltaDirector(String NombreDirector) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_AltaDirector '"+NombreDirector+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR ALTA (activación) DE DIRECTOR");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_BajaDirector(String NombreDirector) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_BajaDirector '"+NombreDirector+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR BAJA DE DIRECTOR");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_ReactivaDirector(String NombreDirector) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_ReactivaDirector '"+NombreDirector+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR ALTA (activación) DE DIRECTOR");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_EditarDirector(String NombreActual, String NuevoNombre) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_EditarDirector '"+NombreActual + "', '" +NuevoNombre+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL EDICIÓN DE DIRECTOR");

        }

        this.closeAllConnections();
        return state;
    }

//muestra vistadirectores    
    @Override
    public List<Director> readAll() {
        ResultSet res;
        List<Director> director = new ArrayList<>();
        
         SQL_READALL = "SELECT *FROM vDirector";
        try {
      //      ps= conn.prepareStatement(SQL_READALL);     //DUDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                director.add(parseResDirector(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return director;
    }

//muestra vistad nombres directores    

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

    @Override
    public Director readOne(Director o) {  //la entrada o es la llave
        Director director = null;

        try {
            cs = conn.prepareCall(SQL_READ);
            cs.setInt(1, o.getIdDirector());
            rs = cs.executeQuery();
            //se recorre detro de la base
            while (rs.next()) {
                director = parseResDirector(rs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }
        return director;

    }

    public Director parseResDirector(ResultSet res) {

        Director director = null;

        try {
            director = new Director(
                    res.getInt("idDirector"),
                    res.getString("nombre")
                  //  res.getByte("estado")
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
    
    
    @Override
    public boolean create(Director o) {

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_INSERT);
            cs.setInt(1, o.getIdDirector());
            cs.setString(2, o.getNombre());
            cs.setByte(3, o.getEstado());
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
    public boolean update(Director o) {
        boolean state = false;

        try {
            cs = conn.prepareCall(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar
            cs.setInt(1, o.getIdDirector());
            cs.setString(2, o.getNombre());
            cs.setByte(3, o.getEstado());
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
    public boolean delete(Integer id) {//SE LE DA LA LLAVE PARA BORRAR

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_DELETE);
            cs.setInt(1, id);
            if (cs.executeUpdate() > 0) {
                state = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return state;
    }
}
