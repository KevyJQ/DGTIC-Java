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
		materias = (List<Materia>) alm.getMaterias().stream().filter(mat -> (mat.getCalificacion() >= 6))
				.collect(toList());
		return materias;
	}

	public String exportarCSV(Alumno alumno) {
		return buscarCalificaciones(alumno).stream().map(m -> m.getNombre() + "," + m.getCalificacion())
				.collect(Collectors.joining("\n"));
	}

}
