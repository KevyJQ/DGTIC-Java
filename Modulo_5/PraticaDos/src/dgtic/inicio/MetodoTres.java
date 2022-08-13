package dgtic.inicio;

import dgtic.modelo.Calificar;
import dgtic.modelo.ExplicarClases;
import dgtic.modelo.Profesor;
import dgtic.modelo.Reportes;
import dgtic.modelo.Responsabilidades;

public class MetodoTres {

	public static void main(String[] args) {
		Profesor profesor = new Profesor();
		profesor.setNombre("Pedro");
		
		ExplicarClases exp = new ExplicarClases();
		Calificar cal = new Calificar();
		Reportes rep = new Reportes();
		
		profesor.getResposabilidades().add(exp);
		profesor.getResposabilidades().add(cal);
		profesor.getResposabilidades().add(rep);
		
		System.out.println(profesor.getNombre());
		for (Responsabilidades resp : profesor.getResposabilidades()) {
			System.out.println("--");
			resp.realizar();
		}

	}

}
