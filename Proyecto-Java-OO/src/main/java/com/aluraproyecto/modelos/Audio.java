package com.aluraproyecto.modelos;

public class Audio {

    private String titulo;
    private int Duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private double clasificacion;

    public double clasificar(){
        if (this.meGusta == 0 && totalDeReproducciones > 0){
            return 1;
        } else if (this.meGusta == 0 && totalDeReproducciones == 0){
            return 0;
        } else {
            clasificacion = Math.round(((double) this.meGusta/this.totalDeReproducciones)*10);
            return clasificacion;
        }
    }

    public void meGusta(){
        this.meGusta++;
    }

    public void reproducir(){
        System.out.println("Reproduciendo: " + this.titulo);
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }
}
