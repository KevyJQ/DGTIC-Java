package dgtic.core.modelo;

import java.util.Objects;

public class Editorial {
	private String nombre;
	private String direccion;

	public Editorial() {
		// TODO Auto-generated constructor stub
	}

	public Editorial(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editorial other = (Editorial) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	
}
