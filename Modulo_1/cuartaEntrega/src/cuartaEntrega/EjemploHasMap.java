package cuartaEntrega;

import java.util.HashMap;

public class EjemploHasMap {

	public static void main(String[] args) {
		
		HashMap <Integer,String> entidades = new HashMap<Integer,String>();	//Crea un HashMap que va a recibir un Integer y un String
		
		//Ingresar los datos
		entidades.put(9,"CDMX");
		entidades.put(1,"Aguascalientes");
		entidades.put(32,"Zacatecas");
		
		System.out.println(entidades);	//Imprime la lista entera que tengas
		System.out.println(entidades.get(32));	//Imprime la que se encuentra en esa posicion 
		
	}

}
