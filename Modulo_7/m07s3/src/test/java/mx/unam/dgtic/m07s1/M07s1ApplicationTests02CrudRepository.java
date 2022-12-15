package mx.unam.dgtic.m07s1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.reporting.ReportEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests02CrudRepository {

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void buscarTodosTest() {
		Iterable<Alumno> iterable = repositoryAlumno.findAll();
		List<Alumno> misAlumnos = new ArrayList<Alumno>();

		System.out.println("Buscar todos los alumnos");
		iterable.forEach(misAlumnos::add);
		misAlumnos.forEach(System.out::println);

		assertThat(misAlumnos.size(), greaterThan(6));
	}

	@Test
	void buscarUnoTest() {
		Optional<Alumno> optional = repositoryAlumno.findById("2A");

		System.out.println("\nBuscar por Matricula");
		if (optional.isPresent()) {
			System.out.println(optional.get().toString() + "\n");
		} else {
			System.out.println("Matricula no localizada");
		}
	}

	@Test
	void insertatUnoTest() {
		Alumno alumno = new Alumno("1F", "Kevy", "Juarez", new Date(), 1.76);
		repositoryAlumno.save(alumno);

		System.out.println("\nInsertamos alumno");
		Optional<Alumno> optional = repositoryAlumno.findById("1F");

		System.out.println("\nBuscar por Matricula");
		if (optional.isPresent()) {
			System.out.println(optional.get().toString());
		} else {
			System.out.println("Matricula no localizada");
		}
	}

	@Test
	void actualizarUnoTest() {
		System.out.println("\nActualizar alumno");
		Optional<Alumno> optional = repositoryAlumno.findById("3B");

		if (optional.isPresent()) {
			Alumno alumno = optional.get();
			alumno.setPaterno("Avenida");
			alumno.setEstatura(1.62);
			repositoryAlumno.save(alumno);

			optional = repositoryAlumno.findById("3B");
			System.out.println(optional.get().toString() + "\n");
		}
	}

	@Test
	void eliminarUnoTest() {
		System.out.println("\nEliminamos alumno");
		repositoryAlumno.deleteById("1F");

		Alumno alumno = new Alumno("1A");
		repositoryAlumno.delete(alumno);
	}

	@Test
	void buscarVariosTest() {
		Iterable<Alumno> iterable = repositoryAlumno.findAllById(List.of("2A", "4A", "15A"));
		List<Alumno> milista = new ArrayList<Alumno>();

		System.out.println("\nBuscar todos los alumnos");
		iterable.forEach(milista::add);
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void insertarVariosTest() {
		List<Alumno> milista = new ArrayList<Alumno>();
		for (int i = 1; i < 6; i++) {
			milista.add(new Alumno(i + "N", "Marco", "Polo", new Date(), 1.60 + (i / 10)));
		}
		System.out.println("\nAlumnos antes de insertar vaios: " + repositoryAlumno.count());
		repositoryAlumno.saveAll(milista);
		System.out.println("Alumnos Despues de insertar vaios: " + repositoryAlumno.count());
	}
}
