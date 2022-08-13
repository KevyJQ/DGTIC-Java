package dgtic.modelo;

import java.util.ArrayList;

public class Profesor {
	private String nombre;
	private ArrayList<Responsabilidades> resposabilidades = new ArrayList<>();
	public Profesor() {
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Responsabilidades> getResposabilidades() {
		return resposabilidades;
	}
	public void setResposabilidades(ArrayList<Responsabilidades> resposabilidades) {
		this.resposabilidades = resposabilidades;
	}
	
}
