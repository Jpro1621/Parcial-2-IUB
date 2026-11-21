/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author estudiante
 */
public class MateriaPrima {
    private String nombre;
    private int stock;
    private String unidad;

    public MateriaPrima(String nombre, String unidad) {
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
}
