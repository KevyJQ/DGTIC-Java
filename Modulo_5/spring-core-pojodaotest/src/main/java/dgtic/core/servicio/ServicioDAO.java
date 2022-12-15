package dgtic.core.servicio;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import dgtic.core.repositorio.intf.BaseDeDatosDAO;

@Component
@ComponentScan(basePackages = "dgtic.core")

public class ServicioDAO {
	/*
	 * El Autowire indica que va a buscar en el contenedor los que seas de la
	 * BaseDeDatosDAO, cuando lo encuentra lo injecta a servicioDAO En otras
	 * palabras hace una injeccion de dependencia
	 */
	
	/*
	 * @Autowired(required = false) indica a Spring si no puede encontrar un bean
	 * que coincida, entonces la propiedad no se establece. No se indica dado que
	 * Spring necesita inyectar el bean cuando se ocupa en el constructor. Correr la
	 * aplicación.
	 */

	/*
	 * private BaseDeDatosDAO servicioDAO;
	 * 
	 * @Autowired public ServicioDAO(@Qualifier("baseDeDatosDAOExtra")
	 * BaseDeDatosDAO servicioDAO) { this.servicioDAO = servicioDAO; }
	 */
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("baseDeDatosDAOExtra") private BaseDeDatosDAO servicioDAO;
	 * 
	 * public void setServicioDAO(BaseDeDatosDAO servicioDAO) { this.servicioDAO =
	 * servicioDAO; }
	 */

	private BaseDeDatosDAO servicioDAO;

	@Autowired
	public void setServicioDAO(@Qualifier("baseDeDatosDAOExtra") BaseDeDatosDAO servicioDAO) {
		this.servicioDAO = servicioDAO;
	}

	public BaseDeDatosDAO getServicioDAO() {
		return servicioDAO;
	}

	public String archivoCSV(String carrera) {
		return servicioDAO.getEstudiantes(carrera).stream()
				.map(alm -> alm.getMatricula() + ";"
						+ (alm.getMaterias().stream().map(mat -> (mat.getNombre() + ";" + mat.getCreditos()))
								.collect(Collectors.joining(";")))
						+ ";" + alm.getNombre())
				.collect(Collectors.joining("\n"));
	}

}
