package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inve_seq")
	@SequenceGenerator(name = "inve_seq", sequenceName = "inve_seq", allocationSize = 1) 
	@Column(name = "prod_id")
	private Integer id;
	
	//Relaciones
	@ManyToOne
	@JoinColumn(name = "inve_id_bodega")
	private Bodega miBodega;

	//Relaciones
	@ManyToOne
	@JoinColumn(name = "inve_id_producto")
	private Producto miProducto;
	
}