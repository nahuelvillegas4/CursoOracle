public class Decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String plan = "plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas mas populares:");
        }else {
            System.out.println("Pelicula Retro que aun se puede ver");
        }

        if (incluidoEnElPlan || plan.equals("plus")) { //el equals es un metodo de String que es lo mismo que ==
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible");
        }
    }
}
