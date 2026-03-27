/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clinicalhospital.model;

/**
 *
 * @author Andres Felipe Torres Padilla
 */
public class Consulta {
    private String fecha;
    private String motivo;
    private String diagnostico;
    private int duracionMinutos;
    
    public Consulta(){
        
    }

    public Consulta(String fecha, String motivo, String diagnostico, int duracionMinutos) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.duracionMinutos = duracionMinutos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    @Override
    public String toString() {
        return "\n\n\tHistoria Clinica\n\tConsulta\nFecha: " + fecha + 
                "\nMotivo: " + motivo + 
                "\nDiagnostico: " + diagnostico +
                "\nDuracion: " + duracionMinutos + "Min";
    }
    
    
}
