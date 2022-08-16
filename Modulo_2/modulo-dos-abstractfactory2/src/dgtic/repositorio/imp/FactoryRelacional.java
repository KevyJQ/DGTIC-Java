package dgtic.repositorio.imp;

import dgtic.repositorio.interfaces.RepositorioAbstractFactory;
import dgtic.repositorio.interfaces.RepositorioProfesores;

public class FactoryRelacional implements RepositorioAbstractFactory{

	@Override
	public RepositorioProfesores crearRespositorioProfesores() {
		// TODO Auto-generated method stub
		return new RepositorioProfesorRelacional();
	}

	@Override
	public RepositorioMateriasRelacional crearRespositorioMaterias() {
		// TODO Auto-generated method stub
		return new RepositorioMateriasRelacional();
	}



}
