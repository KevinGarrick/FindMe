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
public class Especialidad {
    private Conexion conexion = new Conexion();
    public Especialidad(){}

    public ArrayList<com.neck.findme.entidad.Especialidad> getEspecialidades(Context contexto){
        ArrayList<com.neck.findme.entidad.Especialidad> alEsp = new ArrayList<>();
        com.neck.findme.entidad.Especialidad esp;
        conexion = Conexion.obtenerConexion(contexto);
        Cursor cursor = conexion.obtenerPorConsulta("Select * from %s ",
                BaseDatosOH.Tablas.ESPECIALIDAD
                );
        if(cursor != null && cursor.moveToNext()){
            while(cursor.moveToNext()){
                esp = new com.neck.findme.entidad.Especialidad(cursor.getInt(0),cursor.getInt(2),cursor.getString(1));
                alEsp.add(esp);
            }
        }
        return alEsp;
    }
}
