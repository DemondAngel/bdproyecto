package com.upiita.dao;

import com.upiita.model.Pelicula;

/**
 *
 * @author Ian Rojas Gomez
 */
public interface PeliculaDAO extends DAO<Pelicula> {
    public boolean reactive(String tituloOriginal, int anio);
}
