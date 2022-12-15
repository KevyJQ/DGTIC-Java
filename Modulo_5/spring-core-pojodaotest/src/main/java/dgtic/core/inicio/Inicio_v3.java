package dgtic.core.inicio;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dgtic.core.modelo.Estudiante;
import dgtic.core.repositorio.intf.BaseDeDatosDAO;
import dgtic.core.servicio.ServicioDAO;

public class Inicio_v3 {
	public static void main(String[] args) {
		ConfigurableApplicationContext contexto = new AnnotationConfigApplicationContext(ServicioDAO.class);
		ServicioDAO csv = contexto.getBean(ServicioDAO.class);
		BaseDeDatosDAO serv = csv.getServicioDAO();
		System.out.println(serv.getEstudiantes("ico"));
		System.out.println("	");
		Estudiante est = serv.getEstudiante("ime", "126");
		System.out.println(est);
		System.out.println("	");
		System.out.println(csv.archivoCSV("ime"));
		System.out.println("	");
		contexto.close();
	}
}
