import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Contacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.ContactoMedio;
import mx.unam.tic.diplomado.agenda.modelo.entidades.MedioContacto;
import mx.unam.tic.diplomado.agenda.modelo.entidades.TipoContacto;
import mx.unam.tic.diplomado.agenda.modelo.hibernate.HibernateUtil;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosCatalogos;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosCatalogosImpl;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosContactos;
import mx.unam.tic.diplomado.agenda.servicios.ServiciosContactosImpl;

public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HibernateUtil.init();
		ServiciosCatalogos serviciosCatalogos = ServiciosCatalogosImpl.getInstance();
		ServiciosContactos serviciosContactos = ServiciosContactosImpl.getInstance();
		
		
		List<TipoContacto> tiposContacto = serviciosCatalogos.cargaTiposContacto();
		
		for (TipoContacto tipoContacto : tiposContacto) {
			System.out.println("El tipo contacto es:" + tipoContacto.getNombre());
		}

		TipoContacto familiar = serviciosCatalogos.cargaTipoContactoPorId(1);
		System.out.println("El contacto familiar===" + familiar);

		List<MedioContacto> mediosContacto = serviciosCatalogos.cargaMediosContacto();

		for (MedioContacto medioContacto : mediosContacto) {
			System.out.println("El medio contacto es:" + medioContacto.getNombre());
		}

		MedioContacto casa = serviciosCatalogos.cargaMedioContactoPorId(1);
		System.out.println("El medio casa===" + casa);
		Contacto papa = new Contacto();
		
		//Datos del contacto 
		papa.setNombre("Mi tio");
		papa.setApellidos("Lopez");
		papa.setDireccion("Calle sin calle ");
		papa.setEstatus("Activo");	//-----------Campo añadido 
		papa.setEdad(30);		
		familiar = serviciosCatalogos.cargaTipoContactoPorId(1);
		papa.setTipoContacto(familiar);
		
		MedioContacto trabajo = serviciosCatalogos.cargaMedioContactoPorId(2);
		ContactoMedio contactoMedio = new ContactoMedio();
		
		//Datos del contacto medio 
		contactoMedio.setValor("53535621");
		contactoMedio.setMedioContacto(trabajo);
		contactoMedio.setContacto(papa);
		Set<ContactoMedio> contactosMedios = new HashSet<ContactoMedio>();
		contactosMedios.add(contactoMedio);
		papa.setContactosMedios(contactosMedios);
		
		serviciosContactos.guardaContacto(papa);
		
		List<Contacto> contactos = serviciosContactos.cargaContactos();
		for (Contacto contacto : contactos) {
			System.out.println("El contacto es:" + contacto.getNombre());
			System.out.println("El tipo contacto es:" + contacto.getTipoContacto().getNombre());
			System.out.println("El estatus del contacto es: "+contacto.getEstatus());
		}
	}

}
