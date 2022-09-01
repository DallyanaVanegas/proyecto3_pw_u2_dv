package com.example.demo.uce.controller.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cita_medica_DTO {
	
	private Integer numero_cita;
	private LocalDate fecha_cita;
	private BigDecimal valor_cita;
	private String lugar_cita;
	private String cedula_doctor;
	private String cedula_paciente;

	public Integer getNumero_cita() {
		return numero_cita;
	}
	public void setNumero_cita(Integer numero_cita) {
		this.numero_cita = numero_cita;
	}
	public LocalDate getFecha_cita() {
		return fecha_cita;
	}
	public void setFecha_cita(LocalDate fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	public BigDecimal getValor_cita() {
		return valor_cita;
	}
	public void setValor_cita(BigDecimal valor_cita) {
		this.valor_cita = valor_cita;
	}
	public String getLugar_cita() {
		return lugar_cita;
	}
	public String getCedula_doctor() {
		return cedula_doctor;
	}
	public void setCedula_doctor(String cedula_doctor) {
		this.cedula_doctor = cedula_doctor;
	}
	public String getCedula_paciente() {
		return cedula_paciente;
	}
	public void setCedula_paciente(String cedula_paciente) {
		this.cedula_paciente = cedula_paciente;
	}
	public void setLugar_cita(String lugar_cita) {
		this.lugar_cita = lugar_cita;
	}
	
	
	
	
	


}
