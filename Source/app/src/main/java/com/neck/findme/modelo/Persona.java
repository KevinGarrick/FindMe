package com.neck.findme.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.neck.findme.sqlite.BaseDatosOH;
import com.neck.findme.sqlite.Conexion;
import com.neck.findme.sqlite.EstructuraBd;
import com.neck.findme.sqlite.EstructuraBd.ColumnasPersona;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Persona {
    private Conexion conexion = new Conexion();
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

    public com.neck.findme.entidad.Persona obtenerPorIdUsuario(Context contexto, int idUsuario){
        com.neck.findme.entidad.Persona persona = null;
        conexion = Conexion.obtenerConexion(contexto);
        Cursor cursor = conexion.obtenerPorConsulta("Select * from %s where %s = '%s'",
                BaseDatosOH.Tablas.PERSONA,
                EstructuraBd.Persona.USUARIO_ID,
                String.valueOf(idUsuario));
        if(cursor != null && cursor.moveToNext()){
            persona = new com.neck.findme.entidad.Persona();
            persona.setNombre(cursor.getString(cursor.getColumnIndex(EstructuraBd.Persona.NOMBRE)));
            persona.setpApellido(cursor.getString(cursor.getColumnIndex(EstructuraBd.Persona.P_APELLIDO)));
            persona.setsApellido(cursor.getString(cursor.getColumnIndex(EstructuraBd.Persona.S_APELLIDO)));
            persona.setUsuarioId(cursor.getInt(cursor.getColumnIndex(EstructuraBd.Persona.USUARIO_ID)));
            persona.setDireccionId(cursor.getInt(cursor.getColumnIndex(EstructuraBd.Persona.DIRECCION_ID)));
        }
        return persona;
    }
}
