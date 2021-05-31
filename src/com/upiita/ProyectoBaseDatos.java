/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiita;

import com.upiita.dao.PaisDAO;
import com.upiita.dao.sql.SQLPaisDAO;
import com.upiita.model.Pais;
import com.upiita.model.Pelicula;

/**
 *
 * @author iarog
 */
public class ProyectoBaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pais pais = new Pais(0, "Madagascar", (byte) 1);
        
        PaisDAO paisdao = new SQLPaisDAO();
        paisdao.create(pais);
        
        System.out.println("Si furula :)");
        
    }
    
}
