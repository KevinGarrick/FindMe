package com.neck.findme.entidad;

import java.sql.Date;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Promocion {
    int id;
    int establecimientoId;
    Date fechaInicio;
    Date fechaFin;
    String descripcion;

    public Promocion(int id, int establecimientoId, Date fechaInicio, Date fechaFin, String descripcion) {
        this.id = id;
        this.establecimientoId = establecimientoId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

}
