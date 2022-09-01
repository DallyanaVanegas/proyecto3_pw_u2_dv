package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.modelo.Paciente;
import com.example.demo.uce.service.IPacienteService;

@RestController
@RequestMapping("/ApiPacientes/V1/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService ds;
	
	@PostMapping()
	public String insertarPaciente(@RequestBody Paciente paci) {
		String mensaje="Paciente insertado correctamente";
		try {
			this.ds.insertarPaciente(paci);
		} catch (Exception e) {
			mensaje="Error intente más tarde";
		}
		return mensaje;
	}

	
	@GetMapping(path = "/{cedulaPaciente}")
	public ResponseEntity<Paciente> buscarPorCedula(@PathVariable("cedulaPaciente") String cedula) {
		Paciente empl = this.ds.buscarPorCedula(cedula);
		return ResponseEntity.ok(empl);
	}
	

	
	
	

}
