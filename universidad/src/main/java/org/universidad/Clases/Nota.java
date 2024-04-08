package org.universidad.Clases;

public class Nota {
    private Clase clase;
    private double calificacion;

    public Nota(Clase clase, double calificacion) {
        this.clase = clase;
        this.calificacion = calificacion;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nota{\n" +
                "clase=" + clase +
                ",\n calificacion=" + calificacion +
                '}';
    }
}
