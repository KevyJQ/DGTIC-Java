package mx.unam.diplomado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.unam.diplomado.modelo.entidades.Contacto;
import mx.unam.diplomado.modelo.repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements ContactoService {
	
	@Autowired
	private ContactoRepository contactoRepository;

	@Override
	public List<Contacto> cargaContactos() {
		return contactoRepository.findAll();
	}
	
	@Override
	public void guardaContacto(Contacto contacto) {
		contactoRepository.save(contacto);
	}	
	
	@Override
	public Contacto cargaContacto(Integer id) {
		return contactoRepository.findById(id).orElse(null);
	}
	
	@Override
	public void eliminaContacto(Integer id) {
		contactoRepository.deleteById(id);
	}
}
