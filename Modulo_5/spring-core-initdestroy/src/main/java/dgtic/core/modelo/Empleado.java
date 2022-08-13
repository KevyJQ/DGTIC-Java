package dgtic.core.modelo;

import org.springframework.beans.factory.InitializingBean;

public class Empleado implements InitializingBean{
	private String nombre;
	private Integer edad;
	private Actividades actividad;

	public Empleado() {
	}

	public Empleado(Actividades actividad) {
		super();
		this.actividad = actividad;
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Actividades getActividad() {
		return actividad;
	}

	public void setActividad(Actividades actividad) {
		this.actividad = actividad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public void limpiar() {
		System.out.println("Liberando recursos de Empleado	");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Iniciando Empleado	");
	}

}
