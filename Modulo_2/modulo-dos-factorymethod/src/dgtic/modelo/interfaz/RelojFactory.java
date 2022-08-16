package dgtic.modelo.interfaz;

import dgtic.modelo.Reloj;

public abstract class RelojFactory {
	public Reloj crea() {
		Reloj reloj=crearReloj();
		reloj.ponerIndice();
		reloj.ponerIndicadores();
		return reloj;
	}
	protected abstract Reloj crearReloj();
}
