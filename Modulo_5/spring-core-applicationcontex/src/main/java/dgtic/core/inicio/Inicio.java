package dgtic.core.inicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dgtic.core.servicio.Servicio;

public class Inicio {
	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext(new String[] {
			"/dgtic/core/xml/bean-configuration.xml",
			"/dgtic/core/xml/bean-services.xml"
		});
		Servicio ser = (Servicio) contexto.getBean("servicio");
		System.out.println(ser.toString());
		((ClassPathXmlApplicationContext)contexto).close();
	}
}
