package org.example.com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosporTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override //indica que estamos sobreescribiendo un metodo que esta en la clase titulo
    public int getDuracionEnMinutos(){
        return this.episodiosporTemporada * this.temporadas * this.minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosporTemporada() {
        return episodiosporTemporada;
    }

    public void setEpisodiosporTemporada(int episodiosporTemporada) {
        this.episodiosporTemporada = episodiosporTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public String toString() {
        return "Serie: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }

}
