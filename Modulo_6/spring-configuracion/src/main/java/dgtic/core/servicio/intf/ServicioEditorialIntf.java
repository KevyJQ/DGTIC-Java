package dgtic.core.servicio.intf;

import java.util.List;

import dgtic.core.modelo.Libro;

public interface ServicioEditorialIntf {
	public List<Libro> editorialLibros(String nombreEditorial);
}
