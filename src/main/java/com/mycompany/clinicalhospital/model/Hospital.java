/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clinicalhospital.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Felipe Torres Padilla
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<Consulta> consultas = new ArrayList<>();
    
    public Hospital(){
        
    }

    public Hospital(String nombre, String ciudad, ArrayList<Consulta> consultas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = consultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Consulta> getConsulta() {
        return consultas;
    }

    public void setConsulta(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    //reglas del negocio
    public void registrarConsulta(Consulta c){
        consultas.add(c);
    }
    
    public Consulta getConsulta(int i){
        return consultas.get(i);
    }    
}
