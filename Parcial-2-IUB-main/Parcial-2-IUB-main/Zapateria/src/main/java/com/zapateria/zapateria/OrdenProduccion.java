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
public class OrdenProduccion {
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_entrega;
    private int cantidad;
    private String estado;
    private Zapato zapato;
    private DetalleProduccion detalle;

    public OrdenProduccion(LocalDateTime fecha_inicio, LocalDateTime fecha_entrega, int cantidad) {
        this.fecha_inicio = fecha_inicio;
        this.fecha_entrega = fecha_entrega;
        this.cantidad = cantidad;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public DetalleProduccion getDetalle() {
        return detalle;
    }
    

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio;
    }

    public LocalDateTime getFecha_entrega() {
        return fecha_entrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setFecha_inicio(LocalDateTime fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_entrega(LocalDateTime fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }

    public void setDetalle(DetalleProduccion detalle) {
        this.detalle = detalle;
    }
    
}
