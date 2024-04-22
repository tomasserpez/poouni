package com.ifts.clase4.EjercicioHomeBanking;

public class Transferencia {
    public int idTransferencia;
    public int monto;
    public String fecha;
    public CuentaCliente origen;
    public CuentaCliente destino;

    public Transferencia(int idTransferencia, int monto, String fecha, CuentaCliente origen, CuentaCliente destino) {
        this.idTransferencia = idTransferencia;
        this.monto = monto;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;

        System.out.println("Transferencia creada con éxito");
    }
}
