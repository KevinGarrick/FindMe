package com.neck.findme.entidad;

/**
 * Created by Kevin on 25/08/2016.
 */
public class ProductoServicio {
    int id;
    int tipoProductoId;
    int establecimientoId;
    String productoServicio;
    String descripcion;
    double precio;

    public ProductoServicio(int id, int tipoProductoId, int establecimientoId, String descripcion,
                            String productoServicio, double precio) {
        this.id = id;
        this.tipoProductoId = tipoProductoId;
        this.establecimientoId = establecimientoId;
        this.productoServicio = productoServicio;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
