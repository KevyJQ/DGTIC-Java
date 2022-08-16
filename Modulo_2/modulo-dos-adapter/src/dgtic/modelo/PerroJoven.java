package dgtic.modelo;

import dgtic.adapter.Truco;

public class PerroJoven implements Truco {
	private String nombre;
	

	public PerroJoven(String nombre) {		
		this.nombre = nombre;
	}

	@Override
	public void camina() {
		System.out.println("Camina.....");
	}

	@Override
	public void corre() {
		System.out.println("Correo.....");

	}

	@Override
	public void busca() {
		System.out.println("Busca.....");
	}

}
