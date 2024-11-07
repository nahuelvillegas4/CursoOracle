package org.example;

import com.aluraproyecto.modelos.Cancion;

public class Main {
    public static void main(String[] args) {

        Cancion a = new Cancion();
        a.setNombreArtista("Harry Styles");
        a.setNombreAlbum("Si");
        a.setTitulo("Kiss U");

        for (int i = 0; i < 842; i++){
            a.meGusta();
        }

        for (int i = 0; i < 1040; i++){
            a.reproducir();
        }

        System.out.println(a.getTotalDeReproducciones());
        System.out.println(a.getMeGusta());
        System.out.println("La clasificacion de la cancion es de: " + a.clasificar());
    }
}