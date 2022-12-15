package dgtic.core.repositorio.intf;

import java.util.List;

import dgtic.core.modelo.Estudiante;

public interface BaseDeDatosDAO {
	public List<Estudiante> getEstudiantes(String carrera);
	public Estudiante getEstudiante(String carrera, String matricula);

}
