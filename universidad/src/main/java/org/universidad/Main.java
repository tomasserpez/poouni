package org.universidad;

import org.universidad.Clases.Clase;
import org.universidad.Clases.Estudiante;
import org.universidad.Clases.Nota;
import org.universidad.Clases.Profesor;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Clase Persona nombreApellido, email, direccion, estado
        //Clase Profesor idProfesor, List<Clase> clases

        System.out.printf("Hello and welcome!");
        Clase matematica = new Clase(1, "Matematica");
        Clase ingles = new Clase(2, "Inglés");
        Clase programacion = new Clase(3, "Programación");

        List<Clase> clases = new ArrayList<>();

        clases.add(matematica);
        clases.add(ingles);
        clases.add(programacion);

        List<Nota> notas = new ArrayList<>();


        Profesor profesor1 = new Profesor("Juan Perez", "juan.perez@gmail.com", "Calle Sospechosa 123", "Activo", 1, clases);
        Estudiante alumno1 = new Estudiante("Esteban Quito", "esteban.quito@gmail.com", "Calle Curiosa 321", "Activo", 1, clases, notas);
        Profesor profesor2 = new Profesor("Jose Angel", "jose.angel@gmail.com", "Calle Sospechosa 223", "Activo", 2, clases);
        Estudiante alumno2 = new Estudiante("Esteban Quito", "esteban.quito@gmail.com", "Calle Curiosa 321", "Activo", 1, clases, notas);
        Profesor profesor3 = new Profesor("Juan Perez", "juan.perez@gmail.com", "Calle Sospechosa 123", "Activo", 1, clases);
        Estudiante alumno3 = new Estudiante("Esteban Quito", "esteban.quito@gmail.com", "Calle Curiosa 321", "Activo", 1, clases, notas);

    }
    }
}