package mx.unam.diplomado.ejb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ejb.Stateful;
import jakarta.enterprise.context.SessionScoped;
import mx.unam.diplomado.dao.ArrendadorDao;
import mx.unam.diplomado.dao.ArrendadorDaoImpl;
import mx.unam.diplomado.dao.jdbc.DbConnnection;
import mx.unam.diplomado.modelo.Arrendador;

//es importante usar un scoped
@SessionScoped
@Stateful
public class StatefulEJB {

	private Integer contador = 0;
	private ArrendadorDao arrendadorDao;

	public Map<String, Object> saludar(String nombre) {
		List<Arrendador> arrendadores = arrendadorDao.findAll();
		arrendadorDao = new ArrendadorDaoImpl(DbConnnection.getConnection());
		for (Arrendador arrendado : arrendadores) {
			nombre = nombre + arrendado.getNombre1();
			System.out.println(arrendado);
		}

		Map<String, Object> datos = new HashMap<>();
		datos.put("contador", contador++);
		datos.put("saludo", "Hola que tal " + nombre);
		System.out.println("imprimiendo dentro del ejb con instancia: " + this);
		return datos;
	}

}
