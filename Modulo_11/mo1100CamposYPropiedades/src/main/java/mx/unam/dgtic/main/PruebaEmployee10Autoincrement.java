package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.EmployeeService;

public class PruebaEmployee10Autoincrement {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);

		System.out.println("Insertar empleado");
		Employee emp = new Employee("Kevy Juarez", 5000);
		service.createEmployee(emp);

		System.out.println("--- Kevy Juarez ---");
		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e);
			}
		}
	}
}
