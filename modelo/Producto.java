package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
	@SequenceGenerator(name = "prod_seq", sequenceName = "prod_seq", allocationSize = 1) 
	@Column(name = "prod_id")
	private Integer id;
	
	@Column(name = "prod_nombre")
	private String nombre;
	
	@Column(name = "prod_codigo_barras_maestro")
	private String codigoBarrasMaestro;
	
	@Column(name = "prod_categoria")
	private String categoria;

	@Column(name = "prod_stock")
	private Integer stock;
	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	//Relaciones
	@OneToMany(mappedBy = "miProducto")
	private List<Inventario> miListaInventarioProd;

	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigoBarrasMaestro=" + codigoBarrasMaestro
				+ ", categoria=" + categoria + "]";
	}

	//Get y Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}

	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Inventario> getMiListaInventarioProd() {
		return miListaInventarioProd;
	}

	public void setMiListaInventarioProd(List<Inventario> miListaInventarioProd) {
		this.miListaInventarioProd = miListaInventarioProd;
	}
	
	
	
	
	
}