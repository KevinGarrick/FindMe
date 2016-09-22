package com.neck.findme.entidad;

/**
 * Created by Kevin on 23/08/2016.
 */
public class Usuario {
    int id;
    String email;

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String contrasenia;

    public Usuario(int id,String email, String contrasenia){
        this.id = id;
        this.email=email;
        this.contrasenia=contrasenia;
    }
    public Usuario(){}
}
