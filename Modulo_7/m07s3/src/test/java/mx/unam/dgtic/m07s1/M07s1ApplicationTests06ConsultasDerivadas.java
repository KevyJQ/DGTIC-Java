package mx.unam.dgtic.m07s1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests06ConsultasDerivadas {
	private static final String NOMBRE = "Kevy";
	private static final String PATERNO = "Juarez";
	private static final double ESTATUTA = 1.65;
	private static final double ESTATUTA2 = 1.69;
	private static final String PATRON = "a";

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void patronesTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByPaternoStartingWith(PATRON);
		System.out.println("\nPaterno Inicia con " + PATRON);
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByPaternoEndingWith("a");
		System.out.println("\nPaterno Termina con a");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByPaternoContaining("a");
		System.out.println("\nPaterno Contiene con a");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void likeTest() {
		// Igual a patron
		List<Alumno> misAlumnos = repositoryAlumno.findByPaternoLike(PATRON);
		System.out.println("\nPaterno like " + PATRON);
		misAlumnos.forEach(System.out::println);
		System.out.println();

		// Inicia con patron %a
		misAlumnos = repositoryAlumno.findByPaternoLike(PATRON + "%");
		System.out.println("\nPaterno like " + PATRON + "%");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		// Termina con patron %a
		misAlumnos = repositoryAlumno.findByPaternoLike("%" + PATRON);
		System.out.println("\nPaterno like " + "%" + PATRON);
		misAlumnos.forEach(System.out::println);
		System.out.println();

		// Contiene patron %a%
		misAlumnos = repositoryAlumno.findByPaternoLike("%" + PATRON + "%");
		System.out.println("\nPaterno like " + "%" + PATRON + "%");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		// Contiene patron en la tercera posicion _a%
		misAlumnos = repositoryAlumno.findByPaternoLike("__" + PATRON + "%"); // Hay 3 _ para indicar la posicion
		System.out.println("\nPaterno like " + "_" + PATRON + "%");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		// Paterno con 6 caracteres
		misAlumnos = repositoryAlumno.findByPaternoLike("______");
		System.out.println("\nPaterno con 6 caraceteres" + "______"); // Los espacion tambien cuentan
		misAlumnos.forEach(System.out::println);
		System.out.println();

		// Paterno diferente a 6 caracteres
		misAlumnos = repositoryAlumno.findByPaternoNotLike("______");
		System.out.println("\nPaterno diferente a 6 caraceteres" + "______"); // Los espacion tambien cuentan
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void comparacionTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByEstaturaLessThan(ESTATUTA);
		System.out.println("\nEstatura menor que " + ESTATUTA);
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByEstaturaLessThanEqual(ESTATUTA);
		System.out.println("\nEstatura menor o igual que " + ESTATUTA);
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByEstaturaGreaterThan(ESTATUTA);
		System.out.println("\nEstatura mayor que " + ESTATUTA);
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByEstaturaGreaterThanEqual(ESTATUTA);
		System.out.println("\nEstatura mayor o igual que " + ESTATUTA);
		misAlumnos.forEach(System.out::println);
		System.out.println();

	}

	@Test
	void comparacionLikeTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByEstaturaGreaterThanAndPaternoLike(ESTATUTA,
				"%" + PATRON + "%");
		System.out.println("\nEstatura mayor que " + ESTATUTA + " y like " + "%" + PATRON + "%");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void betweenTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByEstaturaBetween(ESTATUTA, ESTATUTA2);
		System.out.println("\nEstatura entre " + ESTATUTA + " y " + ESTATUTA2);
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void inTest() {
		List<Double> estaturas = Arrays.asList(ESTATUTA, ESTATUTA2, 1.75);

		List<Alumno> misAlumnos = repositoryAlumno.findByEstaturaIn(estaturas);
		System.out.println("\nEstaturas in: ");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByEstaturaNotIn(estaturas);
		System.out.println("\nEstaturas in: ");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void inNombresTest() {
		List<String> nombres = Arrays.asList(NOMBRE, "Marco", "Javier");

		List<Alumno> misAlumnos = repositoryAlumno.findByNombreIn(nombres);
		System.out.println("\nNombres in: ");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByNombreNotIn(nombres);
		System.out.println("\nNombres in: ");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarFechasTest() {
		List<Alumno> misAlumnos;
		try {
			misAlumnos = repositoryAlumno.findByFnacBefore(new SimpleDateFormat("yyyy-MM-dd").parse("2001-02-10"));
			System.out.println("\nFecha Before 2001-02-10");
			misAlumnos.forEach(System.out::println);
			System.out.println();
			
			misAlumnos = repositoryAlumno.findByFnacAfter(new SimpleDateFormat("yyyy-MM-dd").parse("2001-02-10"));
			System.out.println("\nFecha After 2001-02-10");
			misAlumnos.forEach(System.out::println);
			System.out.println();
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
