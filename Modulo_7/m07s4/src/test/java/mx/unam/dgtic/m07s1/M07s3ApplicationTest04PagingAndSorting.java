package mx.unam.dgtic.m07s1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
class M07s3ApplicationTest04PagingAndSorting {

	private static final String miNombre = "Kevy Bryan Juarez Quiroz";

	@Autowired
	AlumnoPagingAndSortingRepository repositoryAlumno;

	@Autowired
	CalificacionRepository calificacionRepository;

	@Test
	void buscarTodosOrderByTest() {
		System.out.println(miNombre);

		Iterable<Alumno> iterable = repositoryAlumno.findByOrderByNombre();
		System.out.println("\nfindOrderByNombre");
		iterable.forEach(System.out::println);
		System.out.println();

		iterable = repositoryAlumno.findByOrderByNombreDescPaternoDesc();
		System.out.println("\nfindByOrderByNombreDescPaternoDesc");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarByEstaturaPageableTest() {
		System.out.println(miNombre);

		Pageable pagina = PageRequest.of(0, 5);
		Iterable<Alumno> iterable = repositoryAlumno.findAllByEstatura(1.60, pagina);
		System.out.println("\nBuscamos la pagina 1 de 3 elementos");
		iterable.forEach(System.out::println);
		System.out.println();

		pagina = PageRequest.of(1, 5);
		iterable = repositoryAlumno.findAllByEstatura(1.60, pagina);
		System.out.println("\nbuscamos la pagina 2 de 5 elementos");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarTodosPageableTest() {
		System.out.println(miNombre);
		// Se separan en paginas de 5 elementos(Ejemplo: 20 usuarios serian 20/5 = 4
		// paginas)
		Pageable pagina = PageRequest.of(0, 5, Sort.by("nombre").descending());
		Iterable<Alumno> iterable = repositoryAlumno.findAll(pagina);
		System.out.println("\nBuscamos todo la pagina 1 de 5 elementos ordenamos por nombre");
		iterable.forEach(System.out::println);
		System.out.println();

		pagina = PageRequest.of(1, 5, Sort.by("estatura"));
		iterable = repositoryAlumno.findAllByEstatura(1.60, pagina);
		System.out.println("\nbuscamos la pagina 2 de 5 elementos ordenamos por estatura");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarTodosPaginasTest() {
		System.out.println(miNombre);
		// Se separan en paginas de 5 elementos(Ejemplo: 20 usuarios serian 20/5 = 4
		// paginas)
		Pageable pagina;
		Iterable<Alumno> iterable;

		for (int i = 0; i <= 4; i++) {
			System.out.println("Pagina " + i);
			pagina = PageRequest.of(i, 5, Sort.by("nombre").descending());
			iterable = repositoryAlumno.findAll(pagina);
			System.out.println("\nBuscamos todo "+ i + "de 5 elementos ordenamos por nombre");
			iterable.forEach(System.out::println);
			System.out.println();
		}

	}
}