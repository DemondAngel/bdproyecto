package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Pelicula;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.PeliculaDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author iarog
 */
public class SQLPeliculaDAO implements PeliculaDAO {

    private static final String SQL_INSERT = "INSERT INTO Pelicula (idPelicula, TituloOriginal, TituloExhibicion, Anio) VALUES(?,?,?, ?)";
    private static final String SQL_DELETE = "DELETE FROM Pelicula WHERE idPelicula= ?";
    private static final String SQL_UPDATE = "UPDATE Pelicula SET idPelicula= ?,TituloOriginal= ? , TituloExhibicion= ?, Anio= ?";
    private static final String SQL_READ = "SELECT *FROM Pelicula WHERE idPais= ?";
    private static final String SQL_READALL = "SELECT *FROM Pelicula";

    private static final Conexion conexionn = Conexion.saberEstado();  //aplicando SINGETON, solo hay una instancia, que se crea o accede mediante el estado

    @Override
    public boolean create(Pelicula o) {
        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_INSERT);
            ps.setInt(1, o.getNoExpedicion());
            ps.setString(2, o.getTituloOriginal());
            ps.setString(3, o.getTituloExhibicion());
            ps.setInt(4, o.getAnio());
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
    public boolean update(Pelicula o) {
        PreparedStatement ps;

        try {

            ps = conexionn.getConexionn().prepareStatement(SQL_UPDATE); //nos fijamos en los signos de interrogacion de arriba, para actualizar
            ps.setInt(1, o.getNoExpedicion());
            ps.setString(2, o.getTituloOriginal());
            ps.setString(3, o.getTituloExhibicion());
            ps.setInt(4, o.getAnio());

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
    public List<Pelicula> readAll() {
        PreparedStatement ps;
        ResultSet res;
        List<Pelicula> peliculas = new ArrayList();
        try {
            ps = conexionn.getConexionn().prepareStatement(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = ps.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                peliculas.add(new Pelicula(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }
        return peliculas;
    }

    @Override
    public boolean delete(Integer id) { //SE LE DA LA LLAVE PARA BORRAR
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
    public Pelicula readOne(Pelicula o) {
        PreparedStatement ps;
        ResultSet res;
        Pelicula pe = null;
        try {
            ps = conexionn.getConexionn().prepareStatement(SQL_READ);
            ps.setInt(1, o.getNoExpedicion());
            res = ps.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                pe = new Pelicula(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLDirectorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionn.crerrarConexion(); //CIERRA CONEXION 
        }
        return pe;

    }

}
