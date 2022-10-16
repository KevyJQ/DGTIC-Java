package mx.unam.diplomado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import mx.unam.diplomado.modelo.entidades.TipoContacto;
import mx.unam.diplomado.modelo.repository.TipoContactoRepository;

@Service
public class TipoContactoServiceImpl implements TipoContactoService {
	
	@Autowired
    private TipoContactoRepository tipoContactoRepository;
	
	@Override
	public List<TipoContacto> getListaTipoContacto() {
		return tipoContactoRepository.findAll();
	}
	
	@Override
	public TipoContacto cargaPorNombre(String nombre) {
		TipoContacto encontrado = null;
		TipoContacto tipoContactoExample = new TipoContacto();
		tipoContactoExample.setNombre(nombre);
		Example<TipoContacto> tCExample = Example.of(tipoContactoExample);
		Iterable<TipoContacto> it = tipoContactoRepository.findAll(tCExample);
		for (TipoContacto tipocontacto : it) {
			encontrado = tipocontacto;
		}
		return encontrado; 
	}

}
