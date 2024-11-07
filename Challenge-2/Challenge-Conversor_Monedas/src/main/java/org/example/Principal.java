package org.example;

import org.example.modelos.ConsultaCotizacion;
import org.example.modelos.Cotizacion;
import org.example.modelos.CotizacionOMDB;

public class Principal {
    public static void main(String[] args) {

        ConsultaCotizacion consulta = new ConsultaCotizacion();

        try{

            CotizacionOMDB cotizacion = consulta.consultarCotizacion("ARS", "USD");
            Cotizacion cotizacionACrear = new Cotizacion(cotizacion);

            System.out.println("La cotizacion de " + 1000 + " " + "ARS" + " es igual a " +
                    1000 * cotizacionACrear.getConversion() + " " + "USD");
        } catch (Exception e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
