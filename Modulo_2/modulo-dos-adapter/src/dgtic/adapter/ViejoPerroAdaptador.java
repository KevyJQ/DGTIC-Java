package dgtic.adapter;

import dgtic.modelo.PerroViejo;

public class ViejoPerroAdaptador implements Truco {
	private PerroViejo adaptando;
	
	public ViejoPerroAdaptador(PerroViejo adaptador) {
		this.adaptando=adaptador;
	}
	@Override
	public void camina() {
		adaptando.camina();
		
	}

	@Override
	public void corre() {
		adaptando.duerme();	
	}

	@Override
	public void busca() {
		adaptando.duerme();
		
	}

}
