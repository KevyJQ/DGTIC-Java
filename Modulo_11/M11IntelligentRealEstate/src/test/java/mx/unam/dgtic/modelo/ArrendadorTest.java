package mx.unam.dgtic.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.modelo.util.ModelUtil;

public class ArrendadorTest {

	@Test
	public void crear() {
		Arrendador arrendador = ModelUtil.crearArrendador();
		System.out.println(arrendador);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		RealEstate realEstate = ModelUtil.crearRealEstate(arrendador);
		arrendador.getRealEstates().add(realEstate);
		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		em.getTransaction().begin(); // Iniciamos la transaccion
		Arrendador arrendador2 = em.find(Arrendador.class, arrendador.getIdArrendador());
		assertEquals(1, arrendador2.getRealEstates().size());
		em.getTransaction().commit();

	}
	@Test
	public void actualizar() {
		Arrendador arrendador = ModelUtil.crearArrendador();
		System.out.println(arrendador);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		assertNotNull(arrendador.getIdArrendador());

		arrendador.setNombre1("Pedro");

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();
	}

	@Test
	public void borrar() {
		Arrendador arrendador = ModelUtil.crearArrendador();
		System.out.println(arrendador);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		Long idArrendador = arrendador.getIdArrendador();
		assertNotNull(idArrendador);

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.remove(arrendador);
		em.getTransaction().commit();

		assertNull(em.find(Arrendador.class, idArrendador));
	}
}
