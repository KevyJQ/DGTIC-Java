package dgtic.modelo;

public class Entidad {
	
	private int clave;
	private String entidad;
	private int poblacion;
	
	public Entidad() {
		this.setClave(0);
		this.setEntidad("Desconocido");
		this.setPoblacion(0);
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	
}
