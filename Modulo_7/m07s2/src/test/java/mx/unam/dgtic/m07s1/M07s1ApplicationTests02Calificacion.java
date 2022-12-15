package mx.unam.dgtic.m07s1;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M07s1ApplicationTests02Calificacion {

	@Autowired
	AlumnoRepository repositoryAlumno; // Ya podemos ingresar a nuestra DB
	
	@Autowired
	CalificacionRepository calificacionRepository;

	@Test
	void buscarTodosCalificacioTest() {
		Iterable<Calificacion> iterable= calificacionRepository.findAll();
		List<Calificacion> misCalificaciones = new ArrayList<Calificacion>();
		
		System.out.println("\nFindAll Calificacion");
		iterable.forEach(System.out::println);
	}
	
	@Test
	void buscarCalificacioPorAlumnoNombreTest() {
		Iterable<Calificacion> iterable = calificacionRepository.findByAlumnoNombre("Nadia");
		System.out.println("findByAlumnoNombre Calificacion");
		iterable.forEach(System.out::println);
	}
}