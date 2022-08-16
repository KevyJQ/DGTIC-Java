package dgtic.inicio;
import dgtic.adapter.ViejoPerroAdaptador;
import dgtic.modelo.PerroJoven;
import dgtic.modelo.PerroViejo;
import dgtic.servicio.ExposicionCanina;
public class Inicio {
	public static void main(String[] args) {
		PerroViejo viejo=new PerroViejo("Rojo");		
		PerroJoven nuevo=new PerroJoven("Negro");
		ViejoPerroAdaptador adapta=new ViejoPerroAdaptador(viejo);
		ExposicionCanina expo=new ExposicionCanina();
		expo.competencia(adapta);
		System.out.println("-----");
		expo.competencia(nuevo);
	}
}
