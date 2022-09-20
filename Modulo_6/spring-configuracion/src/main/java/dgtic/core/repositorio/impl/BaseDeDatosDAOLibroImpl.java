package dgtic.core.repositorio.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dgtic.core.modelo.Editorial;
import dgtic.core.modelo.Libro;
import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.intf.BaseDeDatosDAOLibroIntf;
@Repository
public class BaseDeDatosDAOLibroImpl implements BaseDeDatosDAOLibroIntf {

	@Override
	public Libro nombreLibro(String nombre) {
		return BaseDeDatos.libros.stream()
				.filter(lib -> lib.getNombre().equals(nombre))
				.findFirst().get();
	}
	/*
	 * Sentencia del return BaseDeDatos -> Lugar donde se encuentran los libros
	 * libros -> Trae todos los obros que tenga la Base de datos filter ->Hace el
	 * filtro que nosotros deseamos findFirst -> Busca el primeto que encuentres get
	 * -> dame el primero que enconstraste
	 */

	@Override
	public List<Libro> getLibros() {
		return null;
	}

	@Override
	public void agregarLibro(Libro libro) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Libro> nombreEditorial(String nombre) {
		return (List<Libro>) BaseDeDatos.libros.stream()
				.filter(lib->lib.getEditorial().equals(nombre))
				.findFirst().get().getEditorial();
	}
}
