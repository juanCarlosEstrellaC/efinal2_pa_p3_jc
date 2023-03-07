package com.example.demo.service;

import com.example.demo.modelo.Bodega;

public interface IBodegaService {

	public void insertarBodega(Integer id, String nombre, String numero, String direccion, String telefono);
	
	public void guardar(Bodega bodega);
	
}
