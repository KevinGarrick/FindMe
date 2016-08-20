package com.neck.findme.sqlite;

/**
 * Created by Kevin on 20/08/2016.
 */
public class DbStructure {
    interface Usuario {
        String ID = "id";
        String EMAIL = "email";
        String CONTRASENIA = "contrasenia";
        String SAL = "sal";
    }

    interface Persona {
        String ID = "id";
        String P_APELLIDO = "p_apellido";
        String S_APELLIDO = "s_apellido";
        String DIRECCION_ID = "direccion_id";
        String USUARIO_ID = "usuario_id";
    }

    interface Establecimiento {
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

    interface Direccion {
        String ID = "id";
        String COLONIA = "colonia";
        String CALLE = "calle";
        String NO_EXT = "no_ext";
        String NO_INT = "no_int";
        String LOTE = "lote";
        String MZ="mz";
        String CP="cp";
        String ESTADO_ID = "estado_id";
        String MUNICIPIO = "municipio_id";
    }

    interface giro{
        String ID = "id";
        String DSC = "dsc";
    }

    interface estadoMunicipio{
        String ID ="id";
        String DSC = "dsc";
    }

    interface pedido{
        String ID = "id";
        String FECHA = "fecha";
        String HORA = "hora";
        String TOTAL = "total";
        String ESTABLECIMIENTO_ID = "establecimiento_id";
        String PERSONA_ID ="persona_id";
    }

    interface especialidad{
        String ID = "id";
        String DSC ="dsc";
        String GIRO_ID = "giro_id";
    }

    interface productoServicio{
        String ID = "id";
        String PRODUCTO_SERVICIOS = "producto_servicios";
        String DESCRIPCION ="descripcion";
        String PRECIO = "precio";
        String TIPO_PRODUCTO_ID = "tipo_producto_id";
        String ESTABLECIMIENTO_ID ="establecimiento_id";
    }

    interface  pedidoProductoServicio{
        String ID = "id";
        String PRODUCTO_SERVICIO_ID = "producto_servicio_id";
        String CANTIDAD = "cantidad";
    }

    interface tipoProducto{
        String ID = "id";
        String DSC = "dsc";
    }

    interface promocion{
        String ID = "id";
        String FECHA_INICIO="fecha_inicio";
        String FECHA_FIN = "fecha_fin";
        String DESCRIPCION ="descripcion";
        String ESTABLECIMIENTO ="establecimiento";
    }

    interface promocionPersona{
        String PROMOCION_ID = "promocion_id";
        String PERSONA_ID = "persona_id";
    }
}
