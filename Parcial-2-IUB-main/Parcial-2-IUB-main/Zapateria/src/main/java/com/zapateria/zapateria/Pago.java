/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

import java.time.LocalDateTime;

/**
 *
 * @author jairo
 */
public class Pago {
    private LocalDateTime fechapago;
    private double valorpagado;
    private String comprobante;
    private String estadopago;

    public Pago(LocalDateTime fechapago, double valorpagado, String comprobante) {
        this.fechapago = fechapago;
        this.valorpagado = valorpagado;
        this.comprobante = comprobante;
    }

    public LocalDateTime getFechapago() {
        return fechapago;
    }

    public double getValorpagado() {
        return valorpagado;
    }

    public String getComprobante() {
        return comprobante;
    }

    public String getEstadopago() {
        return estadopago;
    }

    public void setFechapago(LocalDateTime fechapago) {
        this.fechapago = fechapago;
    }

    public void setValorpagado(double valorpagado) {
        this.valorpagado = valorpagado;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public void setEstadopago(String estadopago) {
        this.estadopago = estadopago;
    }
    
}
