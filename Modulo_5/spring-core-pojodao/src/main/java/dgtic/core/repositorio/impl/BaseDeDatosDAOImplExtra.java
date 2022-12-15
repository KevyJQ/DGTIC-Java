package dgtic.core.repositorio.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.BaseDeDatos;
import dgtic.core.repositorio.intf.BaseDeDatosDAO;

/*
 * Si nosotros queremos indicar el bean que se inyectara, lo podemos hacer por 
 * medio de su nombre que se asigna, para eso hacemos el uso de la anotación @Qualifier
 */

@Component("baseDeDatosDAOExtra")
public class BaseDeDatosDAOImplExtra implements BaseDeDatosDAO {
	@Override
	public List<Estudiante> getEstudiantes(String carrera) {
		return BaseDeDatos.carreras.get(carrera);
	}

	@Override
	public Estudiante getEstudiante(String carrera, String matricula) {
		return BaseDeDatos.carreras.get(carrera).stream().filter(est -> est.getMatricula().equals(matricula))
				.findFirst().get();
	}

}
