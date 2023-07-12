/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase se toma tal cual del siguiente repositorio:        *
 *              https://www.bezkoder.com/spring-boot-jwt-authentication/      *
 *****************************************************************************/

package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsis.edu.mx.entity.Role;
import unsis.edu.mx.model.RoleRepository;

@Service
public class RolService {
	@Autowired
	RoleRepository repository;

	public List<Role> getRoles(){
		return repository.findAll();
	}
	
	public Role getRol(Long idRol){
		return repository.findById(idRol).get();
	}
	
	public Role createRol(Role rol) {
		return repository.save(rol);
	}
}
