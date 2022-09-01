package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.repository.modelo.Cita_medica;

public interface ICitaMedicaRepository {
	
	public void agendarCita(Cita_medica cita);
	public void actualizarCita(Cita_medica cita);
	public List<Cita_medica> citasMedicasPendientes(String cedula);
	
}
