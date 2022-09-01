package com.example.demo.uce.service;

import com.example.demo.uce.repository.modelo.Doctor;

public interface IDoctorService {
	
	public void crear(Doctor doctor);
	public void actualizar(Doctor doctor);
	public void eliminar(Integer id);
	public Doctor buscar (Integer id);
	public Doctor buscarPorCedula(String cedula);
}
