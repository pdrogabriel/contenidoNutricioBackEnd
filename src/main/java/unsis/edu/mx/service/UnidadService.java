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
import unsis.edu.mx.entity.Unidad;
import unsis.edu.mx.model.UnidadRepository;

@Service
public class UnidadService {
	@Autowired
	UnidadRepository repository;

	public List<Unidad> getUnidades(){
		return repository.findAll();
	}
	
	public Unidad getUnidad(Long idUnidad){
		return repository.findById(idUnidad).get();
	}
}
