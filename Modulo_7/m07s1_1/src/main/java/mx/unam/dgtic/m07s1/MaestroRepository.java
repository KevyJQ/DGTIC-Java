package mx.unam.dgtic.m07s1;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MaestroRepository extends CrudRepository<Maestro, String>{
	public List<Maestro> findAll();
	public List<Maestro> getByNombre(String nombre);
	public List<Maestro> findMaestroDistinctByNombre(String nombre);
	public List<Maestro> getByNombreAndPaterno(String nombre, String paterno);
	public List<Maestro> findFirstByOrderByEstatura();
	boolean existsByNombre(String nombre);
	public List<Maestro> findAllByPaternoIsNotNull();
	public List<Maestro> findByNombreContaining(String contiene);
	public List<Maestro> findByEstaturaLessThanEqual(double estatura);
	public List<Maestro> findByNombreIn(Collection<String> nombres);
	
}
