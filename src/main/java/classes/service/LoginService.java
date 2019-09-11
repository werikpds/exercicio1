package classes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classes.model.Usuario;
import classes.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
	return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
	 usuario.getSenha()) != null;
	}
}
