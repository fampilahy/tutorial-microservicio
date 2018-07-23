package force.backend.tutorialmicroservicio.model;

public class Usuario {

	private Integer id;
	private String nombre;
	private String apellido;
	private Integer salario;

	public Usuario() {

	}

	public Usuario(Integer id, String nombre, String apellido, Integer salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

}
