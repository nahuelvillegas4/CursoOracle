package org.example.modelos;

public class Cotizacion {

    private String monedaBase;
    private String monedaAConvertir;
    private double conversion;

    public Cotizacion(CotizacionOMDB cotizacion) {
        this.monedaBase = cotizacion.base_code();
        this.monedaAConvertir = cotizacion.target_code();
        this.conversion = cotizacion.conversion_rate();
    }

    public double getConversion(){
        return conversion;
    }
}
