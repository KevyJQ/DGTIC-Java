package dgtic.inicio;

import dgtic.modelo.Racional;
import dgtic.recursos.Operaciones;

public class Principal {

	public static void main(String[] args) {
		
		Racional racUno = new Racional(1,2);
		Racional racDos = new Racional(1,3);
		
		Racional resultado = Operaciones.suma(racUno, racDos);
		System.out.println(resultado.toString());
		
	}
}
