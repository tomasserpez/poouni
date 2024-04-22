package com.ifts.clase4.EjercicioHomeBanking;

public class Usuario {
    //Atributos
    private String nombre_completo;
    private int dni;
    private String nombreUsuario;
    private String password;
    private String correo;
    private int edad;
    private boolean esMayor;
    private int idUsuario;
    private int contador = 0;

    //Constructor
    public Usuario(String nombre_completo, int dni, String nombreUsuario, String password, String correo, int idUsuario, int edad) {
        this.nombre_completo = nombre_completo;
        this.dni = dni;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correo = correo;
        this.idUsuario = idUsuario;
        if(edad >= 18){
            this.esMayor = true;
        } else {
            this.esMayor = false;
        }
        this.edad = edad;

        System.out.println("Usuario creado con éxito");
    }

    //Metodos
    public boolean login(String nombreUsuario, String password) {
        if(contador < 3){
            if(this.nombreUsuario.equals(nombreUsuario) && this.password.equals(password)){
                System.out.println("Login exitoso");
                return true;
            } else {
                System.out.println("Login fallido");
                contador++;
                return false;
            }
        }
        return false;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if(edad >= 18){
            this.esMayor = true;
        } else {
            this.esMayor = false;
        }
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isEsMayor() {
        return esMayor;
    }

}
