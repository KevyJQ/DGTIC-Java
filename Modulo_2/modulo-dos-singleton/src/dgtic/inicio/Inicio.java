package dgtic.inicio;
import dgtic.modelo.Archivo;
public class Inicio {
	public static void main(String[] args) {
		Archivo archivo=Archivo.getInstancia();
		Archivo archivoDos=Archivo.getInstancia();
		System.out.println(archivo.equals(archivoDos));
		System.out.println(archivoDos.equals(archivo));
	}
}
