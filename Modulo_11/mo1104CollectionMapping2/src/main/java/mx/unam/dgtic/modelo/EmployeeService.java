package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.dgtic.dominio.Employee;

public class EmployeeService {
	protected EntityManager em;

	public EmployeeService(EntityManager em) {
		super();
		this.em = em;
	}

	// Crear
	public Employee createEmployee(int id, String name, long salary) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(employee);
		em.flush();
		em.getTransaction().commit();

		return employee;
	}

	// Remover
	public void removeEmployee(int id) {
		Employee employee = findEmployee(id);
		if (employee != null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
		}
	}

	// Update/actualizar
	public Employee updateEmployee(Employee emp) {
		Employee employee = findEmployee(emp.getId());
		if (employee != null) {
			em.getTransaction().begin();
			employee = em.merge(emp); // merge = mezcla cada dato con los que tenemos en nuestra entidad
			em.getTransaction().commit();
		}
		return employee;
	}

	// Busqueda por Id
	public Employee findEmployee(int id) {
		return em.find(Employee.class, id); // Hacemos la busqueda por id con el EntityManager
	}

	// Buscar todo los empleados
	@SuppressWarnings("unchecked") // Se le agrega en dado caso que no tengamos ningun valor
	public Collection<Employee> findAllEmployee() {
		Query query = em.createQuery("SELECT e FROM Employee e");
		return (Collection<Employee>) query.getResultList();
	}

	public Collection<Employee> findAllEmployeeVacations() {
		TypedQuery query = em.createQuery("SELECT e FROM Employee e", Employee.class);
		Collection<Employee> employees = query.getResultList();
		for (Employee e : employees) {
			e.getVacationBookings().size();
			e.getNickNames().size();
		}
		return employees;
	}

	public Employee addEmployeeNickname(int id, String nickname) {
		Employee employee = findEmployee(id);
		if (employee != null) {
			employee.getNickNames().add(nickname);
			updateEmployee(employee);
		}
		return employee;
	}

}
