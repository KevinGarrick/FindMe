package com.neck.findme.sqlite;

/**
 * Created by Kevin on 20/08/2016.
 */
public class DbStructure {

    interface ColumnasCalificacionEstablecimiento {
        String CALIFICACION = "calificacion";
        String ESTABLECIMIENTO_ID = "establecimiento_id";
        String USUARIO_ID = "usuario_id";
        String OBSERVACIONES = "observaciones";
    }

    interface ColumnasUsuario {
        String ID = "id";
        String EMAIL = "email";
        String CONTRASENIA = "contrasenia";
        String SAL = "sal";
    }

    interface ColumnasPersona {
        String ID = "id";
        String NOMBE = "nombre";
        String P_APELLIDO = "p_apellido";
        String S_APELLIDO = "s_apellido";
        String DIRECCION_ID = "direccion_id";
        String USUARIO_ID = "usuario_id";
    }

    interface ColumnasEstablecimiento {
        String ID = "id";
        String NOMBRE = "nombre";
        String TELEFONO = "telefono";
        String COORD_X = "coord_x";
        String COORD_Y = "coord_y";
        String SERVICIO_DOMICILIO = "servicio_domicilio";
        String USUARIO_ID = "usuario_id";
        String DIRECCION_ID = "direccion_id";
        String GIRO_ID = "giro_id";
        String ESPECIALIDAD_ID = "especialidad_id";
    }

    interface ColumnasDireccion {
        String ID = "id";
        String COLONIA = "colonia";
        String CALLE = "calle";
        String NO_EXT = "no_ext";
        String NO_INT = "no_int";
        String LOTE = "lote";
        String MZ = "mz";
        String CP = "cp";
        String ESTADO_ID = "estado_id";
        String MUNICIPIO = "municipio_id";
    }

    interface ColumnasGiro {
        String ID = "id";
        String DSC = "dsc";
    }

    interface ColumnasEstadoMunicipio {
        String ID = "id";
        String DSC = "dsc";
        String PARENT_ID = "parent_id";
    }

    interface ColumnasPedido {
        String ID = "id";
        String FECHA_HORA = "fecha_hora";
        String TOTAL = "total";
        String ESTABLECIMIENTO_ID = "establecimiento_id";
        String PERSONA_ID = "persona_id";
    }

    interface ColumnasEspecialidad {
        String ID = "id";
        String DSC = "dsc";
        String GIRO_ID = "giro_id";
    }

    interface ColumnasProductoServicio {
        String ID = "id";
        String PRODUCTO_SERVICIO = "producto_servicio";
        String DESCRIPCION = "descripcion";
        String PRECIO = "precio";
        String TIPO_PRODUCTO_ID = "tipo_producto_id";
        String ESTABLECIMIENTO_ID = "establecimiento_id";
    }

    interface ColumnasPedidoProductoServicio {
        String PEDIDO_ID = "pedido_id";
        String PRODUCTO_SERVICIO_ID = "producto_servicio_id";
        String CANTIDAD = "cantidad";
    }

    interface ColumnasTipoProducto {
        String ID = "id";
        String DSC = "dsc";
    }

    interface ColumnasPromocion {
        String ID = "id";
        String FECHA_INICIO = "fecha_inicio";
        String FECHA_FIN = "fecha_fin";
        String DESCRIPCION = "descripcion";
        String ESTABLECIMIENTO_ID = "establecimiento_id";
    }

    interface ColumnasPromocionPersona {
        String PROMOCION_ID = "promocion_id";
        String PERSONA_ID = "persona_id";
    }

    public static class CalificacionEstablecimiento implements ColumnasCalificacionEstablecimiento{

    }
    public static class Direccion implements ColumnasDireccion{

    }
    public static class Especialidad implements ColumnasEspecialidad{

    }
    public static class Establecimiento implements ColumnasEstablecimiento{

    }
    public static class EstadoMunicipio implements ColumnasEstadoMunicipio{

    }
    public static class Giro implements ColumnasGiro{

    }
    public static class Pedido implements ColumnasPedido{

    }
    public static class PedidoProductoServicio implements ColumnasPedidoProductoServicio{

    }
    public static class Persona implements ColumnasPersona{

    }
    public static class ProductoServicio implements ColumnasProductoServicio{

    }
    public static class Promocion implements ColumnasPromocion{

    }
    public static class PromocionPersona implements ColumnasPromocionPersona{

    }
    public static class TipoProducto implements ColumnasTipoProducto{

    }
    public static class Usuario implements ColumnasUsuario{

    }

    private DbStructure() {
    }

}
