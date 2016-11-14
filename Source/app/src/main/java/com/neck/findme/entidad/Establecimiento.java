package com.neck.findme.entidad;

import android.content.Context;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Establecimiento {
    int id;
    int usuarioId;
    int direccionId;
    int giroId;
    int especialidadId;
    int coordX;
    int coordY;
    int servicioDomicilio;
    String nombre;
    String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public int getGiroId() {
        return giroId;
    }

    public void setGiroId(int giroId) {
        this.giroId = giroId;
    }

    public int getEspecialidadId() {
        return especialidadId;
    }

    public void setEspecialidadId(int especialidadId) {
        this.especialidadId = especialidadId;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getServicioDomicilio() {
        return servicioDomicilio;
    }

    public void setServicioDomicilio(int servicioDomicilio) {
        this.servicioDomicilio = servicioDomicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Establecimiento(int id, int usuarioId, int direccionId, int giroId, int especialidadId,
                           int coordX, int coordY, int servicioDomicilio, String nombre, String telefono) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.direccionId = direccionId;
        this.giroId = giroId;
        this.especialidadId = especialidadId;
        this.coordX = coordX;
        this.coordY = coordY;

        this.servicioDomicilio = servicioDomicilio;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getStringDirection(Context contexto){
        com.neck.findme.modelo.Direccion mDireccion = new com.neck.findme.modelo.Direccion();
        Direccion direccion = mDireccion.getDireccionById(contexto, this.id);
        String string = direccion.getCalle();
        string += direccion.getNoExt() != null ? " " + direccion.getNoExt() : " N/A";
        return string;
    }
}
