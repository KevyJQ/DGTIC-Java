package mx.unam.dgtic.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona {
	private String nombre1;
	private String nombre2;
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	private int edad;
	private String correo;
	private String celular;
	@Embedded
	private Direccion direccion;

	public Persona() {
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;

	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String string) {

		this.celular = string;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n\t");
		sb.append(nombre1);
		sb.append("\n\t");
		sb.append(nombre2);
		sb.append("\n\t");
		sb.append(apellidoPaterno);
		sb.append("\n\t");
		sb.append(apellidoMaterno);
		sb.append("\n\t");
		sb.append(edad);
		sb.append("\n\t");
		sb.append(correo);
		sb.append("\n\t");
		sb.append(celular);
		sb.append("\n");
		sb.append("}");

		return sb.toString();
	}

}
