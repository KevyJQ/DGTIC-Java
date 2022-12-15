package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Company;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.CompanyService;
import mx.unam.dgtic.modelo.EmployeeService;

public class Prueba26SharingEmbebedOb {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);
		CompanyService cService = new CompanyService(em);

		System.out.println("Insertar Compania");
		Company company = cService.createCompany("DGTIC", "Circuito Universitario", "CU", "CMDX", "53000");
		System.out.println(company);

		Collection<Company> companies = cService.findAllCompanies();
		if (companies.isEmpty()) {
			System.out.println("No se localizaron las compañias...");
		} else {
			System.out.println("Compañias  localizados");
			for (Company c : companies) {
				System.out.println(c.getId() + " " + c.getName());
				System.out.println(c.getAddress().getStreet() + " " + c.getAddress().getCity() + " "
						+ c.getAddress().getState() + " " + c.getAddress().getZip());
				System.out.println();
			}
		}

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
