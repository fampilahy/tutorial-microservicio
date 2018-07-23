package force.backend.tutorialmicroservicio.dao;

import java.util.List;

import force.backend.tutorialmicroservicio.model.Usuario;

public interface UsuarioDao {

	public Usuario createUser(Usuario usuario);

	public Usuario getUser(Integer id);

	public List<Usuario> listUsers();

}
