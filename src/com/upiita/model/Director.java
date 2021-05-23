package com.upiita.model;

/**
 *
 * @author ELA ALEINAD
 */
public class Director {

    private int ID_Director;
    private String Director;

    public Director() {
    }

    public Director(int ID_Director, String Director) {
        this.ID_Director = ID_Director;
        this.Director = Director;
    }

    public void setID_Director(int ID_Director) {
        this.ID_Director = ID_Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getID_Director() {
        return ID_Director;
    }

    public String getDirector() {
        return Director;
    }

    @Override
    public String toString() {
        return "Directores{" + "ID_Director=" + ID_Director + ", Director=" + Director + '}';
    }

}
