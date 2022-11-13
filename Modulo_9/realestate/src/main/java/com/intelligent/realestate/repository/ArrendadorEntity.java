package com.intelligent.realestate.repository;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public class ArrendadorEntity implements Serializable {

	private static final long serialVersionUID = 3L;
	private String nombre;
	private String paterno;
	private String materno;
	private String correo;
	private String direccion;
	private String ciudad;
	private String estado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "ArrendadorEntity [nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", correo="
				+ correo + ", direccion=" + direccion + ", ciudad=" + ciudad + ", estado=" + estado + "]";
	}

}
