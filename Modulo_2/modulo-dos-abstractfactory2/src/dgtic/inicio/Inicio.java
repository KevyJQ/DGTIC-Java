package dgtic.inicio;

import dgtic.repositorio.imp.FactoryRelacional;
import dgtic.repositorio.interfaces.RepositorioAbstractFactory;
import dgtic.repositorio.interfaces.RepositorioMaterias;
import dgtic.repositorio.interfaces.RepositorioProfesores;


public class Inicio {

	public static void main(String[] args) {
		RepositorioAbstractFactory factory = new FactoryRelacional();
		RepositorioProfesores rep = factory.crearRespositorioProfesores();
		rep.listaProfesores();

		RepositorioAbstractFactory factoryDos = new FactoryRelacional();
		RepositorioMaterias repDos = factoryDos.crearRespositorioMaterias();
		repDos.listaMaterias();
	}


}
