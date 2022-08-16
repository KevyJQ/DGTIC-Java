package terceraEntrega;

public class Celular extends Telefono implements IVolumen{	//Celular hereda de Telefono

	private boolean encendido;

	public Celular(boolean encendido) {
		super();
		this.encendido = false;
	}
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	@Override
	public String toString() {
		String texto = "Soy un celular y estoy: "+ isEncendido();
		return (texto);
	}

	@Override
	public void subeVolumen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaVolumen() {
		// TODO Auto-generated method stub
		
	}
}

//get class regresa la clase del objeto 