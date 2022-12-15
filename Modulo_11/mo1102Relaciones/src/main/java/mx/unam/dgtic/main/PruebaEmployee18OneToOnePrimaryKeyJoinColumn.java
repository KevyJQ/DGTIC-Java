package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Department;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.dominio.ParkingSpace;
import mx.unam.dgtic.modelo.EmployeeService;
import mx.unam.dgtic.modelo.ParkingSpaceService;

public class PruebaEmployee18OneToOnePrimaryKeyJoinColumn {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);
		ParkingSpaceService pSpaceService = new ParkingSpaceService(em);

		Employee employee = new Employee("Kevy Juarez", 5000);
		employee.setId(500);
		service.createEmployee(employee);

		pSpaceService.createParkingSpace(employee, 500, "E-500");

		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e);
				System.out.println(e.getParkingSpace());
			}
		}

		Collection<ParkingSpace> parkingSpaces = pSpaceService.findAllParkingSpace();
		if (parkingSpaces.isEmpty()) {
			System.out.println("No se encontraron espacios de estacionamiento");
		} else {
			System.out.println("Espacios localizados");
			for (ParkingSpace p : parkingSpaces) {
				System.out.println(p);
				System.out.println(p.getEmployee());
			}
		}
	}
}
