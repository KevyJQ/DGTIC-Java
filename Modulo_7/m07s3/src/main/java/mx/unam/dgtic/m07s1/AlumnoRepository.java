package mx.unam.dgtic.m07s1;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, String> {
	// <Clase que vamos a menjar, tipo que vamos a mapear>

	/*
	 * Consultas derivadas Busquedas
	 * 
	 * finByNombre(String nombre) getByNombre(String nombre) searchByNombre(String
	 * nombre) streamByNombre(String nombre) readByNombre(String nombre)
	 * queryByNombre(String nombre)
	 */

	// Listar los diferentes nombres
	public List<Alumno> getByNombre(String nombre);

	public List<Alumno> getByNombreNot(String nombre);

	// Contar por nombre
	public long countByNombre(String nombre);

	public long countByNombreNot(String nombre);

	// Paterno
	public List<Alumno> searchByPaterno(String paterno);

	// Estatura
	public List<Alumno> streamByEstatura(double esttura);

	// Fecha
	public List<Alumno> getByFnac(Date fecha);

	// AND / OR
	public List<Alumno> getByNombreAndPaterno(String nombre, String paterno);

	public List<Alumno> getByNombreOrPaterno(String nombre, String paterno);

	public List<Alumno> getByNombreOrPaternoAndEstatura(String nombre, String paterno, double estatura);

	public List<Alumno> getByNombreAndPaternoOrEstatura(String nombre, String paterno, double estatura);

	// Contar por nombre con And / Or
	public long countByNombreAndPaterno(String nombre, String peterno);

	public long countByNombreOrPaterno(String nombre, String peterno);

	public long countByNombreOrPaternoAndEstatura(String nombre, String peterno, double estatura);

	public long countByNombreAndPaternoOrEstatura(String nombre, String peterno, double estatura);

	// Distinct -- El campo que queremos distinguir
	public List<Alumno> findAlumnoDistinctByNombre(String nombre);

	// Top
	public List<Alumno> findTop2ByEstatura(double estatura);

	// Order
	public List<Alumno> findByNombreOrderByPaterno(String nombre);

	public List<Alumno> findByNombreOrderByPaternoDesc(String nombre);

	// Limit
	public List<Alumno> findFirstByOrderByEstatura();

	public List<Alumno> findTopByOrderByEstaturaDesc();

	// Exists
	boolean existsByNombre(String nombre);

	boolean existsByNombreAndPaterno(String nombre, String paterno);

	// Null
	public List<Alumno> findByPaternoIsNull();

	public List<Alumno> findByPaternoIsNotNull();

	// Patrones
	public List<Alumno> findByPaternoStartingWith(String prefijo);

	public List<Alumno> findByPaternoEndingWith(String prefijo);

	public List<Alumno> findByPaternoContaining(String contiene);

	// Like
	public List<Alumno> findByPaternoLike(String patron);

	public List<Alumno> findByPaternoNotLike(String patron);

	// Comparaciones
	public List<Alumno> findByEstaturaLessThan(double estatura); // Menor

	public List<Alumno> findByEstaturaLessThanEqual(double estatura); // Menor que

	public List<Alumno> findByEstaturaGreaterThan(double estatura); // Mayor

	public List<Alumno> findByEstaturaGreaterThanEqual(double estatura); // Mayor que

	public List<Alumno> findByEstaturaGreaterThanAndPaternoLike(double estatura, String patron);

	// Between
	public List<Alumno> findByEstaturaBetween(double Estaturaini, double Estaturafin);

	// In
	public List<Alumno> findByEstaturaIn(Collection<Double> estaturas);

	public List<Alumno> findByEstaturaNotIn(Collection<Double> estaturas);

	public List<Alumno> findByNombreIn(Collection<String> nombres);

	public List<Alumno> findByNombreNotIn(Collection<String> nombres);

	// Fechas
	public List<Alumno> findByFnacBefore(Date fecha);

	public List<Alumno> findByFnacAfter(Date fecha);

	// Delete
	@Transactional // Lo ponemos porque ya requiere una operacion
	public List<Alumno> deleteByNombre(String nombre);

	// Ejercicios
	boolean existsByNombreAndPaternoAndEstatura(String nombre, String paterno, double estatura);

	public List<Alumno> findByNombreAndEstaturaBetween(String nombre, double estatura1, double estatura2);

	// NamedQuery
	public List<Alumno> buscarAltos();

	public List<Alumno> buscarAltosConFecha(Date fecha);

	public List<Alumno> buscarPorNombre(String nombre);

	public List<Alumno> buscarPorNombreYPaterno(String nombre, String paterno);

	// NamedNativeQuery
	public List<Alumno> buscarAltosMayorPromedio();

	// @Query en repositorio usando JPQL
	@Query("select avg(a.estatura) from Alumno a ")
	public double buscarEstaturaPromedioAlumnos();

	// @Query en repositorio usando SQL
	@Query(value = "select distinct a.* from alumnos a "
			+ "join calificaciones c ON(a.matricula = c.alumnos_matricula) "
			+ "order by nombre", nativeQuery = true)
	public List<Alumno> buscarAlumnosConCalificacion();
	
	@Query (value = "select * from alumnos where nombre = ? and paterno = ? "
			+ "order by nombre, paterno",
			nativeQuery = true)	//Indica que vamos a usar SQL normal
	public List<Alumno> buscarPorNombreYPaternoNative(String n, String p);
	
	//Join Ferch
	public List<Alumno> buscarTodosConCalificaciones();
	
	//DTO
	@Query(value= "select distinct new mx.unam.dgtic.m07s1.AlumnoCalificacionDTO("
			+ "a.nombre, a.paterno, c.materia, c.calificacion) "
			+ "from Alumno a, Calificacion c "
			+ "where a.matricula = c.alumno")
	public List<AlumnoCalificacionDTO> findAlumnoCalificacionDTO();
}
