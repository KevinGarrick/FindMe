package com.neck.findme.entidad;

import java.sql.Date;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Pedido {
    int id;
    Date fecha;
    Date hora;
    double total;
    int establecimientoId;
    int personaId;

    public Pedido(int id, Date fecha, Date hora, double total, int establecimientoId, int personaId) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.establecimientoId = establecimientoId;
        this.personaId = personaId;
    }
}
