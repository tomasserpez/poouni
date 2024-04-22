package com.ifts.clase4.ejercicio1;

public class Carnivoro extends Animal{
    public String tipoAlimentacion;

    public Carnivoro(String nombre, String cantidadPatas, String tipoPelaje, String tipoAnimal, String tipoAlimentacion) {
        super(nombre, cantidadPatas, tipoPelaje, tipoAnimal);
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void emitirSonido() {
        System.out.println("El animal carnivoro emite un sonido");
    }

    public void comer() {
        System.out.println("El animal carnivoro come carne");
    }

    //Getters y Setters

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }
}
