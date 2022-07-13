package unsis.edu.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unsis.edu.mx.entity.Alimento;
import unsis.edu.mx.service.AlimentoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/calculo/alimento")
public class AlimentoController {
	@Autowired
	AlimentoService service;
	
	@GetMapping("/listar")
	public List<Alimento> getGrupoAlimentos() {
		return service.getAlimentos();
	}
}
