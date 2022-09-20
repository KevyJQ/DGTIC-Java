package dgtic.core.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Libro {
	private String nombre;
	private Editorial editorial;
	private String isbn;
	private List<Autor> autores = new ArrayList<>();

	public Libro() {
	}

	public Libro(String nombre, Editorial editorial, String isbn, List<Autor> autores) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.isbn = isbn;
		this.autores = autores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autores, editorial, isbn, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autores, other.autores) && Objects.equals(editorial, other.editorial)
				&& Objects.equals(isbn, other.isbn) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", editorial=" + editorial + ", isbn=" + isbn + ", autores=" + autores + "]";
	}

	
}
