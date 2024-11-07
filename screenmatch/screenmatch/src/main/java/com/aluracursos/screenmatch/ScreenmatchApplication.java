package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.Principal.EjemploStreams;
import com.aluracursos.screenmatch.Principal.Principal;
import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporadas;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//comandlinerunner permite ejecutar una accion luego de que se inicie la aplicacion
@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Hola mundo desde Spring");
//
//		var consumoAPI = new ConsumoAPI();
//
//		var json = consumoAPI.obtenerDatos("https://omdbapi.com/?t=game+of+thrones&apikey=90fe81a2");
//		//var json = consumoAPI.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);
//
//		ConvierteDatos conversor = new ConvierteDatos();
//		var datos = conversor.obtenerdatos(json, DatosSerie.class);
//		System.out.println(datos);
//
//		json = consumoAPI.obtenerDatos("https://omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=90fe81a2");
//		DatosEpisodio episodios = conversor.obtenerdatos(json, DatosEpisodio.class);
//		System.out.println(episodios);

		Principal principal = new Principal();
		principal.muestraElMenu();

//		EjemploStreams ejemploStreams = new EjemploStreams();
//		ejemploStreams.muestraEjemplo();


	}

}
