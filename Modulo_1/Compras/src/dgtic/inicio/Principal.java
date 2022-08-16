package dgtic.inicio;

import dgtic.modelo.Articulo;
import dgtic.modelo.Cuenta;
import dgtic.modelo.Direccion;
import dgtic.modelo.Pago;
import dgtic.modelo.Pedido;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido pedido = new Pedido();
		Articulo art = new Articulo();
		pedido.getArticulos().add(art);
		art = new Articulo();
		pedido.getArticulos().add(art);
		
		Direccion direc = new Direccion();
		pedido.getDireccion().add(direc);
		direc = new Direccion();
		pedido.getDireccion().add(direc);
		
		Cuenta cuenta = new Cuenta();
		pedido.setCuenta(cuenta);
		
		Pago pago = new Pago();
		cuenta.getPago().add(pago);
		
		pedido.enviar();
	}

}
