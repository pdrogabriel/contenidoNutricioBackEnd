package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsis.edu.mx.entity.Nutrientes;
import unsis.edu.mx.model.NutrientesRepository;

@Service
public class NutrientesService {
	@Autowired
	NutrientesRepository repository;
	
	public List<Nutrientes> getNutrientes(){
		return repository.findAll();
	}

	public Nutrientes getNutriente(Long idNutriente){
		return repository.findById(idNutriente).get();
	}

}
