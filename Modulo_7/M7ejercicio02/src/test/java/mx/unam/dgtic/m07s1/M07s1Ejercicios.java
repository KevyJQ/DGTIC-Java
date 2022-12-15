package mx.unam.dgtic.m07s1;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1Ejercicios {
	private static final String PATRON = "c";
	private static final int CREDITO1 = 6;
	private static final int CREDITO2 = 8;

	@Autowired
	MateriaRepository materiaRepository;

	@Test
	void findAllTest() {
		List<Materias> materia = materiaRepository.findAll();
		System.out.println("\n findAll");
		materia.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void likeTest() {
		List<Materias> materia = materiaRepository.findByNombreLike(PATRON + "%");
		System.out.println("\nNombre like " + PATRON + "%");
		materia.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void betweenTest() {
		List<Materias> materias = materiaRepository.findByCreditosBetween(CREDITO1, CREDITO2);
		System.out.println("\nCreditos entre " + CREDITO1 + " y " + CREDITO2);
		materias.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void andTest() {
		List<Materias> materias = materiaRepository.findByNombreAndProfesor("Etica", "Carlo");
		System.out.println("\nBuscar por nombre de la materia y profesor");
		materias.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void inTest() {
		List<String> nombres = Arrays.asList("espanol", "Estatica", "Dinamica");
		List<Materias> materias = materiaRepository.findByNombreIn(nombres);
		System.out.println("\nBuscar las materias en la coleccion");
		materias.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void deleteTest() {

		List<Materias> materia = materiaRepository.deleteByNombre("Etica");
		System.out.println("Materia eliminada");
		materia.forEach(System.out::println);
		System.out.println();

	}

}
