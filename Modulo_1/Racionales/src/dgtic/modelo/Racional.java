package dgtic.modelo;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional() {
	}
	
	

	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}



	@Override
	public String toString() {
		return numerador + " / " +denominador;
	}
	
	
	
	

}
