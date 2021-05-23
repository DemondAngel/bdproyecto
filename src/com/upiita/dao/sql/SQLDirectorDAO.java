package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Director;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.DirectorDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ELA ALEINAD
 */
public class SQLDirectorDAO implements DirectorDAO {

    private static final String SQL_INSERT = "INSERT INTO Director (idDirector, nombre) VALUES(?,?)";
    private static final String SQL_DELETE = "DELETE FROM Director WHERE idDirector= ?";
    private static final String SQL_UPDATE = "UPDATE Director SET idDirector= ?, nombre= ?,";
    private static final String SQL_READ = "SELECT *FROM Director WHERE idDirector= ?";
    private static final String SQL_READALL = "SELECT *FROM Director";

    private static final Conexion conexionn = Conexion.saberEstado();  //aplicando SINGETON, solo hay una instancia, que se crea o accede mediante el estado

    @Override
    public boolean create(Director o) {
        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_INSERT);
            ps.setInt(1, o.getID_Director());
            ps.setString(2, o.getDirector());
            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion();

        }

        return false;
    }

    @Override
    public boolean update(Director o) {
        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar
            ps.setInt(1, o.getID_Director());
            ps.setString(2, o.getDirector());
            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion();

        }

        return false;
    }

    @Override
    public List<Director> readAll() {

        PreparedStatement ps;
        ResultSet res;
        List<Director> directores = new ArrayList();
        try {
            ps = conexionn.getConexionn().prepareStatement(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = ps.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                directores.add(new Director(res.getInt(1), res.getString(2)));
                //,res.getString(3), res.getInt(4) 
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }
        return directores;
    }

    @Override
    public boolean delete(Integer id) {

        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }

        return false;

    }

    @Override
    public Director readOne(Director o) {  //la entrada o es la llave
        PreparedStatement ps;
        ResultSet res;
        Director dir = null;
        try {
            ps = conexionn.getConexionn().prepareStatement(SQL_READ);
            ps.setInt(1, o.getID_Director());
            res = ps.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                dir = new Director(res.getInt(1), res.getString(2));
                //,res.getString(3), res.getInt(4) 
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }
        return dir;

    }

}
