package mx.unam.tic.diplomado.agenda.modelo.entidades;

import java.util.Set;

public class Contacto {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer edad;
	private String direccion;
	private String estatus;
	private TipoContacto tipoContacto;
	private Set<ContactoMedio> contactosMedios;
	
	
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public TipoContacto getTipoContacto() {
		return tipoContacto;
	}
	public void setTipoContacto(TipoContacto tipoContacto) {
		this.tipoContacto = tipoContacto;
	}
	public Set<ContactoMedio> getContactosMedios() {
		return contactosMedios;
	}
	public void setContactosMedios(Set<ContactoMedio> contactosMedios) {
		this.contactosMedios = contactosMedios;
	}
	
	

}
