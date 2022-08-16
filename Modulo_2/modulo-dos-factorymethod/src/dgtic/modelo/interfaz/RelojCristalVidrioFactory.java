package dgtic.modelo.interfaz;

import dgtic.modelo.Reloj;

public class RelojCristalVidrioFactory extends RelojFactory{

	@Override
	protected Reloj crearReloj() {
		// TODO Auto-generated method stub
		return new CristalVidrio();
	}

}
