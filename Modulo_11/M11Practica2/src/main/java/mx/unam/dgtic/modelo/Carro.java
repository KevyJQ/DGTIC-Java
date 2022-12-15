package mx.unam.dgtic.modelo;

public class Carro {
	private long numSerie;
	private String modelo;

	public long getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(long numSerie) {
		this.numSerie = numSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [numSerie=" + numSerie + ", modelo=" + modelo + "]";
	}

}
