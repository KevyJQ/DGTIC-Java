package mx.unam.diplomado.service;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.TipoContacto;

public interface TipoContactoService {
	
	List<TipoContacto> getListaTipoContacto();
	
	TipoContacto cargaPorNombre(String nombre);
	
}
