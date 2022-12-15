package mx.unam.dgtic.m07s1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests07ConsultasDerivadas {
	private static final String NOMBRE = "Kevy";
	private static final String PATERNO = "Juarez";
	private static final double ESTATUTA = 1.65;
	private static final double ESTATUTA2 = 1.69;
	private static final String PATRON = "a";

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Test
	void deletePorNombreTest() {
		boolean existenombre = repositoryAlumno.existsByNombre(NOMBRE);
		System.out.println("\nExiste el nombre " + NOMBRE + " " + existenombre);
		if (existenombre == true) {
			System.out.println("\nSi existe, por lo tanto ahora lo elimino..");
			List<Alumno> misAlumnos = repositoryAlumno.deleteByNombre(NOMBRE);
			System.out.println("Alumnos eliminados");
			misAlumnos.forEach(System.out::println);
			System.out.println();
		}
	}
}
