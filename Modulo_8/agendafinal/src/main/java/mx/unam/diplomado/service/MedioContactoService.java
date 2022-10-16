package mx.unam.diplomado.service;

import java.util.List;

import mx.unam.diplomado.modelo.entidades.MedioContacto;

public interface MedioContactoService {

	List<MedioContacto> getListaMedioContacto();

	MedioContacto cargaPorNombre(String nombre);

}
