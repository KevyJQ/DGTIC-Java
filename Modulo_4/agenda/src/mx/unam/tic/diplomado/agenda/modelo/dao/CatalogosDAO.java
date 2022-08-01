package mx.unam.tic.diplomado.agenda.modelo.dao;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.TipoContacto;

public interface CatalogosDAO {
	
	List<TipoContacto> cargaTiposContacto();
	
	TipoContacto cargaTipoContactoPorId(Integer id);
	
	List<MedioContacto> cargaMediosContacto();
	
	MedioContacto cargaMedioContactoPorId(Integer id);

}
