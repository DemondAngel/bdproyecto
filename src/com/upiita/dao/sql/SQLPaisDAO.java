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

    private static final String SQL_INSERT = "exec usp_AltaPais ?"; //un solo ? por el parametro de entrada
    private static final String SQL_DELETE = "exec usp_BajaPais ?";
    private static final String SQL_UPDATE = "exec usp_EditarPais ?, ?";
    private static final String SQL_REACTIVE = "exec usp_ReactivarPais ?";
    private static final String SQL_READ = "";
    private static  String SQL_READALL = "SELECT *FROM vPais";

    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;

    public SQLPaisDAO() {
        super();
    } 
    
    //ccreat es para dar de alta
    @Override
    public boolean create(Pais o) {

        boolean state = false;

        try {
//la varible SQL_INSERT se declaro como tipo final global
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
    //ejecuta el USP_EDITAR DE PAIS
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
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections();
        }

        return state;
    }
     @Override
    public boolean delete(String NombrePais) {
        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_DELETE);
            cs.setString(1, NombrePais);
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
    public boolean reactive(String NombrePais) {

        boolean state = false;

        try {

            cs = conn.prepareCall(SQL_REACTIVE);
            cs.setString(1, NombrePais);

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

    //crea la vidat de pais con id
    @Override
    public List<Pais> readAll() {
        ResultSet res;
        List<Pais> pais = new ArrayList<>();
        try {
 //      ps= conn.prepareStatement(SQL_READALL);     //DUDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
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
    
    //vista de los nombres de paises
    public List<Pais> vPaisNombre() {
        ResultSet res;
        List<Pais> pais = new ArrayList<>();
         SQL_READALL = "SELECT *FROM vPaisNombre";
        try {
 //      ps= conn.prepareStatement(SQL_READALL);     //DUDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            cs = conn.prepareCall(SQL_READALL);
            //como no se busca algo ene specifico (n hay un signo "?", se va direcyo al resulset )
            res = cs.executeQuery();
            //se recorre detro de la base
            while (res.next()) {
                //LLENA LA LISTA
                pais.add(parse2viewResPais(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLPaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeAllConnections(); //CIERRA CONEXION 
        }

        return pais;

    }

    public Pais parseResPais(ResultSet res) {

        Pais pais = null;

        try {
            pais = new Pais(
                    res.getInt("idPais"),
                    res.getString("nombre")
                 //   res.getByte("estado")
            );
        } catch (SQLException xxx) {
            xxx.printStackTrace();
        }

        return pais;

    }
    public Pais parse2viewResPais(ResultSet res) {

        Pais pais = null;

        try {
            pais = new Pais(
                    res.getString("nombre")
                 //   res.getByte("estado")
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
