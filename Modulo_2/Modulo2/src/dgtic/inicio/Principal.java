package dgtic.inicio;

import dgtic.modelo.Clase1;
import dgtic.modelo.Clase2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Clase1 objUno = new Clase1();
		Clase2 objDos = new Clase2();

		objUno.setReferencia(objDos);
		objDos.setReference(objUno);
		 */

		Clase1 objUno = new Clase1();
		Clase2 objDos = new Clase2(objUno);
		//objUno.setRolDos(objDos);
	}

}
