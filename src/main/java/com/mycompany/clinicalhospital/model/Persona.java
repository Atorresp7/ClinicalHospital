/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clinicalhospital.model;

/**
 *
 * @author Andres Felipe Torres Padilla
 */
public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private String telefono;
    
    public Persona(){}
    
    public Persona(String nombre, int edad, String cedula, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
        }
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad >= 0 && edad<=120){
           this.edad = edad; 
        }
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        if(!cedula.isEmpty()){
            this.cedula = cedula;
        }
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n\n\tPersona \nNombre: " + nombre + "\nEdad: " + edad + "\nCedula: " + cedula
                 + "\nTelefono: " + telefono;
    }
    
    
}
