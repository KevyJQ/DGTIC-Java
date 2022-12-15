package mx.unam.dgtic.m07s1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
class M07s1Ejercicios1NamedQuery {

	@Autowired
	MateriaRepository materiaRepository;
	
	@Autowired
	MateriasPagingAndSortingRepository materiasPagingAndSortingRepository;

	@Test
	void buscarAltosTest() {
		Iterable<Materias> iterable = materiaRepository.buscarAltos();
		System.out.println("\n--- Buscar Altos ---");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarAltosMayorCalificacionTest() {
		Iterable<Materias> iterable = materiaRepository.buscarAltosMayorCalificacion();
		System.out.println("\nbuscarAltos");
		iterable.forEach(System.out::println);
		System.out.println();
	}
	
	@Test
	void buscarTodosConCalificacionTest() {
		Iterable<Materias> iterable = materiaRepository.buscarTodosConCalificacion();
		System.out.println("\n-- Buscar todos con calificacion --");
		iterable.forEach(System.out::println);
		System.out.println();
	}
	
//	@Test
//	void findMateriasCalificacionesDTOTest() {
//		Iterable<MateriaCalificacionDTO> iterable = materiaRepository.findMateriasCalificacionesDTO();
//		System.out.println("\n-- Buscar materiasCalificacionesDTO --");
//		iterable.forEach(System.out::println);
//		System.out.println();
//	}
	
	@Test
	void buscarByOrderByNombreTest() {
		Iterable<Materias> iterable = materiasPagingAndSortingRepository.findByOrderByNombre();
		System.out.println("\nfindOrderByNombre");
		iterable.forEach(System.out::println);
		System.out.println();
	}
	
	@Test
	void buscarTodosPaginasTest() {
		Pageable pagina;
		Iterable<Materias> iterable;

		for (int i = 0; i <= 4; i++) {
			System.out.println("Pagina " + i);
			pagina = PageRequest.of(i, 2, Sort.by("nombre").descending());
			iterable = materiasPagingAndSortingRepository.findAll(pagina);
			System.out.println("\nBuscamos todo "+ i + "de 4 elementos ordenamos por nombre");
			iterable.forEach(System.out::println);
			System.out.println();
		}

	}
	
	
}
