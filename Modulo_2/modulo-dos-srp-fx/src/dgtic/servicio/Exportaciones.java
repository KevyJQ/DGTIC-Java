package dgtic.servicio;

import java.util.stream.Collectors;

import dgtic.modelo.Materia;

import java.util.List;

public class Exportaciones {
	public String exportarCSV(List<Materia> materias) {
		return materias.stream().map(m -> m.getNombre() + "," + m.getCalificacion()).collect(Collectors.joining("\n"));
	}

}
