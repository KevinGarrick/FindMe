package com.neck.findme.model;

/**
 * Created by Kevin on 23/08/2016.
 */
public class EstadoMunicipioEntity {
    int id;
    String dsc;
    int parentId;
    public EstadoMunicipioEntity(int id, String dsc, int parentId){
        this.id=id;
        this.dsc=dsc;
        this.parentId=parentId;
    }
}
