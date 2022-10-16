package mx.unam.diplomado.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.unam.diplomado.modelo.entidades.MedioContacto;

@Repository("medioContactoRepository")
public interface MedioContactoRepository extends JpaRepository<MedioContacto, Integer>, 
	QueryByExampleExecutor<MedioContacto>{

}
