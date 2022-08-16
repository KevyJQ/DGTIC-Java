package dgtic.repositorio;

public class Inventario {
	public int cantidadProducto(String almacen,String producto) {
		
		return BaseDeDatos.almacenes.get(almacen).get(producto);

	}

}
