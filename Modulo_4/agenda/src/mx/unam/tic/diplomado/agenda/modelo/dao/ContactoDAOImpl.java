package mx.unam.tic.diplomado.agenda.modelo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Contacto;
import mx.unam.tic.diplomado.agenda.modelo.hibernate.HibernateUtil;

public class ContactoDAOImpl implements ContactoDAO {

	private static ContactoDAOImpl instance;

	private ContactoDAOImpl() {
	}

	public static ContactoDAOImpl getInstance() {
		if (instance == null) {
			instance = new ContactoDAOImpl();
		}
		return instance;
	}

	@Override
	public Contacto cargaContactoPorId(Integer id) {
		Contacto contacto = null;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			contacto = session.get(Contacto.class, id);	
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
		return contacto;
	}

	@Override
	public List<Contacto> cargaContactos() {
		List<Contacto> catalogo = null;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			catalogo = session.createQuery("FROM Contacto").list();
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}

		return catalogo;
	}

	@Override
	public void guardaContacto(Contacto contacto) {
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			session.save(contacto);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
	}

	@Override
	public void actualizaContacto(Contacto contacto) {
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			session.update(contacto);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
	}

	@Override
	public void eliminaContacto(Contacto contacto) {
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			session.remove(contacto);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
	}

}
