package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepository  implements IDoctorRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void crear(Doctor doctor) {
		this.em.persist(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.em.merge(doctor);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.em.remove(buscar(id));
		
	}

	@Override
	public Doctor buscar(Integer id) {
		return this.em.find(Doctor.class,id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		TypedQuery<Doctor> myQuery = this.em.createQuery("SELECT e FROM Doctor e WHERE e.doct_cedula = :dato", Doctor.class);
		myQuery.setParameter("dato", cedula);
		return myQuery.getSingleResult();
	}

}
