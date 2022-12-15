package mx.unam.dgtic.m07s1;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materias {

	@Id
	private String matricula;
	private String nombre;
	private String profesor;
	private int creditos;

	public Materias() {
		super();
	}

	public Materias(String matricula, String nombre, String profesor, int cretitos) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.profesor = profesor;
		this.creditos = cretitos;
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

	public int getCretitos() {
		return creditos;
	}

	public void setCretitos(int cretitos) {
		this.creditos = cretitos;
	}

	@Override
	public String toString() {
		return "matricula=" + matricula + ", nombre=" + nombre + ", profesor=" + profesor + ", cretitos="
				+ creditos + "]";
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
