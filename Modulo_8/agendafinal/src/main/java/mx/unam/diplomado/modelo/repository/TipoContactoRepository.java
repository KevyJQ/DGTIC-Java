package mx.unam.diplomado.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.unam.diplomado.modelo.entidades.TipoContacto;

@Repository("tipoContactoRepository")
public interface TipoContactoRepository extends JpaRepository<TipoContacto, Integer>, 
	QueryByExampleExecutor<TipoContacto> {
}
