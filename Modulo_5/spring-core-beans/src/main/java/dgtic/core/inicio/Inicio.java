package dgtic.core.inicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dgtic.core.modelo.Empleado;
import dgtic.core.modelo.PlanificacionProyectos;

public class Inicio {
	public static void main(String[] args) {
		ApplicationContext contexto = new ClassPathXmlApplicationContext(new String[] {
			"/dgtic/core/xml/bean-configuration.xml",
		});
		
		Empleado emp = (Empleado) contexto.getBean("empleado");
		emp.setActividad(new PlanificacionProyectos());
		System.out.println(emp.toString());
		if(emp.getActividad() != null) {
			emp.getActividad().realizar();
		}
		System.out.println("-----");
		Empleado empDos = (Empleado) contexto.getBean("empleadoDos");
		System.out.println(empDos.toString());
		if(empDos.getActividad() != null) {
			empDos.getActividad().realizar();
		}
		System.out.println("-----");
		Empleado empTres = (Empleado) contexto.getBean("empleadoTres");
		empTres.setNombre("Carlos");
		System.out.println(empTres.toString());
		if(empTres.getActividad() != null) {
			empTres.getActividad().realizar();
		}
		System.out.println("-----");
		Empleado empCuatro = (Empleado) contexto.getBean("empleadoCuatro");
		empCuatro.setNombre("Tomas");
		System.out.println(empCuatro.toString());
		if(empCuatro.getActividad() != null) {
			empCuatro.getActividad().realizar();
		}
		System.out.println("-----");
		Empleado empCinco = (Empleado) contexto.getBean("empleadoCinco");
		System.out.println(empCinco.toString());
		if(empCinco.getActividad() != null) {
			empCinco.getActividad().realizar();
		}
		((ClassPathXmlApplicationContext)contexto).close();
	}
}
