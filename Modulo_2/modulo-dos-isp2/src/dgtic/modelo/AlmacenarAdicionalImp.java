package dgtic.modelo;

public class AlmacenarAdicionalImp implements AlmacenarIntfAdicional{

	@Override
	public void guardarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("Mensaja de texto");
	}

	@Override
	public void guardarMensaje(Object objeto) {
		// TODO Auto-generated method stub
		System.out.println(objeto.toString());
	}

	@Override
	public void setCifrado(Cifrado tipo) {
		// TODO Auto-generated method stub
		System.out.println(tipo.name());
	}

}
