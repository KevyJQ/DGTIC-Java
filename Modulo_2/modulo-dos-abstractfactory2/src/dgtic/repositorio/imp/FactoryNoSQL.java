package dgtic.repositorio.imp;

import dgtic.repositorio.interfaces.RepositorioAbstractFactory;
import dgtic.repositorio.interfaces.RepositorioMaterias;
import dgtic.repositorio.interfaces.RepositorioProfesores;

public class FactoryNoSQL  implements RepositorioAbstractFactory{

	@Override
	public RepositorioProfesores crearRespositorioProfesores() {
		return new RepositorioProfesorNoSQL();
	}

	@Override
	public RepositorioMaterias crearRespositorioMaterias() {
		return new RepositorioMateriasNoSQL();	//Regresa la interfas que esta implementando
	}

}
