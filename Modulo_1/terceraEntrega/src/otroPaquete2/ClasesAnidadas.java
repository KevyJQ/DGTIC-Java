package otroPaquete2;

public class ClasesAnidadas {

	public static void main(String[] args) {
		ClaseExterna.publicoEstatico = "Si lo cambio ¿qué pasa?";
		System.out.println (ClaseExterna.publicoEstatico);
		
		
		ClaseExterna oExterno1 = new ClaseExterna();
		ClaseExterna oExterno2 = new ClaseExterna();
		// Clase objeto = new Constructor();
		oExterno1.publicoNoEstatico += " de objeto externo 1";
		System.out.println (oExterno1.publicoNoEstatico);
		System.out.println (oExterno1.publicoEstatico);
		
		oExterno2.publicoNoEstatico += " de objeto externo 2";
		System.out.println (oExterno2.publicoNoEstatico);
		System.out.println (oExterno2.publicoEstatico);		
		
		System.out.println ("Clases internas de la Externa");
		
		ClaseExterna.Interna interna1 = oExterno2.new Interna();
		//ClaseExterna.ClaseInterna objeto = objetoExterno.new ConstructorClaseInterna();
		
		interna1.saluda();
		//Clases internas estáticas
		//ClaseExterna.InternaEstatica internaEstatica1 = oExterno1.new InternaEstatica();
		
		
	}

}
