package dgtic.negocio;

import dgtic.repositorio.Inventario;

public class LogicaAlmacen {
	private final Inventario inventario;

	public LogicaAlmacen(Inventario invetario) {
		this.inventario = invetario;
	}

	public boolean necesitaAbastecer(String tienda, String producto) {
		int actualCantidad = inventario.cantidadProducto(tienda, producto);
		return actualCantidad < 50;
	}

}
