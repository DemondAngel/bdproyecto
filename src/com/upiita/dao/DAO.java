package com.upiita.dao;

import java.util.List;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface DAO<Object> {
    
    public int create(Object o);
    public int update(Object o);
    public List<Object> read();
    public int delete(int id);
    
}
