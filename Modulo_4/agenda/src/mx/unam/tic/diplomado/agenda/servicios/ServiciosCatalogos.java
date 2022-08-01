package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.TipoContacto;

public interface ServiciosCatalogos {
	
	TipoContacto cargaTipoContactoPorId(Integer id);
	
	List<TipoContacto> cargaTiposContacto();
	
	List<MedioContacto> cargaMediosContacto();

	MedioContacto cargaMedioContactoPorId(Integer id);
}
