package com.neck.findme.entidad;

/**
 * Created by Kevin on 23/08/2016.
 */
public class Persona {
    int id;
    int direccionId;
    int usuarioId;
    String nombre;
    String pApellido;
    String sApellido;
    public int getId(){
        return id;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
    public Persona(int id, int direccionId, int usuarioId, String nombre, String pApellido, String sApellido) {
        this.id = id;
        this.direccionId = direccionId;
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
    }
    public Persona(){}
}
