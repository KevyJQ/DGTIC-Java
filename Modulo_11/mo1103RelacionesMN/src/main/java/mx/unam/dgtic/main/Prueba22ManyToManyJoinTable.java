package mx.unam.dgtic.main;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.dominio.Project;
import mx.unam.dgtic.modelo.EmployeeService;
import mx.unam.dgtic.modelo.ProjectService;

public class Prueba22ManyToManyJoinTable {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		EmployeeService service = new EmployeeService(em);
		ProjectService pService = new ProjectService(em);

		Collection<Project> projs;

		// Insertar empleado
		System.out.println("--- Kevy Juarez ---");
		System.out.println("Insertar empleado");
		Employee employee = new Employee("Kevy Juarez", 5000);
		employee = service.createEmployee(employee);
		System.out.println(employee);

		System.out.println("Insertar proyecto");
		Project project = pService.createProject("JAVA");
		System.out.println(project);

		System.out.println("Agregar proyecto a empleado");
		service.addEmployeeProject(employee.getId(), project.getId());
		service.addEmployeeProject(employee.getId(), 1);
		service.addEmployeeProject(employee.getId(), 2);

		Collection<Employee> employees = service.findAllEmployee();
		if (employees.isEmpty()) {
			System.out.println("No se localizaron empleados...");
		} else {
			System.out.println("Empleados localizados");
			for (Employee e : employees) {
				System.out.println(e);
				projs = e.getProjects();
				if (projs.isEmpty()) {
					System.out.println("El empleado " + e.getName() + " No tiene proyectos asignados");
				} else {
					System.out.println("Proyectos del empleado " + e.getName());
					for (Project p : projs) {
						System.out.println(p.getName());
					}
				}
			}
		}

		projs = pService.findAllProjects();
		if (projs.isEmpty()) {
			System.out.println("No se localizaron proyectos...");
		} else {
			System.out.println("Proyectos localizados");
			for (Project p : projs) {
				System.out.println(p);
				employees = p.getEmployees();
				if (projs.isEmpty()) {
					System.out.println("El proyecto " + p.getName() + " No tiene proyectos asignados");
				} else {
					System.out.println("Empleados del proyecto " + p.getName());
					for (Employee e : employees) {
						System.out.println(e.getName());
					}
				}
			}
		}
		/*
		 * // Cambiar empleado System.out.println("Cambiar Empleado"); Employee eu = new
		 * Employee(100); eu.setName("Kevy Juarez"); eu.setSalary(1100);
		 * 
		 * Employee empAct = service.updateEmployee(eu); System.out.println(empAct);
		 * 
		 * // Insertar empleado System.out.println("Insertar empleado"); eu =
		 * service.createEmployee(500, "Kevy Juarez", 5000); System.out.println(eu);
		 * 
		 * // Eliminar empleado System.out.println("Eliminar empleado");
		 * service.removeEmployee(200); System.out.println("Empleado eliminado");
		 * 
		 * employees = service.findAllEmployee(); if (employees.isEmpty()) {
		 * System.out.println("No se localizaron empleados..."); } else {
		 * System.out.println("Empleados localizados"); for (Employee ec : employees) {
		 * System.out.println(ec.getId() + " " + ec.getName() + " " + ec.getSalary()); }
		 * }
		 */
	}
}
