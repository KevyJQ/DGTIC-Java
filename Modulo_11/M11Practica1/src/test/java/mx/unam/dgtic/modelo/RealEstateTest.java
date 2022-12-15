package mx.unam.dgtic.modelo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.modelo.util.ModelUtil;

public class RealEstateTest {

	@Test
	public void crear() {
		Arrendador arrendador = ModelUtil.crearArrendador();

		RealEstate realEstate = ModelUtil.crearRealEstate(arrendador);
		System.out.println(realEstate);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(realEstate);
		em.getTransaction().commit();
	}

	@Test
	public void actualizar() {
		Arrendador arrendador = ModelUtil.crearArrendador();
		RealEstate realEstate = ModelUtil.crearRealEstate(arrendador);
		System.out.println(realEstate);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(realEstate);
		em.getTransaction().commit();

		assertNotNull(realEstate.getIdRealEstate());

		realEstate.setCostoMax(10000);

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(realEstate);
		em.getTransaction().commit();
	}

	@Test
	public void borrar() {
		Arrendador arrendador = ModelUtil.crearArrendador();
		RealEstate realEstate = ModelUtil.crearRealEstate(arrendador);
		System.out.println(realEstate);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(realEstate);
		em.getTransaction().commit();

		Long idRealEstate = realEstate.getIdRealEstate();
		assertNotNull(idRealEstate);

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.remove(realEstate);
		em.getTransaction().commit();

		assertNull(em.find(RealEstate.class, idRealEstate));
	}

}
