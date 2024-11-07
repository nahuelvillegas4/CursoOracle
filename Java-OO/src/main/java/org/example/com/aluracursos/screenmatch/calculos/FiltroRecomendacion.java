package org.example.com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){ //se utiliza clasificacion pero supongo que tambien podria usar titulo en si
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}
