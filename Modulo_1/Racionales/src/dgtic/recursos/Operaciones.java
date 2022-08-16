package dgtic.recursos;

import dgtic.modelo.Racional;

public class Operaciones {
	
	public static Racional suma(Racional racionalUno, Racional racionalDos) {
		int numerador = racionalUno.getNumerador()*racionalDos.getDenominador() + 
				racionalDos.getNumerador()*racionalUno.getDenominador();
		int denominador = racionalUno.getDenominador()*racionalDos.getDenominador();
		
		return new Racional(numerador, denominador);
	}
	
	public static Racional resta(Racional racionalUno, Racional racionalDos) {
		int numerador = racionalUno.getNumerador()*racionalDos.getDenominador() - 
				racionalDos.getNumerador()*racionalUno.getDenominador();
		int denominador = racionalUno.getDenominador()*racionalDos.getDenominador();
		
		return new Racional(numerador, denominador);
	}
	
	public static Racional multiplicacion(Racional racionalUno, Racional racionalDos) {
		int numerador = racionalUno.getNumerador()*racionalDos.getNumerador(); 
		int denominador = racionalUno.getDenominador()*racionalDos.getDenominador();
		
		return new Racional(numerador, denominador);
	}
	
	public static Racional division(Racional racionalUno, Racional racionalDos) {
		int numerador = racionalUno.getNumerador()*racionalDos.getDenominador();
		int denominador = racionalUno.getDenominador()*racionalDos.getNumerador();
		
		return new Racional(numerador, denominador);
	}
	
}
