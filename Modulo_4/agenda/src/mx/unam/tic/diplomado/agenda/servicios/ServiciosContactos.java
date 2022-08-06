package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Contacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.ContactoMedio;
import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;

public interface ServiciosContactos {

	Contacto cargaContactoPorId(Integer id);

	List<Contacto> cargaContactos();

	void guardaContacto(Contacto contacto);

	void actualizaContacto(Contacto contacto);

	void eliminaContacto(Contacto contacto);
	
	public List<ContactoMedio> cargarContactoMedio(MedioContacto medioContacto);

}
