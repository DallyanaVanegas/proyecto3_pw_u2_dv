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

import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.service.IDoctorService;

@RestController
@RequestMapping("/ApiDoctores/V1/doctores")
public class DoctorController {
	
	@Autowired
	private IDoctorService ds;
	
	@PostMapping()
	public String crear(@RequestBody Doctor doctor) {
		String mensaje="Doctor insertado correctamente";
		try {
			this.ds.crear(doctor);
		} catch (Exception e) {
			mensaje="Error intente más tarde";
		}
		return mensaje;
	}
	
	@PutMapping
	public String actualizar(@RequestBody Doctor doctor) {
		String mensaje="Doctor actualizado correctamente";
		try {
			this.ds.actualizar(doctor);
		} catch (Exception e) {
			mensaje="Error intente más tarde";
		}
		return mensaje;	
	}
	
	@GetMapping(path = "/{idDoctor}")
	public ResponseEntity<Doctor> buscar(@PathVariable("idDoctor") Integer id) {
		Doctor empl = this.ds.buscar(id);
		return ResponseEntity.ok(empl);
	}
	
	@DeleteMapping(path= "/{idDoctor}")
	public String eliminar(@PathVariable("idDoctor") Integer id) {
		this.ds.eliminar(id);
		return "Doctor eliminado con exito";
		
	}


}
