package dgtic.core.modelo;

import java.util.Objects;

public class Autor {
	private String nombre;
	private int edad;

	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
