/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase modela las operaciones CRUD de AlimentoNutriente.  *
 *****************************************************************************/

package unsis.edu.mx.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import unsis.edu.mx.entity.AlimentoNutriente;

@Repository
public interface AlimentoNutrienteRepository extends JpaRepository<AlimentoNutriente, Long> {
	// @Query(value = "SELECT * FROM alimento WHERE
	// grupo_alimento_id=:grupoAlimentoId", nativeQuery=true)
	// @Query("from Country c where lower(c.name) like lower(?1)")

	/*
	 * @Query(value =
	 * "SELECT alinut.id_alimento_nutriente, alinut.alimento_id, alinut.nutriente_id, nut.nutriente, alinut.cantidad FROM alimento AS ali INNER JOIN alimento_nutriente AS alinut ON ali.id_alimento = alinut.alimento_id INNER JOIN nutrientes AS nut ON alinut.nutriente_id = nut.id_nutrientes WHERE ali.id_alimento=:idAlimento"
	 * , nativeQuery=true) List<AlimentoNutriente>
	 * getNutrienteByAlimento(@Param("idAlimento")Long idAlimento);
	 */

	@Query(value = "SELECT * FROM alimento_nutriente  WHERE alimento_id=:idAlimento", nativeQuery = true)
	List<AlimentoNutriente> getNutrienteByAlimento(@Param("idAlimento") Long idAlimento);

	// List<Alimento> getAlimentoByGrupoAlimentoId(@Param("grupoAlimentoId")Long
	// grupoAlimentoId);*/
}
