package org.universidad.Clases;

public class Clase {
    private int idClase;
    private String nombre;

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase(int idClase, String nombre) {
        this.idClase = idClase;
        this.nombre = nombre;
    }

}
