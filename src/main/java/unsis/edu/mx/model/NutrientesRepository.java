package unsis.edu.mx.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unsis.edu.mx.entity.Nutrientes;

@Repository
public interface NutrientesRepository extends JpaRepository<Nutrientes, Long> {
}
