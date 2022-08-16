package dgtic.inicio.servicio;

import java.util.List;

import dgtic.inicio.modelo.Enemigo;
import dgtic.inicio.modelo.Personaje;
import dgtic.inicio.modelo.Posicion;

public class Pantalla {
	public void pintar(List<Posicion> posicion) {
		for (Posicion ps : posicion) {
			ps.pintar();
		}
	}


}
