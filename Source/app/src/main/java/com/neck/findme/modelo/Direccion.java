package com.neck.findme.modelo;

import android.content.Context;
import android.database.Cursor;

import com.neck.findme.sqlite.BaseDatosOH;
import com.neck.findme.sqlite.Conexion;
import com.neck.findme.sqlite.EstructuraBd;

import java.util.ArrayList;

/**
 * Created by Kevin on 29/10/2016.
 */
public class Direccion {
    private Conexion conexion = new Conexion();
    public Direccion(){}

   private EstructuraBd.Direccion fields;

    public com.neck.findme.entidad.Direccion getDireccionById(Context contexto, int id){
        com.neck.findme.entidad.Direccion direccion = null;
        conexion = Conexion.obtenerConexion(contexto);
        Cursor cursor = conexion.obtenerPorConsulta("select * from %s where id=%s",BaseDatosOH.Tablas.DIRECCION, String.valueOf(id));
        if(cursor != null && cursor.moveToNext()){
            direccion = new com.neck.findme.entidad.Direccion(contexto,
                    cursor.getInt(cursor.getColumnIndex(fields.ID)),
                    cursor.getInt(cursor.getColumnIndex(fields.ESTADO_ID)),
                    cursor.getInt(cursor.getColumnIndex(fields.MUNICIPIO)),
                    cursor.getString(cursor.getColumnIndex(fields.COLONIA)),
                    cursor.getString(cursor.getColumnIndex(fields.CALLE)),
                    cursor.getString(cursor.getColumnIndex(fields.NO_EXT)),
                    cursor.getString(cursor.getColumnIndex(fields.NO_INT)),
                    cursor.getString(cursor.getColumnIndex(fields.LOTE)),
                    cursor.getString(cursor.getColumnIndex(fields.MZ)),
                    cursor.getString(cursor.getColumnIndex(fields.CP))
            );
        }
        return direccion;
    }
}
