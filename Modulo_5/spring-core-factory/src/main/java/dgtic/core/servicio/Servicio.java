package dgtic.core.servicio;

import dgtic.core.modelo.Empleado;

public class Servicio {
	private static Servicio servicio = new Servicio();
	private Empleado empleado;

	private Servicio() {
	}

	public static Servicio getInstance() {
		return servicio;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
