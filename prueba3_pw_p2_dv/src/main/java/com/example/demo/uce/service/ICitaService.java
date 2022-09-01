package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.controller.DTO.Cita_medica_DTO;
import com.example.demo.uce.controller.DTO.Cita_medica_DTO2;
import com.example.demo.uce.repository.modelo.Cita_medica;
import com.example.demo.uce.repository.modelo.Paciente;

public interface ICitaService {
	
	public void agendarCita(Cita_medica_DTO cita);
	public void actualizarCita(Cita_medica_DTO2 cita);
	public List<Cita_medica> citasMedicasPendientes(String cedula);
}
