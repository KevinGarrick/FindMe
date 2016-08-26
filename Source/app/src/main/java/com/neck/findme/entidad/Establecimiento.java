package com.neck.findme.entidad;

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
}
