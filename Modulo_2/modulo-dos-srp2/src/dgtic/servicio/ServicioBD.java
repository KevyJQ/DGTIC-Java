package dgtic.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dgtic.modelo.Alumno;
import dgtic.modelo.Materia;

public class ServicioBD {

	public static List<Alumno> consulta() {

		String[] materias = { "Cálculo", "Álgebra", "Programación", "Lógica", "POO" };
		String[] nombres = { "Maria", "Pedro", "Jose", "Martha", "Luis", "Juan", "Samuel" };
		List<Alumno> lista = new ArrayList<>();
		Random rd = new Random();
		Alumno alm = null;
		for (int i = 0; i < nombres.length - 1; i++) {
			alm = new Alumno();
			alm.setNombre(nombres[i]);
			for (int j = 0; j < materias.length - 1; j++) {
				alm.getMaterias().add(new Materia(materias[j], rd.nextInt(10)));
			}
			lista.add(alm);
		}
		return lista;

	}
}