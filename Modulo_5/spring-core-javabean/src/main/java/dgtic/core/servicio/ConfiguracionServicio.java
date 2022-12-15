package dgtic.core.servicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import dgtic.core.modelo.Estudiante;
import dgtic.core.modelo.Materia;

@Configuration
@ImportResource(locations={"classpath:/dgtic/core/xml/*.xml"}) 
@ComponentScan(basePackages = "dgtic.core")

/*
 * @ImportResource(locations = { "classpath:/dgtic/core/xml/bean-configuration.xml" })
 * Le indicamos de donde es que va a empezar a importar las configuraciones de
 * xml dandole la direccion de donde se encuentra.
 */
public class ConfiguracionServicio {
	@Bean(name = "estudiante")
	@Scope("prototype")
	/*
	 * Hacemos el cambio para que ya no sea Singlenton y cada que se ejecute sea
	 * diferente
	 */
	public Estudiante servicioEstudiante() {
		Estudiante est = new Estudiante();
		est.setNombre("Pedro");
		est.setEdad(13);
		return est;
	}

	@Bean(name = "materia")	//Creacion del bean
	public Materia regresarMateria() {
		Materia materia = new Materia();
		materia.setNombre("Calculo");
		materia.setCreditos(10);
		return materia;
	}
	
	@Bean(name = "materiaDos")	//Creacion del bean
	public Materia regresarMateriaDos() {
		Materia materia = new Materia();
		materia.setNombre("Programacion");
		materia.setCreditos(10);
		return materia;
	}
}
