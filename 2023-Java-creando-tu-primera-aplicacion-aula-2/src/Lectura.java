import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula");
        String pelicula = teclado.nextLine(); //el metodo nextLine es de Scanner que permite leer lo que coloque el usuario (siendo String)
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt(); //mismo metodo pero lee un int
        System.out.println("Por ultimo, indica la nota de la pelicula");
        double notaPelicula = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(notaPelicula);
    }
}
