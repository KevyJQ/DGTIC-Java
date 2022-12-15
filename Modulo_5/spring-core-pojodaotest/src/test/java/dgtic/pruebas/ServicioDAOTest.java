package dgtic.pruebas;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import dgtic.core.excepciones.CreditosMenores;
import dgtic.core.modelo.Estudiante;
import dgtic.core.modelo.Materia;
import dgtic.core.servicio.ServicioDAO;

@SpringBootTest(classes = { ServicioDAOTest.class })
@ComponentScan(basePackages = "dgtic.core")

class ServicioDAOTest {
	@Autowired // Para correr el test 5 necesitamos el @Autowired y el private
	private ServicioDAO servicio;

	private int lista[];

	/*
	 * @BeforeEach se ejecuta en cada prueba unitaria (@Test), mientras
	 * que @AfterEach se ejecutara después de terminada cada prueba unitaria.
	 */

	@BeforeEach // Se ejecuta antes de cada Unit test case
	public void inicio() {
		System.out.println("\nAntes de cada metodo");
		Random rd = new Random(); // Crea un objeto tipo Ramdom
		int limite = rd.nextInt(3) + 1; // Le decimos que solo cre 3 valores
		lista = new int[limite];
		for (int i = 0; i < limite; i++) {
			lista[i] = i;
		}
	}

	@AfterEach // Se ejectura despues de cada prueba unitaria
	public void despues() {
		System.out.println("\nDespues de cada metodo");
	}

	/*
	 * @BeforeAll se ejecuta una sola vez durante todas la pruebas, mientras
	 * que @AfterAll se ejecutara una sola vez cuando termine todas las pruebas.
	 */

	@BeforeAll
	public static void unicoInicio() {
		System.out.println("\nUnica vez al inicio");
	}

	@AfterAll
	public static void unicoFinal() {
		System.out.println("\nUnica vez al final");
	}

	// Pruebas Unitarias
	@Test
	public void textUno() {
		System.out.println("Prueba unitaria");
		String esperado = "Spring"; // Lo que esperas como resultado.
		String actual = "Spring"; // El valor que tienes actual.
		/*
		 * Si le cambiamos el valor a actual = "spring"; nos arrojara error porque el
		 * assertEquals no es igual.
		 */
		assertEquals(esperado, actual, "Cadenas no iguales"); // Comparamos
	}

	@Test
	public void textDos() {
		int[] esperado = { 0, 1, 2 };
		assertArrayEquals(esperado, lista); // Compara lo esperado con lo que tiene el arreglo
	}

	/*
	 * @assertNotNull,@assertNull Comparar si un objeto es nulo o no.
	 */
	@Test
	public void textTres() {
		Estudiante est = null;
		assertNull(est); // Los valores de estudiante estan nulos
		est = new Estudiante("123", "Raul", 20);
		assertNotNull(est); // Los valores del estudiante ya estan llenos
	}

	/*
	 * @assertSame,@assertNotSame Verificar si dos variables hacen referencia o no
	 * referencia al mismo objeto.
	 */

	@Test
	public void testCuatro() {
		Estudiante valorActual = new Estudiante("234", "Raul", 18);
		Estudiante valorEsperado = new Estudiante("234", "Raul", 18);
		Estudiante valorEsperadoTmp = valorEsperado;
		// dos variables se refieren al mismo objeto
		// assertSame(valorEsperado, valorActual); //----------
		// assertSame(valorEsperado, valorEsperadoTmp); //----------

		// dos variables no se refieren al mismo objeto
		// assertNotSame(valorEsperado, valorActual); //-------------
		/*
		 * $ assertNotSame(valorEsperado, valorActual); Checa si no son iguales
		 */

		// Se quiere verificar sin son iguales, respecto a su estado
		// implementar equals
		// assertEquals(valorEsperado, valorActual);//--------------
		/*
		 * $ assertEquals(valorEsperado, valorActual); Checa si son iguales en el
		 * estado, para esto necesitamos tener el metodo hascode and Equals en la clase
		 * que vemos a checar, en este caso es en la clase Estudiante
		 */
	}

