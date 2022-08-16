package dgtic.modelo;

/**
 * @author kevyb
 *
 */
public interface AlmacenarIntf {
	public void setCifrado(Cifrado tipo);
	public void guardarMensaje(String mensaje);
	public void guardarMensaje(Object objeto);
}
