package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.repository.IBodegaRepository;

@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepository iBodegaRepository;
	
	@Override
	public void insertarBodega(Integer id, String nombre, String numero, String direccion, String telefono) {
		this.iBodegaRepository.insertarBodega(id, nombre, numero, direccion, telefono);
	}

	@Override
	public void guardar(Bodega bodega) {
		this.iBodegaRepository.guardar(bodega);
	}

	
	
}
