package mx.unam.dgtic.modelo;

import java.util.Date;

import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.modelo.util.ModelUtil;

public class ContratoTest {

	@Test
	public void crear() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("intelligent_realestate");
		EntityManager em = emf.createEntityManager();

		Contrato contrato = new Contrato();
		Arrendador arrendador = ModelUtil.crearArrendador();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendador);
		em.getTransaction().commit();

		Arrendatario arrendatario = ModelUtil.crearArrendatario();

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(arrendatario);
		em.getTransaction().commit();

		RealEstate realEstate = ModelUtil.crearRealEstate(arrendador);

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(realEstate);
		em.getTransaction().commit();

		contrato.setArrendador(arrendador);
		contrato.setArrendatario(arrendatario);
		contrato.setRealEstate(realEstate);
		contrato.setFechaInicio(new Date());
		contrato.setFechaFinal(new Date());

		em.getTransaction().begin(); // Iniciamos la transaccion
		em.persist(contrato);
		em.getTransaction().commit();
	}
}
