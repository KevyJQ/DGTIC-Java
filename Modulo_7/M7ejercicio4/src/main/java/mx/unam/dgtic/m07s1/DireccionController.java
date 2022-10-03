package mx.unam.dgtic.m07s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/direcciones")
public class DireccionController {

	@Autowired
	DireccionRepository direccionRepository;

	@RequestMapping(value = "buscartodos")
	public String buscarTodos(Model model) {
		Iterable<Direccion> direccion = direccionRepository.findAll();
		model.addAttribute("direcciones", direccion);
		return "direccion";// Es el nombre que usamos en el HTML
	}

	@RequestMapping(value = "buscartodos", params = "arrendador")
	public String buscarPorArrendador(String nombre, Model model) {
		Iterable<Direccion> direccion = direccionRepository.buscarPorArrendador(nombre);
		model.addAttribute("direcciones", direccion);
		return "direccion";// Es el nombre que usamos en el HTML
	}
}
