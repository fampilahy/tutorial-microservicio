package force.backend.tutorialmicroservicio.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import force.backend.tutorialmicroservicio.model.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	//todavia no tenemos base de datos, mejor utilizamos una lista para gardar los usuarios
	public static final List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	static {
		listaUsuarios.add(new Usuario(1, "Frelin", "Ampilahy", 5000));
		listaUsuarios.add(new Usuario(2, "Norma", "Tijerina", 6000));
	}

	@Override
	public Usuario createUser(Usuario usuario) {
		if (usuario != null) {
			listaUsuarios.add(usuario);
			return usuario;
		}
		return null;
	}

	@Override
	public Usuario getUser(Integer id) {
		if(id!=null){
			for (Usuario usuario : listaUsuarios){
				if(usuario.getId().intValue()==id.intValue()){
					return usuario;
				}
			}
		}
		return null;
	}

	@Override
	public List<Usuario> listUsers() {
		return listaUsuarios;
	}

	

}
