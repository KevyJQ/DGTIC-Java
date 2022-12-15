package dgtic.core.servicio;

import java.util.List;
import java.util.stream.Collectors;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.intf.EstudianteRepositorio;
import dgtic.core.repositorio.intf.MateriaRepositorio;

//@Service
public class EstudianteServicioImpl implements EstudianteServicio {
	private EstudianteRepositorio estudianteRepositorio;
	private MateriaRepositorio materiaRepositorio;

	public EstudianteServicioImpl(EstudianteRepositorio estudianteRepositorio, MateriaRepositorio materiaRepositorio) {
		super();
		this.estudianteRepositorio = estudianteRepositorio;
		this.materiaRepositorio = materiaRepositorio;
	}

	@Override
	public List<Estudiante> findAll() {
		return estudianteRepositorio.findAll();
	}

	@Override
	public Estudiante findById(String matricula) {
		return estudianteRepositorio.findById(matricula);

	}

	@Override
	public String archivoCSV(String matricula) {
		// TODO Auto-generated method stub
		return estudianteRepositorio.findAll().stream().filter(est -> (est.getMatricula().equals(matricula)))
				.map(est -> (est.getMatricula() + ";"
						+ (est.getMaterias().stream()
								.map(mat -> (mat.getId() + ";" + mat.getNombre() + ";" + mat.getCreditos()))
								.collect(Collectors.joining(";")))
						+ ";" + est.getNombre() + ";" + est.getEdad()))
				.collect(Collectors.joining("\n"));

	}

	@Override
	public int creditos(String matricula) {
		return estudianteRepositorio.findAll().stream().filter(est -> (est.getMatricula().equals(matricula)))
				.findFirst()
				.map(est -> (est.getMaterias().stream().map(xx -> xx.getCreditos()).reduce(0, Integer::sum))).get();
	}

}
