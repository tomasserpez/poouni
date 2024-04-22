package com.ifts.clase4.EjercicioHomeBanking;

import java.util.ArrayList;
import java.util.List;

public class Sucursal extends Banco{
    public String direccion;
    public int idSucursal;
    public int telefono;
    public List<Transferencia> transferencias;

    public Sucursal(String nombre, int idBanco, String paisOrigen, String direccion, int idSucursal, int telefono) {
        super(nombre, idBanco, paisOrigen);
        this.direccion = direccion;
        this.idSucursal = idSucursal;
        this.telefono = telefono;
        this.transferencias = new ArrayList<>();

        System.out.println("Sucursal creada con éxito");
    }

    public void crearTransferencia(int id, int monto, String fecha, CuentaCliente origen, CuentaCliente destino){
        Transferencia transferencia = new Transferencia(id, monto, fecha, origen, destino);
        if(origen.getSaldo()>monto){
            origen.extraer(monto);
            destino.depositar(monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Transferencia realizada con éxito");
        transferencias.add(transferencia);

    }
}
