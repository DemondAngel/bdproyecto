package com.upiita.dao;

import com.upiita.model.Pelicula;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface PeliculaDAO extends DAO<Pelicula> {
    public boolean update(Pelicula p);
    public boolean reactive(Pelicula p);
    public boolean delete(Pelicula p);
}
