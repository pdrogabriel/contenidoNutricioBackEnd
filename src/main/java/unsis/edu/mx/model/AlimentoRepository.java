package unsis.edu.mx.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import unsis.edu.mx.entity.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Long> {
	@Query(value = "SELECT * FROM alimento WHERE grupo_alimento_id=:grupoAlimentoId", nativeQuery=true)
	//@Query("from Country c where lower(c.name) like lower(?1)")
	 List<Alimento> getAlimentoByGrupoAlimentoId(Long grupoAlimentoId);
    //List<Alimento> getAlimentoByGrupoAlimentoId(@Param("grupoAlimentoId")Long grupoAlimentoId);
	
	

}
