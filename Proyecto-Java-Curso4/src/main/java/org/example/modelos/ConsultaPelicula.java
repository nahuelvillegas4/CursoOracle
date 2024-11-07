package org.example.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {
    private String direccion = "https://swapi.dev/api/films/";


    public PeliculaOMDB consultarPelicula(int nroPelicula) {
        HttpClient client = HttpClient.newHttpClient(); //creamos un cliente para aplicar el cliente servidor
        HttpRequest request = HttpRequest.newBuilder()  //este utiliza el patron builder que carga la direccion
                .uri(URI.create(this.direccion + nroPelicula + "/")) //direccion de la API
                .build();

        HttpResponse<String> response = null;

        try {

            response = client //llamamos a la instancia de cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e){

            throw new RuntimeException(e);

        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = response.body();

        PeliculaOMDB pelicula = gson.fromJson(json, PeliculaOMDB.class);

        return pelicula;
    }
}
