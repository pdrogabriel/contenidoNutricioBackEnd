/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase modela las operaciones CRUD de Unidad.             *
 *****************************************************************************/

package unsis.edu.mx.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unsis.edu.mx.entity.Unidad;

@Repository
public interface UnidadRepository extends JpaRepository<Unidad, Long> {
}
