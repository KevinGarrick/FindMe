package com.neck.findme.entidad;

/**
 * Created by Kevin on 25/08/2016.
 */
public class CalificacionEstablecimiento {
    int establecimientoId;
    int usuarioId;
    int calificacion;
    String observaciones;

    public CalificacionEstablecimiento(int establecimientoId, int usuarioId, int calificacion, String observaciones) {
        this.establecimientoId = establecimientoId;
        this.usuarioId = usuarioId;
        this.calificacion = calificacion;
        this.observaciones = observaciones;
    }
}
