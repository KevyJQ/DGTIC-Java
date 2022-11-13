package com.intelligent.realestate.bean;

import java.io.Serializable;
import java.util.List;

import com.intelligent.realestate.repository.ArrendadorEntity;
import com.intelligent.realestate.repository.Arrendadores;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named // Te va a regresar un nombre listo para el set
@SessionScoped
public class Arrendador implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String paterno;
	private String materno;
	private String correo;
	private String direccion;
	private String ciudad;
	private String estado;
	private Arrendadores arrendadores;

	public Arrendador() {
		arrendadores = new Arrendadores();
	}

	public List<ArrendadorEntity> getArrendadores() {
		return arrendadores.getArrendadores();
	}

	public void setArrendadores(Arrendadores arrendadores) {
		this.arrendadores = arrendadores;
	}

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

	public void agregar(AjaxBehaviorEvent event) throws AbortProcessingException {
		arrendadores.agregar(this);

		System.out.println(arrendadores.getArrendadores().size());
		for (ArrendadorEntity entity : arrendadores.getArrendadores()) {
			System.out.println(entity);
		}
	}
}
