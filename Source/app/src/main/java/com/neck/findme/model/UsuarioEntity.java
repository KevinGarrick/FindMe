package com.neck.findme.model;

/**
 * Created by Kevin on 23/08/2016.
 */
public class UsuarioEntity {
    int id;
    String email;
    String contrasenia;

    public UsuarioEntity(int id, String email, String contrasenia){
        this.id = id;
        this.email=email;
        this.contrasenia=contrasenia;
    }
}
