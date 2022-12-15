package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import mx.unam.dgtic.dominio.Employee;
import mx.unam.dgtic.dominio.ParkingSpace;

public class ParkingSpaceService {
	protected EntityManager em;

	public ParkingSpaceService(EntityManager em) {
		super();
		this.em = em;
	}

	public ParkingSpace createParkingSpace(Employee employee, int lot, String location) {
		ParkingSpace pSpace = new ParkingSpace();
		pSpace.setId(employee.getId());
		pSpace.setLot(lot);
		pSpace.setLocation(location);

		employee.setParkingSpace(pSpace);
		pSpace.setEmployee(employee);

		em.getTransaction().begin();
		em.persist(pSpace);
		em.getTransaction().commit();

		return pSpace;
	}

	public Long countParkingSpace() {
		Query query = em.createQuery("SELECT COUNT(p) as np FROM ParkingSpace p");
		return (Long) query.getSingleResult();
	}

	public ParkingSpace findParkingSpace(int id) {
		return em.find(ParkingSpace.class, id);
	}

	@SuppressWarnings("unchecked")
	public Collection<ParkingSpace> findAllParkingSpace() {
		Query query = em.createQuery("SELECT p FROM ParkingSpace p");
		return (Collection<ParkingSpace>) query.getResultList();
	}
}
