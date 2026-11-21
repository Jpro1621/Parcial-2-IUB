/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author jairo
 */
public class DetalleFactura {
    private int cantidad;
    private double impuesto;
    private double subtotal;

    public DetalleFactura(int cantidad, double impuesto, double subtotal) {
        this.cantidad = cantidad;
        this.impuesto = impuesto;
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
