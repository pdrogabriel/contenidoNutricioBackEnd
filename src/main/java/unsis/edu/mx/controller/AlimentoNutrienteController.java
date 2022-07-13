package unsis.edu.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unsis.edu.mx.entity.AlimentoNutriente;
import unsis.edu.mx.service.AlimentoNutrienteService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/calculo/alimentonutriente")
public class AlimentoNutrienteController {
	@Autowired
	AlimentoNutrienteService service;
	
	@GetMapping("/listar")
	public List<AlimentoNutriente> getAlimentosNutrientes() {
		return service.getAlimentosNutrientes();
	}
	
	@GetMapping("/")
	public AlimentoNutriente getAlimentoNutriente() {		
		return service.getAlimentoNutriente(new Long(1));
	}
}
