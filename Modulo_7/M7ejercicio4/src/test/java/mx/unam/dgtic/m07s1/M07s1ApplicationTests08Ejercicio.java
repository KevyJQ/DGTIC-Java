package mx.unam.dgtic.m07s1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests08Ejercicio {
	private static final String NOMBRE = "Marco";
	private static final String PATERNO = "Juarez";
	private static final double ESTATUTA = 1.60;
	private static final double ESTATUTA2 = 1.70;
	private static final String PATRON = "a";

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void existTest() {
		boolean existe = repositoryAlumno.existsByNombreAndPaternoAndEstatura(NOMBRE, PATERNO, ESTATUTA);
		if (existe == true) {
			System.out.println("\nSi existe el alumno: " + NOMBRE + " " + PATERNO + " y estatura " + ESTATUTA);
			System.out.println();
		} else {
			System.out.println(
					"\nNo existe el alumno con el nombre: " + NOMBRE + " " + PATERNO + " y estatura " + ESTATUTA);
			System.out.println();
		}
	}
	
	@Test
	void betweenTest() {
		List<Alumno> misAlumnos = repositoryAlumno.findByNombreAndEstaturaBetween(NOMBRE,ESTATUTA, ESTATUTA2);
		System.out.println("\nEstatura entre " + ESTATUTA + " y " + ESTATUTA2);
		misAlumnos.forEach(System.out::println);
		System.out.println();
	}
}
