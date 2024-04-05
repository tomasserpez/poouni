package org.universidad.Clases;

public abstract class Persona {
    private String nombreApellido;
    private String email;
    private String direccion;
    private String estado;

    public Persona(String nombreApellido, String email, String direccion, String estado) {
        this.nombreApellido = nombreApellido;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void cambiarEstado(){
        this.setEstado("");
    };
}
