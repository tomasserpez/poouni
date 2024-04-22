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

        Clase matematica = new Clase(1, "Matematica");
        Clase ingles = new Clase(2, "Inglés");
        Clase programacion = new Clase(3, "Programación");

        List<Clase> clases = new ArrayList<>();

        clases.add(matematica);
        clases.add(ingles);
        clases.add(programacion);

        List<Nota> notas1 = new ArrayList<>();
        List<Nota> notas2 = new ArrayList<>();
        List<Nota> notas3 = new ArrayList<>();

        notas1.add(new Nota(ingles, 7));
        notas1.add(new Nota(matematica,8));
        notas1.add(new Nota(programacion, 10));

        notas2.add(new Nota(ingles, 3));
        notas2.add(new Nota(matematica,2));
        notas2.add(new Nota(programacion, 4));

        notas3.add(new Nota(ingles, 10));
        notas3.add(new Nota(matematica,10));
        notas3.add(new Nota(programacion, 10));

        Profesor profesor1 = new Profesor("Juan Perez", "juan.perez@gmail.com", "Calle Sospechosa 123", "Activo", 1, clases);
        Estudiante alumno1 = new Estudiante("Esteban Quito", "esteban.quito@gmail.com", "Calle Curiosa 321", "Activo", 1, clases, notas1);
        Profesor profesor2 = new Profesor("Jose Angel", "jose.angel@gmail.com", "Calle Sospechosa 223", "Activo", 2, clases);
        Estudiante alumno2 = new Estudiante("Esteban Quito", "esteban.quito@gmail.com", "Calle Curiosa 321", "Activo", 1, clases, notas2);
        Profesor profesor3 = new Profesor("Miguel Perez", "miguel.perez@gmail.com", "Calle sucia 123", "Activo", 1, clases);
        Estudiante alumno3 = new Estudiante("Esteban Quito", "esteban.quito@gmail.com", "Calle miesteriosa 321", "Activo", 1, clases, notas3);

        System.out.println(profesor1.toString());
        System.out.println(" ");
        System.out.println(profesor2.toString());
        System.out.println(" ");
        System.out.println(profesor3.toString());
        System.out.println(" ");

        System.out.println(alumno1.toString());
        System.out.println(" ");
        System.out.println(alumno2.toString());
        System.out.println(" ");
        System.out.println(alumno3.toString());
        System.out.println(" ");

        profesor1.cambiarEstado("Despedido");
        profesor2.cambiarEstado("12/12/23","20/12/23");

        System.out.println(profesor1.getNombreApellido() + ": " + profesor1.getEstado());
        System.out.println(profesor2.getNombreApellido() + ": " + profesor2.getEstado());


        // Crear un usuario
        CuentaCliente cuentaCliente1 = new CuentaCliente("Juan Perez", 12345678, "juanperez", "1234", "jperez@prueba.com", 1, 1000, 1, 123456, 25);
        CuentaCliente cuentaCliente2 = new CuentaCliente("Maria Lopez", 87654321, "marialopez", "5678", "mlopez@prueba.com", 2, 2000, 2, 654321, 30);
        CuentaCliente cuentaCliente3 = new CuentaCliente("Pedro Gomez", 11111111, "pedrogomez", "1111", "pgomez@prueba.com", 3, 3000, 3, 111111, 16);

        System.out.println(cuentaCliente3.isEsMayor());

        Banco banco1 = new Banco("Banco1", 1, "Argentina");
        Sucursal sucursal1 = new Sucursal("Banco1", 1, "Argentina", "Av. Siempreviva 123", 1, 123456789);

        sucursal1.crearTransferencia(1, 500, "01/01/2021", cuentaCliente1, cuentaCliente2);
        //probaremos el login ingresando por teclado la contraseña
        //Ingresamos por teclado
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su contraseña: ");
            String password = scanner.nextLine();
            if (cuentaCliente1.login("juanperez", password)) {
                System.out.println("Contraseña correcta");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
    }
    }
}