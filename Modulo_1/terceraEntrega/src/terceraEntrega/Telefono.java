package terceraEntrega;

public class Telefono {

	//Atributos 
	
	private int numero;
	private String color;
	private String tipo;
	
	public Telefono() {
	}
	
	public Telefono(int numero, String color, String tipo) {
		super();
		this.numero = numero;
		this.color = color;
		this.tipo = tipo;
	}
	
	//Metodos get set 

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodos
	
	public void llama(int numeroExterno) {
		
	}
	
	public String toString() {
		String texto = "Soy un telefono y este es mi numero: "+getNumero()+" mi color es: "+getColor();
		return (texto);
	}

	
	
}
