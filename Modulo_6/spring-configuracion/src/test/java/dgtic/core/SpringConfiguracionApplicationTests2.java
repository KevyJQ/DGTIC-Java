package dgtic.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import dgtic.core.servicio.intf.ServicioEditorialIntf;
import dgtic.core.servicio.intf.ServicioIntf;

@SpringBootTest
@ComponentScan(basePackages = "dgtic.core")
class SpringConfiguracionApplicationTests2 {
	@Autowired
	private ServicioIntf servicio;
	@Autowired
	private ServicioEditorialIntf servicio2;

	@Test
	void contextLoadUno() {
		assertEquals(2, servicio.nombreLibro("Spring-1").getAutores().size());
		System.out.println("\n" + servicio.nombreLibro("Spring-1"));
	}

	@Test
	void contextLoadDos() {
		System.out.println(servicio2.editorialLibros("Edito2"));
	}
}
