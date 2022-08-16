package dgtic.modelo;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	
	private String nombre;
	private List<Materia> materias = new ArrayList<Materia>();

	public Alumno() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", materias=" + materias + "]";
	}

	
}
