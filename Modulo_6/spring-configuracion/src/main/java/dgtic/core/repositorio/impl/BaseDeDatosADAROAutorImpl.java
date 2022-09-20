package dgtic.core.repositorio.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dgtic.core.modelo.Autor;
import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.intf.BaseDeDatosDAOAutorIntf;
@Repository
public class BaseDeDatosADAROAutorImpl implements BaseDeDatosDAOAutorIntf {

	@Override
	public List<Autor> getAutores(String nombreLibro) {
		// TODO Auto-generated method stub
		return BaseDeDatos.libros.stream()
				.filter(lb -> lb.equals(nombreLibro))
				.findFirst().get().getAutores();
	}

}
