package mx.unam.tic.diplomado.agenda.modelo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.TipoContacto;
import mx.unam.tic.diplomado.agenda.modelo.hibernate.HibernateUtil;

public class CatalogosDAOImpl implements CatalogosDAO {

	private static CatalogosDAOImpl instance;

	private CatalogosDAOImpl() {

	}

	public static CatalogosDAOImpl getInstance() {
		if (instance == null) {
			instance = new CatalogosDAOImpl();
		}
		return instance;
	}

	@Override
	public List<TipoContacto> cargaTiposContacto() {
		List<TipoContacto> catalogo = null;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			catalogo = session.createQuery("SELECT t FROM TipoContacto t WHERE t.estatus = 'ACTIVO' ").list();
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
	public TipoContacto cargaTipoContactoPorId(Integer id) {
		TipoContacto tipoContacto = null;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			tipoContacto = session.get(TipoContacto.class, id);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
		return tipoContacto;
	}

	@Override
	public List<MedioContacto> cargaMediosContacto() {
		List<MedioContacto> catalogo = null;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			catalogo = session.createQuery("SELECT t FROM MedioContacto t WHERE t.estatus = 'ACTIVO' ").list();
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
	public MedioContacto cargaMedioContactoPorId(Integer id) {
		MedioContacto medioContacto = null;
		try {

			Session session = HibernateUtil.getSessionFactory().openSession();

			// se inicia una transaccion
			session.beginTransaction();
			medioContacto = session.get(MedioContacto.class, id);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(HibernateUtil.getRegistry());
		}
		return medioContacto;
	}
}
