package mx.unam.diplomado.service;

import java.util.List;

import mx.unam.diplomado.modelo.entidades.Contacto;

public interface ContactoService {
	
	List<Contacto> cargaContactos();
	
	void guardaContacto(Contacto contacto);
	
	Contacto cargaContacto(Integer id);
	
	void eliminaContacto(Integer id);
}
