package com.upiita.dao;

import java.util.List;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface DAO<Object> { //obliga a que sea crud

    public boolean create(Object o);

    public boolean update(Object o);

    public List<Object> readAll();

    public boolean delete(Integer id);
    
    public boolean reactive(String field);

    public Object readOne(Object o);
}
