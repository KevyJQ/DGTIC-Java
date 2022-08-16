package dgtic.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dgtic.modelo.Alumno;
import dgtic.modelo.Materia;
import static java.util.stream.Collectors.toList;

public class Consultas {

	public List<Materia> buscarCalificaciones(Alumno alm) {
		List<Materia> materias = new ArrayList<>();
		materias = (List<Materia>) 
				alm.getMaterias()	//Traeme la lista de materias
				.stream().filter(mat -> (mat.getCalificacion() >= 6))	
				/*
				 * Es un filtro que le mandamos mat y nos regresa las materias con sus calificaciones
				 * */
				.collect(toList());	//Ya que tienes la materias conviertemelo en una lista 
		return materias;	//Me regresa una lista de Materias
	}


	public String exportarCSV(Alumno alumno) {
		return buscarCalificaciones(alumno)	//Te voy a dar el alumno, lo filtra y te regresa la lista de tipo Materia 
				.stream()	//
				.map(m -> m.getNombre() + "," + m.getCalificacion())	
				/**
				 * Hazme un mapeo que quiero que lo accomodes como nombre de la materia y la calificacion
				 */
				.collect(Collectors.joining("\n"));	
				/*
				 * Ya que me lo regresaste como linea, por cada registro me haras un salto de linea
				 * */
	}
	

}
