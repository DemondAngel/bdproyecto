package com.upiita.dao;

import com.upiita.model.Pelicula;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface PeliculaDAO extends DAO<Pelicula> {
    public boolean update(Pelicula p, String directorActual, String PaisActual);
    public boolean reactive(Pelicula p);
    public boolean delete(Pelicula p);
}
