package com.example.demo.uce.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@Column(name="doct_id")
	private Integer doct_id;
	@Column(name="doct_cedula")
	private String doct_cedula;
	@Column(name="doct_nombre")
	private String doct_nombre;
	@Column(name="doct_apellido")
	private String doct_apellido;
	@Column(name="doct_fecha_nacimiento")
	private LocalDate doct_fecha_nacimiento;
	@Column(name="doct_numero_consultorio")
	private Integer doct_numero_consultorio;
	@Column(name="doct_codigo_senecyt")
	private Integer doct_codigo_senecyt;
	@Column(name="doct_genero")
	private String doct_genero;
	
	@OneToMany(mappedBy = "doctor")
	private List<Cita_medica> cita_medica;
	
	public Integer getDoct_id() {
		return doct_id;
	}

	public void setDoct_id(Integer doct_id) {
		this.doct_id = doct_id;
	}

	public String getDoct_cedula() {
		return doct_cedula;
	}

	public void setDoct_cedula(String doct_cedula) {
		this.doct_cedula = doct_cedula;
	}

	public String getDoct_nombre() {
		return doct_nombre;
	}

	public void setDoct_nombre(String doct_nombre) {
		this.doct_nombre = doct_nombre;
	}

	public String getDoct_apellido() {
		return doct_apellido;
	}

	public void setDoct_apellido(String doct_apellido) {
		this.doct_apellido = doct_apellido;
	}

	public LocalDate getDoct_fecha_nacimiento() {
		return doct_fecha_nacimiento;
	}

	public void setDoct_fecha_nacimiento(LocalDate doct_fecha_nacimiento) {
		this.doct_fecha_nacimiento = doct_fecha_nacimiento;
	}

	public Integer getDoct_numero_consultorio() {
		return doct_numero_consultorio;
	}

	public void setDoct_numero_consultorio(Integer doct_numero_consultorio) {
		this.doct_numero_consultorio = doct_numero_consultorio;
	}

	public Integer getDoct_codigo_senecyt() {
		return doct_codigo_senecyt;
	}

	public void setDoct_codigo_senecyt(Integer doct_codigo_senecyt) {
		this.doct_codigo_senecyt = doct_codigo_senecyt;
	}

	public String getDoct_genero() {
		return doct_genero;
	}

	public void setDoct_genero(String doct_genero) {
		this.doct_genero = doct_genero;
	}

	public List<Cita_medica> getCita_medica() {
		return cita_medica;
	}

	public void setCita_medica(List<Cita_medica> cita_medica) {
		this.cita_medica = cita_medica;
	}
	
	
	
	
	

}
