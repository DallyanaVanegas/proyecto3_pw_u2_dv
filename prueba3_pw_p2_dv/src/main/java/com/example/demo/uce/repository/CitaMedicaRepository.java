package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.controller.DTO.Cita_medica_DTO;
import com.example.demo.uce.repository.modelo.Cita_medica;
import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.service.DoctorService;

@Repository
@Transactional
public class CitaMedicaRepository implements ICitaMedicaRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void agendarCita(Cita_medica cita) {
		this.em.persist(cita);
		
	}

	@Override
	public void actualizarCita(Cita_medica cita) {
		this.em.merge(cita);
		
	}

	@Override
	public List<Cita_medica> citasMedicasPendientes(String cedula) {
		//Doctor doc= this.ds.buscarPorCedula(cedula_doc);
		TypedQuery<Cita_medica> myQuery = this.em.createQuery("SELECT e FROM Cita_medica e "
				+ "WHERE e.doctor.doct_cedula = :cedula_doc and "
				+ "e.cime_diagnostico == null and "
				+ "e.cime_receta == null and "
				+ "e.cime_fecha_proxima_cita == null ", Cita_medica.class);
		myQuery.setParameter("cedula_doc", cedula);
		return myQuery.getResultList();
		
	}


}
