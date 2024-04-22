package com.ifts.clase4.ejercicio1;

public class Acuatico extends Vehiculo{
    private int cantidadDeHelices;

    public Acuatico(String marca, String modelo, String color, int velocidad, int cantidadDeHelices) {
        super(marca, modelo, color, velocidad);
        this.cantidadDeHelices = cantidadDeHelices;
    }

    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Cantidad de helices: " + cantidadDeHelices);
    }
}
