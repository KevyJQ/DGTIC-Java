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
class M07s1ApplicationTests03ConsultasDerivadas {
	private static final String NOMBRE = "Marco";

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void buscarPorNombre() {
		long nalu = repositoryAlumno.countByNombre(NOMBRE);
		System.out.println("\nNumero de alumnos con el nombre "+NOMBRE+": "+ nalu);
		
		Iterable<Alumno> iterable = repositoryAlumno.getByNombre(NOMBRE);
		System.out.println("\nBuscar por nombre");
		iterable.forEach(System.out::println);
	}
	
	@Test
	void buscarPorNombreNotTest() {
		long nalu = repositoryAlumno.countByNombreNot(NOMBRE);
		System.out.println("\nNumero de alumnos con el nombre "+NOMBRE+": "+ nalu);
		
		Iterable<Alumno> iterable = repositoryAlumno.getByNombre(NOMBRE);
		System.out.println("\nBuscar por nombre");
		iterable.forEach(System.out::println);
	}
}
