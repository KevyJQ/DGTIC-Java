package dgtic.modelo;

public class Archivo {
	private static Archivo INSTANCIA;
	private Archivo() {		
	}
	public synchronized static Archivo getInstancia() {
		if(INSTANCIA==null) {
			INSTANCIA=new Archivo();
		}
		return INSTANCIA;
	}
	public void escritura(String datos) {
		System.out.println("Se guarda en el archivo");
	}
	
}
