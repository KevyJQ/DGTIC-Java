package segundaEntrega;

public class RentaDeAuto extends Auto1{	//Creamos la clase RentaDeAuto que hereda sus valores de Auto1
	
	//Declaramos las variables de tipo privado
	private	int tiempo;	
	private int horas;

	//Creamos un contructos que inicializa las variables 
	RentaDeAuto(String placas, String colorCarro, int tiempo, int horas) {
		super(placas, colorCarro);	//Usamos el constructor super para mandar a llamar al constructor de la clase Auto1
		this.tiempo = tiempo;	//Hacemos la asignacion
		this.horas = horas;
	}
	
	//Creamos los get y los set
	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}	
	
	//Creamos el metodo mostrarDatos 
	void mostrarDatos() {
		System.out.println("Placas: "+getPlacas()+"\nColor del carro: "+getcolorCarro()+"\nTiempo(dias): "+getTiempo()+"\nHoras: "+getHoras());
	}
	
}
