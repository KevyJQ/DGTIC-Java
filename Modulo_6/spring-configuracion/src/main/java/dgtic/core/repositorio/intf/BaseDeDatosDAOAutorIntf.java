package dgtic.core.repositorio.intf;

import java.util.List;

import dgtic.core.modelo.Autor;

public interface BaseDeDatosDAOAutorIntf {
	public List<Autor> getAutores(String nombreLibro);
}
