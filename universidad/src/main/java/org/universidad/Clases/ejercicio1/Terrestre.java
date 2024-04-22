package com.ifts.clase4.ejercicio1;

public class Terrestre extends Vehiculo{
    private int cantidadDeRuedas;

    public Terrestre(String marca, String modelo, String color, int velocidad, int cantidadDeRuedas) {
        super(marca, modelo, color, velocidad);
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Cantidad de ruedas: " + cantidadDeRuedas);
    }
}
