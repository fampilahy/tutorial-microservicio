package force.backend.tutorialmicroservicio.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import force.backend.tutorialmicroservicio.dao.UsuarioDao;
import force.backend.tutorialmicroservicio.model.Usuario;

@RestController
@RequestMapping(value = "Usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioDao usuarioDao;

	@PostMapping
	public Usuario createUser(@RequestBody Usuario usuario) {
		return usuarioDao.createUser(usuario);
	}

	@GetMapping(value="{id}")
	public Usuario getUser(@PathVariable Integer id) {
		return usuarioDao.getUser(id);
	}

	@GetMapping
	public List<Usuario> listUsers() {
		return usuarioDao.listUsers();
	}
}
