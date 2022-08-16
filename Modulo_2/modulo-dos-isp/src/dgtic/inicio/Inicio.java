package dgtic.inicio;

import dgtic.modelo.AlmacenarImp;
import dgtic.modelo.AlmacenarIntf;
import dgtic.modelo.Cifrado;

/**
 * @author kevyb
 *
 */
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlmacenarIntf alm = new AlmacenarImp();
		/*
		 * Cuando creamos este objeto alm, le estamos indicando que va a tener
		 * acceso a los 3 metodos que estamos declarando en la interface
		 * */
		alm.setCifrado(Cifrado.DEBIl);
		alm.guardarMensaje("Datos");
		

	}
}
