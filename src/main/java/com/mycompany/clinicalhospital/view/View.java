/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.clinicalhospital.view;

import com.mycompany.clinicalhospital.model.Consulta;
import com.mycompany.clinicalhospital.model.Hospital;
import com.mycompany.clinicalhospital.model.Medico;

/**
 *
 * @author Acer
 */
public class View {

    public static void main(String[] args) {
        //creacion de hospital
        Hospital hospital = new Hospital();
        hospital.setNombre("Clinica Santa María");
        hospital.setCiudad("Cartagena");
        
        
        //creacion de consultas
        Consulta c = new Consulta();
        
        c.setFecha("03/06/2020");
        c.setMotivo("Dolor de muelas");
        c.setDiagnostico("Caries");
        c.setDuracionMinutos(30);
        hospital.registrarConsulta(new Consulta(c.getFecha(),c.getMotivo(),c.getDiagnostico(),c.getDuracionMinutos()));
        
        c.setFecha("01/01/2025");
        c.setMotivo("Dolor de cabeza frecuente");
        c.setDiagnostico("Migraña");
        c.setDuracionMinutos(15);
        hospital.registrarConsulta(new Consulta(c.getFecha(),c.getMotivo(),c.getDiagnostico(),c.getDuracionMinutos()));
        
        c.setFecha("015/10/2025");
        c.setMotivo("Tos persistente");
        c.setDiagnostico("Bronquitis");
        c.setDuracionMinutos(15);
        hospital.registrarConsulta(new Consulta(c.getFecha(),c.getMotivo(),c.getDiagnostico(),c.getDuracionMinutos()));
        
        //creacion de medico
        Medico m1 = new Medico("Carlos",40, "1005489257", "3152020350", "Medicina Interna", "Vigente", 15);
        Medico m2 = new Medico("Pedro", 60, "730459358", "3130282893", "Odontologia", "Vigente", 06);
        
        m1.atender(hospital.getConsulta(0));
        System.out.println("-".repeat(50));
        m2.atender(hospital.getConsulta(1));
    }
}
