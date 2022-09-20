package dgtic.core.repositorio;

import java.util.ArrayList;
import java.util.List;

import dgtic.core.modelo.Autor;
import dgtic.core.modelo.Editorial;
import dgtic.core.modelo.Libro;

public class BaseDeDatos {
	public static List<Libro> libros = new ArrayList<>(); // Arreglo de libros

	static { // primer bloque que se ejecuta
		Editorial editorial = new Editorial("Edito1", "direc1");
		List<Autor> autores = new ArrayList<>(); // Creamos el arreglo de autores

		Autor autor = new Autor(); // Creamos el objeto Autor
		autor.setEdad(34); // Damos el valor de edad
		autor.setNombre("Autor1"); // Le damos el nombre
		autores.add(autor); // Agregamos al arreglo
		// --------------------
		autor = new Autor();
		autor.setEdad(53);
		autor.setNombre("Autor2");
		autores.add(autor);

		Libro libro = new Libro(); // Creamos el objeto libro
		libro.setIsbn("AS223"); // Llenamos el vamor de isbn
		libro.setNombre("Spring-1"); // Pasamoe el nombre
		libro.setEditorial(editorial); // Pasamos los datos de la editorial
		libro.setAutores(autores); // Pasamos los autores
		libros.add(libro);
		/**
		 * Cuando pasamos los autores, estamos pasando los 2 autores que estamos
		 * llenando previamente
		 */

		editorial = new Editorial("Edito2", "direc2");
		autores = new ArrayList<>();
		autor = new Autor();
		autor.setEdad(34);
		autor.setNombre("Autor1");
		autores.add(autor);
		libro = new Libro();
		libro.setIsbn("AS224");
		libro.setNombre("Spring-2");
		libro.setEditorial(editorial);
		libro.setAutores(autores);
		libros.add(libro);
	}
}
