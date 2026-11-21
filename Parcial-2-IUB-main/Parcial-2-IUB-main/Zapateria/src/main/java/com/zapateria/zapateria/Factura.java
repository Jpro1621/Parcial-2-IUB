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
public class Factura {
    private String numero;
    private LocalDateTime fecha_emision;
    private double subtotal;
    private double impuesto;
    private double total;
    private MetodoPago metodo;
    private DetalleFactura detalle;

    public Factura(String numero, double impuesto, double total) {
        this.numero = numero;
        this.impuesto = impuesto;
        this.total = total;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public DetalleFactura getDetalle() {
        return detalle;
    }

    public double getTotal() {
        return total;
    }
    
    public String getNumero() {
        return numero;
    }

    public LocalDateTime getFecha_emision() {
        return fecha_emision;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFecha_emision(LocalDateTime fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void setDetalle(DetalleFactura detalle) {
        this.detalle = detalle;
    }
    
}    
