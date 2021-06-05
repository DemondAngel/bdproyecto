/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita;

import com.upiita.dao.PeliculaDAO;
import com.upiita.dao.sql.SQLPeliculaDAO;

/**
 *
 * @author iarog
 */
public class ProyectoBaseDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       // String palabra = "Hola";
        
       // System.out.println(palabra.matches(".*Holaa.*"));
        
        //PeliculaDAO peliculaDAO = new SQLPeliculaDAO();
        //peliculaDAO.readAll();
        
       PeliculaDAO peliculaDAO = new SQLPeliculaDAO();
       peliculaDAO.readAll();
        
    }
    
}
