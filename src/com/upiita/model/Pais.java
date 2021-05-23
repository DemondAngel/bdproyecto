package com.upiita.model;

/**
 *
 * @author ELA ALEINAD
 */
public class Pais {

    private int ID_Pais;
    private String Pais;

    public Pais() {
    }

    public Pais(int ID_Pais, String Pais) {
        this.ID_Pais = ID_Pais;
        this.Pais = Pais;
    }

    public void setID_Pais(int ID_Pais) {
        this.ID_Pais = ID_Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getID_Pais() {
        return ID_Pais;
    }

    public String getPais() {
        return Pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "ID_Pais=" + ID_Pais + ", Pais=" + Pais + '}';
    }

}
