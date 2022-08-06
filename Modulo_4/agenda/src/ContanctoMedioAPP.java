import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.ContactoMedio;
import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;
import mx.unam.tic.diplomado.agenda.modelo.hibernate.HibernateUtil;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosCatalogos;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosCatalogosImpl;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosContactos;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosContactosImpl;

public class ContanctoMedioAPP {

	public static void main(String[] args) {
		
		HibernateUtil.init();	//Hechamos a andar el motor de hibernate
		
		ServiciosCatalogos serviciosCatalogos = ServiciosCatalogosImpl.getInstance();
		ServiciosContactos serviciosContactos = ServiciosContactosImpl.getInstance();
		
		MedioContacto medioContacto = serviciosCatalogos.cargaMedioContactoPorId(3);
		
		List<ContactoMedio> contactosMedio = serviciosContactos.cargarContactoMedio(medioContacto);
		
		if(contactosMedio != null && ! contactosMedio.isEmpty()) {
			System.out.println("Los numeros de medio de contacto: "+medioContacto.getNombre());
			for(ContactoMedio contactoMedio : contactosMedio) {
				System.out.println("El numero es: "+contactoMedio.getValor()+
						"\nEl nombre del contacto es: "+ contactoMedio.getContacto().getNombre());
			}
		}

	}

}
