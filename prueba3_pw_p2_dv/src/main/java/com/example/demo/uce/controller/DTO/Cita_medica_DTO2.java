package com.example.demo.uce.controller.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cita_medica_DTO2 {
	
	private Integer numero_cita;
	private String diagnostico;
	private String receta;
	private LocalDate fecha;
	
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getNumero_cita() {
		return numero_cita;
	}
	public void setNumero_cita(Integer numero_cita) {
		this.numero_cita = numero_cita;
	}
	
	
	
	
	
	
	


}
