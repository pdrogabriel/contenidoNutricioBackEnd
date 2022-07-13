package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unsis.edu.mx.entity.GrupoAlimento;
import unsis.edu.mx.model.GrupoAlimentoRepository;

@Service
public class GrupoAlimentoService {
	@Autowired
	GrupoAlimentoRepository repository;
	
	public List<GrupoAlimento> getGrupoAlimentos(){
		return repository.findAll();
	}
}
