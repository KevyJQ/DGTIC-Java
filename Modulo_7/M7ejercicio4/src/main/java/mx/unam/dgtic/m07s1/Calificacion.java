package mx.unam.dgtic.m07s1;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Calificaciones")
public class Calificacion {
	@Id
	private int id;
	private String materia;
	private int calificacion;

	@ManyToOne
	@JoinColumn(name = "alumnos_matricula") // Hacemos la concatenacion de las tablas en la BD
	private Alumno alumno;

	public Calificacion() {
		super();
	}

	public Calificacion(String materia) {
		super();
		this.materia = materia;
	}

	public Calificacion(int calificacion) {
		super();
		this.calificacion = calificacion;
	}

	public Calificacion(String materia, int calificacion) {
		super();
		this.materia = materia;
		this.calificacion = calificacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Calificacion [id=" + id + ", materia=" + materia + ", calificacion=" + calificacion + ", alumno="
				+ alumno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calificacion other = (Calificacion) obj;
		return id == other.id;
	}

}
