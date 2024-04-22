package com.ifts.clase4.ejercicio1;

public class Herbivoro extends Animal{
    public String tipoAlimentacion;

    public Herbivoro(String nombre, String cantidadPatas, String tipoPelaje, String tipoAnimal, String tipoAlimentacion) {
        super(nombre, cantidadPatas, tipoPelaje, tipoAnimal);
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void comer() {
        System.out.println("El animal come plantas");
    }

    //Getters y Setters

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }


}
