package mx.unam.dgtic.m07s1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M7ApplicationTests01Ejericicio01 {
	private static final String NOMBRE = "Daniela";
	private static final String PATERNO = "Juarez";
	private static final double ESTATUTA = 1.65;
	
	@Autowired
	MaestroRepository maestroRepository;

//	// 1
//	@Test
//	void buscarTodoTest() {
//		Iterable<Maestro> iterable = maestroRepository.findAll();
//		List<Maestro> maestros = new ArrayList<Maestro>();
//		System.out.println("\nMostramos todos los maestros");
//		iterable.forEach(maestros::add);
//		maestros.forEach(System.out::println);
//	}
//
//	// 2
//	@Test
//	void insertarTest() {
//		Maestro maestro = new Maestro("100F", "Kevy", "Juarez", new Date(), 1.76);
//		maestroRepository.save(maestro);
//
//		System.out.println("\nInsertamos nuevo maestro");
//		Optional<Maestro> optional = maestroRepository.findById("100F");
//
//		System.out.println("\nBuscar por Matricula");
//		if (optional.isPresent()) {
//			System.out.println(optional.get().toString());
//		} else {
//			System.out.println("Matricula no localizada");
//		}
//		System.out.println();
//	}
//
//	// 3
//	@Test
//	void buscarVariosTest() {
//		Iterable<Maestro> iterable = maestroRepository.findAllById(List.of("20A", "6C", "90A"));
//		List<Maestro> maestros = new ArrayList<Maestro>();
//		System.out.println("\nBuscamos diferentes profesores");
//		iterable.forEach(maestros::add);
//		maestros.forEach(System.out::println);
//		System.out.println();
//	}

	// 4
	@Test
	void existsNombreTest() {
		boolean existe = maestroRepository.existByNombre(NOMBRE);
		System.out.println("\nExiste alumno por nombre " + NOMBRE);
		if (existe == true) {
			System.out.println("Existe el alumno: " + NOMBRE);
		} else {
			System.out.println("No existe el alumno con el nombre: " + NOMBRE);
		}
		System.out.println();
	}

}
