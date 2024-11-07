package org.example.modelos;

import java.util.ArrayList;

public class Tarjeta {
    private int saldo;
    private ArrayList<Compra> compras;

    public Tarjeta(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean comprar(Compra compra) {
        if (compras == null) {
            compras = new ArrayList<>();
        }
        if (this.saldo < compra.precio){
            System.out.println("COMPRA RECHAZADA");
            return false;
        } else {
            compras.add(compra);
            this.saldo -= compra.precio;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder resumen = new StringBuilder();

        if (compras != null) {
            for (Compra compra : compras) {
                resumen.append(compra.toString());
            }
        }

        return "Resumen Tarjeta: " + '\n' +
                "Saldo: " + this.saldo  + '\n' +
                "******************************" + '\n' +
                "COMPRAS REALIZADAS: " + '\n' +  resumen.toString() + '\n' +
                "***************************************";
    }
}
