package org.example.com.aluracursos.screenmatch.principal;

import org.example.com.aluracursos.screenmatch.modelos.Pelicula;
import org.example.com.aluracursos.screenmatch.modelos.Serie;
import org.example.com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021); //creacion de una pelicula en si
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2021); //infiere que el tipo de dato es pelicula al crearlo
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragon", 2022);

        Pelicula p1 = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>(); //esto crea un array list de peliculas (que esta entre <>)
        lista.add(peliculaDeBruno); //añadiendo elementos al array
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item : lista) { //esto recorre la lista y a cada elemento le asigna el nombre item
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println("Lista de artistas no ordenada: " + listaDeArtistas);

        Collections.sort(listaDeArtistas); //ordenar una lista
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getNombre)); //de esta forma puedo ordenar a partir de lo que yo quiera

        System.out.println("Lista de titulos ordenados: " + lista);

        //ArrayList ajusta su tamaño dinamicamente
        //LinkedList es un tipo de lista que es lista enlazada
        //Collections es una interfaz conjunto de items que no estan ordenados eliminandome la posibilidad de sacar un item de una posicion especifica
        //Set es otra interfaz la cual es un conjunto de datos que no permite tener un dato duplicado, hashSet utiliza esto (importante en back)
        //Map es un diccionario (llave, valor) osea que permite encontrar un valor buscandolo a partir de su llave
    }
}
