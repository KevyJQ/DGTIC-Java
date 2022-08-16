package dgtic.inicio;

import dgtic.modelo.Departamento;
import dgtic.modelo.Materias;
import dgtic.modelo.Profesor;
import dgtic.modelo.Tipo;

/**
 * @author kevyb
 *
 */
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Builder completa un objeto complejo 
		Profesor profesor = new Profesor.Builder("Persona")
				.setTipoBase(Tipo.BASE)
				.setDepartamento(Departamento.COMPUTACION)
				.build();
		
		Profesor pr = new Profesor.Builder("Carlos")
				.setTipoAsignatura(Tipo.ASIGNATURA)
				.setMaterias(Materias.ALGEBRA,Materias.CALCULO)
				.build();
	}

}
