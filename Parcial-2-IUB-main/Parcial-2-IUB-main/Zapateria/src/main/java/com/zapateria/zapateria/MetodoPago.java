/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author estudiante
 */
public class MetodoPago {
    private String tipo;
    private String descripcion;
    private Pago pago;
    
    public MetodoPago(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Pago getPago() {
        return pago;
    }
    

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
}
