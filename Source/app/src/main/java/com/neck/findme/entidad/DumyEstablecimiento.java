package com.neck.findme.entidad;

import android.content.Context;

/**
 * Created by Kevin on 25/08/2016.
 */
public class DumyEstablecimiento {
    String id;
    int usuarioId;
    int direccionId;
    int giroId;
    int especialidadId;
    double coordX;
    double coordY;
    int servicioDomicilio;
    String direccion;
    String nombre;
    String telefono;
    String sDomicilio;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getsDomicilio() {
        return sDomicilio;
    }

    public void setsDomicilio(String sDomicilio) {
        this.sDomicilio = sDomicilio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    int img;
    public DumyEstablecimiento(String id, String nombre, String direccion, String telefono, String sDomicilio, double coordX, double coordY,int img) {
        this.id =id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sDomicilio = sDomicilio;
        this.coordX = coordX;
        this.coordY = coordY;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
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

    @Override
    public String toString() {
        return "establecimiento{" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Telefono='" + telefono + '\'' +
                ", ServivcioDomicilio='" + sDomicilio + '\'' +
                ", cX='" + coordX + '\'' +
                ", cY='" + coordY + '\'' +
                '}';
    }
}
