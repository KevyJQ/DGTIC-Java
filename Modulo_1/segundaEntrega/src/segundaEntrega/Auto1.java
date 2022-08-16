package segundaEntrega;

public class Auto1 {	//Creamos la clase Auto1
	
	private String placas;	//Declaramos las variables de tipo privado
	private String colorCarro;
	
	//Creamos el constructor donde inicializamos las variables 
	public Auto1(String placas, String colorCarro) {
		this.placas = placas;
		this.colorCarro = colorCarro;
	}

	//Creamos los get y set
	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getcolorCarro() {
		return colorCarro;
	}

	public void setcolorCarro(String colorCarro) {
		this.colorCarro = colorCarro;
	}
	
	

}
