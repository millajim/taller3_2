/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.taller2.model;

/**
 *
 * @author HP
 */
public class Empleado {

    private double sueldoBase;
    private int horasExtra;

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }


    public double calcularSueldoTotal() {
        double tarifaPorHora = sueldoBase / 160; 
        return sueldoBase + (horasExtra * 8); 
    }
}
