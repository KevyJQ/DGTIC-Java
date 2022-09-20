package dgtic.core.repositorio;

import java.util.ArrayList;
import java.util.List;

import dgtic.core.modelo.Estudiante;
import dgtic.core.modelo.Materia;

public class BaseDeDatos {
	public static List<Estudiante> estudiante = new ArrayList<>();
	static {
		Estudiante est = new Estudiante("A1", "Rosa", "19", new Materia(1, "Lógica", 10),
				new Materia(2, "Programación", 9));
		estudiante.add(est);

		est = new Estudiante("A2", "Mario", "18", new Materia(1, "Lógica", 10), new Materia(2, "Programación", 9),
				new Materia(3, "Álgebra", 9));
		estudiante.add(est);

		est = new Estudiante("A3", "Rebeca", "22", new Materia(2, "Programación", 9), new Materia(3, "Álgebra", 9));
		estudiante.add(est);
	}

}
