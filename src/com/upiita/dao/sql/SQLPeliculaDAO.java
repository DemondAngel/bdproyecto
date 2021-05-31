package com.upiita.dao.sql;

import com.upiita.Conexion.Conexion;
import com.upiita.model.Pelicula;
import java.util.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.upiita.dao.PeliculaDAO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
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
    private static  String SQL_READALL = "";   
    
    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;

    public SQLPeliculaDAO() {
        super();
    }

    public boolean usp_AltaPelicula(String TituloO, String TituloE, int anio, String Director, String Pais) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_AltaPelicula '" +TituloO
                +"' , '"+TituloE +"' , '"+anio
                +"' , '" +Director+"' , '"+Pais+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR ALTA (activación) DE PELICULA");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_BajaPelicula(String TituloO, int anio) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_BajaPelicula '"+TituloO+"' , '"+anio+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR BAJA DE PELICULA");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_ReactivaPelicula(String TituloO, int anio) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_ReactivaDirector '"+TituloO +"' , '"+anio +"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR ALTA (reactivación) DE PELICULA");

        }

        this.closeAllConnections();
        return state;
    }
        public boolean usp_EditarPelicula(String IdPelicula, String TituloO, String TituloE, int anio, String Director, String Pais) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_EditarPelicula '" +IdPelicula
                +"' , '"+TituloO
                +"' , '"+TituloE +"' , '"+anio
                +"' , '" +Director+"' , '"+Pais+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR EDICIÓN (cambio de datos en algunos parámetros) DE PELICULA");

        }

        this.closeAllConnections();
        return state;
    }
  
        @Override
        
        //muestra tabla pelicula con id
      public List<Pelicula> readAll() {
        ResultSet res;
        List<Pelicula> pelicula = new ArrayList<>();
        SQL_READALL = "SELECT *FROM Pelicula";
        try {
           
     //      ps= conn.prepareStatement(SQL_READALL);     //DUDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                pelicula.add(parseResPelicula(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return pelicula;
    }
//view peliculaTitulos
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

    @Override
    public Pelicula readOne(Pelicula o) {
        Pelicula pelicula = null;

        try {
            cs = conn.prepareCall(SQL_READ);
            cs.setString(1, o.getIdPelicula());
            rs = cs.executeQuery();
            //se recorre detro de la base
            while (rs.next()) {
                pelicula = parseResPelicula(rs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }
        return pelicula;

    }

    public Pelicula parseResPelicula(ResultSet res) {

        Pelicula pelicula = null;

        try {
            pelicula = new Pelicula(
                   res.getString("idPelicula"),   //no necesita el id el usuario, dudaaaaa
                    res.getString("tituloOriginal"),
                    res.getString("tituloExhibicion"),
                    res.getInt("año")
                  //  res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return pelicula;

    }
    
    public Pelicula parse2viewResPelicula(ResultSet res) {

        Pelicula pelicula = null;

        try {
            pelicula = new Pelicula(
                    res.getString("tituloOriginal"),
                    res.getString("tituloExhibicion")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return pelicula;

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
    public boolean create(Pelicula o) {

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_INSERT);

            cs.setString(1, o.getIdPelicula());
            cs.setString(2, o.getTituloOriginal());
            cs.setString(3, o.getTituloExhibicion());
            cs.setInt(4, o.getAnio());
            cs.setByte(5, o.getEstado());
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
            cs.setString(1, o.getIdPelicula());
            cs.setString(2, o.getTituloOriginal());
            cs.setString(3, o.getTituloExhibicion());
            cs.setInt(4, o.getAnio());
            cs.setByte(5, o.getEstado());

            if (cs.executeUpdate() > 0) {
                state = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections();
        }

        return false;

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
            Logger.getLogger(SQLPeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return state;
    }
}
