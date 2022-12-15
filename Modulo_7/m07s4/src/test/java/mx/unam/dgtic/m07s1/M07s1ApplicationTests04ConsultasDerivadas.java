package mx.unam.dgtic.m07s1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests04ConsultasDerivadas {
	private static final String NOMBRE = "Kevy";
	private static final String PATERNO = "Juarez";
	private static final double ESTATUTA = 1.65;

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void buscarPaternoTest() {
		Iterable<Alumno> iterable = repositoryAlumno.searchByPaterno(PATERNO);
		System.out.println("\nBuscar por paterno");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarEstaturaTest() {
		Iterable<Alumno> iterable = repositoryAlumno.streamByEstatura(ESTATUTA);
		System.out.println("\nBuscar por estatura");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarFechaTest() {
		List<Alumno> misAlumnos;
		System.out.println("\nBuscar por Fecha");
		try {
			misAlumnos = repositoryAlumno.getByFnac(new SimpleDateFormat("yyyy-mm-dd").parse("2001-03-20"));
			misAlumnos.forEach(System.out::println);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	@Test
	void buscarPorNombreAndPaternoTest() {
		long nalu = repositoryAlumno.countByNombreAndPaterno(NOMBRE,PATERNO);
		System.out.println("\nNumero de alumnos con el nombre "+NOMBRE+" "+ PATERNO+ ": "+ nalu);
		
		Iterable<Alumno> iterable = repositoryAlumno.getByNombreAndPaterno(NOMBRE,PATERNO);
		System.out.println("\nBuscar por nombre y Paterno");
		iterable.forEach(System.out::println);
		System.out.println();
	}
	
	@Test
	void buscarPorNombreOrPaternoTest() {
		long nalu = repositoryAlumno.countByNombreOrPaterno(NOMBRE,PATERNO);
		System.out.println("\nNumero de alumnos con el nombre "+NOMBRE+" o apellido "+ PATERNO+ ": "+ nalu);
		
		Iterable<Alumno> iterable = repositoryAlumno.getByNombreOrPaterno(NOMBRE,PATERNO);
		System.out.println("\nBuscar por nombre o Paterno");
		iterable.forEach(System.out::println);
		System.out.println();
	}
	
	@Test
	void buscarPorNombreOrPaternoAndEstaturaTest() {
		long nalu = repositoryAlumno.countByNombreOrPaternoAndEstatura(NOMBRE,PATERNO,ESTATUTA);
		System.out.println("\nNumero de alumnos con el nombre "+NOMBRE+" o apellido "+ PATERNO+ " y estatura "+ESTATUTA+": "+ nalu);
		
		Iterable<Alumno> iterable = repositoryAlumno.getByNombreOrPaternoAndEstatura(NOMBRE,PATERNO,ESTATUTA);
		System.out.println("\nBuscar por nombre o Paterno y estatura");
		iterable.forEach(System.out::println);
		System.out.println();
	}
	
	@Test
	void buscarPorNombreAndPaternoOrEstaturaTest() {
		long nalu = repositoryAlumno.countByNombreAndPaternoOrEstatura(NOMBRE,PATERNO,ESTATUTA);
		System.out.println("\nNumero de alumnos con el nombre "+NOMBRE+" y apellido "+ PATERNO+ " o estatura "+ESTATUTA+": "+ nalu);
		
		Iterable<Alumno> iterable = repositoryAlumno.getByNombreAndPaternoOrEstatura(NOMBRE,PATERNO,ESTATUTA);
		System.out.println("\nBuscar por nombre y Paterno o estatura");
		iterable.forEach(System.out::println);
		System.out.println();
	}
}
