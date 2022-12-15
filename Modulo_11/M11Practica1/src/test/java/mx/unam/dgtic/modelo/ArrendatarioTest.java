package mx.unam.dgtic.modelo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.modelo.util.ModelUtil;

public class ArrendatarioTest {

	@Test
	public void crear() {
		Arrendatario arrendatario = ModelUtil.crearArrendatario();
		System.out.println(arrendatario);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendatario);
		em.getTransaction().commit();
	}

	@Test
	public void actualizar() {
		Arrendatario arrendatario = ModelUtil.crearArrendatario();
		System.out.println(arrendatario);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendatario);
		em.getTransaction().commit();

		assertNotNull(arrendatario.getIdArrendatario());

		arrendatario.setNombre1("Pedro");

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendatario);
		em.getTransaction().commit();
	}

	@Test
	public void borrar() {
		Arrendatario arrendatario = ModelUtil.crearArrendatario();
		System.out.println(arrendatario);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendatario);
		em.getTransaction().commit();

		Long idArrendatario = arrendatario.getIdArrendatario();
		assertNotNull(idArrendatario);

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.remove(arrendatario);
		em.getTransaction().commit();

		assertNull(em.find(Arrendatario.class, idArrendatario));
	}

}
