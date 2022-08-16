package encapsulamiento_y_metodosAccesores;

public class Clase1 {

	//public int edad;----puede ser accedidad desde cualquier metodo que tengamos 
	private int edad;	//solo puede accesar desde los metodos de la misma clase1
	private String nombre;

	
	//Si queremos manipular el valor tenemos que general los accesores(los getters y setters)
	
	//Metodo getter: Mostramos la edad
	public int getEdad() {
		return edad;
	}
	//Metodo Setter: establecemos la edad
	public void setEdad(int edad) {
		if(edad >0 && edad<100) {
			this.edad = edad;	//Estamos inicializando esta variable con edad. ahora si podemos acceder desde otra clase
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Clase1() {	//Constructor
		super();
		this.edad = 0;		//Inicializamos la variable en dado caso que el valor que nos ingresen de la edad es incongruente, se le asignara esta por default
		this.nombre = "Pedro";
	}
	
	
	
	
}
