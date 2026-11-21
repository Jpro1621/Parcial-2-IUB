/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

import java.time.LocalDateTime;

/**
 *
 * @author estudiante
 */
public class Pedido {
    private LocalDateTime fecha;
    private double valor;
    private String estado;
    private DetallePedido detalle;
    private Factura factura;
    private Devolucion devolucion;
    private Zapato zapato;

    public Pedido(LocalDateTime fecha, double valor) {
        this.fecha = fecha;
        this.valor = valor;
    }

    public DetallePedido getDetalle() {
        return detalle;
    }

    public Factura getFactura() {
        return factura;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getValor() {
        return valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDetalle(DetallePedido detalle) {
        this.detalle = detalle;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }
    
}
