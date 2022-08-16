package cuartaEntrega;

public class PruebaGenericos {

	public static void main(String[] args) {
		
		Personaje p1 = new Personaje(1,2);
		
		Generica<String> obj1 = new Generica<String>();
		Generica<Personaje> obj2 = new Generica<Personaje>();
		Generica<Double> obj3 = new Generica<Double>();
		
		obj1.atributo = "Hola mundo";
		obj2.atributo = new Personaje (-9,-8);
		obj3.atributo = -99.645;
		
		obj1.imprime("Hola");
		obj2.imprime(p1);
		obj3.imprime(9.8);

	}

}
