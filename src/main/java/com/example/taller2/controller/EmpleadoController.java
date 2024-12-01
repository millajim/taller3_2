/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.taller2.controller;
import com.example.taller2.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author HP
 */
@Controller
public class EmpleadoController {
    @GetMapping("/formularioemple")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formemplea"; 
    }

    @PostMapping("/save")
    public String guardarFormulario(Empleado empleado, Model model) {
        double sueldoTotal = empleado.calcularSueldoTotal();
        model.addAttribute("sueldoTotal", sueldoTotal);
        model.addAttribute("empleado", empleado);
        return "resulemplea"; 
    }
}
