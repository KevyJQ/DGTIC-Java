package mx.unam.dgtic.m07s1;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s2ApplicationTests02NamedNativeQuery {

	private static final String miNombre = "Kevy Bryan Juarez Quiroz";

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Autowired
	CalificacionRepository calificacionRepository;

	@Test
	void buscarAltosMayorPromedioTest() {
		double estaturaPromedio = repositoryAlumno.buscarEstaturaPromedioAlumnos();

		System.out.println(miNombre);
		System.out.println("Estatura promedio " + estaturaPromedio);

		Iterable<Alumno> iterable = repositoryAlumno.buscarAltosMayorPromedio();
		System.out.println("\nbuscarAltos");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarTodosNativeQueryTest() {
		System.out.println(miNombre);

		Iterable<Alumno> iterable = repositoryAlumno.buscarAlumnosConCalificacion();
		System.out.println("\nbuscar alumnos con calificacion");
		iterable.forEach(System.out::println);
		System.out.println();

		iterable = repositoryAlumno.buscarPorNombreYPaternoNative("Marco", "Polo 5");
		System.out.println("\nBuscar por nombre y Paterno Native Query");
		iterable.forEach(System.out::println);
		System.out.println();
	}

	@Test
	void buscarTodosConCalificacionesTest() {
		System.out.println(miNombre);

		Iterable<Alumno> iterable = repositoryAlumno.buscarTodosConCalificaciones();
		System.out.println("\nBuscarTodosConCalificaciones");
		iterable.forEach(System.out::println);
		System.out.println();
		
		for (Alumno a : iterable) {
			System.out.println(a.getMatricula() + " " + a.getNombre() + " " + a.getPaterno());
			List<Calificacion> calificaciones = a.getCalificaciones();
			for (Calificacion c : calificaciones) {
				System.out.println(c.getMateria() + " " + c.getCalificacion());
			}
		}

	}
}