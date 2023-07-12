/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase se toma tal cual del siguiente repositorio:        *
 *              https://www.bezkoder.com/spring-boot-jwt-authentication/      *
 *                                                                            *
 *              Se agrega el método updateUsuario.                            *
 *****************************************************************************/

package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unsis.edu.mx.entity.User;
import unsis.edu.mx.model.UserRepository;

@Service
public class UsuarioService {
	@Autowired
	UserRepository repository;

	public List<User> getUsuarios() {
		return repository.findAll();
	}

	public User getUsuario(Long idUsuario) {
		return repository.findById(idUsuario).get();
	}

	public User createUsuario(User usuario) {
		return repository.save(usuario);
	}
	
	public void deleteUsuario(Long id) {
		repository.deleteById(id);
	}
	
	public void updateUsuario(User usuario) {
		repository.save(usuario);
	}
	
	public void spUpdateRolUsuario(int idUser, int idRol) {
		repository.spUpdateRolUsuario(idUser, idRol);
	}
	
	public int spGetUsuarioActivoByUserName(String username) {
		return repository.spGetUsuarioActivoByUserName(username);
	}
}
