package com.example.demo.uce.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {
	@Id
	@Column(name="paci_id")
	private Integer paci_id;
	@Column(name="paci_cedula")
	private String paci_cedula;
	@Column(name="paci_nombre")
	private String paci_nombre;
	@Column(name="paci_apellido")
	private String paci_apellido;
	@Column(name="paci_fecha_nacimiento")
	private LocalDate paci_fecha_nacimiento;
	@Column(name="paci_codigo_seguro")
	private Integer paci_codigo_seguro;
	@Column(name="paci_estatura")
	private Integer paci_estatura;
	@Column(name="paci_peso")
	private String paci_peso;
	@Column(name="paci_genero")
	private String paci_genero;
	
	@OneToMany(mappedBy = "paciente")
	private List<Cita_medica> cita_medica;
	

	public Integer getPaci_id() {
		return paci_id;
	}
	public void setPaci_id(Integer paci_id) {
		this.paci_id = paci_id;
	}
	
	public String getPaci_cedula() {
		return paci_cedula;
	}
	public void setPaci_cedula(String paci_cedula) {
		this.paci_cedula = paci_cedula;
	}
	public String getPaci_nombre() {
		return paci_nombre;
	}
	public void setPaci_nombre(String paci_nombre) {
		this.paci_nombre = paci_nombre;
	}
	public String getPaci_apellido() {
		return paci_apellido;
	}
	public void setPaci_apellido(String paci_apellido) {
		this.paci_apellido = paci_apellido;
	}
	public LocalDate getPaci_fecha_nacimiento() {
		return paci_fecha_nacimiento;
	}
	public void setPaci_fecha_nacimiento(LocalDate paci_fecha_nacimiento) {
		this.paci_fecha_nacimiento = paci_fecha_nacimiento;
	}
	public Integer getPaci_codigo_seguro() {
		return paci_codigo_seguro;
	}
	public void setPaci_codigo_seguro(Integer paci_codigo_seguro) {
		this.paci_codigo_seguro = paci_codigo_seguro;
	}
	public Integer getPaci_estatura() {
		return paci_estatura;
	}
	public void setPaci_estatura(Integer paci_estatura) {
		this.paci_estatura = paci_estatura;
	}
	public String getPaci_peso() {
		return paci_peso;
	}
	public void setPaci_peso(String paci_peso) {
		this.paci_peso = paci_peso;
	}
	public String getPaci_genero() {
		return paci_genero;
	}
	public void setPaci_genero(String paci_genero) {
		this.paci_genero = paci_genero;
	}
	public List<Cita_medica> getCita_medica() {
		return cita_medica;
	}
	public void setCita_medica(List<Cita_medica> cita_medica) {
		this.cita_medica = cita_medica;
	}
	
	
}
	
	
	
	