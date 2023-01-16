package unsis.edu.mx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unsis.edu.mx.entity.User;
import unsis.edu.mx.model.UserRepository;

@Service
public class UsuarioService {
	@Autowired
	UserRepository repository;

	public List<User> getUsuarios() {
		return repository.findAll();
	}

	public User getUsuario(Long idUsuario) {
		return repository.findById(idUsuario).get();
	}

	public User createUsuario(User usuario) {
		return repository.save(usuario);
	}
}
