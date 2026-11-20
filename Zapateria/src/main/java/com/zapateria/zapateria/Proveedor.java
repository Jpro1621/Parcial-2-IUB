/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author estudiante
 */
public class Proveedor {
    private String nit;
    private String direccion;
    private String correo;
    private long telefono;
    private String razonSocial;

    public Proveedor(String nit, String direccion, String correo, long telefono, String razonSocial) {
        this.nit = nit;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
