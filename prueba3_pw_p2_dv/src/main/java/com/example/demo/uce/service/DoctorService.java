package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IDoctorRepository;
import com.example.demo.uce.repository.modelo.Doctor;

@Service
public class DoctorService implements IDoctorService {
	
	@Autowired
	public IDoctorRepository er;

	@Override
	public void crear(Doctor doctor) {
		this.er.crear(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.er.actualizar(doctor);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.er.eliminar(id);
		
	}

	@Override
	public Doctor buscar(Integer id) {
		return this.er.buscar(id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		return this.er.buscarPorCedula(cedula);
	}

}
