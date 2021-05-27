  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita.view;

import com.upiita.dao.sql.SQLPeliculaDAO;
import com.upiita.model.Pelicula;
import com.upiita.dao.PeliculaDAO;

/**
 *
 * @author iarog
 */
public class Vista {
    public static void main(String[] args){
        
        Pelicula pelicula = new Pelicula();
        
        PeliculaDAO peliculaDAO = new SQLPeliculaDAO();
        
        peliculaDAO.create(pelicula);
                
    }
}
