package dgtic.core.inicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dgtic.core.servicio.EmpleadoServicio;
import dgtic.core.servicio.PredeterminadoServicio;
import dgtic.core.servicio.ReporteEmpleadoServicio;
import dgtic.core.servicio.Servicio;

public class Inicio {
	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext(
				new String[] { "/dgtic/core/xml/bean-configuration.xml", "/dgtic/core/xml/bean-services.xml" });
		Servicio serv = (Servicio) contexto.getBean("servicio");
		System.out.println(serv.getEmpleado().toString());
		System.out.println("	");
		Servicio servDos = (Servicio) contexto.getBean("servicioDos");
		System.out.println(servDos.getEmpleado().toString());
		System.out.println("	");
		// cambiar el valor de uno de los beans
		serv.getEmpleado().setNombre("Monica");
		System.out.println(serv.getEmpleado().toString());
		System.out.println(" ");
		System.out.println(servDos.getEmpleado().toString());
		System.out.println("	");
		((ClassPathXmlApplicationContext) contexto).close();

	}
}
