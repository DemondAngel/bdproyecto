package com.upiita.dao;

import java.util.List;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface DAO<Object> { //obluga a que sea crude

    public boolean create(Object o);

    public boolean update(Object o);

    public List<Object> readAll();

    public boolean delete(Integer id);

    public Object readOne(Object o);
}
