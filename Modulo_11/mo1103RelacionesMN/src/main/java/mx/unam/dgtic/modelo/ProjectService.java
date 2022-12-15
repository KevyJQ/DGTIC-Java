package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import mx.unam.dgtic.dominio.Project;

public class ProjectService {
	protected EntityManager em;

	public ProjectService(EntityManager em) {
		super();
		this.em = em;
	}

	public Project findProject(int id) {
		return em.find(Project.class, id);
	}

	@SuppressWarnings("unchecked") // Se le agrega en dado caso que no tengamos ningun valor
	public Collection<Project> findAllProjects() {
		Query query = em.createQuery("SELECT p FROM Project p");
		return (Collection<Project>) query.getResultList();
	}

	public Project createProject(String name) {
		Project project = new Project();
		project.setName(name);
		em.getTransaction().begin();
		em.persist(project);
		em.getTransaction().commit();
		return project;
	}
}
