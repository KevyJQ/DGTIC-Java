package encapsulamiento_y_metodosAccesores;

public class Clase2 {

	public static void main(String[] args) {
		Clase1 objeto1 = new Clase1();
		
		//objeto1.edad = 5;	//este caso es si no estuvieran las variables privadas
		objeto1.setEdad(20);
		System.out.println("La edad es: "+objeto1.getEdad());
		
		objeto1.setNombre("Alejandro");
		System.out.println("El nombre es: "+objeto1.getNombre());
		

	}

}
