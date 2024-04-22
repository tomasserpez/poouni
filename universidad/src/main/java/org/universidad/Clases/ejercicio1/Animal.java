package com.ifts.clase4.ejercicio1;

public class Animal {
    public String nombre;
    public String cantidadPatas;
    public String tipoPelaje;
    public String tipoAnimal;

    public Animal(String nombre, String cantidadPatas, String tipoPelaje, String tipoAnimal) {
        this.nombre = nombre;
        this.cantidadPatas = cantidadPatas;
        this.tipoPelaje = tipoPelaje;
        this.tipoAnimal = tipoAnimal;
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido");
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(String cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
