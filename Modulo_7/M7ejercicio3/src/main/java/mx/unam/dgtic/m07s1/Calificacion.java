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
	private String semestre;
	private int calificacionFinal;

	@ManyToOne
	@JoinColumn(name = "generacion")
	private Materias materias;

	public Calificacion() {
		super();
	}

	public Calificacion(Materias materias) {
		super();
		this.materias = materias;
	}

	public Calificacion(int calificacionFinal) {
		super();
		this.calificacionFinal = calificacionFinal;
	}

	public Calificacion(int calificacionFinal, Materias materias) {
		super();
		this.calificacionFinal = calificacionFinal;
		this.materias = materias;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "id=" + id + ", semestre=" + semestre + ", calificacionFinal=" + calificacionFinal + ", materias="
				+ materias + "]";
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
