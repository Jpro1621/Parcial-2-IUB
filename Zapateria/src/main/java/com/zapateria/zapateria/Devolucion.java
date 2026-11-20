/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zapateria;

/**
 *
 * @author estudiante
 */
public class Devolucion {
    private String motivo;
    private int cantidad;
    private String estado;

    public Devolucion(String motivo, int cantidad) {
        this.motivo = motivo;
        this.cantidad = cantidad;
    }
    

    public String getMotivo() {
        return motivo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
