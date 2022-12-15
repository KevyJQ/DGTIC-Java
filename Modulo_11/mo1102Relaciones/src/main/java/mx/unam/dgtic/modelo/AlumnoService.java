package mx.unam.dgtic.modelo;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import mx.unam.dgtic.dominio.Alumno;

public class AlumnoService {
	protected EntityManager em;

	public AlumnoService(EntityManager em) {
		super();
		this.em = em;
	}

	public Alumno createAlumno(String matricula, String nombre, String paterno, Date fnac, double estatura) {
		Alumno alumno = new Alumno(matricula);
		alumno.setNombre(nombre);
		alumno.setPaterno(paterno);
		alumno.setFnac(fnac);
		alumno.setEstatura(estatura);
		em.persist(alumno);
		return alumno;
	}

	public Alumno findAlumno(String matricula) {
		return em.find(Alumno.class, matricula);
		/*
		 * Tenemos que decirle explicitamente en este caso la clase en donde el
		 * EntityManager va a hacer la busqueda
		 */
	}

	@SuppressWarnings("unchecked")
	public Collection<Alumno> findAllAlumnos() {
		Query query = em.createQuery("SELECT a FROM Alumno a");
		return (Collection<Alumno>) query.getResultList();
	}

	public void removeAlumno(String matricula) {
		Alumno alumno = findAlumno(matricula);
		if (alumno != null) {
			em.remove(alumno);
		}
	}

	public Alumno raiseAlumnoEstatura(String matricula, long raise) {
		Alumno alumno = findAlumno(matricula);
		if (alumno != null) {
			alumno.setEstatura(alumno.getEstatura() + raise);
		}
		return alumno;
	}
}
