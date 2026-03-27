/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clinicalhospital.model;

import com.mycompany.clinicalhospital.model.Persona;

/**
 *
 * @author Andres Felipe Torres Padilla
 */

public class Medico extends Persona{
    private String especialidad;
    private String tarjetaProfesional;
    private int consultorio;

    public Medico() {
    }

    public Medico(String nombre, int edad, String cedula, String telefono, String especialidad, 
            String tarjetaProfesional, int consultorio) {
        super(nombre, edad, cedula, telefono);
        this.especialidad = especialidad;
        this.tarjetaProfesional = tarjetaProfesional;
        this.consultorio = consultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
    public void atender(Consulta c){
        System.out.println(toString() + c.toString());
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nEspecialidad: " + especialidad + 
                "\nTarjeta Profesional: " + tarjetaProfesional + 
                "\nConsultorio No." + consultorio;
    }
               
}