package com.example.demo.uce.service;

import com.example.demo.uce.repository.modelo.Paciente;

public interface IPacienteService {
	
	public void insertarPaciente(Paciente paciente);
	public Paciente buscarPorCedula(String cedula);
	

}
