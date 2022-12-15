package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import mx.unam.dgtic.dominio.Department;

public class DepartmenService {
	protected EntityManager em;

	public DepartmenService(EntityManager em) {
		super();
		this.em = em;
	}
	
	public Department findDepartment(int id) {
		return em.find(Department.class, id);
	}

	public Department createDepartment(String name) {
		Department d = new Department();
		d.setName(name);
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return d;
	}

	@SuppressWarnings("unchecked")
	public Collection<Department> findAllDepartment() {
		Query query = em.createQuery("SELECT d FROM Department d");
		return (Collection<Department>) query.getResultList();
	}
}
