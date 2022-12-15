package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Department;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.modelo.DepartmenService;
import mx.unam.dgtic.modelo.EmployeeService;

public class PruebaEmployee14OneToMany {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);
		DepartmenService serviceDept = new DepartmenService(em);
		
		Employee employee = service.findEmployee(301);
		Department department = serviceDept.findDepartment(5);
		
		if(!department.getEmployees().contains(employee)) {
			//department.getEmployees().add(employee);
			//employee.setDepartment(department);
			service.updateEmployee(employee);
			em.flush();
		}

		Collection<Department> departments = serviceDept.findAllDepartment();
		Collection<Employee> employees;
		if (departments.isEmpty()) {
			System.out.println(" No se encontraron departamentos");
		} else {
			System.out.println(" Departamentos localizados");
			for (Department d : departments) {
				System.out.println(d);
				employees = d.getEmployees();
				if (employees.isEmpty()) {
					System.out.println(" El departemento " + d.getName() + " No tiene empleados registrados");
				} else {
					System.out.println("Empleados registrados en " + d.getName());
					for (Employee e : employees) {
						System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
					}
				}
			}
		}
	}
}
