package com.ifts.clase4.ejercicio1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Vehiculo(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }

    public void frenar(int velocidad) {
        this.velocidad -= velocidad;
    }

    public void cambiarColor(String color) {
        this.color = color;
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
    }
}
