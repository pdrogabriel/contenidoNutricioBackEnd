/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase sirve de intermediario con los servicios de        *
 *              Usuario y el frontend que está codificado en Angular 13, esta *
 *              aplicación del backend sale por el puerto 8080 y el frontend  *
 *              por el puerto 4200.                                           *
 *****************************************************************************/

package unsis.edu.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unsis.edu.mx.entity.User;
import unsis.edu.mx.service.UsuarioService;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/usuario")
public class UsuarioControllerAcces {
	@Autowired
	UsuarioService service;

	@GetMapping("/list")
	public List<User> getUsuarios() {
		return service.getUsuarios();
	}
	
	@GetMapping("/acceso/{username}")
	public int spGetUsuarioActivoByUserName(@PathVariable("username") String username) {
		return service.spGetUsuarioActivoByUserName(username);
	}

	@PutMapping("/update/{id}")
	public void updateUsuario(@RequestBody User usuario, @PathVariable("id") Long id) {
		usuario.setId(id);
		service.updateUsuario(usuario);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUsuario(@PathVariable("id") Long id) {
		service.deleteUsuario(id);
	}
	
	@PutMapping("/updateUsuarioRol/{id}")
	public void spUpdateRolUsuario(@RequestBody User usuario, @PathVariable Integer id) {
		service.spUpdateRolUsuario(Math.toIntExact(usuario.getId()), id);
	}
}
