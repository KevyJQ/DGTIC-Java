package segundaEntrega;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unaP = new Persona();
		Estudiante unE = new Estudiante();
		Empleado unEm = new Empleado();
		
		//System.out.println ("Persona "+ unaP.edad);
		System.out.println ("Estudiante "+ unE.edad + "/"+unE.matricula);
		//System.out.println ("Empleado "+ unEm.edad + "/"+unEm.claveEmpleado);
		
		//.saluda();
		unE.saluda();
		unEm.saluda();
	}

}