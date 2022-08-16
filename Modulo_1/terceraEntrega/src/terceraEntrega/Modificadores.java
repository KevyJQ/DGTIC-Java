package terceraEntrega;

public class Modificadores {

	public int publico = 1;
	private int privado = 2;
	protected int protegido = 3;
	
	public void pruebaPPP() {
		this.publico = -1;
		this.privado = -2;
		this.protegido = -3;
		
		//Dentro del paquete protegido = publico
		
	}
}
