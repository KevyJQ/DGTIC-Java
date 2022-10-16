package mx.unam.diplomado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import mx.unam.diplomado.modelo.entidades.MedioContacto;
import mx.unam.diplomado.modelo.repository.MedioContactoRepository;

@Service
public class MedioContactoServiceImpl implements MedioContactoService {
	
	@Autowired
	private MedioContactoRepository medioContactoRepository;

	@Override
	public List<MedioContacto> getListaMedioContacto() {
		return medioContactoRepository.findAll();
	}

	@Override
	public MedioContacto cargaPorNombre(String nombre) {
		MedioContacto encontrado = null;
		MedioContacto medioContactoExample = new MedioContacto();
		medioContactoExample.setNombre(nombre);
		Example<MedioContacto> tCExample = Example.of(medioContactoExample);
		Iterable<MedioContacto> it = medioContactoRepository.findAll(tCExample);
		for (MedioContacto mediocontacto : it) {
			encontrado = mediocontacto;
		}
		return encontrado; 
	}

}
