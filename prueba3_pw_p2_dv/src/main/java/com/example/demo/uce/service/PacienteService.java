package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IPacienteRepository;
import com.example.demo.uce.repository.modelo.Paciente;

@Service
public class PacienteService implements IPacienteService {

	@Autowired
	public IPacienteRepository er;
	
	@Override
	public void insertarPaciente(Paciente paciente) {
		this.er.insertarPaciente(paciente);
	}
	
	@Override
	public Paciente buscarPorCedula(String cedula) {
		return this.er.buscarPorCedula(cedula);
	}

}
