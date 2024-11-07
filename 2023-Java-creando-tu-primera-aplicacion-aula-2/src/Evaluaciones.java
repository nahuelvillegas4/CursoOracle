import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int pasadas = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = sc.nextDouble();
            if (nota == -1){
                break;
            }
            mediaEvaluaciones += nota;
            pasadas++;
        }

        System.out.println("La media de evaluaciones para Matrix es:" + mediaEvaluaciones/ pasadas);
    }
}
