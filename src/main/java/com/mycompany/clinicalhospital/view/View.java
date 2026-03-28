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
        hospital.registrarConsulta(new Consulta("03/06/2020","Dolor de muelas","Caries",30));      
        hospital.registrarConsulta(new Consulta("01/01/2025","Dolor de cabeza frecuente","Migraña",15));
        hospital.registrarConsulta(new Consulta("15/10/2025","Tos persistente","Bronquitis",15));
        
        //creacion de medico
        Medico m1 = new Medico("Carlos",40, "1005489257", "3152020350", "Medicina Interna", "Vigente", 15);
        Medico m2 = new Medico("Pedro", 60, "730459358", "3130282893", "Odontologia", "Vigente", 06);
        
        m1.atender(hospital.getConsulta(0));
        System.out.println("-".repeat(50));
        m2.atender(hospital.getConsulta(1));
        //lista de consultas
        hospital.listarConsultas();
        
        //tueno y consultorio
        m1.presentarse();
        m2.presentarse();
        
        
        m1.setConsultorio(20);
        hospital.getConsulta(2).setDiagnostico("Gripe");
        m2.setTarjetaProfesional("Vencida");
        
        
        System.out.println("El Medico: " + m2.getNombre()+ " tiene Tarjeta profesional" + m2.getTarjetaProfesional());
        System.out.println("Luego de estudios se diagostico : "+ hospital.getConsulta(2).getDiagnostico());
        
    }
}
