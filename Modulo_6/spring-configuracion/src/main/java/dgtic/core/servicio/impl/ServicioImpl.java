package dgtic.core.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import dgtic.core.modelo.Autor;
import dgtic.core.modelo.Libro;
import dgtic.core.repositorio.intf.BaseDeDatosDAOAutorIntf;
import dgtic.core.repositorio.intf.BaseDeDatosDAOLibroIntf;
import dgtic.core.servicio.intf.ServicioIntf;

@Component
public class ServicioImpl implements ServicioIntf {
	private BaseDeDatosDAOLibroIntf DAOLibro;
	private BaseDeDatosDAOAutorIntf DAOAutor;

	public ServicioImpl(BaseDeDatosDAOLibroIntf dAOLibro, BaseDeDatosDAOAutorIntf dAOAutor) {
		DAOLibro = dAOLibro;
		DAOAutor = dAOAutor;
	}

	@Override
	public Libro nombreLibro(String nombre) {
		return DAOLibro.nombreLibro(nombre);
	}

	@Override
	public List<Autor> obtenerAutor(String nombre) {
		return DAOAutor.getAutores(nombre);
	}

}
