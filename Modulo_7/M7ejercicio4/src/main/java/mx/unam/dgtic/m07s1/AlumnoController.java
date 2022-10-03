package mx.unam.dgtic.m07s1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

	@Autowired
	AlumnoRepository repositoryAlumno;

	@RequestMapping(value = "buscartodos")
	public String buscarTodos(Model model) {
		Iterable<Alumno> alumnos = repositoryAlumno.findAll();
		model.addAttribute("alumnos", alumnos);
		return "alumnos";// Es el nombre que usamos en el HTML
	}

	@RequestMapping(value = "buscartodos", params = "nombre")
	public String buscarPorNombre(String nombre, Model model) {
		Iterable<Alumno> alumnos = repositoryAlumno.buscarPorNombre(nombre);
		model.addAttribute("alumnos", alumnos);
		return "alumnos";// Es el nombre que usamos en el HTML
	}

	@RequestMapping(value = "buscartodos", params = "paterno")
	public String buscarPorPaterno(String paterno, Model model) {
		Iterable<Alumno> alumnos = repositoryAlumno.findByPaternoContaining(paterno);
		model.addAttribute("alumnos", alumnos);
		return "alumnos";// Es el nombre que usamos en el HTML
	}

	@RequestMapping(value = "buscartodos", params = { "nombre", "paterno" })
	public String buscarPorPaterno(String nombre, String paterno, Model model) {
		Iterable<Alumno> alumnos = repositoryAlumno.buscarPorNombreYPaterno(nombre, paterno);
		model.addAttribute("alumnos", alumnos);
		return "alumnos";// Es el nombre que usamos en el HTML
	}

	@RequestMapping(value = "buscartodos", params = "orden")
	public String buscarTodos(Model model, @RequestParam(name = "orden", defaultValue = "matricula") String orden) {
		Iterable<Alumno> alumnos = repositoryAlumno.findAll(Sort.by(orden));
		model.addAttribute("alumnos", alumnos);
		return "alumnos";// Es el nombre que usamos en el HTML
	}

	// CRUD
	@RequestMapping("/nuevo")
	public String nuevoAlumno(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("alumno", alumno);
		return "alumno_nuevo";
	}

	@RequestMapping("/editar/{matricula}")
	public ModelAndView editarAlumno(@PathVariable(name = "matricula") String matricula) {
		ModelAndView mAv = new ModelAndView("alumno_editar");

		Optional<Alumno> optional = repositoryAlumno.findById(matricula);
		Alumno alumno = null;
		if (optional.isPresent()) {
			alumno = optional.get();
		}
		mAv.addObject("alumno", alumno);
		return mAv;
	}
	
	@RequestMapping("/eliminar/{matricula}")
	public String eliminarAlumno(@PathVariable(name = "matricula") String matricula) {
		Optional<Alumno> optional = repositoryAlumno.findById(matricula);
		if (optional.isPresent()) {
			repositoryAlumno.deleteById(matricula);
		}
		return "redirect:/alumnos/buscartodos";
		
	}

	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("alumno") Alumno alumno) {
		repositoryAlumno.save(alumno);
		return "redirect:buscartodos";
	}

}
