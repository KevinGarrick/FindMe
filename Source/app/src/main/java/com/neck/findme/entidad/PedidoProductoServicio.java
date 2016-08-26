package com.neck.findme.entidad;

/**
 * Created by Kevin on 25/08/2016.
 */
public class PedidoProductoServicio {
    int pedidoId;
    int productoServicioId;
    int cantidad;

    public PedidoProductoServicio(int pedidoId, int productoServicioId, int cantidad) {
        this.pedidoId = pedidoId;
        this.productoServicioId = productoServicioId;
        this.cantidad = cantidad;
    }
}
