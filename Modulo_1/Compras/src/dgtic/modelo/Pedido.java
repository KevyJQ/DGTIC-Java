package dgtic.modelo;

import java.util.ArrayList;
import java.util.List;


public class Pedido {

	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<Direccion> direccion = new ArrayList<Direccion>();
	private Cuenta cuenta;
	private boolean status;

	public Pedido() {	//Constructor
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public void verficar() {
		if(cuenta.verificarPago()) {
			status = true;
		}else {
			status = false;
		}

	}
	
	public void enviar() {
		this.verficar();
		if(status) {
			System.out.println("Enviar el pedido");
		}else {
			System.out.println("No hay pago");
		}
		
	}
}