package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Pais;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.PaisDAO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ELA ALEINAD
 */
public class SQLPaisDAO extends Conexion implements PaisDAO {

    private static final String SQL_INSERT = "";
    private static final String SQL_DELETE = "";
    private static final String SQL_UPDATE = "";
    private static final String SQL_READ = "";
    private static final String SQL_READALL = "";

    private CallableStatement cs;
    private ResultSet rs;

    public SQLPaisDAO() {
        super();
    }

    @Override
    public boolean create(Pais o) {

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_INSERT);

            cs.setInt(1, o.getIdPais());
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
    public boolean update(Pais o) {
        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar

            cs.setInt(1, o.getIdPais());
            cs.setString(2, o.getNombre());
            cs.setByte(3, o.getEstado());
            if (cs.executeUpdate() > 0) {
                state = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections();
        }

        return state;

    }

    @Override
    public List<Pais> readAll() {
        ResultSet res;
        List<Pais> pais = new ArrayList<>();

        try {
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                pais.add(parseResPais(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return pais;

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
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return state;
    }

    @Override
    public Pais readOne(Pais o) {
        Pais pais = null;

        try {
            cs = conn.prepareCall(SQL_READ);
            cs.setInt(1, o.getIdPais());
            rs = cs.executeQuery();
            //se recorre detro de la base
            while (rs.next()) {
                pais = parseResPelicula(rs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }
        return pais;

    }

    public Pais parseResPelicula(ResultSet res) {

        Pais pais = null;

        try {
            pais = new Pais(
                    res.getInt("idPais"),
                    res.getString("nombre"),
                    res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return pais;

    }

    public Pais parseResPais(ResultSet res) {

        Pais pais = null;

        try {
            pais = new Pais(
                    res.getInt("idPais"),
                    res.getString("nombre"),
                    res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return pais;

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
