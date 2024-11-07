package org.example.modelos;

public class Compra {
    String descripcionCompra;
    int precio;

    public Compra(String descripcionCompra, int precio) {
        this.descripcionCompra = descripcionCompra;
        this.precio = precio;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return descripcionCompra + " - " + precio +
                '\n';
    }
}
