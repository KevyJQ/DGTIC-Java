package mx.unam.dgtic.m07s1;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests01ConsultasDerivadaCRUD {
	private static final String NOMBRE = "Daniela";
	private static final String PATERNO = "Calles";
	private static final double ESTATUTA = 1.65;

	@Autowired
	MaestroRepository maestroRepository;

	// #1
	@Test
	void findAllTest() {
		List<Maestro> maestros = maestroRepository.findAll();
		System.out.println("\nBuscar todos");
		maestros.forEach(System.out::println);
		System.out.println();
	}

	// #2
	@Test
	void findByNombreTest() {
		Iterable<Maestro> iterable = maestroRepository.getByNombre(NOMBRE);
		System.out.println("\nBuscar por nombre");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	// #3
	@Test
	void desitinctTest() {
		List<Maestro> maestros = maestroRepository.findMaestroDistinctByNombre(NOMBRE);
		System.out.println("\nDistinct por nombre " + NOMBRE);
		maestros.forEach(System.out::println);
		System.out.println();
	}

	// #4
	@Test
	void getByNombreAndPaternoTest() {
		Iterable<Maestro> iterable = maestroRepository.getByNombreAndPaterno(NOMBRE, PATERNO);
		System.out.println("\nBuscar por nombre y Paterno");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	// #5
	@Test
	void findFirstByOrderByEstaturaTest() {
		Iterable<Maestro> iterable = maestroRepository.findFirstByOrderByEstatura();
		System.out.println("\nFirst ordenado por estatura ASC");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	// #6
	@Test
	void existNombreTest() {
		boolean existe = maestroRepository.existsByNombre(NOMBRE);
		System.out.println("\nExiste alumno por nombre " + NOMBRE);
		if (existe == true) {
			System.out.println("Existe el alumno: " + NOMBRE);
		} else {
			System.out.println("No existe el alumno con el nombre: " + NOMBRE);
		}
	}

	// #7
	@Test
	void findAllByPaternoIsNotNullTest() {
		Iterable<Maestro> iterable = maestroRepository.findAllByPaternoIsNotNull();
		System.out.println("\nBuscar todos mientras paterno no sea null");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	// #8
	@Test
	void patronesTest() {
		List<Maestro> maestros = maestroRepository.findByNombreContaining("g");
		System.out.println("\nNombre que Contenga g");
		maestros.forEach(System.out::println);
		System.out.println();
	}

	// #9
	@Test
	void comparacionTest() {
		List<Maestro> maestros = maestroRepository.findByEstaturaLessThanEqual(ESTATUTA);
		System.out.println("\nBuscar las estaturas menores a " + ESTATUTA);
		maestros.forEach(System.out::println);
		System.out.println();
	}

	// #10
	@Test
	void inNombresTest() {
		List<String> nombres = Arrays.asList(NOMBRE, "Mariano", "Majo");
		List<Maestro> maestros = maestroRepository.findByNombreIn(nombres);
		System.out.println("\nNombres in: ");
		maestros.forEach(System.out::println);
		System.out.println();
	}
}
