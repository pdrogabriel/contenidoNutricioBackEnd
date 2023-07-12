/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase modela las operaciones CRUD de Alimento.           *
 *****************************************************************************/

package unsis.edu.mx.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import unsis.edu.mx.entity.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
	@Query(value = "SELECT * FROM alimento WHERE grupo_alimento_id=:grupoAlimentoId", nativeQuery = true)
	// @Query("from Country c where lower(c.name) like lower(?1)")
	List<Alimento> getAlimentoByGrupoAlimentoId(Long grupoAlimentoId);
	// List<Alimento> getAlimentoByGrupoAlimentoId(@Param("grupoAlimentoId")Long
	// grupoAlimentoId);
}
