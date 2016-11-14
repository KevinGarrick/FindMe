package com.neck.findme.entidad;

import android.content.Context;

/**
 * Created by Kevin on 23/08/2016.
 */
public class Direccion {


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
    EstadoMunicipio estado;
    EstadoMunicipio municipio;

    public int getId() {
        return id;
    }
    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoExt() {
        return noExt;
    }

    public void setNoExt(String noExt) {
        this.noExt = noExt;
    }

    public String getNoInt() {
        return noInt;
    }

    public void setNoInt(String noInt) {
        this.noInt = noInt;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public EstadoMunicipio getEstado() {
        return estado;
    }

    public void setEstado(EstadoMunicipio estado) {
        this.estado = estado;
    }

    public EstadoMunicipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(EstadoMunicipio municipio) {
        this.municipio = municipio;
    }

    public Direccion(Context contexto, int id, int estadoId, int municipioId, String colonia, String calle, String noExt, String noInt,
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
        this.estado = setLocalidad(contexto,this.estadoId);
        this.municipio = setLocalidad(contexto,this.municipioId);

    }

    private EstadoMunicipio setLocalidad(Context contexto,int id){
        com.neck.findme.modelo.EstadoMunicipio mLocalidad = new com.neck.findme.modelo.EstadoMunicipio();
        return mLocalidad.getLocalidadById(contexto,id);
    }

}
