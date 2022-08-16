package dgtic.modelo;

public class Clase2 {

	private Clase1 rolUno;

	public Clase2() {
		super();
	}

	public Clase2(Clase1 rolUno) {
		super();
		this.rolUno = rolUno;
	}

	public Clase1 getRolUno() {
		return rolUno;
	}

	public void setRolUno(Clase1 rolUno) {
		this.rolUno = rolUno;
	}

	@Override
	public String toString() {
		return "Clase2 [rolUno=" + rolUno + "]";
	}


}
