package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.EmployeeService;

public class PrincipalEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);

		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
//				System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
			}
		}

//		// Cambiar empleado
//		System.out.println("Cambiar Empleado");
//		Employee eu = new Employee(100);
//		eu.setName("Kevy Juarez");
//		eu.setSalary(1100);
//
//		Employee empAct = service.updateEmployee(eu);
//		System.out.println(empAct);
//
//		// Insertar empleado
//		System.out.println("Insertar empleado");
//		eu = service.createEmployee(500, "Kevy Juarez", 5000);
//		System.out.println(eu);

		// Eliminar empleado
		System.out.println("Eliminar empleado");
		service.removeEmployee(200);
		System.out.println("Empleado eliminado");

		employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee ec : employees) {
//				System.out.println(ec.getId() + " " + ec.getName() + " " + ec.getSalary());
			}
		}

	}
}
