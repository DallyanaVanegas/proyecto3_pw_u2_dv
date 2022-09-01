package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.controller.DTO.Cita_medica_DTO;
import com.example.demo.uce.controller.DTO.Cita_medica_DTO2;
import com.example.demo.uce.repository.ICitaMedicaRepository;
import com.example.demo.uce.repository.modelo.Cita_medica;
import com.example.demo.uce.repository.modelo.Paciente;

@Service
public class CitaService implements ICitaService{

	@Autowired
	public ICitaMedicaRepository er;
	@Autowired
	public IDoctorService ds;
	@Autowired
	public IPacienteService ps;
	
	@Override
	public void agendarCita(Cita_medica_DTO cita) {
		Cita_medica cit = new Cita_medica();
		cit.setCime_numero_cita(cita.getNumero_cita());
		cit.setCime_fecha_cita(cita.getFecha_cita());
		cit.setCime_valor_cita(cita.getValor_cita());
		cit.setCime_lugar_cita(cita.getLugar_cita());
		cit.setDoctor(ds.buscarPorCedula(cita.getCedula_doctor()));
		cit.setPaciente(ps.buscarPorCedula(cita.getCedula_paciente()));
		
		this.er.agendarCita(cit);
	}

	@Override
	public void actualizarCita(Cita_medica_DTO2 cita) {
		Cita_medica cit = new Cita_medica();
		cit.setCime_numero_cita(cita.getNumero_cita());
		cit.setCime_diagnostico(cita.getDiagnostico());
		cit.setCime_receta(cita.getReceta());
		cit.setCime_fecha_proxima_cita(cita.getFecha());

		this.er.actualizarCita(cit);
	}

	@Override
	public List<Cita_medica> citasMedicasPendientes(String cedula) {
		return this.er.citasMedicasPendientes(cedula);
	}

}
