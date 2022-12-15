package dgtic.core.repositorio.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.intf.BaseDeDatosDAO;

@Component("baseDeDatosDAO")
public class BaseDeDatosDAOImpl implements BaseDeDatosDAO {
	@Override
	public List<Estudiante> getEstudiantes(String carrera) {
		return BaseDeDatos.carreras.get(carrera);
	}

	@Override
	public Estudiante getEstudiante(String carrera, String matricula) {
		return BaseDeDatos.carreras.get(carrera).stream().filter(est -> est.getMatricula().equals(matricula))
				.findFirst().get();
	}

}
