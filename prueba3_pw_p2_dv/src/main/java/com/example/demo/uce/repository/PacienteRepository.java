package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.repository.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepository implements IPacienteRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insertarPaciente(Paciente paciente) {	
		this.em.persist(paciente);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		TypedQuery<Paciente> myQuery = this.em.createQuery("SELECT e FROM Paciente e WHERE e.paci_cedula = :dato", Paciente.class);
		myQuery.setParameter("dato", cedula);
		return myQuery.getSingleResult();
	}

}
