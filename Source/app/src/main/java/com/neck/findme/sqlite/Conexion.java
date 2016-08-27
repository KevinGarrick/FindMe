package com.neck.findme.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Conexion {

    private static BaseDatosOH baseDatosOH = null;
    private static Conexion conexion = new Conexion();
    private SQLiteDatabase bd;
    private SQLiteQueryBuilder constructor;

    public Conexion() {
    }

    public static Conexion obtenerConexion(Context contexto) {
        if (baseDatosOH == null) {
            baseDatosOH = new BaseDatosOH(contexto);
        }
        return conexion;
    }

    public Cursor obtenerPorLectura(String tabla, String[] columnas) {
        bd = baseDatosOH.getReadableDatabase();
        constructor = new SQLiteQueryBuilder();
        constructor.setTables(tabla);

        return constructor.query(bd, columnas, null, null, null, null, null);
    }

    public Cursor obtenerPorEscritura(String tabla, String[] columnas, String seleccion, String[] seleccionArgs) {
        bd = baseDatosOH.getWritableDatabase();
        constructor = new SQLiteQueryBuilder();
        constructor.setTables(tabla);
        return constructor.query(bd, columnas, seleccion, seleccionArgs, null, null, null);
    }

    public void ejecutarConsulta(String consulta, String... argumentos) {
        bd = baseDatosOH.getReadableDatabase();
        bd.execSQL(String.format(consulta,argumentos), null);
    }

    public void ejecutarConsulta(String consulta) {
        obtenerPorConsulta(consulta, null);
    }

    public Cursor obtenerPorConsulta(String consulta, String... argumentos) {
        bd = baseDatosOH.getReadableDatabase();
        return bd.rawQuery(String.format(consulta,argumentos), null);
    }

    public void obtenerPorConsulta(String consulta) {
        ejecutarConsulta(consulta, null);
    }

    public int insertar(String tabla, ContentValues valores) {
        bd = baseDatosOH.getWritableDatabase();
        return (int)bd.insertOrThrow(tabla, null, valores);
    }


    public boolean actualizar(String tabla, ContentValues valores, String where, String[] whereArgs) {
        bd = baseDatosOH.getWritableDatabase();
        return bd.update(tabla, valores, where, whereArgs) > 0;
    }

    public boolean eliminar(String tabla, String where, String[] whereArgs) {
        bd = baseDatosOH.getWritableDatabase();
        return bd.delete(tabla, where, whereArgs) > 0;
    }

    public SQLiteDatabase getDb() {
        return baseDatosOH.getWritableDatabase();
    }

}
