package dgtic.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private List<Pago> pago = new ArrayList<Pago>();	//Lista doblemente enlazada arreglo dinamico

	public List<Pago> getPago() {
		return pago;
	}

	public void setPago(List<Pago> pago) {
		this.pago = pago;
	}

	public boolean verificarPago() {
		boolean existePago = false;
		/*
		 * 1 conectarme a la BD. y verificar el pago
		 * pago = pagos del BD
		 * regreso true si existe, si no false
		 * */
		return existePago;
	}

	
}
