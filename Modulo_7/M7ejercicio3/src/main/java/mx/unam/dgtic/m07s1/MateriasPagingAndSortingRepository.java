package mx.unam.dgtic.m07s1;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MateriasPagingAndSortingRepository extends PagingAndSortingRepository<Materias, String>{
	public List<Materias> findByOrderByNombre();

}
