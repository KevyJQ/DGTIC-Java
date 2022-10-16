package mx.unam.diplomado.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class ContactoForm {
	
	private Integer id;
	
	@Size(min = 5, max = 50)
	private String nombre;
	
	@NotBlank
	private String apellidos;
	
	@NotNull
	private Integer edad;
	
	@Size(min = 5, max = 100)
	@NotNull
	private String direccion;
	
	@NotBlank
	private String tipoContacto;
	
	@NotBlank
	private String medioContacto;
	
	@NotBlank
	private String medio;
	
	
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
	public String getTipoContacto() {
		return tipoContacto;
	}
	public void setTipoContacto(String tipoContacto) {
		this.tipoContacto = tipoContacto;
	}
	public String getMedioContacto() {
		return medioContacto;
	}
	public void setMedioContacto(String medioContacto) {
		this.medioContacto = medioContacto;
	}
	public String getMedio() {
		return medio;
	}
	public void setMedio(String medio) {
		this.medio = medio;
	}
	@Override
	public String toString() {
		return "ContactoForm [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", direccion=" + direccion + ", tipoContacto=" + tipoContacto + ", medioContacto=" + medioContacto
				+ ", medio=" + medio + "]";
	}
	
	

}
