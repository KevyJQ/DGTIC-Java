package mx.unam.dgtic.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Stream;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder.Case;
import mx.unam.dgtic.dominio.Alumno;
import mx.unam.dgtic.modelo.AlumnoService;

public class PrincipalAlumno {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("modulo11");
		EntityManager em = emf.createEntityManager();

		AlumnoService service = new AlumnoService(em);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String action;
		String matricula;
		try {
			while (true) {
				System.out.println("\n\n\n[L]istar| [A]gregar | [M]odificar | [R]emover | [Q]uit: \n\t\t\t");
				action = in.readLine();
				if ((action.length() == 0) || action.toUpperCase().charAt(0) == 'Q') {
					System.out.println("Bye");
					break;
				}

				switch (action.toUpperCase().charAt(0)) {
				case 'A':
					System.out.println("Ingresa la matricula del alumno: \n\t\t\t");
					matricula = in.readLine();

					System.out.println("Ingresa el nombre del alumno: \n\t\t\t");
					String nombre = in.readLine();

					System.out.println("Ingresa el paterno del alumno: \n\t\t\t");
					String paterno = "";
					paterno = in.readLine();

					System.out.println("Ingresa la estatura del alumno: \n\t\t\t");
					double estatura = 0.0;
					try {
						estatura = Double.parseDouble(in.readLine());
					} catch (NumberFormatException e) {
						break;
					}

					em.getTransaction().begin();
					Alumno alumno = service.createAlumno(matricula, nombre, paterno, new Date(), estatura);
					em.getTransaction().commit();

					System.out.println("\n\nAlumno Insertado " + alumno);
					break;

				case 'L':
					Collection<Alumno> alumnos = service.findAllAlumnos();
					System.out.println("\n\nAlumnos encontrados: ");
					for (Alumno e : alumnos)
						System.out.println("\t" + e);
					break;
				case 'M':
					// update alumno
					System.out.println("Ingresa la matricula del alumno a Modificar: \n\t\t\t");
					matricula = in.readLine();
					alumno = service.findAlumno(matricula);
					System.out.println("Alumno: " + alumno);
					em.getTransaction().begin();
					alumno = service.raiseAlumnoEstatura(matricula, 1);
					em.getTransaction().commit();
					System.out.println("Modificado: " + alumno);
					break;
				case 'R':
					System.out.println("Ingresa una matricula de alumno para eliminar: \n\t\t\t");
					matricula = in.readLine();

					em.getTransaction().begin();
					service.removeAlumno(matricula);
					em.getTransaction().commit();

					System.out.println("\n\nAlumno Eliminado " + matricula);
					break;
				default:
					continue;
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			// close the EntityManager when done
			em.close();
			emf.close();
		}

	}

}
