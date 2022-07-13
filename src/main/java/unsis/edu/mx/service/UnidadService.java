package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unsis.edu.mx.entity.Unidad;
import unsis.edu.mx.model.UnidadRepository;

@Service
public class UnidadService {
	@Autowired
	UnidadRepository repository;

	public List<Unidad> getUnidades(){
		return repository.findAll();
	}
	
	public Unidad getUnidad(Long idUnidad){
		return repository.findById(idUnidad).get();
	}
}
