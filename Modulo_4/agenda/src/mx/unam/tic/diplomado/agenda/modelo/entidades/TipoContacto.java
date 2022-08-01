package mx.unam.tic.diplomado.agenda.modelo.entidades;

public class TipoContacto {
	
	private Integer id;
	private String nombre;
	private String estatus;
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
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "TipoContacto [id=" + id + ", nombre=" + nombre + ", estatus=" + estatus + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
