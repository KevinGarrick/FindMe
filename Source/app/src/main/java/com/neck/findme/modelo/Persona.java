package com.neck.findme.modelo;

import android.content.ContentValues;

import com.neck.findme.sqlite.EstructuraBd.ColumnasPersona;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Persona {
    public Persona(){}
    public ContentValues obtenerValores(String nombre, String pApellido, String sApellido, int usuarioId){
       return this.obtenerValores(nombre,pApellido,sApellido,usuarioId,0);
    }
    public ContentValues obtenerValores(String nombre, String pApellido, String sApellido, int usuarioId, int direccionId){
        ContentValues valores = new ContentValues();
        valores.put(ColumnasPersona.NOMBRE,nombre);
        valores.put(ColumnasPersona.P_APELLIDO,pApellido);
        valores.put(ColumnasPersona.S_APELLIDO,sApellido);
        valores.put(ColumnasPersona.USUARIO_ID,usuarioId);
        valores.put(ColumnasPersona.DIRECCION_ID,direccionId !=0 ? direccionId : null);
        return valores;
    }
}
