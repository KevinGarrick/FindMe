package com.neck.findme.entidad;

import android.content.Context;

/**
 * Created by Kevin on 25/08/2016.
 */
public class DumyEstablecimiento {
    String id;
    double coordX;
    double coordY;
    String direccion;
    String nombre;
    String telefono;
    String sDomicilio;
    int img;

    int estId;

    public int getEstId() {
        return estId;
    }

    public int getImg() {
        return img;
    }

    public String getsDomicilio() {
        return sDomicilio;
    }

    public String getDireccion() {
        return direccion;
    }

    public DumyEstablecimiento(String id, String nombre, String direccion, String telefono, String sDomicilio, double coordX, double coordY,int img,int estId) {
        this.id =id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sDomicilio = sDomicilio;
        this.coordX = coordX;
        this.coordY = coordY;
        this.img = img;
        this.estId = estId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
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
