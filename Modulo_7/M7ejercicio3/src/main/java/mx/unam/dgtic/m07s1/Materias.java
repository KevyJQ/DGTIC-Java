package mx.unam.dgtic.m07s1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "materias01")

@NamedQuery(name = "Materias.buscarAltos", query = "Select m from Materias m Where m.calificacion > 9")

@NamedNativeQuery(name = "Materias.buscarAltosMayorCalificacion", query = "select * from materias01 where creditos > 7", resultClass = Materias.class)

@NamedQuery(name = "Materias.buscarTodosConCalificacion", query = "select distinct a from Materias a JOIN FETCH a.calificaciones")

public class Materias {

	@Id
	private String matricula;
	private String nombre;
	private String profesor;
	private int creditos;
	private int calificacion;
	
	@OneToMany(mappedBy = "materias")
	private List<Calificacion> calificaciones = new ArrayList<Calificacion>();

	public Materias() {
		super();
	}

	public Materias(String matricula, String nombre, String profesor, int creditos, int calificacion) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.profesor = profesor;
		this.creditos = creditos;
		this.calificacion = calificacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "matricula=" + matricula + ", nombre=" + nombre + ", profesor=" + profesor + ", creditos=" + creditos
				+ ", calificacion=" + calificacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materias other = (Materias) obj;
		return Objects.equals(matricula, other.matricula);
	}

}
