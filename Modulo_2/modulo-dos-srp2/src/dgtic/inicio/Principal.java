package dgtic.inicio;

import java.util.ArrayList;
import java.util.List;

import dgtic.modelo.Alumno;
import dgtic.servicio.Consultas;
import dgtic.servicio.Exportaciones;
import dgtic.servicio.ServicioBD;

import static java.util.stream.Collectors.toList;

//Para poner de la linea 12 a la 15 instantaneamente apretamos (Alt Shift j)
/**
 * @author kevyb
 *
 */
public class Principal {
	public static void main(String[] args) {

		List<Alumno> lista = new ArrayList<>(); // Creas una lista de topo Alumno
		lista = ServicioBD.consulta();
		Consultas sl = new Consultas();
		List<Alumno> alm = lista.stream().filter(alum -> (alum.getNombre().equals("Jose")))
				/*
				 * Haz un filtro que me regresa a Jose, pero como puede haber varios Jose en la
				 * lista, solo toma al primero que se encuentra en la lista
				 */
				.collect(toList()); // Creame la lista

		String cadena = new Exportaciones().exportarCSV(sl.buscarCalificaciones(alm.get(0)));
		System.out.println(cadena);
	}
}
