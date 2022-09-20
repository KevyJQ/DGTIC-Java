package dgtic.core.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.BaseDeDatos;

@RestController
public class CRUDController {
	@PostMapping(value = "agregarestudiante", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estudiante> servicioUno(@RequestBody Estudiante estudiante) {
		BaseDeDatos.estudiante.add(estudiante);
		return BaseDeDatos.estudiante;
	}

	@PutMapping(value = "modificarestudiante", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estudiante> servicioDos(@RequestBody Estudiante estudiante) {
		for (int i = 0; i < BaseDeDatos.estudiante.size(); i++) {
			if (BaseDeDatos.estudiante.get(i).getCuenta().equals(estudiante.getCuenta())) {
				BaseDeDatos.estudiante.set(i, estudiante);
				break;
			}
		}
		return BaseDeDatos.estudiante;
	}

	@DeleteMapping(value = "borrar/{cuenta}")
	public void eliminar(@PathVariable("cuenta") String cuenta) {
		BaseDeDatos.estudiante.removeIf(es -> es.getCuenta().equals(cuenta));
	}
}