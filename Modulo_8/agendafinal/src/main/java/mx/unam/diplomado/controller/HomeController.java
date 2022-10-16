package mx.unam.diplomado.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.diplomado.modelo.entidades.MedioContacto;
import mx.unam.diplomado.modelo.entidades.TipoContacto;
import mx.unam.diplomado.service.MedioContactoService;
import mx.unam.diplomado.service.TipoContactoService;

@Controller
public class HomeController {

	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private TipoContactoService tipoContactoService;
	
	@Autowired
	private MedioContactoService medioContactoService;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<TipoContacto> lista = tipoContactoService.getListaTipoContacto();
		List<String> listaTipoContacto = new ArrayList<String>();
		for (TipoContacto tipoContacto : lista) {
			listaTipoContacto.add(tipoContacto.getNombre());
		}
		List<MedioContacto> lista2 = medioContactoService.getListaMedioContacto();
		List<String> listaMedioContacto = new ArrayList<String>();
		for (MedioContacto medioContacto : lista2) {
			listaMedioContacto.add(medioContacto.getNombre());
		}
		
		servletContext.setAttribute("tipoContactoList", listaTipoContacto);
		servletContext.setAttribute("medioContactoList", listaMedioContacto);
		return new ModelAndView("home");
	}
}
