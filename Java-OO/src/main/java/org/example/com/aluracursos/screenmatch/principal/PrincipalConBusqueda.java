package org.example.com.aluracursos.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.com.aluracursos.screenmatch.excepciones.ErrorEnConversionDuracionException;
import org.example.com.aluracursos.screenmatch.modelos.Titulo;
import org.example.com.aluracursos.screenmatch.modelos.TituloOMDB;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        //tutorial para hacer request http

        Scanner scanner = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        //utilizando Gson para transformar Json
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() //esto mejora la creacion del Json
                .create(); //esto permite que los identificadores de los datos se muestren con
        //una escritura establecida

        while(true) {
            System.out.println("Escriba el nombre de la pelicula: ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) { //si escribe salir salimos del bucle
                break;
            }

            String busqueda = URLEncoder.encode(nombre, "UTF-8"); //esta metodo encode toma la cadena original
            //y la devuelve codificada para que sea segura en una URL

            String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=90fe81a2";

            try{
                //esto se utiliza para pedir
                HttpClient client = HttpClient.newHttpClient(); //creamos un cliente para aplicar el cliente servidor
                HttpRequest request = HttpRequest.newBuilder()  //este utiliza el patron builder que carga la direccion
                        .uri(URI.create(direccion)) //direccion de la API
                        .build();

                //esto se utiliza para recibir
                HttpResponse<String> response = client //llamamos a la instancia de cliente
                        .send(request, HttpResponse.BodyHandlers.ofString()); //con esto utilizamos el metodo del cliente para enviar la request ya creada
                //y asi en response se carga lo que recibamos

                System.out.println(response.body()); //imprime todo el Json recibido

                String json = response.body();

                //metodo para transformar json a una clase

                TituloOMDB miTituloOMDB = gson.fromJson(json, TituloOMDB.class);
                //el record tituloOmdb sirve para tener un intermediario que transforme los datos
                //que recibimos de la api y los transforme a los que utilizamos en la clase
                //asi podemos utilizar distintas api sin tener que modificar la clase siempre

                System.out.println(miTituloOMDB);

//para leer un archivo podemos utilizar la clase File para brindar la direccion del archivo y luego
                //utilizar scanner para poder leer el mismo
                Titulo miTitulo = new Titulo(miTituloOMDB);
                System.out.println("Titulo ya convertido: " + miTitulo);

                titulos.add(miTitulo);

            } catch (NumberFormatException e) { //este error es porque no tiene duracion especifica la pelicula

                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage()); //imprime el mensaje de la excepcion

            } catch(IllegalArgumentException e){ //esto ocurre cuando ingresamos una pelicula mal escrita

                System.out.println("Error en la URI, verifique la direccion: ");
                System.out.println(e.getMessage());

            } catch (ErrorEnConversionDuracionException e) { //este atrapa errores generales ya que exception es la clase madre

                System.out.println(e.getMessage());

            }
        }

        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json"); //clase que permite crear archivos
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Fin del programa");

    }
}
