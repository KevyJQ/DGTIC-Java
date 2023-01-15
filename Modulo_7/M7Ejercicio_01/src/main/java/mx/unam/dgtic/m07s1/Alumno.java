package mx.unam.dgtic.m07s1;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maestros")
public class Maestro {
	
	@Id
	private String matricula;
	private String nombre;
	private String paterno;
	private Date fnac;
	private double estatura;

	public Maestro() {
		super();
	}

	public Maestro(String matricula, String nombre, String paterno, Date fnac, double estatura) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.paterno = paterno;
		this.fnac = fnac;
		this.estatura = estatura;
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

	@Override
	public String toString() {
		return "Maestros [matricula=" + matricula + ", nombre=" + nombre + ", paterno=" + paterno + ", fnac=" + fnac
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
		Maestro other = (Maestro) obj;
		return Objects.equals(matricula, other.matricula);
	}

}
