package dgtic.core.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dgtic.core.modelo.Estudiante;
import dgtic.core.modelo.Materia;

public class BaseDeDatos {
	public static Map<String, List<Estudiante>> carreras = new HashMap<>();
	static {
		List<Estudiante> estudiantes = new ArrayList<>();
		Estudiante est = new Estudiante("123", "Rosa", 20);
		est.setMaterias(new Materia("Calculo", 9), new Materia("Programacion", 10), new Materia("Logica", 10));
		estudiantes.add(est);

		est = new Estudiante("124", "Tomas", 22);
		est.setMaterias(new Materia("Programación", 10), new Materia("Lógica", 10));
		estudiantes.add(est);

		carreras.put("ico", estudiantes);
		//////////////////////////////////
		estudiantes = new ArrayList<>();
		est = new Estudiante("125", "Mario", 20);
		est.setMaterias(new Materia("Calculo", 9), new Materia("Circuitos Logicos", 10),
				new Materia("Logica de Automatas", 10));
		estudiantes.add(est);
		est = new Estudiante("126", "Esmeralda", 22);
		est.setMaterias(new Materia("Circuitos Logicos", 10), new Materia("Logica de Automatas", 10));
		estudiantes.add(est);
		carreras.put("ime", estudiantes);
	}

}
