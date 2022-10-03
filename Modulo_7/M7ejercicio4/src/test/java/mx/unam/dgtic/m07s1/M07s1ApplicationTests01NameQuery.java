package mx.unam.dgtic.m07s1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests01NameQuery {

	//private static final miNombre = "Kevy Bryan Juarez Quiroz";
	
	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Autowired
	CalificacionRepository calificacionRepository;

	@Test
	void buscarAltosTest() {
		Iterable<Alumno> iterable = repositoryAlumno.buscarAltos();
		System.out.println("\nbuscarAltos");
		iterable.forEach(System.out::println);

		try {
			iterable = repositoryAlumno.buscarAltosConFecha(new SimpleDateFormat("yyyy-MM-dd").parse("2001-01-01"));
			System.out.println("\nBuscar_Altos");
			iterable.forEach(System.out::println);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void buscarPorNombreNamedQueryTest() {
		Iterable<Alumno> iterable = repositoryAlumno.buscarPorNombre("Marco");
		System.out.println("\nBuscar por nombre NamedQuery");
		iterable.forEach(System.out::println);
		
		iterable = repositoryAlumno.buscarPorNombreYPaterno("Marco","Polo 5");
		System.out.println("\nBuscar por nombre y Paterno NamedQuery");
		iterable.forEach(System.out::println);
		System.out.println();
	}
}