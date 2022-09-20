package dgtic.core.servicio.intf;

import java.util.List;

import dgtic.core.modelo.Autor;
import dgtic.core.modelo.Libro;

public interface ServicioIntf {
	public Libro nombreLibro(String nombre); // Regresas el nombre del libro

	public List<Autor> obtenerAutor(String nombre);

}
