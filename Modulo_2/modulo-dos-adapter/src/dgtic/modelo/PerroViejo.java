package dgtic.modelo;

public class PerroViejo {
	@SuppressWarnings("unused")
	private String nombre;
	public PerroViejo(String nombre) {
		this.nombre=nombre;
	}
	public void camina() {
		System.out.println("Camina lento.....");
	}
	public void duerme() {
		System.out.println("Se duerme.....");
	}
}
