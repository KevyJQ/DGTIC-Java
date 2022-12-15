package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.EmployeeService;

public class Prueba25EmbebedOb {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);

		System.out.println("Insertar empleado");
		Employee employee = service.createEmployee("Kevy Juarez", 5000, "Torre de piedra", "Queretaro", "Queretaro",
				"87877");
		System.out.println(employee);

		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
				System.out.println(e.getAddress().getStreet() + " " + e.getAddress().getCity() + " "
						+ e.getAddress().getState() + " " + e.getAddress().getZip());
				System.out.println();
			}
		}
	}
}
