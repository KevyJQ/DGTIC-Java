package repasos;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {	//Costructor
		setNombre("desconocido");
		setEdad(0);
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() >= 10) {
			this.nombre = nombre;	
		}else {	//Si intentamos dar un valor incorrecto se vaciara el nombre
			this.nombre = "";
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	

}
