package dgtic.modelo;

public class Materia {
	
	private String nombre;
	private int calificacion;
	
	public Materia() {	//Costructor
	}

	public Materia(String nombre, int calificacion) {	//Cotructor inicializado
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	//toString
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", calificacion=" + calificacion + "]";
	}
	
	

}
