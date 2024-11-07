package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.modelos.ConsultaCotizacion;
import org.example.modelos.Cotizacion;
import org.example.modelos.CotizacionOMDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Consultor de divisas");

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        Scanner sc = new Scanner(System.in);
        ConsultaCotizacion consulta = new ConsultaCotizacion();

        while (true) {
            System.out.println( "*************" + "\n" +
                                "Ingrese moneda a cotizar: " + "\n" +
                                "1 - ARS - USD" + "\n" +
                                "2 - ARS - CLP" + "\n" +
                                "3 - CLP - USD" + "\n" +
                                "4 - Monedas a seleccionar" + "\n" +
                                "0 - Salir");

            int opcion = sc.nextInt();


            String moneda = "";
            String monedaB = "";

            switch (opcion) {
                case 1:
                    moneda = "ARS";
                    monedaB = "USD";
                    break;

                case 2:
                    moneda = "ARS";
                    monedaB = "CLP";
                    break;

                case 3:
                    moneda = "CLP";
                    monedaB = "USD";
                    break;

                case 4:
                    System.out.println("Ingrese primera moneda: ");
                    moneda = sc.next();

                    System.out.println("Ingrese segunda moneda: ");
                    monedaB = sc.next();
            }

            if (opcion == 0) {
                break;
            }

            System.out.println("Ingrese la cantidad a convertir: ");
            int cantidad = sc.nextInt();

            try{

                CotizacionOMDB cotizacion = consulta.consultarCotizacion(moneda, monedaB);
                Cotizacion cotizacionACrear = new Cotizacion(cotizacion);

                System.out.println("La cotizacion de " + cantidad + " " + moneda + " es igual a " +
                        cantidad * cotizacionACrear.getConversion() + " " + monedaB);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    }
}