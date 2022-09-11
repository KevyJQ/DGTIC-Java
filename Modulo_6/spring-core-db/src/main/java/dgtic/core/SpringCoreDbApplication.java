package dgtic.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dgtic.core.persistence.dao.EstudianteDao;
import dgtic.core.persistence.dao.EstudianteMateriaDao;
import dgtic.core.persistence.dao.MateriaDao;
import dgtic.core.persistence.modelo.EstudianteMateria;

@SpringBootApplication
public class SpringCoreDbApplication implements CommandLineRunner {
	@Autowired
	private EstudianteDao estudiante;

	@Autowired
	private MateriaDao materia;

	@Autowired
	private EstudianteMateriaDao estMat;

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// probando estudiantes
		/*
		 * Estudiante est=new Estudiante(); est.setCuenta("A06");
		 * est.setNombre("DGTIC"); est.setEdad(20); //insertar
		 * //estudiante.insertar(est);
		 *
		 * //actualizar //est.setNombre("DGTIC-2"); //estudiante.cambiar(est);
		 *
		 * //borrar //estudiante.borrar(est);
		 *
		 * for(Estudiante e:estudiante.consulta()) { System.out.println(e); }
		 */
		/*
		 * //probando materia Materia mat=new Materia();
		 * mat.setNombre("Ingeniería de Software"); mat.setCreditos(9);
		 *
		 * //insertar mat.setId(materia.insertar(mat)); for(Materia
		 * m:materia.consulta()) { System.out.println(m); } System.out.println("	");
		 * //actualizar mat.setNombre("DGTIC"); materia.cambiar(mat); for(Materia
		 * m:materia.consulta()) { System.out.println(m); } System.out.println("	");
		 * //borrar materia.borrar(mat); for(Materia m:materia.consulta()) {
		 * System.out.println(m); }
		 */

		// probando estudiante_materia
		EstudianteMateria e = new EstudianteMateria();
		e.setIdEstudiante("A00");
		e.setIdMateria(1);

		/*
		 * //insertar try { estMat.insertar(e); } catch (Exception exp) {
		 * System.out.println("error"); }
		 */
		/*
		 * //actualizar EstudianteMateria nuevo = new EstudianteMateria();
		 * nuevo.setIdEstudiante("A01"); nuevo.setIdMateria(4); estMat.cambiar(e,nuevo);
		 */
		/*
		 * //borrar EstudianteMateria nuevo = new EstudianteMateria();
		 * nuevo.setIdEstudiante("A01"); nuevo.setIdMateria(4); estMat.borrar(nuevo);
		 * 
		 * for (EstudianteMateria datos : estMat.consulta()) {
		 * System.out.println(datos); }
		 */

	}

}
