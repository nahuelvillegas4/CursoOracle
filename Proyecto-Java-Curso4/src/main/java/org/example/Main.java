package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.modelos.ConsultaPelicula;
import org.example.modelos.Pelicula;
import org.example.modelos.PeliculaOMDB;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileWriter;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Consultor de peliculas de Star wars");

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        Scanner sc = new Scanner(System.in);


        System.out.println( "**************************" + "\n" +
                "Ingrese el numero de pelicula a generar un json" + "\n" +
                "1 - Una nueva esperanza" +
                "\n" +
                "2 - El imperio contraataca" +
                "\n" +
                "3 - El retorno del jedi" +
                "\n" +
                "4 - La amenaza fantasma" +
                "\n" +
                "5 - El ataque de los clones" +
                "\n" +
                "6 - La venganza de los sith" +
                "\n" +
                "**************************");

        System.out.println("Ingrese el numero de pelicula a consultar");
        int opcion = sc.nextInt();

        ConsultaPelicula consulta = new ConsultaPelicula();

        try{

            PeliculaOMDB pelicula = consulta.consultarPelicula(opcion);
            Pelicula peliculaAEscribir = new Pelicula(pelicula);

            FileWriter fileWriter = new FileWriter("pelicula.json");
            fileWriter.write(gson.toJson(peliculaAEscribir));
            fileWriter.close();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }
}