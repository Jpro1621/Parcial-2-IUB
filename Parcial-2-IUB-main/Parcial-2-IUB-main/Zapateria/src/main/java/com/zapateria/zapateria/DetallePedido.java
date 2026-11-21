/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author jairo
 */
public class DetallePedido {
    private int cantidad;
    private double preciounitario;
    private double subtotal;

    public DetallePedido(int cantidad, double subtotal) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
