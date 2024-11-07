package org.example;

import org.example.modelos.Compra;
import org.example.modelos.Tarjeta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese saldo tarjeta");
        int saldo = entrada.nextInt();

        Tarjeta tarjeta = new Tarjeta(saldo);

        while (continuar) {
            System.out.println("Ingrese el valor de la compra: ");
            int valor = entrada.nextInt();

            System.out.println("Ingrese descripcion de compra: ");
            String descripcion = entrada.next();

            Compra compra = new Compra(descripcion, valor);

            continuar = tarjeta.comprar(compra);

            if (continuar) {
                System.out.println("Ingrese 1 si quiere continuar o 0 si quiere salir");
                continuar = entrada.nextInt() == 1; //si la entrada es igual a 1 entonces continuar es igual a true
            }

        }
        entrada.close();
        System.out.println(tarjeta.toString());
    }
}