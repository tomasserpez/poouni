package com.ifts.clase4.EjercicioHomeBanking;

public class Banco {
    //Atributos
    public String nombre;
    public int idBanco;
    public String paisOrigen;

    //Constructor
    public Banco(String nombre, int idBanco, String paisOrigen) {
        this.nombre = nombre;
        this.idBanco = idBanco;
        this.paisOrigen = paisOrigen;

        System.out.println("Banco creado con éxito");
    }
}
