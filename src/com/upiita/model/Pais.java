package com.upiita.model;

import java.util.Objects;

/**
 *
 * @author ELA ALEINAD
 */
public class Pais {

    private int idPais;
    private String nombre; //matches
    private byte estado;

    public Pais() {
    }

    public Pais(int idPais, String nombre, byte estado) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.estado = estado;
    }
 public Pais(int idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
   
    }
  public Pais( String nombre) {

        this.nombre = nombre;
   
    }
    public int getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEstado() {
        return estado;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "idPais=" + idPais + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
}
