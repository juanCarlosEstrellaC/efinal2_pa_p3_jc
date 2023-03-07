package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.repository.IBodegaRepository;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EvaluacionPaJeApplication implements CommandLineRunner {

	@Autowired
	private IBodegaService iBodegaService;
	
	@Autowired
	private IProductoService iProductoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EvaluacionPaJeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Bodega b = new Bodega();
		b.setNombre("b1");
		b.setDireccion("America");
		b.setTelefono("123456");
		this.iBodegaService.guardar(b);
		
		Producto p = new Producto();
		p.setNombre("cocacola");
		p.setCategoria("alimento");
		p.setStock(0	);
		this.iProductoService.guardar(p);
		
		
		
		//this.iBodegaRepository.insertarBodega(1, "uno", "djo", "", "jk");

	}

}
