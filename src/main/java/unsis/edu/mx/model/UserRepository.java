/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase se toma tal cual del siguiente repositorio:        *
 *              https://www.bezkoder.com/spring-boot-jwt-authentication/      *
 *****************************************************************************/

package unsis.edu.mx.model;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import unsis.edu.mx.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
	
	@Procedure(name = "spGetUsuarioActivoByUserName")	
	int spGetUsuarioActivoByUserName(String username);
	
	@Procedure(name = "spUpdateRolUsuario")	
	void spUpdateRolUsuario (int idUser, int idRol);
	
	
}