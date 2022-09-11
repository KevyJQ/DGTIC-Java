package dgtic.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dgtic.core.persistence.dao.EstudianteDao;
import dgtic.core.persistence.dao.MateriaDao;
import dgtic.core.persistence.modelo.Estudiante;
import dgtic.core.persistence.modelo.Materia;

@CrossOrigin(origins = "*")
@RestController
public class MicroServicios {
	@Autowired
	private EstudianteDao estudiante;
	@Autowired
	private MateriaDao materia;

	@GetMapping(value = "estudiantes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estudiante> consultaE() {
		return estudiante.consulta();
	}

	@GetMapping(value = "materias", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Materia> consultaM() {
		return materia.consulta();
	}

	@GetMapping(value = "estudiante/{cuenta}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Estudiante buscarIdE(@PathVariable("cuenta") String cuenta) {
		return estudiante.consultaId(cuenta);
	}

	@GetMapping(value = "materia/{Id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Materia buscarIdM(@PathVariable("Id") int Id) {
		return materia.consultaId(Id);
	}

	// curl -X POST localhost:8080/estudiantes -H 'Content-type:application/json' -d
	// '{"cuenta":"A05","nombre":"Rosa","edad":"19"}'
//	@GetMapping(value = "estudiantes")
//	public void insertarE(@RequestBody Estudiante estudiantee) {
//		estudiante.insertar(estudiantee);
//	}
//
//	@GetMapping(value = "materias")
//	public void insertarM(@RequestBody Materia materiaa) {
//		materia.insertar(materiaa);
//	}

	@PostMapping(value = "estudiantes")
	public void cambiarE(@RequestBody Estudiante estudiantee) {
		estudiante.cambiar(estudiantee);
	}

	@PostMapping(value = "materias")
	public void cambiarM(@RequestBody Materia materiaa) {
		materia.cambiar(materiaa);
	}

	@DeleteMapping(value = "borrar/{cuenta}")
	public void eliminarE(@PathVariable("cuenta") String cuenta) {
		estudiante.borrar(estudiante.consultaId(cuenta));
	}

	@DeleteMapping(value = "borrar/{materia}")
	public void eliminarM(@PathVariable("materia") int cuenta) {
		materia.borrar(materia.consultaId(cuenta));
	}
}
