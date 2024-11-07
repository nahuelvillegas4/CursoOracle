import java.util.Random;
import java.util.Scanner;

public class Adivinador {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        int numeroUsuario;

        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero secreto: ");
            numeroUsuario = teclado.nextInt();

            if (numeroSecreto == numeroUsuario){
                System.out.println("Adivinaste el numero");
                break;
            } else if (i == 4) {
                System.out.println("El numero secreto era: " + numeroSecreto);
                break;
            } else if (numeroSecreto < numeroUsuario) {
                System.out.println("el numero ingresado es mayor al numero secreto");

            } else if (numeroSecreto > numeroUsuario) {
                System.out.println("el numero ingresado es menor al numero secreto");
            }
            System.out.println(i);
        }
    }
}
