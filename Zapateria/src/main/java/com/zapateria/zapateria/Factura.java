/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zapateria;

/**
 *
 * @author estudiante
 */
public class Factura {
    private String numero;
    private String fecha_emision;
    private double subtotal;
    private double impuesto;
    private double total;

    public Factura(String numero, double impuesto, double total) {
        this.numero = numero;
        this.impuesto = impuesto;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
    
    public String getNumero() {
        return numero;
    }

    public String getFecha_emision() {
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

    public void setFecha_emision(String fecha_emision) {
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
    
}    
