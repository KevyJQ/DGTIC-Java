package mx.unam.dgtic.m07s1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CalificacionRepository extends CrudRepository<Calificacion, Integer> {
	List<Calificacion> findByMateria(String materia);
	List<Calificacion>	findByCalificacion(int calificacion);
	
	//Busqueda de calificaciones por medio de campos de alumno
	List<Calificacion> findByAlumnoNombre(String nombre);
	List<Calificacion> findByAlumnoPaterno(String paterno);
}