/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zapateria;

import java.time.LocalDateTime;

/**
 *
 * @author estudiante
 */
public class Pedido {
    private LocalDateTime fecha;
    private double valor;
    private String estado;

    public Pedido(LocalDateTime fecha, double valor) {
        this.fecha = fecha;
        this.valor = valor;
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
    
}
