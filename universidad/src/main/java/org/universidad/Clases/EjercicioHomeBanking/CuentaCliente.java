package com.ifts.clase4.EjercicioHomeBanking;

public class CuentaCliente extends Usuario{
    private float saldo;
    private int idCuenta;
    private int cbu;

    public CuentaCliente(String nombre_completo, int dni, String nombreUsuario, String password, String correo, int idUsuario, float saldo, int idCuenta, int cbu, int edad) {
        super(nombre_completo, dni, nombreUsuario, password, correo, idUsuario, edad);
        this.saldo = saldo;
        this.idCuenta = idCuenta;
        this.cbu = cbu;

        System.out.println("Cuenta creada con éxito");
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public void depositar(float monto){
        this.saldo += monto;
        System.out.println("Depósito realizado con éxito");
    }

    public void extraer(float monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
            System.out.println("Extracción realizada con éxito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
