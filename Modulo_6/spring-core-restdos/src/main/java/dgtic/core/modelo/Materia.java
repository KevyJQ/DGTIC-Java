package dgtic.core.modelo;

public class Materia {
	private Integer id;
	private String nombre;
	private int creditos;

	public Materia(Integer id, String nombre, int creditos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creditos = creditos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

}
