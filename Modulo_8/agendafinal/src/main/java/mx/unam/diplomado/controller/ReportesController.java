package mx.unam.diplomado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.unam.diplomado.modelo.entidades.Contacto;
import mx.unam.diplomado.service.ContactoService;

@Controller
@RequestMapping("/formatos")
public class ReportesController {
	
	@Autowired
	private ContactoService service;
	
	@ModelAttribute("contactosList")
    public List<Contacto> getProductosList() {
		return service.cargaContactos();
    }
	
	@RequestMapping("/pdf")
    public String generarPdf(Model model) {
        return "pdfView";
    }
	
	@RequestMapping("/xls")
    public String generarXls(Model model) {
        return "xlsView";
    }

}
