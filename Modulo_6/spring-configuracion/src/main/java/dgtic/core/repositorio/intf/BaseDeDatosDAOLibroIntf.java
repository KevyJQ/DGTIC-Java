package dgtic.core.repositorio.intf;

import java.util.List;

import dgtic.core.modelo.Editorial;
import dgtic.core.modelo.Libro;

public interface BaseDeDatosDAOLibroIntf {
	public Libro nombreLibro(String nombre);
	
	public List<Libro> nombreEditorial(String nombre);

	public List<Libro> getLibros(); // Obteniendo los libros

	public void agregarLibro(Libro libro); // Agregamos un Libro
}
