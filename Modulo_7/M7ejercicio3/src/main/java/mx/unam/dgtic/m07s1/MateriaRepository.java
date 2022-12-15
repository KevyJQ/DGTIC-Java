package mx.unam.dgtic.m07s1;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MateriaRepository extends CrudRepository<Materias, String> {

	public List<Materias> findAll();

	public List<Materias> findByNombreLike(String patron);

	public List<Materias> findByCreditosBetween(int numero1, int numero2);

	public List<Materias> findByNombreAndProfesor(String nombre, String Profesor);

	public List<Materias> findByNombreIn(Collection<String> nombres);

	@Transactional
	public List<Materias> deleteByNombre(String nombre);
	
	//NameQuery
	public List<Materias> buscarAltos();
	
	//NamedNativeQuery
	public List<Materias> buscarAltosMayorCalificacion();

	//Join Ferch
	public List<Materias> buscarTodosConCalificacion();
	
//	//DTO
//	@Query(value= "select distinct new mx.unam.dgtic.m07s1.MateriaCalificacionDTO("
//			+ "m.nombre, m.profesor, c.semestre, c.calificacionFinal) "
//			+ "from Materias m, Calificaciones c "
//			+ "where m.matricula = c.generacion")
//	public List<MateriaCalificacionDTO> findMateriasCalificacionesDTO();
	
	
}
