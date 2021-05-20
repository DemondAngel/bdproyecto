
package com.upiita.model;

import java.util.Objects;

/**
 *
 * @author Ian Rojas Gomez
 */
public class Pelicula {
    
    private int noExpedicion;
    private String tituloOriginal;
    private String tituloExhibicion;
    private int anio;
    
    public Pelicula() {
        
    }

    public Pelicula(int noExpedicion, String tituloOriginal, String exhibicion, int anio) {
        this.noExpedicion = noExpedicion;
        this.tituloOriginal = tituloOriginal;
        this.tituloExhibicion = exhibicion;
        this.anio = anio;
    }

    public int getNoExpedicion() {
        return noExpedicion;
    }

    public void setNoExpedicion(int noExpedicion) {
        this.noExpedicion = noExpedicion;
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
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.noExpedicion;
        hash = 47 * hash + Objects.hashCode(this.tituloOriginal);
        hash = 47 * hash + Objects.hashCode(this.tituloExhibicion);
        hash = 47 * hash + this.anio;
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
        if (this.noExpedicion != other.noExpedicion) {
            return false;
        }
        if (this.anio != other.anio) {
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
        return "Pelicula{" + "noExpedicion=" + noExpedicion + ", tituloOriginal=" + tituloOriginal + ", exhibicion=" + tituloExhibicion + ", anio=" + anio + '}';
    }
    
}
