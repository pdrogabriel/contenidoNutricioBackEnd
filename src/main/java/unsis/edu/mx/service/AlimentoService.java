/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase modela los servicios que el controlador solicita   * 
 *              a través de la comunicación con el frontend.                  *
 *****************************************************************************/

package unsis.edu.mx.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsis.edu.mx.entity.Alimento;
import unsis.edu.mx.model.AlimentoRepository;

@Service
public class AlimentoService {
	@Autowired
	AlimentoRepository repository;
	
	public List<Alimento> getAlimentos(){
		return repository.findAll();
	}
	
	public Alimento getAlimento(Long idAlimento){
		return repository.findById(idAlimento).get();
	}

	public List<Alimento> getAlimentoByGrupoAlimento(Long grupoAlimentoId){
		return repository.getAlimentoByGrupoAlimentoId(grupoAlimentoId);
	}
}
