package org.example.com.aluracursos.screenmatch.principal;

import org.example.com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import org.example.com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import org.example.com.aluracursos.screenmatch.modelos.Episodio;
import org.example.com.aluracursos.screenmatch.modelos.Pelicula;
import org.example.com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021); //creacion de una pelicula en si

//        miPelicula.setFechaDeLanzamiento();
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.6);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon", 2022);
//        casaDragon.setNombre();
//        casaDragon.setFechaDeLanzamiento();
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosporTemporada(10);
        casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
//        otraPelicula.setFechaDeLanzamiento();
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " +
                calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2021); //infiere que el tipo de dato es pelicula al crearlo
//        peliculaDeBruno.setNombre();
        peliculaDeBruno.setDuracionEnMinutos(180);
//        peliculaDeBruno.setFechaDeLanzamiento();

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>(); //esto crea un array list de peliculas (que esta entre <>)
        listaDePeliculas.add(peliculaDeBruno); //añadiendo elementos al array
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println(listaDePeliculas.get(0).toString());


    }
}