package dgtic.modelo;

public abstract class Reloj {
	protected boolean tieneIndicadores;
	protected boolean tieneIndice;
	protected String tipoCristal; 
	
	public void ponerIndicadores() {
		this.tieneIndicadores=true;
	}
	public void ponerIndice() {
		this.tieneIndice=true;
	}
	@Override
	public String toString() {
		return "Reloj [tieneIndicadores=" + tieneIndicadores + ", tieneIndice=" + tieneIndice + ", tipoCristal="
				+ tipoCristal + "]";
	}
	
	
}
