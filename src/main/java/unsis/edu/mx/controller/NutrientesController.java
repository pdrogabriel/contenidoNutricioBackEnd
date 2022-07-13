package unsis.edu.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unsis.edu.mx.entity.Nutrientes;
import unsis.edu.mx.service.NutrientesService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/calculo/nutrientes")
public class NutrientesController {
	@Autowired
	NutrientesService service;
	
	@GetMapping("/listar")
	public List<Nutrientes> getNutrientes() {
		return service.getNutrientes();
	}
	
	@GetMapping("/")
	public Nutrientes getNutriente() {		
		return service.getNutriente(new Long(1));
	}
}
