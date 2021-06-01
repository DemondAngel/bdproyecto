package com.upiita.dao;

import com.upiita.model.Director;

/**
 *
 * @author ELA ALEINAD
 */
public interface DirectorDAO extends DAO<Director> {
     public boolean reactive(String NombreDirector);
     public boolean update(String NombreActual, String NuevoNombre);
     public boolean delete(String NombreDirector);
}
