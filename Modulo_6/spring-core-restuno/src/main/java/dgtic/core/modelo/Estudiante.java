package dgtic.core.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estudiante {
	private String cuenta;
	private String nombre;
	private String edad;
	private List<Materia> materias = new ArrayList<>();

	public Estudiante(String cuenta, String nombre, String edad, Materia... materia) {
		super();
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.edad = edad;
		this.materias.addAll(Arrays.asList(materia));
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

}
