/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

/**
 *
 * @author jairo
 */
public class Turno {
    private String nombre;
    private String horainicio;
    private String horafinal;

    public Turno(String nombre, String horainicio, String horafinal) {
        this.nombre = nombre;
        this.horainicio = horainicio;
        this.horafinal = horafinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }
    
}
