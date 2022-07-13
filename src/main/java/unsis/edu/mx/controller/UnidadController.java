package unsis.edu.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unsis.edu.mx.entity.Unidad;
import unsis.edu.mx.service.UnidadService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/calculo/unidad")
public class UnidadController {
	@Autowired
	UnidadService service;
	
	@GetMapping("/listar")
	public List<Unidad> getUnidades() {
		return service.getUnidades();
	}
	
	@GetMapping("/")
	public Unidad getAlimento() {		
		return service.getUnidad(new Long(1));
	}
}
