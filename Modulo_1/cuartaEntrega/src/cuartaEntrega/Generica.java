package cuartaEntrega;

public class Generica<T>{	//Clase generica que recibe un tipo T

	T atributo;	//Estoy deficiniendo algo de la clase T
	int atributo2;
	String atributo3;
	
	public void imprime(T objeto1) {
		System.out.println("\nObjeto de tipo "+ objeto1.getClass());
		System.out.println("Contenido "+ objeto1);
		//System.out.println("Contenido "+ objeto1.doubleValue());	//No funciona
		
		System.out.println("... y ademas el atributo tiene un valor de "+this.atributo);
	}
}
