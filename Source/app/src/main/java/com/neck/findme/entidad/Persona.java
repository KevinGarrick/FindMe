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

    public Persona(int id, int direccionId, int usuarioId, String nombre, String pApellido, String sApellido) {
        this.id = id;
        this.direccionId = direccionId;
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
    }
}
