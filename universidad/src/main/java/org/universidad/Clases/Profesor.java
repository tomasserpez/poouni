package org.universidad.Clases;

import java.util.List;

public class Profesor extends Persona{
    private int idProfesor;
    private List<Clase> clases;

    public Profesor(String nombreApellido, String email, String direccion, String estado, int idProfesor, List<Clase> clases) {
        super(nombreApellido, email, direccion, estado);
        this.idProfesor = idProfesor;
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", clases=" + clases +
                '}';
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }



    public void quitarClase(Clase clase){
        this.clases.remove(clase);
    }
    public void agregarClase(Clase clase){
        this.clases.add(clase);
    }


    public void cambiarEstado(String estado){
        this.setEstado(estado);
    }

    public void cambiarEstado(String fecha1, String fecha2){
        this.setEstado("Vacaciones");
    }
}
