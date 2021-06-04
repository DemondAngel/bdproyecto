package com.upiita.model;

import java.util.Objects;

/**
 *
 * @author ELA ALEINAD
 */
public class Director {

    private int idDirector;
    private String nombre; //matches
    private byte estado;

    public Director() {
    }

    public Director(int idDirector, String nombre, byte estado) {
        this.idDirector = idDirector;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public Director(int idDirector, String nombre) {
        this.idDirector = idDirector;
        this.nombre = nombre;

    }
    public Director(String nombre) {
      
        this.nombre = nombre;

    }
    public int getIdDirector() {
        return idDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEstado() {
        return estado;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Director other = (Director) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Director{" + "idDirector=" + idDirector + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

}
