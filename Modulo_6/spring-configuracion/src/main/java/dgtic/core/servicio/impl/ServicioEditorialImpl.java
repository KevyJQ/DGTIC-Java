package dgtic.core.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import dgtic.core.modelo.Libro;
import dgtic.core.repositorio.intf.BaseDeDatosDAOEditorialIntf;
import dgtic.core.repositorio.intf.BaseDeDatosDAOLibroIntf;
import dgtic.core.servicio.intf.ServicioEditorialIntf;

@Component
public class ServicioEditorialImpl implements ServicioEditorialIntf {
	private BaseDeDatosDAOEditorialIntf DAOEditorial;

	public ServicioEditorialImpl(BaseDeDatosDAOEditorialIntf dAOEditorial) {
		super();
		DAOEditorial = dAOEditorial;
	}

	@Override
	public List<Libro> editorialLibros(String nombreEditorial) {
		return DAOEditorial.librosDeEditorial(nombreEditorial);
	}

}
