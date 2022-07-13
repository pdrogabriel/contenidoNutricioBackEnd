package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsis.edu.mx.entity.AlimentoNutriente;
import unsis.edu.mx.model.AlimentoNutrienteRepository;

@Service
public class AlimentoNutrienteService {
	@Autowired
	AlimentoNutrienteRepository repository;
	
	public List<AlimentoNutriente> getAlimentosNutrientes(){
		return repository.findAll();
	}

	public AlimentoNutriente getAlimentoNutriente(Long idAlimentoNutriente){
		return repository.findById(idAlimentoNutriente).get();
	}
	
	public List<AlimentoNutriente> getAlimentoNutrientes(Long idAlimento){
		return repository.getNutrienteByAlimento(idAlimento);
	}
	
}
