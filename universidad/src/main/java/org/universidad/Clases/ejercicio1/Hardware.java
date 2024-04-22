package com.ifts.clase4.ejercicio1;

public class Hardware extends Computadora{
    private String placaMadre;
    private String fuente;
    private String gabinete;

    public Hardware(String marca, String modelo, String procesador, int ram, int almacenamiento, String placaMadre, String fuente, String gabinete) {
        super(marca, modelo, procesador, ram, almacenamiento);
        this.placaMadre = placaMadre;
        this.fuente = fuente;
        this.gabinete = gabinete;
    }

    // Getters y Setters
    public String getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(String placaMadre) {
        this.placaMadre = placaMadre;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }
}
