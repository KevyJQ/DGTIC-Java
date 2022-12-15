package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Department;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.DepartmenService;
import mx.unam.dgtic.modelo.EmployeeService;

public class PruebaEmployee14ManyToOne {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);
		DepartmenService serviceDept = new DepartmenService(em);

		//Employee employee = new Employee("Kevy Juarez",5000);
		//employee.setDepartment(serviceDept.findDepartment(4));
		//service.createEmployee(employee);
		
		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e);
			}
		}

		Collection<Department> departments = serviceDept.findAllDepartment();
		if (departments.isEmpty()) {
			System.out.println("No se encontraron departamentos");
		} else {
			System.out.println("Departamentos localizados");
			for(Department d:departments) {
				System.out.println(d);
			}
		}
	}
}
