package mx.unam.dgtic.m07s1;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface DireccionRepository extends PagingAndSortingRepository<Direccion, String> {
	public List<Direccion> findAll();

	public List<Direccion> buscarPorArrendador(String arrendador);

}
