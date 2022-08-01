import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mx.unam.tic.diplomado.hibernate.Registro;

public class RegistrosAPP {

	private SessionFactory sessionFactory;
	private StandardServiceRegistry registry;
	
	public static void main(String[] args) {

		RegistrosAPP app = new RegistrosAPP();
		app.init();//Lo mandamos a llamar para que se carge
		/*
		 * Lo mandamos a llamar para que carge
		 * */
		
		Registro registro = new Registro();
		/*
		 * Creamos el objeto registro
		 * */
		registro.setNombre("nombre");
		registro.setApellido("apellido");
		registro.setEdad(41);
		/*
		 * Ponemos los datos a gusrdar 
		 * */
		
		Session session = app.geFactory().openSession();
		/*
		 * Obtenemos la session de hibernate
		 * */
		session.beginTransaction();
		/*
		 * Iniciamos transaccion
		 * */
		
		session.save(registro);
		/*
		 * Guardamos el registro
		 * */
		session.getTransaction().commit();
		/*
		 * Generamos la transaccion y la confirmamos
		 * */
	}
	
	/*Constructor que inicializa la sessionFactory
	 * */
	public SessionFactory geFactory() {
		return this.sessionFactory;
	}
	
	public void init() {		

		registry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml") // se carga la configuracion hibernate
				.build();
		try {
			// se crea una fabrica de sessiones hibernate
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
		}
		catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy( registry );
		}
	}

}
