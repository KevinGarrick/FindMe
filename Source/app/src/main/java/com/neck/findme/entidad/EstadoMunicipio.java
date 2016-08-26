package com.neck.findme.entidad;

/**
 * Created by Kevin on 23/08/2016.
 */
public class EstadoMunicipio {
    int id;
    String dsc;
    int parentId;
    public EstadoMunicipio(int id, String dsc, int parentId){
        this.id=id;
        this.dsc=dsc;
        this.parentId=parentId;
    }
}
