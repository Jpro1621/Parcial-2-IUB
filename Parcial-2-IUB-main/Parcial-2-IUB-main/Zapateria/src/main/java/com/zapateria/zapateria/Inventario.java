/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zapateria.zapateria;

import java.time.LocalDateTime;

/**
 *
 * @author jairo
 */
public class Inventario {
    private LocalDateTime fechamovimiento;
    private String movimiento;
    private int cantidad;
    private int stockactual;

    public Inventario(LocalDateTime fechamovimiento, int cantidad, int stockactual) {
        this.fechamovimiento = fechamovimiento;
        this.cantidad = cantidad;
        this.stockactual = stockactual;
    }

    public LocalDateTime getFechamovimiento() {
        return fechamovimiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getStockactual() {
        return stockactual;
    }

    public void setFechamovimiento(LocalDateTime fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setStockactual(int stockactual) {
        this.stockactual = stockactual;
    }
    
}
