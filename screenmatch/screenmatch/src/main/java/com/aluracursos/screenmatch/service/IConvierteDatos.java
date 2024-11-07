package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    //T al ser generic puede ser int, String o lo que sea, para ser utilizado primero debo colocar <T>
    <T> T obtenerdatos(String json, Class<T> clase);  //T es un generic

}
