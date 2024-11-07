package org.example.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotizacion {

    private String direccion = "https://v6.exchangerate-api.com/v6/1beb7c429cb97851e8602c66/pair/";

    public CotizacionOMDB consultarCotizacion(String monedaConsulta, String monedaAConvertir){

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.direccion + monedaConsulta + "/" + monedaAConvertir))
                .build();

        HttpResponse<String> response;

        try{

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException  | InterruptedException e) {

            System.out.println("Hola");
            throw new RuntimeException(e);

        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = response.body();

        CotizacionOMDB cotizacion = gson.fromJson(json, CotizacionOMDB.class);

        return cotizacion;

    }

}
