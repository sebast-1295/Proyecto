package com.proyecto.entities;

import java.util.Date;

public class BitacoradePrestamo {

    private Cliente cliente;
    private int cantidad;
    private Date fecha;

    public BitacoradePrestamo (Cliente cliente, int cantidad, Date fecha) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.fecha = fecha;

    }

    public Cliente getCliente () {
        return cliente;
    }

    public int getCantidad () {
        return cantidad;
    }

    public Date getFecha () {
        return fecha;
    }
}