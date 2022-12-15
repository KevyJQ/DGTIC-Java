package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.dominio.VacationEntry;
import mx.unam.dgtic.modelo.EmployeeService;

public class PrincipalEmployee01elelementCollections {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);

		System.out.println("Kevy Bryan Juarez Quiroz");

		// Insertar empleado
		System.out.println("Insertar empleado");
		Employee employee = service.createEmployee(500, "Kevy Juarez", 5000);
		service.addEmployeeNickname(500, "GurrenLagannKS");
		System.out.println(employee);

		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e);
				System.out.println("Vacaciones del empleado " + e.getName());
				for (VacationEntry v : e.getVacationBookings()) {
					System.out.println(v);
				}
				System.out.println("Nicknames del empleado " + e.getName());
				for (String n : e.getNickNames()) {
					System.out.println(n);
				}
			}
		}

	}
}
