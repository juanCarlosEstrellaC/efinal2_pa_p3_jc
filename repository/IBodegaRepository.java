package com.example.demo.repository;

import com.example.demo.modelo.Bodega;

public interface IBodegaRepository {

	public void insertarBodega(Integer id, String nombre, String numero, String direccion, String telefono);
	
	public void guardar(Bodega bodega);

}
