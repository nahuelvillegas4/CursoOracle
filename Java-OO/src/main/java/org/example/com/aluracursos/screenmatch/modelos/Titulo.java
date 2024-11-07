package org.example.com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import org.example.com.aluracursos.screenmatch.excepciones.ErrorEnConversionDuracionException;

public class Titulo implements Comparable<Titulo>{
    //@SerializedName("Title") //permite transformar el Tittle del json a nombre de mi clase
    private String nombre; //con private denego el acceso a las variables del estilo pelicula.nombre
    //@SerializedName("Year")
    private int fechaDeLanzamiento; //teniendo que acceder a estos datos mediante un get
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;


    public Titulo(TituloOMDB miTituloOmdb){
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDuracionException("No pude convertir la duracion, "+
                    "porque contiene N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3)
                .replace(" ", ""));
        //Integer.valueof nos permite transformar el String a Int y el substring nos permite elegir que
        //caracteres tomaremos
    }

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + this.nombre);
        System.out.println("Su fecha de lanzamiento es: " + this.fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es: " + this.getDuracionEnMinutos());
    }

    public void evalua(double nota){
        this.sumaDeLasEvaluaciones += nota;
        this.totalDeLasEvaluaciones ++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones/ totalDeLasEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    @Override //este es el metodo para que se pueda utilizar Collections.sort()
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(" +
                "nombre='" + nombre  +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracionEnMinutos=" + duracionEnMinutos +
                ')';
    }
}
