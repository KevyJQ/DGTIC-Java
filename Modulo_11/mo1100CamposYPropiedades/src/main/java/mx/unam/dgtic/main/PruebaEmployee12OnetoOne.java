package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Address;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.EmployeeService;

public class PruebaEmployee12OnetoOne {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);

		System.out.println("Insertar empleado");
		Employee emp = new Employee("Kevy Juarez", 5000);
		Address address = new Address("Torre de piedra", "Queretaro", "Queretaro", "76146");
		service.createEmployeeWithAddress(emp, address);

		System.out.println("--- Kevy Juarez ---");
		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e);
				System.out.println(e.getAddress().getCity());
			}
		}
	}
}
