package mx.unam.dgtic.m07s1;

import org.springframework.data.repository.CrudRepository;

public interface MaestroRepository extends CrudRepository<Maestro, String> {

	public void buscarTodoTest();
	public void insertarTest();
	public void buscarVariosTest();
	boolean existByNombre(String nombre);
	
}
