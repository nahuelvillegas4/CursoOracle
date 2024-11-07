package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//con JsonAlias no es necesario que el nombre del atributo sea igual al del json que
//recibimos sino que en los parentesis colocamos el nombre del dato dentro del json
//todo esto viene de la dependencia Jackson
@JsonIgnoreProperties(ignoreUnknown = true) //ignora aquellos campos que no esten mapeados
public record DatosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalDeTemporadas,
                         @JsonAlias("imdbRating") String evaluacion) {
} //esto sirve para deserializar los datos (pasar de un objeto JSON a una clase JAVA)
//para serializarlo utilizariamos @JsonProperty
