package dgtic.core.inicio;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.intf.BaseDeDatosDAO;
import dgtic.core.servicio.ServicioDAO;

public class Inicio {
	public static void main(String[] args) {

		// Version 1
		/*
		 * ConfigurableApplicationContext contexto = new
		 * AnnotationConfigApplicationContext(BaseDeDatosDAOImpl.class); /* Le indicamos
		 * que lo tarte como un DAO / BaseDeDatosDAO serv = (BaseDeDatosDAO)
		 * contexto.getBean("baseDeDatosDAO");
		 * System.out.println(serv.getEstudiantes("ico"));
		 * System.out.println(" ----- "); Estudiante est = serv.getEstudiante("ime",
		 * "126"); System.out.println(est); contexto.close();
		 */

		// Version 2
		ConfigurableApplicationContext contexto = new AnnotationConfigApplicationContext(ServicioDAO.class);
		BaseDeDatosDAO serv = (BaseDeDatosDAO) contexto.getBean("baseDeDatosDAO");
		System.out.println(serv.getEstudiantes("ico"));
		System.out.println("	");
		Estudiante est = serv.getEstudiante("ime", "126");
		System.out.println("--jj--"+est);
		System.out.println("	");
		ServicioDAO csv = contexto.getBean(ServicioDAO.class);
		System.out.println(csv.archivoCSV("ime"));
		System.out.println("	");
		contexto.close();

	}

}
