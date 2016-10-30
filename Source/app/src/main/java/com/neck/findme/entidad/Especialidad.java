package com.neck.findme.entidad;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Especialidad {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGiroId() {
        return giroId;
    }

    public void setGiroId(int giroId) {
        this.giroId = giroId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    int giroId;
    String dsc;
    public Especialidad(){}
    public Especialidad(int id, int giroId, String dsc) {
        this.id = id;
        this.giroId = giroId;
        this.dsc = dsc;
    }
    @Override
    public String toString() {
        return "Esp{" +
                "ID='" + id + '\'' +
                ", descripcion='" + dsc + '\'' +
                ", giroId='" + giroId + '\'' +
                '}';
    }
}
