package com.ifts.clase4.ejercicio1;

public class Software extends Computadora{
    private String sistemaOperativo;
    private String version;
    private String licencia;

    public Software(String marca, String modelo, String procesador, int ram, int almacenamiento, String sistemaOperativo, String version, String licencia) {
        super(marca, modelo, procesador, ram, almacenamiento);
        this.sistemaOperativo = sistemaOperativo;
        this.version = version;
        this.licencia = licencia;
    }

    // Getters y Setters
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}
