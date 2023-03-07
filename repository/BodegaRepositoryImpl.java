package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BodegaRepositoryImpl implements IBodegaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarBodega(Integer id, String nombre, String numero, String direccion, String telefono) {
		Query nativeQuery = this.entityManager.createNativeQuery("INSERT INTO bodega(bode_id, bode_direccion, bode_nombre, bode_numero, bode_telefono) VALUES (:datoId,  :datoDir,  :datoNombre,  :datoNum,  :datoTelf)", Bodega.class);
		nativeQuery.setParameter("datoNombre", nombre);
		nativeQuery.setParameter("datoNum", numero);
		nativeQuery.setParameter("datoDir", direccion);
		nativeQuery.setParameter("datoTelf", telefono);
		nativeQuery.setParameter("datoId", id);

		nativeQuery.executeUpdate();
	}

	@Override
	public void guardar(Bodega bodega) {
		this.entityManager.persist(bodega);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
