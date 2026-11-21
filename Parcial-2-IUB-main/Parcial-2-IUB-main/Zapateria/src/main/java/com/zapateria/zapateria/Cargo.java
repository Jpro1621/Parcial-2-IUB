/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author jairo
 */
public class Cargo {
    private String nombre;
    private String descripcion;
    private double salariobase;

    public Cargo(String nombre, String descripcion, double salariobase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.salariobase = salariobase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }
    
}
