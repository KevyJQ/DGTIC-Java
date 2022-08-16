package dgtic.modelo;
/**
 * @author kevyb
 *
 */
public class Mediator {
	
	//Declaramos los objetos con los que puede hacer llamada a las diferentes clases 
	Lampara lampara = new Lampara();
	Radio radio = new Radio();
	Despertador despertador = new Despertador();
	Television television = new Television();
	
	public void encenderLuces() {
	}
	
	public void encenderRadio() {
	}
	
	public void bajarVolumenTelevision() {
	}
	
	public void apagarRadio() {
	}
	
	public void bajarVolumenRadio() {
	}
	
	public void bajarLuces() {
	}

}
