package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsis.edu.mx.entity.Alimento;
import unsis.edu.mx.model.AlimentoRepository;

@Service
public class AlimentoService {
	@Autowired
	AlimentoRepository repository;
	
	public List<Alimento> getAlimentos(){
		return repository.findAll();
	}
	
	public Alimento getAlimento(Long idAlimento){
		return repository.findById(idAlimento).get();
	}

	public List<Alimento> getAlimentoByGrupoAlimento(Long grupoAlimentoId){
		return repository.getAlimentoByGrupoAlimentoId(grupoAlimentoId);
	}
}
