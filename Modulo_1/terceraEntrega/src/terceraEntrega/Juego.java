package terceraEntrega;

public class Juego {

	public static void main(String[] args) {
		
		Personaje uno = new Personaje();
		uno.nombre = "Goku";
		uno.fuerza = 5;
		
		Personaje dos = new Personaje();
		dos.nombre = "Veggeta";
		dos.fuerza = 10;
		
		System.out.println(uno+ "\t\t\t\t"+dos);
		
		//Como se refleja un golpe a Goku a Veggeta
		//[1]dos.vida -=5;
		//[2]uno.ataque(uno, dos);
		//[3]Personaje.ataque(uno, dos);
		uno.ataqueA(dos);
		
		System.out.println(uno+ "\t\t\t\t"+dos);
		
		//Como se refleja un golpe a Veggeta a Goku
		//[1]uno.vida -=10;
		//[2]uno.ataque(dos, uno);
		//[3]Personaje.ataque(dos, uno);
		dos.ataqueA(uno);
		
		System.out.println(uno+ "\t\t\t\t"+dos);
		
	}

}
