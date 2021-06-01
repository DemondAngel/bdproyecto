package com.upiita.dao;

import com.upiita.model.Pais;

/**
 *
 * @author ELA ALEINAD
 */
public interface PaisDAO extends DAO<Pais> {
     public boolean reactive(String NombrePais);
     public boolean update(String NombreActual, String NuevoNombre);
     public boolean delete(String NombrePais);
}