	/*
	 * @assertTrue,@assertFalse Su objetivo es verificar si una condición es
	 * verdadera o falsa.
	 */
	@Test
	public void testCinco() {
		Estudiante est = servicio.getServicioDAO().getEstudiante("ico", "123");
		String esperado = "Logica";
		// Opcion 1

//		assertEquals(esperado, est.getMaterias().stream().filter(dato -> dato.getNombre().equals("Logica")).findFirst()
//				.get().getNombre(), "Primero");

		// Opcion 2
//		assertTrue(est.getMaterias().stream().filter(dato -> dato.getNombre().equals("Lógica")).findFirst().isPresent(),
//				"Log");

		// Opcion 3
		assertTrue(est.getMaterias().stream().anyMatch(dato -> dato.getNombre().equals("Logica")));

		// Opcion 4
//		assertFalse(est.getMaterias().stream().anyMatch(dato -> dato.getNombre().equals("Lógica")));
	}

	/*
	 * @assertAll Agrupar pruebas unitarias las sigue ejecutando hasta que una
	 * falle.
	 */
	@Test
	public void testSeis() {
		Estudiante est = servicio.getServicioDAO().getEstudiante("ico", "123");
		String esperado = "Logica";
		/*
		 * $ assertAll(()->{},()->{},()->{}); Esta parte es importante, es la forma en
		 * como se debe declarar esta sentencia
		 */
		assertAll(() -> {
			assertEquals(esperado, est.getMaterias().stream().filter(dato -> dato.getNombre().equals("Logica"))
					.findFirst().get().getNombre());
		}, () -> {
			assertTrue(est.getMaterias().stream().filter(dato -> dato.getNombre().equals("Logic")).findFirst()
					.isPresent());
		},

				() -> {
					assertTrue(est.getMaterias().stream().anyMatch(dato -> dato.getNombre().equals("Logica")));
				});
	}

	/*
	 * @assertThrows Nos permite en una forma sencilla afirmar si la línea ejecutada
	 * manda una excepción especifica.
	 */
	@Test
	public void testSiete() {
		Materia materia = new Materia("Algebra", 23);
		Exception exp = assertThrows(CreditosMenores.class, () -> {
			materia.setCreditos(-20);
		});
		String actual = exp.getMessage();
		String esperado = "No creditos negativos";
		// verdadero, se prueba el error assertEquals(esperado, actual);
	}

	/*
	 * @assertIterableEquals, @DisplayName Revisa si los iterables son iguales, es
	 * decir en el mismo orden y se requiere que sean del mismo tipo.
	 * Con @DisplayName cambiamos el que se despliega en lugar del nombre del
	 * método.
	 */
	@Test
	@DisplayName("assertIterableEquals sin equals y con equals")
	/*
	 * $ @DisplayName("assertIterableEquals sin equals y con equals") Le cambiamos
	 * el nombre en como aparesca en el Test
	 */
	public void testOcho() {
		Estudiante estUno = servicio.getServicioDAO().getEstudiante("ico", "123");
		Estudiante estDos = servicio.getServicioDAO().getEstudiante("ico", "124");
		// Sin implementar equals en Materia
		assertIterableEquals(estUno.getMaterias(), estUno.getMaterias());

		// sin implementar equals en Materia
//		estDos.getMaterias().add(0, new Materia("Calculo", 9));
//		assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());

		// implementado equals
//		 estDos.getMaterias().add(0, new Materia("Calculo",9));
//		 assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());
	}

	/*
	 * @assertTimeout Nos permite hacer pruebas donde nos interesa probar un proceso
	 * cuanto tiempo se tarda.
	 */
	@Test
	public void testNueve() {
		assertTimeout(java.time.Duration.ofSeconds(3), () -> {
			Thread.sleep(2000);
		});
	}

}
