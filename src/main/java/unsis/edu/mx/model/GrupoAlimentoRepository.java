/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase modela las operaciones CRUD de GrupoAlimento.      *
 *****************************************************************************/

package unsis.edu.mx.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unsis.edu.mx.entity.GrupoAlimento;

@Repository
public interface GrupoAlimentoRepository extends JpaRepository<GrupoAlimento, Long> {
}
