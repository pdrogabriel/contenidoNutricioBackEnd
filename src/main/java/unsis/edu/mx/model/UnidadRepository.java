package unsis.edu.mx.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unsis.edu.mx.entity.Unidad;

@Repository
public interface UnidadRepository extends JpaRepository<Unidad, Long> {
}
