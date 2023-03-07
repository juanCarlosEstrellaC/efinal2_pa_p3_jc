package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.service.IBodegaService;

@Controller
@RequestMapping("/bodegas") // URL:   http://localhost:8080/bodegas/nuevabodega
public class BodegaController {

	@Autowired
	private IBodegaService iBodegaService;

	
	@GetMapping("/nuevabodega")
	public String paginaNuevaBodega(Bodega bodega) { 
		return "vista";
	}

	@PostMapping("/insertar") 	// Página intermedia, si la llamo desde la url en el navegador, no funcionará.
	public String insertarPersona(Bodega bodega) {
		this.iBodegaService.guardar(bodega);
		return "guardado";
	}
	
	
//	@GetMapping("/buscar")
//	public String buscarTodos(Model modelo) { 
//		List<Persona> lista = this.iBodegaService.buscarTodos();
//		modelo.addAttribute("personas", lista);
//		return "vistaListaPersonas";
//	}
//
//	
//	@DeleteMapping("/borrar/{id}")
//	public String borrarPersona(@PathVariable("id") Integer id) {
//		this.iBodegaService.eliminar(id);
//		return "redirect:/personas/buscar";		
//	}
//	
//	
//	@GetMapping("/buscarPorId/{id}") // Editar
//	public String buscarPorId(@PathVariable("id") Integer id, Model modelo){
//		Persona persona = this.iBodegaService.buscarPorId(id);		
//		modelo.addAttribute("persona", persona);					
//		return "vistaPersona";
//	}
//
//	@PutMapping("/actualizar/{id}")  // Actualizar
//	public String actualizarPorId(@PathVariable("id") Integer id, Persona persona) {
//		persona.setId(id);
//		this.iPersonaService.actualizar(persona);
//		return "redirect:/personas/buscar";
//	}	
	
}
