package com.upiita.model;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Ian Rojas Gomez
 */
public class Pelicula {

    private String idPelicula;
    private String tituloOriginal; //matches 
    private String tituloExhibicion; //matches
    private int anio; //Merge Sort //Busqueda Binaria
    
    private List<Pais> paises;
    private List<Director> directores;
    
    private byte estado;

    public Pelicula() {

    }
    
    public Pelicula(String idPelicula, String tituloOriginal, String tituloExhibicion, int anio) {
        this.idPelicula = idPelicula;
        this.tituloOriginal = tituloOriginal;
        this.tituloExhibicion = tituloExhibicion;
        this.anio = anio;
    }

    public Pelicula(String idPelicula, String tituloOriginal, String tituloExhibicion, int anio, byte estado) {
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

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }
    
    public void addDirector(Director director){
        
        if(!this.directores.contains(director)){
            this.directores.add(director);
        }
    
    }
    
    public void removeDirector(Director director){
        if(directores.contains(director)){
            directores.remove(director);
        }
    }
    
     public void addPais(Pais pais){
        
        if(!this.paises.contains(pais)){
            this.paises.add(pais);
        }
    
    }
    
    public void removePais(Pais pais){
        if(paises.contains(pais)){
            paises.remove(pais);
        }
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
        if (this.anio != other.anio) {
            return false;
        }
        if (!Objects.equals(this.idPelicula, other.idPelicula)) {
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
