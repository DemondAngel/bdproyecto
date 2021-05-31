package com.upiita.model;

/**
 *
 * @author ELA ALEINAD
 */
public class Pais {

    private int idPais;
    private String nombre;
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

}
