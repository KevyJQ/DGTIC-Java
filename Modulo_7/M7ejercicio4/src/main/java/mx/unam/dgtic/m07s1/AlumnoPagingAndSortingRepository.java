package mx.unam.dgtic.m07s1;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlumnoPagingAndSortingRepository extends PagingAndSortingRepository<Alumno, String> {
	public List<Alumno> findByOrderByNombre();
	public List<Alumno> findByOrderByNombreDescPaternoDesc();
	
	public List<Alumno> findAllByEstatura(double estatura,Pageable pageable);
}
