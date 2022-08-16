package dgtic.modelo.interfaz;

import dgtic.modelo.Reloj;

public class RelojCristalPlasticoFactory extends RelojFactory{

	@Override
	protected Reloj crearReloj() {
		// TODO Auto-generated method stub
		return new CristalPlastico();
	}

}
