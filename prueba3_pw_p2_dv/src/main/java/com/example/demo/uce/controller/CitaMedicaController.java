package com.example.demo.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.controller.DTO.Cita_medica_DTO;
import com.example.demo.uce.controller.DTO.Cita_medica_DTO2;
import com.example.demo.uce.repository.modelo.Cita_medica;
import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.service.ICitaService;

@RestController
@RequestMapping("/ApiCitaMedica/V1/citasMedicas")
public class CitaMedicaController {
	
	@Autowired
	private ICitaService cs;
	
	@PostMapping()
	public String agendarCita(@RequestBody Cita_medica_DTO cita) {
		String mensaje="Cita insertada correctamente";
		try {
			this.cs.agendarCita(cita);
		} catch (Exception e) {
			mensaje="Error intente más tarde";
		}
		return mensaje;
	}
	
	@PutMapping
	public String actualizarCita(@RequestBody Cita_medica_DTO2 cita) {
		String mensaje="Cita actualizado correctamente";
		try {
			this.cs.actualizarCita(cita);
		} catch (Exception e) {
			mensaje="Error intente más tarde";
		}
		return mensaje;	
	}
	
	@GetMapping(path = "/cedula")
	public List<Cita_medica> todasLasCitasPendientes(@RequestParam(value = "cedula") String cedula) {
		return this.cs.citasMedicasPendientes(cedula);
	}
	
	
}
