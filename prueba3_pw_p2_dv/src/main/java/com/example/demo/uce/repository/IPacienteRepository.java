package com.example.demo.uce.repository;

import com.example.demo.uce.repository.modelo.Paciente;

public interface IPacienteRepository {
	
	public void insertarPaciente(Paciente paciente);
	public Paciente buscarPorCedula(String cedula);


}
