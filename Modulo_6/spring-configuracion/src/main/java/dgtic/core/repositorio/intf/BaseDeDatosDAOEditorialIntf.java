package dgtic.core.repositorio.intf;

import java.util.List;

import dgtic.core.modelo.Libro;

public interface BaseDeDatosDAOEditorialIntf {
	public List<Libro> librosDeEditorial(String nombreEditorial);
}
