package dgtic.modelo;

public class AlmacenarImp implements AlmacenarIntf{

	@Override
	public void setCifrado(Cifrado tipo) {
		// TODO Auto-generated method stub
		System.out.println(tipo.name());
	}

	@Override
	public void guardarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("Mnasaje de texto");
	}

	@Override
	public void guardarMensaje(Object objeto) {
		// TODO Auto-generated method stub
		System.out.println(objeto.toString());
	}
	

}
