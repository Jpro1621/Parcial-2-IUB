/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author estudiante
 */
public class Trabajador {
    private char sexo;
    private String formacion;
    private OrdenProduccion orden;
    private Cargo cargo;
    private Turno turno;
    private Persona persona;

    public Trabajador(String formacion) {
        this.formacion = formacion;
    }

    public OrdenProduccion getOrden() {
        return orden;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Turno getTurno() {
        return turno;
    }

    public Persona getPersona() {
        return persona;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public void setOrden(OrdenProduccion orden) {
        this.orden = orden;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

  
    
    
}
