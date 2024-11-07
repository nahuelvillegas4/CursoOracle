package org.example.modelos;

public class Pelicula {
    private String titulo;
    private int id_episodio;
    private String opening;
    private String director;
    private String productor;
    private String fechaDeLanzamiento;

    public Pelicula(PeliculaOMDB peliculaOMDB){
        this.titulo = peliculaOMDB.title();
        this.id_episodio = peliculaOMDB.episode_id();
        this.opening = peliculaOMDB.opening_crawl();
        this.director = peliculaOMDB.director();
        this.productor = peliculaOMDB.producer();
        this.fechaDeLanzamiento = peliculaOMDB.release_date();
    }
}
