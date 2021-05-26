package com.upiita.model;

import java.util.Objects;

/**
 *
 * @author Ian Rojas Gomez
 */
public class Pelicula {

    private int idPelicula;
    private String tituloOriginal;
    private String tituloExhibicion;
    private int anio;
    private byte estado;

    public Pelicula() {

    }

    public Pelicula(int idPelicula, String tituloOriginal, String tituloExhibicion, int anio, byte estado) {
        this.idPelicula = idPelicula;
        this.tituloOriginal = tituloOriginal;
        this.tituloExhibicion = tituloExhibicion;
        this.anio = anio;
        this.estado = estado;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOrigginal) {
        this.tituloOriginal = tituloOrigginal;
    }

    public String getTituloExhibicion() {
        return tituloExhibicion;
    }

    public void setTituloExhibicion(String exhibicion) {
        this.tituloExhibicion = exhibicion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Pelicula other = (Pelicula) obj;
        if (this.idPelicula != other.idPelicula) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.tituloOriginal, other.tituloOriginal)) {
            return false;
        }
        if (!Objects.equals(this.tituloExhibicion, other.tituloExhibicion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", tituloOriginal=" + tituloOriginal + ", tituloExhibicion=" + tituloExhibicion + ", anio=" + anio + ", estado=" + estado + '}';
    }
    
}
