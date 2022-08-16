package cuartaEntrega;

public class Personaje{
	public int mood;
	private int charm;
	public Personaje(int charm, int mood) {
		this.charm=charm;
		this.mood=mood;
	}
	public void saluda(Personaje p) {
		p.mood+=this.charm;
	}
	@Override
	public String toString() {
		return "Personaje [mood=" + mood + ", charm=" + charm + "]";
	}
	
}
