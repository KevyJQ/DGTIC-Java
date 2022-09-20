package dgtic.core.repositorio.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import dgtic.core.modelo.Libro;
import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.intf.BaseDeDatosDAOEditorialIntf;

@Repository
public class BaseDeDatosDAOEditorialImpl implements BaseDeDatosDAOEditorialIntf {

	@Override
	public List<Libro> librosDeEditorial(String nombreEditorial) {
		return BaseDeDatos.libros.stream().filter(lib -> lib.getEditorial().equals(nombreEditorial))
				.collect(Collectors.toList());
	}
}
