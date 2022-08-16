package dgtic.inicio;

import dgtic.modelo.AlmacenarAdicionalImp;
import dgtic.modelo.Cifrado;

/**
 * @author kevyb
 *
 */
public class Inicio {

	public static void main(String[] args) {
		AlmacenarAdicionalImp simple = new AlmacenarAdicionalImp();
		simple.guardarMensaje("mensaje");
		
		AlmacenarAdicionalImp complejo = new AlmacenarAdicionalImp();
		complejo.setCifrado(Cifrado.FUERTE);
		complejo.guardarMensaje("Complejo");

	}
}
