package dgtic.core;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(OrderAnnotation.class)
class SpringCoreRestunoApplicationTests {

	@Autowired
	MockMvc mock;

	@Test
	@Order(3)
	void contextLoads() throws Exception {
		mock.perform(get("/estudiantes/")).andDo(print());
	}

	@Test
	@Order(0)
	void agregar() throws Exception {
		mock.perform(post("/agregarestudiante").contentType(MediaType.APPLICATION_JSON).content(

				"{\"cuenta\":\"A4\",\"nombre\":\"Alondra\",\"edad\":\"24\",\"materias\":[{\"id\":1,\"nombre\":\"Lógica\",\"creditos\":10},{\"id\":2,\"nombr e\":\"Programación\",\"creditos\":9}]}"))
				.andDo(print());
	}

	@Test
	@Order(1)
	void actualizar() throws Exception {
		mock.perform(put("/modificarestudiante").contentType(MediaType.APPLICATION_JSON).content(

				"{\"cuenta\":\"A1\",\"nombre\":\"DGTIC\",\"edad\":\"24\",\"materias\":[{\"id\":1,\"nombre\":\"Lógica\",\"creditos\":10},{\"id\":2,\"nombr e\":\"Programación\",\"creditos\":9}]}"))
				.andDo(print());
	}

	@Test
	@Order(2)
	void borrar() throws Exception {
		mock.perform(delete("/borrar/A2")).andDo(print());
	}

}
