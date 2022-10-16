package mx.unam.diplomado.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.unam.diplomado.modelo.entidades.Contacto;

@Repository("contactoRepository")
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
