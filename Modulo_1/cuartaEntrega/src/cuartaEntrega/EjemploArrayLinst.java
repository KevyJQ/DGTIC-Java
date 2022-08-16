package cuartaEntrega;

import java.util.ArrayList;

public class EjemploArrayLinst {

	public static void main(String[] args) {
		// ArrayList es una clase generica
		
		ArrayList<String> participantes = new ArrayList<String>();	//participantes es una lista de String
		System.out.println(participantes.isEmpty());
		participantes.add("Adrian");
		participantes.add("Karla");
		participantes.add("Alejandra");
		participantes.add("Laura");
		
		System.out.println(participantes);
		System.out.println(participantes.remove("Adrian"));
		System.out.println(participantes);
		participantes.add(2,"luis");	//.add() por implementar list en la posicion 2
		System.out.println(participantes);
		
		participantes.set(0, "Karla Mayo");
		System.out.println(participantes.get(1));	//La numeracion comienza en 0
		System.out.println(participantes);
		
		ArrayList<Auto> flotilla = new ArrayList<Auto>();	//flotilla es una lista de Autos
		Auto miAuto = new Auto();
		flotilla.add(new Auto());
		flotilla.add(miAuto);
		
		System.out.println(flotilla);
		
		
		
		//ArrayList<Libro> LibroPrestado = new ArrayList<Libro>();
		
		
	}

}
