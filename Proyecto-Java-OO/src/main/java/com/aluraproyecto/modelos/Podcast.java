package com.aluraproyecto.modelos;

public class Podcast extends Audio{

    private String podcaster;
    private String descripcion;

    public String getPodcaster() {
        return podcaster;
    }

    public void setPodcaster(String podcaster) {
        this.podcaster = podcaster;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
