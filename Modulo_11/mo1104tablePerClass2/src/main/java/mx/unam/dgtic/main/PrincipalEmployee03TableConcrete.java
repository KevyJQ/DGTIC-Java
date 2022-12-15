package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.CompanyEmployee;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.dominio.FullTimeEmployee;
import mx.unam.dgtic.dominio.PartTimeEmployee;
import mx.unam.dgtic.modelo.EmployeeService;

public class PrincipalEmployee03TableConcrete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);

		Employee emp = null;
		emp = new FullTimeEmployee();
		emp = new PartTimeEmployee();
		emp = new CompanyEmployee();

		System.out.println("Kevy Bryan Juarez Quiroz");

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
