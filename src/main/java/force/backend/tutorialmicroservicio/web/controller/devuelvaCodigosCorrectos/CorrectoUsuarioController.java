package force.backend.tutorialmicroservicio.web.controller.devuelvaCodigosCorrectos;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import force.backend.tutorialmicroservicio.dao.UsuarioDao;
import force.backend.tutorialmicroservicio.model.Usuario;

@RestController
@RequestMapping(value = "correcto/Usuarios")
public class CorrectoUsuarioController {

	@Autowired
	UsuarioDao usuarioDao;

	@PostMapping
	public ResponseEntity<Void> createUser(@RequestBody Usuario usuario) {
		Usuario usuarioCreado = usuarioDao.createUser(usuario);
		if(usuarioCreado!=null){
			
			URI location = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(usuarioCreado.getId())
					.toUri();
			
			return ResponseEntity.created(location).build();
			
		}else return ResponseEntity.noContent().build();
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<Usuario> getUser(@PathVariable Integer id) {
		Usuario usuario = usuarioDao.getUser(id);
		if(usuario!=null){
			return ResponseEntity.ok(usuario);
		}else 
			return ResponseEntity.noContent().build();
	}

	@GetMapping
	public List<Usuario> listUsers() {
		return usuarioDao.listUsers();
	}
}
