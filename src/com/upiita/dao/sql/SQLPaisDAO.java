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
    private static  String SQL_READALL = "";

    private PreparedStatement ps;
    private CallableStatement cs;
    private ResultSet rs;

    public SQLPaisDAO() {
        super();
    }

    public boolean usp_AltaPais(String NombrePais) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_AltaPais '"+NombrePais+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR ALTA (activación) DE PAIS");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_BajaPais(String NombrePais) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_BajaPais '"+NombrePais +"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR BAJA DE PAIS");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_ReactivaPais(String NombrePais) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_ReactivaPais '"+NombrePais+"'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL REALIZAR ALTA (activación) DE PAIS");

        }

        this.closeAllConnections();
        return state;
    }

    public boolean usp_EditarPais(String NombreActual, String NuevoNombre) {

        boolean state = false;

        boolean x = ejecutaStoredProcedure("usp_EditarPais '" + NombreActual + "', '" + NuevoNombre + "'");
        if (x == true) {
            state = true;
        } else {

            state = false;
            System.out.println("FALLO AL EDICIÓN DE PAIS");

        }

        this.closeAllConnections();
        return state;
    }

    //crea la vidat de pais con id
    @Override
    public List<Pais> readAll() {
        ResultSet res;
        List<Pais> pais = new ArrayList<>();
         SQL_READALL = "SELECT *FROM vPais";
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

    @Override
    public Pais readOne(Pais o) {
        Pais pais = null;

        try {
            cs = conn.prepareCall(SQL_READ);
            cs.setInt(1, o.getIdPais());
            rs = cs.executeQuery();
            //se recorre detro de la base
            while (rs.next()) {
                pais = parseResPais(rs);
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

}
