package org.universidad.Clases;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Estudiante extends Persona{
    private int idEstudiante;
    private List<Clase> clases;
    private List<Nota> notas;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void quitarClase(Clase clase){
        this.clases.remove(clase);
    }
    public void agregarClase(Clase clase){
        this.clases.add(clase);
    }

    public Estudiante(String nombreApellido, String email, String direccion, String estado, int idEstudiante, List<Clase> clases, List<Nota> notas) {
        super(nombreApellido, email, direccion, estado);
        this.idEstudiante = idEstudiante;
        this.clases = clases;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", clases=" + clases +
                ", notas=" + notas +
                '}';
    }

    public void agregarNota(Clase clase, double calif){
        Nota nota = new Nota(clase, calif);
        notas.add(nota);
    }
    public void modificarNota(Clase clase, double calif){
        Nota nota = notas.stream()
                        .filter(item -> clase.equals(item.getClase()))
                                .findAny()
                                        .orElse(null);
        notas.remove(nota);
        Nota notaNueva = new Nota(clase, calif);
    }

    public void cambiarEstado(String estado){
        this.setEstado(estado);

    }
}
