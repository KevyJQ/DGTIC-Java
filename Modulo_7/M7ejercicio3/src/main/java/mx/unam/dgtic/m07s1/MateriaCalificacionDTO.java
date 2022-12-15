package mx.unam.dgtic.m07s1;

import java.util.Objects;

public class MateriaCalificacionDTO {
	private String nombre;
	private String profesor;
	private String semestre;
	private int calificacionFinal;

	public MateriaCalificacionDTO(String nombre, String profesor, String semestre, int calificacionFinal) {
		super();
		this.nombre = nombre;
		this.profesor = profesor;
		this.semestre = semestre;
		this.calificacionFinal = calificacionFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getCalificacionFinal() {
		return calificacionFinal;
	}

	public void setCalificacionFinal(int calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}

	@Override
	public String toString() {
		return "MateriaCalificacionDTO [nombre=" + nombre + ", profesor=" + profesor + ", semestre=" + semestre
				+ ", calificacionFinal=" + calificacionFinal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calificacionFinal, nombre, profesor, semestre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MateriaCalificacionDTO other = (MateriaCalificacionDTO) obj;
		return calificacionFinal == other.calificacionFinal && Objects.equals(nombre, other.nombre)
				&& Objects.equals(profesor, other.profesor) && Objects.equals(semestre, other.semestre);
	}

}
