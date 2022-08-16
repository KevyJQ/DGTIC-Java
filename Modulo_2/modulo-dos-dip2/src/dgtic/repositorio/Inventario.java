package dgtic.repositorio;

import dgtic.negocio.InventarioIntf;

public class Inventario implements InventarioIntf{
	public int cantidadProducto(String almacen,String producto) {
		
		return BaseDeDatos.almacenes.get(almacen).get(producto);

	}

}
