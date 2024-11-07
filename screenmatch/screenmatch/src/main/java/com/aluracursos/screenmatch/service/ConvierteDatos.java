package com.aluracursos.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtenerdatos(String json, Class<T> clase) { //esto sirve para transformar un json en una clase que pasemos
        try {
            return objectMapper.readValue(json, clase);//utiliza el json que enviamos, para transformarlo en una clase
                                                        //en este caso le pasamos el record de datos serie
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
