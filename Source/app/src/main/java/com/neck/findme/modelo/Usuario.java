package com.neck.findme.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import com.neck.findme.sqlite.Conexion;
import com.neck.findme.sqlite.BaseDatosOH.Tablas;
import com.neck.findme.modelo.Persona;
import com.neck.findme.sqlite.EstructuraBd.ColumnasUsuario;

import java.util.ArrayList;

/**
 * Created by Kevin on 25/08/2016.
 */
public class Usuario {
    public Usuario(){}
    private Conexion conexion = new Conexion();

    public boolean crearNuevo(Context contexto,String usuario, String contrasena, String nombre, String pApellido, String sApellido){
        boolean ret = false;
        conexion = Conexion.obtenerConexion(contexto);
        try {
            conexion.getDb().beginTransaction();
            int usuarioId = conexion.insertar(Tablas.USUARIO,this.obtenerValores(usuario,contrasena));
            if (usuarioId!=-1){
                Persona persona = new Persona();
                int personaId = conexion.insertar(Tablas.PERSONA,persona.obtenerValores(nombre,pApellido,sApellido,usuarioId));
                if(personaId == -1){
                    throw new Exception("Error al insertar los datos de la persona.");
                }
            }
            else{
                throw new Exception("Error al insertar el usuario.");
            }
            conexion.getDb().setTransactionSuccessful();
            ret = true;
        }catch (Exception e){
            //acciones no implementadas
        }finally {
            conexion.getDb().endTransaction();
        }
        return true;
    }
    public ArrayList<com.neck.findme.entidad.Usuario> obtenerUsuarios(Context contexto){
        ArrayList<com.neck.findme.entidad.Usuario> Usuarios = new ArrayList<>();
        conexion = Conexion.obtenerConexion(contexto);
        try {
            Cursor cursor = conexion.ejecutarConsulta("select * from %s", Tablas.USUARIO);
            if (cursor != null){
                while (cursor.moveToNext()){
                    com.neck.findme.entidad.Usuario usuario= new com.neck.findme.entidad.Usuario(cursor.getInt(0),
                            cursor.getString(1),cursor.getString(2));
                    Usuarios.add(usuario);
                }
            }
        }catch(Exception e){
            Log.e("USUARIO:","Error al obtener los usuarios:\n"+e.getMessage());
        }

        return Usuarios;
    }

    public ContentValues obtenerValores(String usuario,String contrasena){
        ContentValues valores = new ContentValues();
        valores.put(ColumnasUsuario.EMAIL,usuario+" insertado");
        valores.put(ColumnasUsuario.CONTRASENIA,contrasena);
        return valores;
    }
}
