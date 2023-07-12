/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase sirve de intermediario con los servicios de        *
 *              GrupoAlimento y el frontend que está codificado en Angular 13,*
 *              esta aplicación del backend sale por el puerto 8080 y el      *
 *              frontend por el puerto 4200.                                  *
 *****************************************************************************/

package unsis.edu.mx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unsis.edu.mx.entity.Alimento;
import unsis.edu.mx.entity.AlimentoNutriente;
import unsis.edu.mx.entity.AlimentoNutrienteAux;
import unsis.edu.mx.entity.GrupoAlimento;
import unsis.edu.mx.service.AlimentoNutrienteService;
import unsis.edu.mx.service.AlimentoService;
import unsis.edu.mx.service.GrupoAlimentoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/calculo/grupoalimento")
public class GrupoAlimentoController {
	@Autowired
	GrupoAlimentoService serviceGrupoAlimento;
	
	@Autowired
	AlimentoService serviceAlimento;
	
	@Autowired
	AlimentoNutrienteService serviceAlimentoNutriente;
	
	@GetMapping("/listar")
	public List<GrupoAlimento> getGrupoAlimentos() {
		return serviceGrupoAlimento.getGrupoAlimentos();
	}
	
	@GetMapping("/listarAlimentoByGrupoAlimento/{grupoAlimentoId}")
	public List<Alimento> getAlimentoByGrupoAlimento(@PathVariable("grupoAlimentoId") Long grupoAlimentoId) {
		return  serviceAlimento.getAlimentoByGrupoAlimento(grupoAlimentoId);
	}
	
	@GetMapping("/listarAlimento/{idAlimento}")
	public Alimento getAlimento(@PathVariable("idAlimento") Long idAlimento) {
		return  serviceAlimento.getAlimento(idAlimento);
	}
	
	@GetMapping("/listarAlimentoNutrientes/{idAlimento}")
	public List<AlimentoNutrienteAux> getAlimentoNutrientes(@PathVariable("idAlimento")Long idAlimento) {
		
		List<AlimentoNutriente> lista = serviceAlimentoNutriente.getAlimentoNutrientes(idAlimento);		
		List<AlimentoNutrienteAux> listaAlimentoNutrienteTemporal = new ArrayList<>();
		
		for (AlimentoNutriente alimentoNutriente : lista) {
			AlimentoNutrienteAux alimentoNutrienteTemporal = new AlimentoNutrienteAux();
			alimentoNutrienteTemporal.setCantidad(alimentoNutriente.getCantidad());
			alimentoNutrienteTemporal.setNutrientes(alimentoNutriente.getNutrientes());
			listaAlimentoNutrienteTemporal.add(alimentoNutrienteTemporal);
		}
		
		return listaAlimentoNutrienteTemporal;
	}
}
