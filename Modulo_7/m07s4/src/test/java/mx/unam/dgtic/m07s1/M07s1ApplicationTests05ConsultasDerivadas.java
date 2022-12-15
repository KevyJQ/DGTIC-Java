package mx.unam.dgtic.m07s1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests05ConsultasDerivadas {
	private static final String NOMBRE = "Kevy";
	private static final String PATERNO = "Juarez";
	private static final double ESTATUTA = 1.65;

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void distinctTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findAlumnoDistinctByNombre(NOMBRE);
		System.out.println("\nDistinct por nombre" + NOMBRE);
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void top2PorEstaturaTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findTop2ByEstatura(ESTATUTA);
		System.out.println("\nTop 2 por estatura");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void orderByPaternoTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByNombreOrderByPaterno(NOMBRE);
		System.out.println("\nOrdenado por Paterno ASC");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findByNombreOrderByPaternoDesc(NOMBRE);
		System.out.println("\nOrdenado por Paterno DESC");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void topOrdenadoPorEstaturaTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findFirstByOrderByEstatura();
		System.out.println("\nFirst ordenado por estatura ASC");
		misAlumnos.forEach(System.out::println);
		System.out.println();

		misAlumnos = repositoryAlumno.findTopByOrderByEstaturaDesc();
		System.out.println("\nTop ordenado por estura DESC");
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void existsNombreTest() {
		boolean existe = repositoryAlumno.existsByNombre(NOMBRE);
		System.out.println("\nExiste alumno por nombre " + NOMBRE);
		if (existe == true) {
			System.out.println("Existe el alumno: " + NOMBRE);
		} else {
			System.out.println("No existe el alumno con el nombre: " + NOMBRE);
		}
	}

	@Test
	void existsNombreAndPaternoTest() {
		boolean existe = repositoryAlumno.existsByNombreAndPaterno(NOMBRE, PATERNO);
		System.out.println("\nExiste alumno por nombre " + NOMBRE + " y paterno " + PATERNO);
		if (existe == true) {
			System.out.println("\nSi existe el alumno: " + NOMBRE + " " + PATERNO);
			System.out.println();
		} else {
			System.out.println("\nNo existe el alumno con el nombre: " + NOMBRE + " " + PATERNO);
			System.out.println();
		}
	}

	@Test
	void paternoNullTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByPaternoIsNull();
		System.out.println("\nPaterno null");
		misAlumnos.forEach(System.out::println);
		System.out.println();
		
		misAlumnos = repositoryAlumno.findByPaternoIsNotNull();
		System.out.println("\nPaterno is not null");
		misAlumnos.forEach(System.out::println);
		System.out.println();
		
	}
}
