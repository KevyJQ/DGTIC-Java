package mx.unam.dgtic.m07s1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {

	@Id
	private String matricula;
	private String nombre;
	private String paterno;
	private Date fnac;
	private double estatura;

	@OneToMany(mappedBy = "alumno")
	private List<Calificacion> calificaciones = new ArrayList<Calificacion>();

	public Alumno() {
		super();
	}

	public Alumno(String matricula, String nombre, String paterno, Date fnac, double estatura) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.paterno = paterno;
		this.fnac = fnac;
		this.estatura = estatura;
	}

	public Alumno(String string) {
		super();
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

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public Date getFnac() {
		return fnac;
	}

	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", paterno=" + paterno + ", fnac=" + fnac
				+ ", estatura=" + estatura + "]";
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
		Alumno other = (Alumno) obj;
		return Objects.equals(matricula, other.matricula);
	}

}
