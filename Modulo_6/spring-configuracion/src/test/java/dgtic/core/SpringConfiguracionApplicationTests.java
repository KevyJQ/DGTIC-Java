package dgtic.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import dgtic.core.modelo.Autor;
import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.intf.BaseDeDatosDAOAutorIntf;
import dgtic.core.repositorio.intf.BaseDeDatosDAOLibroIntf;
import dgtic.core.servicio.impl.ServicioImpl;
import dgtic.core.servicio.intf.ServicioIntf;

@SpringBootTest
class SpringConfiguracionApplicationTests {
	private BaseDeDatosDAOLibroIntf libroRepositorio;
	private BaseDeDatosDAOAutorIntf autorRepositorio;
	private ServicioIntf servicio;

	@BeforeEach
	public void inicio() {
		libroRepositorio = mock(BaseDeDatosDAOLibroIntf.class);
		autorRepositorio = mock(BaseDeDatosDAOAutorIntf.class);
		servicio = new ServicioImpl(libroRepositorio, autorRepositorio);
	}

	@Test
	void contextLoads() {
		when(libroRepositorio.nombreLibro("Spring-1")).thenReturn(
				BaseDeDatos.libros.stream().filter(lib -> lib.getNombre().equals("Spring-1")).findFirst().get());
		assertEquals("AS223", servicio.nombreLibro("Spring-1").getIsbn());
		assertEquals("direc1", servicio.nombreLibro("Spring-1").getEditorial().getDireccion());
	}

	@Test
	void contextLoadsDos() {
		when(autorRepositorio.getAutores(toString())).thenReturn(BaseDeDatos.libros.stream()
				.filter(lb -> lb.getNombre().equals("Spring-2"))
				.findFirst().get().getAutores());
		
		List<Autor> autores = new ArrayList<>();
		Autor autor = new Autor();
		autor.setNombre("Autor1");
		autor.setEdad(34);
		autores.add(autor);
		assertIterableEquals(autores, servicio.obtenerAutor("Spring-2"));
	}
}
