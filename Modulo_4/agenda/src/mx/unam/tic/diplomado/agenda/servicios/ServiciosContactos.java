package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Contacto;

public interface ServiciosContactos {

	Contacto cargaContactoPorId(Integer id);

	List<Contacto> cargaContactos();

	void guardaContacto(Contacto contacto);

	void actualizaContacto(Contacto contacto);

	void eliminaContacto(Contacto contacto);

}
