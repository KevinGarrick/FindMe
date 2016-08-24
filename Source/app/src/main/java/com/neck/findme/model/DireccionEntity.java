package com.neck.findme.model;

/**
 * Created by Kevin on 23/08/2016.
 */
public class DireccionEntity {
    int id;
    int estadoId;
    int municipioId;
    String colonia;
    String calle;
    String noExt;
    String noInt;
    String lote;
    String mz;
    String cp;

    DireccionEntity(int id, int estadoId, int municipioId, String colonia, String calle, String noExt, String noInt,
                    String lote, String mz, String cp){
        this.id=id;
        this.estadoId =estadoId;
        this.municipioId =municipioId;
        this.colonia=colonia;
        this.calle=calle;
        this.noExt =noExt;
        this.noInt =noInt;
        this.lote=lote;
        this.mz=mz;
        this.cp=cp;
    }

}
