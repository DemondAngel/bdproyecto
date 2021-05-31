package com.upiita.model;

/**
 *
 * @author ELA ALEINAD
 */
public class Director {

    private int idDirector;
    private String nombre;
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
    public String toString() {
        return "Director{" + "idDirector=" + idDirector + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

}
