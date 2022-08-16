package segundaEntrega;

public final class Empleado extends Persona{  //final no permite la herencia de Empleado
	int claveEmpleado;
	String usuario;
	String contrasena;
	int rol;

	public Empleado() {
		super ();  //Ejecuto el constructor del padre (Persona);
		this.claveEmpleado=0;
		this.rol = 9;
		
	}
	
	public void saluda() {
		//El saludo de un empleado
		System.out.println ("Hola, soy un/a Empleado/a");
		
	}
}