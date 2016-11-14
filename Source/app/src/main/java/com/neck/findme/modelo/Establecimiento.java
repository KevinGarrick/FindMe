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
public class Establecimiento {
    private Conexion conexion = new Conexion();

    public Establecimiento() {
    }

    private EstructuraBd.Establecimiento fields;

    public ArrayList<com.neck.findme.entidad.Establecimiento> getEstablecimientos(Context contexto) {
        ArrayList<com.neck.findme.entidad.Establecimiento> alEsp = new ArrayList<>();
        com.neck.findme.entidad.Establecimiento est;
        conexion = Conexion.obtenerConexion(contexto);
        Cursor cursor = conexion.obtenerPorConsulta("Select * from %s ",
                BaseDatosOH.Tablas.ESTABLECIMIENTO
        );
        if (cursor != null && cursor.moveToNext()) {

            while (cursor.moveToNext()) {
                est = new com.neck.findme.entidad.Establecimiento(
                        cursor.getInt(cursor.getColumnIndex(fields.ID)),
                        cursor.getInt(cursor.getColumnIndex(fields.USUARIO_ID)),
                        cursor.getInt(cursor.getColumnIndex(fields.DIRECCION_ID)),
                        cursor.getInt(cursor.getColumnIndex(fields.GIRO_ID)),
                        cursor.getInt(cursor.getColumnIndex(fields.ESPECIALIDAD_ID)),
                        cursor.getInt(cursor.getColumnIndex(fields.COORD_X)),
                        cursor.getInt(cursor.getColumnIndex(fields.COORD_Y)),
                        cursor.getInt(cursor.getColumnIndex(fields.SERVICIO_DOMICILIO)),
                        cursor.getString(cursor.getColumnIndex(fields.NOMBRE)),
                        cursor.getString(cursor.getColumnIndex(fields.TELEFONO)));
                alEsp.add(est);
            }
        }
        return alEsp;
    }


}
