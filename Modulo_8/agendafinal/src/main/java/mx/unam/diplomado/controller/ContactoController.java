package mx.unam.diplomado.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mx.unam.diplomado.forms.ContactoForm;
import mx.unam.diplomado.modelo.entidades.Contacto;
import mx.unam.diplomado.modelo.entidades.ContactoMedio;
import mx.unam.diplomado.modelo.entidades.MedioContacto;
import mx.unam.diplomado.modelo.entidades.TipoContacto;
import mx.unam.diplomado.service.ContactoService;
import mx.unam.diplomado.service.MedioContactoService;
import mx.unam.diplomado.service.TipoContactoService;


@Controller
@RequestMapping("/contactos")
public class ContactoController {
	
	@Autowired
	private ContactoService contactoService;
	
	@Autowired
	private TipoContactoService tipoContactoService;
	
	@Autowired
	private MedioContactoService medioContactoService;
	
	@ResponseBody
	@RequestMapping(value = {"/jsonContacto"})	
    public List<Contacto> tipoContactoJson() {
		return contactoService.cargaContactos();
    }
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String cargaContacto(Model model) {
		model.addAttribute("contactos", contactoService.cargaContactos());
		return "listaContactos";
	}
	
	@RequestMapping("/contactoForm")
    public String contactoForm(Model model) {
        model.addAttribute("contacto", new ContactoForm());
        return "contactoForm";
    }
	
	@RequestMapping(value = "/guardaContacto", method = RequestMethod.POST)
    public ModelAndView guardaContacto(@ModelAttribute("contacto") @Valid ContactoForm contactoForm, BindingResult result) {
		ModelAndView vista = new ModelAndView();
		if (result.hasErrors()) {
			vista.addObject(contactoForm);
			vista.setViewName("contactoForm");
		} else {
			System.out.println("OBJECT FORM==" + contactoForm);
			Contacto contacto = contactoForm.getId() != null ? contactoService.cargaContacto(contactoForm.getId()) : new Contacto();			
	        contacto.setNombre(contactoForm.getNombre());
	        contacto.setApellidos(contactoForm.getApellidos());
	        contacto.setEdad(contactoForm.getEdad());
	        TipoContacto tipoContacto = tipoContactoService.cargaPorNombre(contactoForm.getTipoContacto());
	        contacto.setTipoContacto(tipoContacto);
	        contacto.setDireccion(contactoForm.getDireccion());
	        contactoService.guardaContacto(contacto);
	        Set<ContactoMedio> contactosMedio = new HashSet<ContactoMedio>();	        
	        MedioContacto medioContacto = medioContactoService.cargaPorNombre(contactoForm.getMedioContacto());
	        ContactoMedio contactoMedio = new ContactoMedio();
	        contactoMedio.setContacto(contacto);
	        contactoMedio.setMedioContacto(medioContacto);
	        contactoMedio.setValor(contactoForm.getMedio());
	        contactosMedio.add(contactoMedio);
	        contacto.setContactosMedios(contactosMedio);
	        contactoService.guardaContacto(contacto);
			vista.addObject("contactos", contactoService.cargaContactos());
			vista.setViewName("listaContactos");
		}
		return vista;
        
    }
	
	@RequestMapping("/actualizar/{idContacto}")
    public String showFormForUpdate(@PathVariable Integer idContacto, Model model) {
		Contacto contacto = contactoService.cargaContacto(idContacto);
		if (contacto != null) {
			ContactoForm contactoForm = new ContactoForm();
			contactoForm.setId(idContacto);
			contactoForm.setNombre(contacto.getNombre());
			contactoForm.setApellidos(contacto.getApellidos());
			contactoForm.setEdad(contacto.getEdad());
			contactoForm.setDireccion(contacto.getDireccion());
			contactoForm.setTipoContacto(contacto.getTipoContacto().getNombre());
			Set<ContactoMedio> contactosMedio = contacto.getContactosMedios();
			if (contactosMedio != null && ! contactosMedio.isEmpty()) {
				for (Iterator<ContactoMedio> it = contactosMedio.iterator(); it.hasNext();) {
					ContactoMedio contactoMedio = it.next();
					contactoForm.setMedioContacto(contactoMedio.getMedioContacto().getNombre());
					contactoForm.setMedio(contactoMedio.getValor());
				}
			}
			model.addAttribute("contacto", contactoForm);
		} else {
			model.addAttribute("contacto", new ContactoForm());
		}
        return "contactoForm";
    }
	
	@RequestMapping("eliminar")
	public String eliminaContacto(@RequestParam("contactoId") Integer idContacto) {
		contactoService.eliminaContacto(idContacto);
		return "redirect:/contactos/listar";
	}

}
