package com.upiita.dao;

import java.util.List;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface DAO<Object> { //obliga a que sea crud

    public boolean create(Object o);
    
    public boolean update(String NombreActual, String NuevoNombre);
    
    public boolean delete(String field);
    
    public boolean reactive(String field);
    
    public List<Object> readAll();
}
