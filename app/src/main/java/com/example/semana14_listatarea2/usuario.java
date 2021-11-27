package com.example.semana14_listatarea2;

public class usuario {
    String nombreUsuario;
    String id;

    public usuario() {

    }

    public usuario(String nombreUsuario, String id) {
        this.nombreUsuario = nombreUsuario;
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
