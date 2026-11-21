/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author estudiante
 */
public class Bodega {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private Inventario inventario;
    private MateriaPrima materia;

    public Bodega(String codigo, String nombre, String ubicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public MateriaPrima getMateria() {
        return materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void setMateria(MateriaPrima materia) {
        this.materia = materia;
    }
    
}
