package dgtic.inicio;

import dgtic.negocio.LogicaAlmacen;
import dgtic.repositorio.Inventario;

public class InicioVersionUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicaAlmacen logica = new LogicaAlmacen(new Inventario());
		System.out.println(logica.necesitaAbastecer("AlmacenDos","frijol"));
	}

}
