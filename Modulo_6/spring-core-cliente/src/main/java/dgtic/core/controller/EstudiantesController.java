package dgtic.core.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import dgtic.core.persistence.modelo.Estudiante;

@Controller
public class EstudiantesController {
	@Autowired
	RestTemplate base;
	String url = "http://localhost:8080/estudiantes";

	@GetMapping(value = "/datos")
	public String listaEstudiantes(Model modelo) {
		Estudiante[] est = base.getForObject(url, Estudiante[].class);
		List<Estudiante> info = Arrays.asList(est);
		for (Estudiante e : info) {
			System.out.println(e);
		}
		modelo.addAttribute("alum", info);
		return "home";
	}
}
