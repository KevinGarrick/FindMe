package com.neck.findme.entidad;

/**
 * Created by Kevin on 23/08/2016.
 */
public class EstadoMunicipio {
    public int getId() {
        return id;
    }

    int id;
    String dsc;
    int parentId;

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public EstadoMunicipio(int id, String dsc, int parentId) {
        this.id = id;
        this.dsc = dsc;
        this.parentId = parentId;
    }
}
