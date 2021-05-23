package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Pais;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.PaisDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ELA ALEINAD
 */
public class SQLPaisDAO implements PaisDAO {

    private static final String SQL_INSERT = "INSERT INTO Pais (idPais, nombre) VALUES(?,?)";
    private static final String SQL_DELETE = "DELETE FROM Pais WHERE idPais= ?";
    private static final String SQL_UPDATE = "UPDATE Pais SET idPais= ?, nombre= ?,";
    private static final String SQL_READ = "SELECT *FROM Pais WHERE idPais= ?";
    private static final String SQL_READALL = "SELECT *FROM Pais";

    private static final Conexion conexionn = Conexion.saberEstado();  //aplicando SINGETON, solo hay una instancia, que se crea o accede mediante el estado

    @Override
    public boolean create(Pais o) {
        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_INSERT);
            ps.setInt(1, o.getID_Pais());
            ps.setString(2, o.getPais());
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
    public boolean update(Pais o) {
        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar
            ps.setInt(1, o.getID_Pais());
            ps.setString(2, o.getPais());
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
    public List<Pais> readAll() {
        PreparedStatement ps;
        ResultSet res;
        List<Pais> paises = new ArrayList();
        try {
            ps = conexionn.getConexionn().prepareStatement(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = ps.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                paises.add(new Pais(res.getInt(1), res.getString(2)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }
        return paises;

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
    public Pais readOne(Pais o) {
        PreparedStatement ps;
        ResultSet res;
        Pais p = null;
        try {
            ps = conexionn.getConexionn().prepareStatement(SQL_READ);
            ps.setInt(1, o.getID_Pais());
            res = ps.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                p = new Pais(res.getInt(1), res.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }
        return p;
    }
}
