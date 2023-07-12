/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase sirve de intermediario con los servicios de        *
 *              AlimentoNutriente y el frontend que está codificado en        *
 *              Angular 13, esta aplicación del backend sale por el           *
 *              puerto 8080 y el frontend por el puerto 4200.                 *
 *****************************************************************************/

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
