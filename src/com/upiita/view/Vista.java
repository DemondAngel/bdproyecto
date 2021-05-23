package com.upiita.view;

import com.upiita.dao.PeliculaDAO;
import com.upiita.dao.sql.SQLPeliculaDAO;
import com.upiita.model.Pelicula;


public class Vista {
    public static void main(String[] args){
        Pelicula pelicula = new Pelicula();
        
        PeliculaDAO peliculaDAO = new SQLPeliculaDAO();
        
        peliculaDAO.create(pelicula);
        
    }
}
