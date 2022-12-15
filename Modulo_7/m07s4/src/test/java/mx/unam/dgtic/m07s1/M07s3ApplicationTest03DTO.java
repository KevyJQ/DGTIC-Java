package mx.unam.dgtic.m07s1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s3ApplicationTest03DTO {

	private static final String miNombre = "Kevy Bryan Juarez Quiroz";

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB

	@Autowired
	CalificacionRepository calificacionRepository;

	@Test
	void buscarAltosMayorPromedioTest() {
		System.out.println(miNombre);

		Iterable<AlumnoCalificacionDTO> iterable = repositoryAlumno.findAlumnoCalificacionDTO();
		System.out.println("\nfindAlumnoCalificacionDTO");
		iterable.forEach(System.out::println);
		System.out.println();
	}
}