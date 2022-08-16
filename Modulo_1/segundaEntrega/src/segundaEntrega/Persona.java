package segundaEntrega;


public abstract class Persona {  //abstract no me permite instanciar objetos de esta clase
	//Atributos de las personas
	String nombre;
	int edad;
	char genero;
	String fechaNacimiento;
	
	
	public Persona () {
	//Cuando los "hijos" ejecutan super() están ejecutando ESTE constructor	
		
	}
	
	public  void saluda () {  //Define un método abstracto que los "hijos" DEBERÁN definir /completar
		
	}
}
