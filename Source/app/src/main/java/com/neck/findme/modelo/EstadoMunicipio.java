package com.neck.findme.modelo;

import android.content.Context;
import android.database.Cursor;

import com.neck.findme.sqlite.BaseDatosOH;
import com.neck.findme.sqlite.Conexion;
import com.neck.findme.sqlite.EstructuraBd;

/**
 * Created by Kevin on 29/10/2016.
 */
public class EstadoMunicipio {
    private Conexion conexion = new Conexion();
    public EstadoMunicipio(){}

   private EstructuraBd.EstadoMunicipio fields;

    public com.neck.findme.entidad.EstadoMunicipio getLocalidadById(Context contexto, int id){
        com.neck.findme.entidad.EstadoMunicipio localidad = null;
        conexion = Conexion.obtenerConexion(contexto);
        Cursor cursor = conexion.obtenerPorConsulta("select * from %s where id=%s",BaseDatosOH.Tablas.DIRECCION, String.valueOf(id));
        if(cursor != null && cursor.moveToNext()){
            localidad = new com.neck.findme.entidad.EstadoMunicipio(
                    cursor.getInt(cursor.getColumnIndex(fields.ID)),
                    cursor.getString(cursor.getColumnIndex(fields.DSC)),
                    cursor.getInt(cursor.getColumnIndex(fields.PARENT_ID))
            );
        }
        return localidad;
    }
}
