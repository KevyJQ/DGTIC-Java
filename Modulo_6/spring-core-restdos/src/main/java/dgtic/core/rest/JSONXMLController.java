package dgtic.core.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.BaseDeDatos;

@RestController
public class JSONXMLController {
	@GetMapping(value = "estudiantes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estudiante> servicioUno() {
		return BaseDeDatos.estudiante;
	}

	@GetMapping(value = "estudiantesXML", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Estudiante> servicioDos() {
		return BaseDeDatos.estudiante;
	}

	@GetMapping(value = "estudiantes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Estudiante servicioTres(@PathVariable("id") String id) {
		return BaseDeDatos.estudiante.stream().filter(es -> (es.getCuenta().equals(id))).findFirst().get();
	}

	@GetMapping(value = "estudiantesXML/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public Estudiante servicioCuatro(@PathVariable("id") String id) {
		return BaseDeDatos.estudiante.stream().filter(es -> (es.getCuenta().equals(id))).findFirst().get();
	}

}
