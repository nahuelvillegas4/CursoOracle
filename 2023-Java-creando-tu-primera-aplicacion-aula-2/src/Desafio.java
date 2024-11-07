import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String menu =   "***********************************\n" +
                        "** Escriba la opcion deseada **\n" +
                        "1 - Consultar Saldo\n" +
                        "2 - Retirar\n" +
                        "3 - Depositar\n" +
                        "9 - Salir\n";

        int opcion = 0;
        double saldo = 1500;
        String nombre = "Salvador Garcia";
        String tipoCuenta = "Corriente";
        double retirado = 0;
        double depositado = 0;

        String detalle =    "*******************************\n" +
                            "\n" +
                            "Nombre del cliente:\n" + nombre +
                            "Tipo de cuenta:\n" + tipoCuenta +
                            "Saldo disponible:\n" + saldo +
                            "\n" +
                            "*******************************\n";

        Scanner entrada = new Scanner(System.in);

        System.out.println(detalle);

        while (opcion != 9) {


            System.out.println(menu);
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:{
                    System.out.println("Su saldo es de:" + saldo);
                    continue;
                }
                case 2:{
                    System.out.println("Cuanto desea retirar?");
                    retirado = entrada.nextDouble();
                    saldo -= retirado;
                    System.out.println("Su saldo es de:" + saldo);
                    continue;
                }
                case 3:{
                    System.out.println("Ingrese la cantidad de dinero a Depositar:");
                    depositado = entrada.nextDouble();
                    saldo += depositado;
                    System.out.println("Su saldo es de:" + saldo);
                }
            }
        }
    }
}
