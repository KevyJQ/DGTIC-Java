package otroPaquete2;

public class ClaseExterna {
	public String publicoNoEstatico = "Atributo público NO estático";
	public static String publicoEstatico = "Atributo público Estático";
	
	public void metodoExterno() {
		
	}
	class Interna {   //Clase interna NO estática
		public String atributoI="Atributo interno";
		public void saluda () {
			System.out.println ("Método de una clase interna");
			System.out.println (atributoI);
			System.out.println (publicoEstatico);
			System.out.println (publicoNoEstatico);
			metodoExterno(); 
		}
	}
	
	
	public static class InternaEstatica {
		public void metodoNoEstatica () {
			System.out.println ("Médodo NO estático de clase Estática");
		}
		public static void metodoEstatica () {
			System.out.println ("Médodo Estático de clase Estática");
			
		} 
	}
}

